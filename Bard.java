public class Bard extends Character
{
    private int charisma;
    private int musicalSkill;

    public Bard(String name, int performance, int life, int x, int y, int z, int point, int rank, int attempt, boolean start, boolean end, int charisma, int musicalSkill) {
        super(name, "Bard", performance, life, x, y, z, point, rank, attempt, start, end);
        this.charisma = charisma;
        this.musicalSkill = musicalSkill;
    }

    public void displayStats() 
    {
        System.out.println("Name: " + name);
        System.out.println("Class: Bard");
        System.out.println("Charisma: " + charisma);
        System.out.println("Musical Skill: " + musicalSkill);
        System.out.println("Life: " + life);
        System.out.println("Rank: " + rank);
    }

    public void playInstrument() 
    {
        if (musicalSkill >= 5)
        {
            System.out.println(name + " plays a mesmerizing tune!");
            musicalSkill -= 5;
            System.out.println("Musical Skill after playing: " + musicalSkill);
        } 
        else
        {
            System.out.println(name + " does not have enough skill to play a tune!");
        }
    }

    public void inspire()
    {
        System.out.println(name + " inspires allies with a rousing speech.");
        charisma += 10;
        System.out.println("Charisma after inspiring: " + charisma);
    }

    @Override
    public void performActionBasedOnRank() 
    {
        super.performActionBasedOnRank();
        if (rank >= 8) 
        {
            System.out.println(name + " has reached a high rank and unlocked the special ability: Song of Victory!");
        }
    }
}
