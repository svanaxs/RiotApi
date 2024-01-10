package ApiPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Fetcher
{

	private static final String API_KEY = "RGAPI-31e5b57a-bd18-4e82-8f49-4a0364bdcbf9";
	private static final String RIOT_API_BASE_URL = "https://euw1.api.riotgames.com/lol/league/v4/entries/by-summoner/";
	private static ByName tempadder;

	public static void main(String[] args)
	{
		String summonerName = "FateS End";

		try
		{
			String encodedSummonerName = encodeSummonerName(summonerName);
			String encryptedSummonerId = getEncryptedSummonerId(encodedSummonerName);
			String summonerData = getSummonerData(encryptedSummonerId);

			System.out.println();

			List<BySummoner> summonerList = BySummoner.fromJsonArray(summonerData);
			for (BySummoner summoner : summonerList)
			{
				tempadder.BySummonerList.add(summoner);

			}

			System.out.println(tempadder.BySummonerList);

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
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

}
