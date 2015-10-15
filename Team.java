package model;

import android.graphics.Color;

/**
 * Created by simon.long on 15/10/2015.
 */
public enum Team
{
    IRELAND("IRE", 1),
    SCOTLAND("SCO", 2),
    AUSTRALIA("AUS", 3);

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
