public class TeamTester 
{
    public static void main(String[] args)
    {
        Team team1 = new Team("Cubs", 35,0.65);
        System.out.println("The name of my team is " + team1.getTeamName());

        System.out.println("The number of players is " + team1.getNumPlayers() + ".");
        System.out.println("The winning percentage is " + team1.getWinPercentage() + ".");

        team1.addPlayers(2);
        System.out.println("The new number of players is " + team1.getNumPlayers() + ".");

        Team team2 = new Team();
        System.out.println("\n TEAM 2");
        System.out.println("The name of my team is " + team2.getTeamName());
        System.out.println("The number of players is " + team2.getNumPlayers() + ".");
        System.out.println("The winning percentage is " + team2.getWinPercentage() + ".");

    }
}