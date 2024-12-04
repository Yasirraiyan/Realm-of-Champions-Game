public class Warrior extends Character
{
    private int strength;
    private int defense;
    private int stamina;

    public Warrior(String name, int performance, int life, int x, int y, int z, int point, int rank, int attempt, boolean start, boolean end, int strength, int defense, int stamina) {
        super(name, "Warrior", performance, life, x, y, z, point, rank, attempt, start, end);
        this.strength = strength;
        this.defense = defense;
        this.stamina = stamina;
    }

    public void displayStats()
    {
        System.out.println("Name: " + name);
        System.out.println("Class: Warrior");
        System.out.println("Strength: " + strength);
        System.out.println("Defense: " + defense);
        System.out.println("Stamina: " + stamina);
        System.out.println("Life: " + life);
        System.out.println("Rank: " + rank);
    }

    public void heavyAttack() 
    {
        if (stamina >= 5)
        {
            System.out.println(name + " performs a heavy attack!");
            stamina -= 5;
            System.out.println("Stamina after attack: " + stamina);
        } 
        else 
        {
            System.out.println(name + " does not have enough stamina for a heavy attack!");
        }
    }

    public void defend(int incomingDamage)
    {
        int damageReduced = defense / 2;
        int damageTaken = Math.max(0, incomingDamage - damageReduced);
        life -= damageTaken;
        System.out.println(name + " defends against the attack, taking " + damageTaken + " damage.");
        System.out.println("Remaining life: " + life);
    }

    public void rest() 
    {
        System.out.println(name + " takes a rest to recover stamina.");
        stamina += 10;
        System.out.println("Stamina after resting: " + stamina);
    }

    @Override
    public void survive(int life, boolean attack)
    {
        super.survive(life, attack);
        if (!attack)
        {
            defense += 5;  // Warrior gains more defense when not attacking
            System.out.println("Warrior's defense increased to: " + defense);
        }
    }

    @Override
    public void performActionBasedOnRank()
    {
        super.performActionBasedOnRank();
        if (rank >= 8) 
        {
            System.out.println(name + " has reached a high rank and unlocked the special ability: Berserk Mode!");
        }
    }
}
