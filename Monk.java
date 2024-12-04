public class Monk extends Character 
{
    private int chi;
    private int martialArtsSkill;

    public Monk(String name, int performance, int life, int x, int y, int z, int point, int rank, int attempt, boolean start, boolean end, int chi, int martialArtsSkill) {
        super(name, "Monk", performance, life, x, y, z, point, rank, attempt, start, end);
        this.chi = chi;
        this.martialArtsSkill = martialArtsSkill;
    }

    public void displayStats() 
    {
        System.out.println("Name: " + name);
        System.out.println("Class: Monk");
        System.out.println("Chi: " + chi);
        System.out.println("Martial Arts Skill: " + martialArtsSkill);
        System.out.println("Life: " + life);
        System.out.println("Rank: " + rank);
    }

    public void performMartialArts()
    {
        if (martialArtsSkill >= 5)
        {
            System.out.println(name + " performs a powerful martial arts move!");
            martialArtsSkill -= 5;
            System.out.println("Martial Arts Skill after move: " + martialArtsSkill);
        } 
        else
        {
            System.out.println(name + " does not have enough skill for a powerful move!");
        }
    }

    public void meditate()
    {
        System.out.println(name + " meditates to restore chi.");
        chi += 10;
        System.out.println("Chi after meditation: " + chi);
    }

    @Override
    public void performActionBasedOnRank()
    {
        super.performActionBasedOnRank();
        if (rank >= 8) {
            System.out.println(name + " has reached a high rank and unlocked the special ability: Dragon Stance!");
        }
    }
}
