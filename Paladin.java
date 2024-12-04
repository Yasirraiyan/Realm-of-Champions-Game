public class Paladin extends Character
{
    private int holiness;
    private int shield;

    public Paladin(String name, int performance, int life, int x, int y, int z, int point, int rank, int attempt, boolean start, boolean end, int holiness, int shield) {
        super(name, "Paladin", performance, life, x, y, z, point, rank, attempt, start, end);
        this.holiness = holiness;
        this.shield = shield;
    }

    public void smite()
    {
        if (holiness >= 10) 
        {
            System.out.println(name + " smites the enemy!");
            holiness -= 10;
            System.out.println("Holiness after smite: " + holiness);
        }
        else
        {
            System.out.println(name + " does not have enough holiness to smite the enemy!");
        }
    }

    public void shieldUp() 
    {
        System.out.println(name + " raises the shield.");
        shield += 10;
        System.out.println("Shield after raising: " + shield);
    }

    @Override
    public void performActionBasedOnRank()
    {
        super.performActionBasedOnRank();
        if (rank >= 8) 
        {
            System.out.println(name + " has reached a high rank and unlocked the special ability: Holy Avenger!");
        }
    }
}
