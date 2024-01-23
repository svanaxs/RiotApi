package ApiPackage;

import java.util.ArrayList;

import com.google.gson.Gson;

public class ByName
{
	protected ArrayList<BySummoner> BySummonerList = new ArrayList<BySummoner>();
	private String id;
	private String accountId;
	private String puuid;
	private String name;
	private int profileIconId;
	private long revisionDate;
	private int summonerLevel;

	public ByName()
	{
	}

	public ByName(String id, String accountId, String puuid, String name, int profileIconId, long revisionDate, int summonerLevel)
	{
		this.id = id;
		this.accountId = accountId;
		this.puuid = puuid;
		this.name = name;
		this.profileIconId = profileIconId;
		this.revisionDate = revisionDate;
		this.summonerLevel = summonerLevel;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getAccountId()
	{
		return accountId;
	}

	public void setAccountId(String accountId)
	{
		this.accountId = accountId;
	}

	public String getPuuid()
	{
		return puuid;
	}

	public void setPuuid(String puuid)
	{
		this.puuid = puuid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getProfileIconId()
	{
		return profileIconId;
	}

	public void setProfileIconId(int profileIconId)
	{
		this.profileIconId = profileIconId;
	}

	public long getRevisionDate()
	{
		return revisionDate;
	}

	public void setRevisionDate(long revisionDate)
	{
		this.revisionDate = revisionDate;
	}

	public int getSummonerLevel()
	{
		return summonerLevel;
	}

	public void setSummonerLevel(int summonerLevel)
	{
		this.summonerLevel = summonerLevel;
	}

	public static ByName fromJson(String json)
	{

		Gson gson = new Gson();
		return gson.fromJson(json, ByName.class);
	}

	@Override
	public String toString()
	{
		return "By Name Klasse [ \n id = " + id + ",\n accountId = " + accountId + ",\n puuid = " + puuid + ",\n name = " + name + ",\n profileIconId = " + profileIconId + ",\n revisionDate  = " + revisionDate + ",\n summonerLevel = " + summonerLevel + "\n BySummonerList = " +  BySummonerList + "]";
	}

}