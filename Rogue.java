public class Rogue extends Character
{
    private int agility;
    private int stealth;

    public Rogue(String name, int performance, int life, int x, int y, int z, int point, int rank, int attempt, boolean start, boolean end, int agility, int stealth) {
        super(name, "Rogue", performance, life, x, y, z, point, rank, attempt, start, end);
        this.agility = agility;
        this.stealth = stealth;
    }

    public void backstab() 
    {
        if (stealth >= 5) 
        {
            System.out.println(name + " performs a backstab!");
            stealth -= 5;
            System.out.println("Stealth after backstab: " + stealth);
        } 
        else
        {
            System.out.println(name + " does not have enough stealth for a backstab!");
        }
    }

    public void sneak()
    {
        System.out.println(name + " sneaks quietly.");
        stealth += 5;
        System.out.println("Stealth after sneaking: " + stealth);
    }

    @Override
    public void performActionBasedOnRank() 
    {
        super.performActionBasedOnRank();
        if (rank >= 8)
        {
            System.out.println(name + " has reached a high rank and unlocked the special ability: Shadow Strike!");
        }
    }
}
