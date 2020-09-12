public class Team 
{

    public Team()
    {
        teamName = "NO NAME";
    }

    public Team(String name)
    {
        teamName = name;
    }

    public Team(String name, int nPlayers, double wPercentage) 
    {
        teamName = name;
        numPlayers = nPlayers;
        winPercentage = wPercentage;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public int getNumPlayers()
    {
        return numPlayers;
    }

    public double getWinPercentage()
    {
        return winPercentage;
    }

    public void addPlayers (int nPlayers)
    {
        numPlayers = numPlayers + nPlayers;
    }

        private String teamName;
        private int numPlayers;
        private double winPercentage;
}