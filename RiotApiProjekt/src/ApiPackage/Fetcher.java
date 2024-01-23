package ApiPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.ComboBoxModel;

public class Fetcher
{
	private RiotGui gui;
	
	private static final String API_KEY = "RGAPI-0e982eec-5691-42ad-9f4f-26afac20108d";
	private static final String RIOT_API_BASE_URL = "https://euw1.api.riotgames.com/lol/league/v4/entries/by-summoner/";
	private static ByName tempadder;
	protected static ArrayList<ByName> dummies = new ArrayList<ByName>();
	
	private DefaultComboBoxModel cbModel = new DefaultComboBoxModel<BySummoner>();
	
	public Fetcher()
	{
		gui = new RiotGui();
		registriereListener();
		allinvis();
	}

	public ByName Fetching(String summonerName)
	{
		

		try
		{
			String encodedSummonerName = encodeSummonerName(summonerName);
			String encryptedSummonerId = getEncryptedSummonerId(encodedSummonerName);
			String summonerData = getSummonerData(encryptedSummonerId);

			System.out.println();
			List<BySummoner> summonerList = BySummoner.fromJsonArray(summonerData);
			
			gui.getComboBox().removeAllItems();
			for (BySummoner summoner : summonerList)
			{
				tempadder.BySummonerList.add(summoner);
				cbModel.addElement(summoner.getQueueType());
			}
			gui.getComboBox().setModel(cbModel);
			System.out.println(tempadder.BySummonerList);
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return tempadder;
	}

	private static String encodeSummonerName(String summonerName)
	{
		return summonerName.replaceAll(" ", "%20");
	}

	private static String getEncryptedSummonerId(String encodedSummonerName) throws IOException
	{
		String apiUrl = "https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + encodedSummonerName;

		URL url = new URL(apiUrl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("X-Riot-Token", API_KEY);

		int responseCode = connection.getResponseCode();

		if (responseCode == HttpURLConnection.HTTP_OK)
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder content = new StringBuilder();
			String inputLine;

			while ((inputLine = in.readLine()) != null)
			{
				content.append(inputLine);

				ByName temp = ByName.fromJson(inputLine);
				tempadder = temp;
				System.out.println(temp);

				System.out.println();

			}
			;

			in.close();
			String json = content.toString();
			String encryptedSummonerId = json.split("\"id\"")[1].split(":")[1].split(",")[0].replaceAll("\"", "").trim();

			return encryptedSummonerId;
		}
		else
		{
			throw new IOException("Error retrieving summoner data. HTTP error code: " + responseCode);
		}
	}

	private static String getSummonerData(String encryptedSummonerId) throws IOException
	{
		String apiUrl = RIOT_API_BASE_URL + encryptedSummonerId;

		URL url = new URL(apiUrl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("X-Riot-Token", API_KEY);

		int responseCode = connection.getResponseCode();

		if (responseCode == HttpURLConnection.HTTP_OK)
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			StringBuilder content = new StringBuilder();

			while ((inputLine = in.readLine()) != null)
			{

				content.append(inputLine);

			}
			in.close();

			return content.toString();
		}
		else
		{
			throw new IOException("Error retrieving summoner data. HTTP error code: " + responseCode);
		}
	}
	
	private void registriereListener()
	{
		
		gui.setListener(new Suchen());
		
		gui.setListener(new Select());

	}
	
	class Suchen implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
			System.out.println("Suchen");
			String temp = (String) gui.getTextFieldName().getText();
			System.out.println(temp);
			ByName tempname = Fetching(temp);
			gui.getLblNameOut().setText(tempname.getName());
			gui.getLblLevelOut().setText(Integer.toString(tempname.getSummonerLevel()));
			
			dummies.add(tempname);
			Mainhandler MH2 = new NIO("Output"+tempname.getName() + ".txt");
			MH2.schreiben(dummies);
			
			gui.getLblTip().setVisible(true);
			allinvis();
		}
	}
	
	class Select implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
			System.out.println("State Change");
			
			BySummoner temp = (BySummoner) gui.getComboBox().getSelectedItem();
			
			gui.getLblRankOut().setText((String)temp.getRank()); 
			gui.getLblTierOut().setText((String)temp.getTier());
			gui.getLblWinsOut().setText(Integer.toString(temp.getWins()));
			gui.getLblLossesOut().setText(Integer.toString(temp.getLosses()));
			float wr =((float) temp.getWins() / (temp.getLosses() +  temp.getWins()) * 100);
			float wrr = Math.round(wr);
			gui.getLblRatioOut().setText(Float.toString(wrr) + "%");
			gui.getLblInactiveOut().setText(String.valueOf(temp.isInactive()));
			
			gui.getLblTip().setVisible(false);
			allinvis();
			
			switch (temp.getTier()) {
		    case "IRON":
		        gui.getLblIron().setVisible(true);
		        break;
		    case "BRONZE":
		        gui.getLblBronze().setVisible(true);
		        break;
		    case "SILVER":
		        gui.getLblSilver().setVisible(true);
		        break;
		    case "GOLD":
		        gui.getLblGold().setVisible(true);
		        break;
		    case "PLATINUM":
		        gui.getLblPlat().setVisible(true);
		        break;
		    case "EMERALD":
		        gui.getLblEmerald().setVisible(true);
		        break;
		    case "DIAMOND":
		        gui.getLblDiamond().setVisible(true);
		        break;
		    case "MASTER":
		        gui.getLblMaster().setVisible(true);
		        break;
		    case "GRANDMASTER":
		        gui.getLblGrandmaster().setVisible(true);
		        break;
		    case "CHALLENGER":
		        gui.getLblChallenger().setVisible(true);
		        break;
		    default:
		        
		        break;
		}
			
		}
	}
	
	private void allinvis()
	{
		gui.getLblIron().setVisible(false);
		gui.getLblBronze().setVisible(false);
		gui.getLblSilver().setVisible(false);
		gui.getLblGold().setVisible(false);
		gui.getLblPlat().setVisible(false);
		gui.getLblEmerald().setVisible(false);
		gui.getLblDiamond().setVisible(false);
		gui.getLblMaster().setVisible(false);
		gui.getLblGrandmaster().setVisible(false);
		gui.getLblChallenger().setVisible(false);
	}

}
