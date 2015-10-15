import java.util.ArrayList;

public class TestApplication {

	public static void main(String[] args) {
		Round quarterFinals = new Round();
		Match match1 = new Match(Team.SOUTH_AFRICA, Team.WALES);
		Match match2 = new Match(Team.NEW_ZEALAND, Team.FRANCE);
		Match match3 = new Match(Team.IRELAND, Team.ARGENTINA);
		Match match4 = new Match(Team.AUSTRALIA, Team.SCOTLAND);
		
		quarterFinals.addMatch(match1);
		quarterFinals.addMatch(match2);
		quarterFinals.addMatch(match3);
		quarterFinals.addMatch(match4);
		
		ArrayList<Team> winners = quarterFinals.playMatchesForRound();
		System.out.println("QUARTER WINNERS");
		for(Team winner : winners)
		{
			System.out.println(winner.getTeamName());
		}

		//Create the semi
		Round semis = new Round();
		Match semi1 = new Match(winners.get(0), winners.get(1));
		Match semi2 = new Match(winners.get(2), winners.get(3));
		semis.addMatch(semi1);
		semis.addMatch(semi2);
		
		ArrayList<Team> semiWinners = semis.playMatchesForRound();
		System.out.println("SEMI WINNERS");
		for(Team winner : semiWinners)
		{
			System.out.println(winner.getTeamName());
		}
		
	
		
		
	}

}
