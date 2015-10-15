/**
 * Created by simon.long on 15/10/2015.
 */
public enum Team
{
    IRELAND("IRE", 1),
    SCOTLAND("SCO", 2),
    AUSTRALIA("AUS", 3),
	NEW_ZEALAND("NZL", 4),
	WALES("WAL", 5),
	SOUTH_AFRICA("RSA", 6),
	ARGENTINA("ARG", 7),
	FRANCE("FRA", 8);

    private String teamName;
    private int teamColor;

    private Team(String teamName, int teamColor)
    {
        this.teamName = teamName;
        this.teamColor = teamColor;
    }

    public String getTeamName()
    {
        return teamName;
    }
}
