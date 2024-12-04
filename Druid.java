public class Druid extends Character
{
    private int naturePower;
    private int shapeShift;

    public Druid(String name, int performance, int life, int x, int y, int z, int point, int rank, int attempt, boolean start, boolean end, int naturePower, int shapeShift) {
        super(name, "Druid", performance, life, x, y, z, point, rank, attempt, start, end);
        this.naturePower = naturePower;
        this.shapeShift = shapeShift;
    }

    public void castNatureSpell()
    {
        if (naturePower >= 10)
        {
            System.out.println(name + " casts a nature spell!");
            naturePower -= 10;
            System.out.println("Nature Power after spell: " + naturePower);
        }
        else 
        {
            System.out.println(name + " does not have enough nature power to cast a spell!");
        }
    }

    public void shapeShift()
    {
        System.out.println(name + " shape-shifts.");
        shapeShift += 5;
        System.out.println("Shape Shift after transforming: " + shapeShift);
    }

    @Override
    public void performActionBasedOnRank()
    {
        super.performActionBasedOnRank();
        if (rank >= 8) 
        {
            System.out.println(name + " has reached a high rank and unlocked the special ability: Nature's Fury!");
        }
    }
}
