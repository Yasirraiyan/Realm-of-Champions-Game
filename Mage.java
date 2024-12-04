public class Mage extends Character 
{
    private int mana;
    private int spellPower;

    public Mage(String name, int performance, int life, int x, int y, int z, int point, int rank, int attempt, boolean start, boolean end, int mana, int spellPower) {
        super(name, "Mage", performance, life, x, y, z, point, rank, attempt, start, end);
        this.mana = mana;
        this.spellPower = spellPower;
    }

    public void castSpell()
    {
        if (mana >= 10)
        {
            System.out.println(name + " casts a powerful spell!");
            mana -= 10;
            System.out.println("Mana after spell: " + mana);
        } else 
        {
            System.out.println(name + " does not have enough mana to cast a spell!");
        }
    }

    public void regenerateMana() 
    {
        System.out.println(name + " regenerates mana.");
        mana += 5;
        System.out.println("Mana after regeneration: " + mana);
    }

    @Override
    public void performActionBasedOnRank() 
    {
        super.performActionBasedOnRank();
        if (rank >= 8) {
            System.out.println(name + " has reached a high rank and unlocked the special ability: Arcane Surge!");
        }
    }
}
