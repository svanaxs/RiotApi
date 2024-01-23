package ApiPackage;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class BySummoner
{

	private String leagueId;
	private String queueType;
	private String tier;
	private String rank;
	private String summonerId;
	private String summonerName;
	private int leaguePoints;
	private int wins;
	private int losses;
	private boolean veteran;
	private boolean inactive;
	private boolean freshBlood;
	private boolean hotStreak;

	public BySummoner()
	{
	}

	public BySummoner(String leagueId, String queueType, String tier, String rank, String summonerId, String summonerName, int leaguePoints, int wins, int losses, boolean veteran, boolean inactive, boolean freshBlood, boolean hotStreak)
	{
		super();
		this.leagueId = leagueId;
		this.queueType = queueType;
		this.tier = tier;
		this.rank = rank;
		this.summonerId = summonerId;
		this.summonerName = summonerName;
		this.leaguePoints = leaguePoints;
		this.wins = wins;
		this.losses = losses;
		this.veteran = veteran;
		this.inactive = inactive;
		this.freshBlood = freshBlood;
		this.hotStreak = hotStreak;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getQueueType()
	{
		return queueType;
	}

	public void setQueueType(String queueType)
	{
		this.queueType = queueType;
	}

	public String getSummonerId()
	{
		return summonerId;
	}

	public void setSummonerId(String summonerId)
	{
		this.summonerId = summonerId;
	}

	public String getSummonerName()
	{
		return summonerName;
	}

	public void setSummonerName(String summonerName)
	{
		this.summonerName = summonerName;
	}

	public int getLeaguePoints()
	{
		return leaguePoints;
	}

	public void setLeaguePoints(int leaguePoints)
	{
		this.leaguePoints = leaguePoints;
	}

	public int getWins()
	{
		return wins;
	}

	public void setWins(int wins)
	{
		this.wins = wins;
	}

	public int getLosses()
	{
		return losses;
	}

	public void setLosses(int losses)
	{
		this.losses = losses;
	}

	public boolean isVeteran()
	{
		return veteran;
	}

	public void setVeteran(boolean veteran)
	{
		this.veteran = veteran;
	}

	public boolean isInactive()
	{
		return inactive;
	}

	public void setInactive(boolean inactive)
	{
		this.inactive = inactive;
	}

	public boolean isFreshBlood()
	{
		return freshBlood;
	}

	public void setFreshBlood(boolean freshBlood)
	{
		this.freshBlood = freshBlood;
	}

	public boolean isHotStreak()
	{
		return hotStreak;
	}

	public void setHotStreak(boolean hotStreak)
	{
		this.hotStreak = hotStreak;
	}

	@Override
	public String toString() {
		return "\n\n BySummoner Klasse queueType=" + queueType + "[\n leagueId=" + leagueId + ",\n tier=" + tier + ",\n rank=" + rank
				+ ",\n summonerId=" + summonerId + ",\n summonerName=" + summonerName + ",\n leaguePoints=" + leaguePoints
				+ ",\n wins=" + wins + ",\n losses=" + losses + ",\n veteran=" + veteran + ",\n inactive=" + inactive
				+ ",\n freshBlood=" + freshBlood + ",\n hotStreak=" + hotStreak + "\n]\n ";
	}

	public static List<BySummoner> fromJsonArray(String jsonArray)
	{
		Gson gson = new Gson();
		Type listType = new TypeToken<List<BySummoner>>()
		{
		}.getType();
		return gson.fromJson(jsonArray, listType);
	}
}
