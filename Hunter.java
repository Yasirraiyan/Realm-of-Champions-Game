public class Hunter extends Character 
{
    private int marksmanship;
    private int traps;

    public Hunter(String name, int performance, int life, int x, int y, int z, int point, int rank, int attempt, boolean start, boolean end, int marksmanship, int traps) {
        super(name, "Hunter", performance, life, x, y, z, point, rank, attempt, start, end);
        this.marksmanship = marksmanship;
        this.traps = traps;
    }

    public void displayStats()
    {
        System.out.println("Name: " + name);
        System.out.println("Class: Hunter");
        System.out.println("Marksmanship: " + marksmanship);
        System.out.println("Traps: " + traps);
        System.out.println("Life: " + life);
        System.out.println("Rank: " + rank);
    }

    public void shootArrow()
    {
        if (marksmanship >= 5)
        {
            System.out.println(name + " shoots an arrow with precision!");
            marksmanship -= 5;
            System.out.println("Marksmanship after shooting: " + marksmanship);
        }
        else
        {
            System.out.println(name + " does not have enough marksmanship to shoot an arrow!");
        }
    }

    public void setTrap()
    {
        if (traps >= 3)
        {
            System.out.println(name + " sets a trap!");
            traps -= 3;
            System.out.println("Traps after setting: " + traps);
        } 
        else
        {
            System.out.println(name + " does not have enough traps to set!");
        }
    }

    @Override
    public void performActionBasedOnRank() 
    {
        super.performActionBasedOnRank();
        if (rank >= 8)
        {
            System.out.println(name + " has reached a high rank and unlocked the special ability: Sniper Shot!");
        }
    }
}
