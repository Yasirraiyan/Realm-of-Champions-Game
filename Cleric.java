public class Cleric extends Character
{
    private int healingPower;
    private int divineFavor;

    public Cleric(String name, int performance, int life, int x, int y, int z, int point, int rank, int attempt, boolean start, boolean end, int healingPower, int divineFavor) {
        super(name, "Cleric", performance, life, x, y, z, point, rank, attempt, start, end);
        this.healingPower = healingPower;
        this.divineFavor = divineFavor;
    }

    public void heal() 
    {
        if (divineFavor >= 5)
        {
            System.out.println(name + " casts a healing spell!");
            divineFavor -= 5;
            life += healingPower;
            System.out.println("Life after healing: " + life);
        }
        else 
        {
            System.out.println(name + " does not have enough divine favor to cast a healing spell!");
        }
    }

    public void pray()
    {
        System.out.println(name + " prays to the divine.");
        divineFavor += 5;
        System.out.println("Divine Favor after praying: " + divineFavor);
    }

    @Override
    public void performActionBasedOnRank() 
    {
        super.performActionBasedOnRank();
        if (rank >= 8)
        {
            System.out.println(name + " has reached a high rank and unlocked the special ability: Divine Intervention!");
        }
    }
}
