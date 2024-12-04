public class MyClass
{
  public static void main(String args[])
  {
        Character[] characters = new Character[10];
        characters[0] = new Character("Alice", "Warrior", 6, 100, 1, 1, 1, 6, 10, 3, true, false);
        characters[1] = new Character("Bob", "Mage", 5, 80, -1, 1, 1, 5, 9, 2, false, true);
        characters[2] = new Character("Charlie", "Rogue", 4, 60, -1, -1, 1, 4, 8, 1, true, false);
        characters[3] = new Character("Dave", "Cleric", 3, 40, 1, -1, 1, 3, 7, 2, false, true);
        characters[4] = new Character("Eve", "Paladin", 2, 20, 0, 1, 1, 2, 6, 3, true, false);
        characters[5] = new Character("Frank", "Druid", 1, 10, 0, -1, 1, 1, 5, 1, false, true);
        characters[6] = new Character("Grace", "Hunter", 0, 50, 1, 0, 1, 0, 4, 3, true, false);
        characters[7] = new Character("Hank", "Monk", 6, 70, -1, 0, 1, 6, 3, 2, false, true);
        characters[8] = new Character("Ivy", "Bard", 5, 90, 1, 1, 0, 5, 2, 1, true, false);
        characters[9] = new Character("Jack", "Sorcerer", 4, 30, -1, -1, 0, 4, 1, 1, false, true);
        
        
        for (Character character : characters) 
        {
            character.getname();
            character.getwork();
            character.getPerformance(character.point);
            character.survive(character.life, character.start);
            character.getpoint(character.life, character.start, character.attempt);
            character.gamecondition(character.start, character.end);
            character.getPosition2D();
            character.getPosition3D();
            character.performActionBasedOnRank();
            character.getgamecondition(character.start, character.end);
        }
        
        Warrior warrior = new Warrior("Alice", 6, 100, 1, 1, 1, 6, 10, 3, true, false, 15, 10, 20);
                       warrior.displayStats();

       
        warrior.heavyAttack();

      
        warrior.defend(20);

       
        warrior.rest();

        
        warrior.survive(warrior.life, false);

        
        warrior.gamecondition(warrior.start, warrior.end);

       
        warrior.getPosition2D();

       
        warrior.getPosition3D();

       
        warrior.performActionBasedOnRank();

        
        warrior.getPerformance(warrior.point);

        
        warrior.getpoint(warrior.life, warrior.start, warrior.attempt);
        Mage mage = new Mage("Bob", 5, 80, -1, 1, 1, 5, 9, 2, false, true, 20, 25); 
       
        mage.castSpell();
       
       mage.regenerateMana(); 
       mage.performActionBasedOnRank();
    public class MyClass
{
  public static void main(String args[])
  {
        Character[] characters = new Character[10];
        characters[0] = new Character("Alice", "Warrior", 6, 100, 1, 1, 1, 6, 10, 3, true, false);
        characters[1] = new Character("Bob", "Mage", 5, 80, -1, 1, 1, 5, 9, 2, false, true);
        characters[2] = new Character("Charlie", "Rogue", 4, 60, -1, -1, 1, 4, 8, 1, true, false);
        characters[3] = new Character("Dave", "Cleric", 3, 40, 1, -1, 1, 3, 7, 2, false, true);
        characters[4] = new Character("Eve", "Paladin", 2, 20, 0, 1, 1, 2, 6, 3, true, false);
        characters[5] = new Character("Frank", "Druid", 1, 10, 0, -1, 1, 1, 5, 1, false, true);
        characters[6] = new Character("Grace", "Hunter", 0, 50, 1, 0, 1, 0, 4, 3, true, false);
        characters[7] = new Character("Hank", "Monk", 6, 70, -1, 0, 1, 6, 3, 2, false, true);
        characters[8] = new Character("Ivy", "Bard", 5, 90, 1, 1, 0, 5, 2, 1, true, false);
        characters[9] = new Character("Jack", "Sorcerer", 4, 30, -1, -1, 0, 4, 1, 1, false, true);
        
        
        for (Character character : characters) 
        {
            character.getname();
            character.getwork();
            character.getPerformance(character.point);
            character.survive(character.life, character.start);
            character.getpoint(character.life, character.start, character.attempt);
            character.gamecondition(character.start, character.end);
            character.getPosition2D();
            character.getPosition3D();
            character.performActionBasedOnRank();
            character.getgamecondition(character.start, character.end);
        }
        
        Warrior warrior = new Warrior("Alice", 6, 100, 1, 1, 1, 6, 10, 3, true, false, 15, 10, 20);
                       warrior.displayStats();

       
        warrior.heavyAttack();

      
        warrior.defend(20);

       
        warrior.rest();

        
        warrior.survive(warrior.life, false);

        
        warrior.gamecondition(warrior.start, warrior.end);

       
        warrior.getPosition2D();

       
        warrior.getPosition3D();

       
        warrior.performActionBasedOnRank();

        
        warrior.getPerformance(warrior.point);

        
        warrior.getpoint(warrior.life, warrior.start, warrior.attempt);
        Mage mage = new Mage("Bob", 5, 80, -1, 1, 1, 5, 9, 2, false, true, 20, 25); 
       
        mage.castSpell();
       
       mage.regenerateMana(); 
       mage.performActionBasedOnRank();
    public class MyClass
{
  public static void main(String args[])
  {
        Character[] characters = new Character[10];
        characters[0] = new Character("Alice", "Warrior", 6, 100, 1, 1, 1, 6, 10, 3, true, false);
        characters[1] = new Character("Bob", "Mage", 5, 80, -1, 1, 1, 5, 9, 2, false, true);
        characters[2] = new Character("Charlie", "Rogue", 4, 60, -1, -1, 1, 4, 8, 1, true, false);
        characters[3] = new Character("Dave", "Cleric", 3, 40, 1, -1, 1, 3, 7, 2, false, true);
        characters[4] = new Character("Eve", "Paladin", 2, 20, 0, 1, 1, 2, 6, 3, true, false);
        characters[5] = new Character("Frank", "Druid", 1, 10, 0, -1, 1, 1, 5, 1, false, true);
        characters[6] = new Character("Grace", "Hunter", 0, 50, 1, 0, 1, 0, 4, 3, true, false);
        characters[7] = new Character("Hank", "Monk", 6, 70, -1, 0, 1, 6, 3, 2, false, true);
        characters[8] = new Character("Ivy", "Bard", 5, 90, 1, 1, 0, 5, 2, 1, true, false);
        characters[9] = new Character("Jack", "Sorcerer", 4, 30, -1, -1, 0, 4, 1, 1, false, true);
        
        
        for (Character character : characters) 
        {
            character.getname();
            character.getwork();
            character.getPerformance(character.point);
            character.survive(character.life, character.start);
            character.getpoint(character.life, character.start, character.attempt);
            character.gamecondition(character.start, character.end);
            character.getPosition2D();
            character.getPosition3D();
            character.performActionBasedOnRank();
            character.getgamecondition(character.start, character.end);
        }
        
        Warrior warrior = new Warrior("Alice", 6, 100, 1, 1, 1, 6, 10, 3, true, false, 15, 10, 20);
                       warrior.displayStats();

       
        warrior.heavyAttack();

      
        warrior.defend(20);

       
        warrior.rest();

        
        warrior.survive(warrior.life, false);

        
        warrior.gamecondition(warrior.start, warrior.end);

       
        warrior.getPosition2D();

       
        warrior.getPosition3D();

       
        warrior.performActionBasedOnRank();

        
        warrior.getPerformance(warrior.point);

        
        warrior.getpoint(warrior.life, warrior.start, warrior.attempt);
        Mage mage = new Mage("Bob", 5, 80, -1, 1, 1, 5, 9, 2, false, true, 20, 25); 
       
        mage.castSpell();
       
       mage.regenerateMana(); 
       mage.performActionBasedOnRank();
    public class MyClass
{
  public static void main(String args[])
  {
        Character[] characters = new Character[10];
        characters[0] = new Character("Alice", "Warrior", 6, 100, 1, 1, 1, 6, 10, 3, true, false);
        characters[1] = new Character("Bob", "Mage", 5, 80, -1, 1, 1, 5, 9, 2, false, true);
        characters[2] = new Character("Charlie", "Rogue", 4, 60, -1, -1, 1, 4, 8, 1, true, false);
        characters[3] = new Character("Dave", "Cleric", 3, 40, 1, -1, 1, 3, 7, 2, false, true);
        characters[4] = new Character("Eve", "Paladin", 2, 20, 0, 1, 1, 2, 6, 3, true, false);
        characters[5] = new Character("Frank", "Druid", 1, 10, 0, -1, 1, 1, 5, 1, false, true);
        characters[6] = new Character("Grace", "Hunter", 0, 50, 1, 0, 1, 0, 4, 3, true, false);
        characters[7] = new Character("Hank", "Monk", 6, 70, -1, 0, 1, 6, 3, 2, false, true);
        characters[8] = new Character("Ivy", "Bard", 5, 90, 1, 1, 0, 5, 2, 1, true, false);
        characters[9] = new Character("Jack", "Sorcerer", 4, 30, -1, -1, 0, 4, 1, 1, false, true);
        
        
        for (Character character : characters) 
        {
            character.getname();
            character.getwork();
            character.getPerformance(character.point);
            character.survive(character.life, character.start);
            character.getpoint(character.life, character.start, character.attempt);
            character.gamecondition(character.start, character.end);
            character.getPosition2D();
            character.getPosition3D();
            character.performActionBasedOnRank();
            character.getgamecondition(character.start, character.end);
        }
        
        Warrior warrior = new Warrior("Alice", 6, 100, 1, 1, 1, 6, 10, 3, true, false, 15, 10, 20);
                       warrior.displayStats();

       
        warrior.heavyAttack();

      
        warrior.defend(20);

       
        warrior.rest();

        
        warrior.survive(warrior.life, false);

        
        warrior.gamecondition(warrior.start, warrior.end);

       
        warrior.getPosition2D();

       
        warrior.getPosition3D();

       
        warrior.performActionBasedOnRank();

        
        warrior.getPerformance(warrior.point);

        
        warrior.getpoint(warrior.life, warrior.start, warrior.attempt);
        Mage mage = new Mage("Bob", 5, 80, -1, 1, 1, 5, 9, 2, false, true, 20, 25); 
       
        mage.castSpell();
       
       mage.regenerateMana(); 
       mage.performActionBasedOnRank();
    public class MyClass
{
  public static void main(String args[])
  {
        Character[] characters = new Character[10];
        characters[0] = new Character("Alice", "Warrior", 6, 100, 1, 1, 1, 6, 10, 3, true, false);
        characters[1] = new Character("Bob", "Mage", 5, 80, -1, 1, 1, 5, 9, 2, false, true);
        characters[2] = new Character("Charlie", "Rogue", 4, 60, -1, -1, 1, 4, 8, 1, true, false);
        characters[3] = new Character("Dave", "Cleric", 3, 40, 1, -1, 1, 3, 7, 2, false, true);
        characters[4] = new Character("Eve", "Paladin", 2, 20, 0, 1, 1, 2, 6, 3, true, false);
        characters[5] = new Character("Frank", "Druid", 1, 10, 0, -1, 1, 1, 5, 1, false, true);
        characters[6] = new Character("Grace", "Hunter", 0, 50, 1, 0, 1, 0, 4, 3, true, false);
        characters[7] = new Character("Hank", "Monk", 6, 70, -1, 0, 1, 6, 3, 2, false, true);
        characters[8] = new Character("Ivy", "Bard", 5, 90, 1, 1, 0, 5, 2, 1, true, false);
        characters[9] = new Character("Jack", "Sorcerer", 4, 30, -1, -1, 0, 4, 1, 1, false, true);
        
        
        for (Character character : characters) 
        {
            character.getname();
            character.getwork();
            character.getPerformance(character.point);
            character.survive(character.life, character.start);
            character.getpoint(character.life, character.start, character.attempt);
            character.gamecondition(character.start, character.end);
            character.getPosition2D();
            character.getPosition3D();
            character.performActionBasedOnRank();
            character.getgamecondition(character.start, character.end);
        }
        
        Warrior warrior = new Warrior("Alice", 6, 100, 1, 1, 1, 6, 10, 3, true, false, 15, 10, 20);
                       warrior.displayStats();

       
        warrior.heavyAttack();

      
        warrior.defend(20);

       
        warrior.rest();

        
        warrior.survive(warrior.life, false);

        
        warrior.gamecondition(warrior.start, warrior.end);

       
        warrior.getPosition2D();

       
        warrior.getPosition3D();

       
        warrior.performActionBasedOnRank();

        
        warrior.getPerformance(warrior.point);

        
        warrior.getpoint(warrior.life, warrior.start, warrior.attempt);
        Mage mage = new Mage("Bob", 5, 80, -1, 1, 1, 5, 9, 2, false, true, 20, 25); 
       
        mage.castSpell();
       
       mage.regenerateMana(); 
       mage.performActionBasedOnRank();
    }
}

    }
}

  }
}
    public class MyClass
{
  public static void main(String args[])
  {
        Character[] characters = new Character[10];
        characters[0] = new Character("Alice", "Warrior", 6, 100, 1, 1, 1, 6, 10, 3, true, false);
        characters[1] = new Character("Bob", "Mage", 5, 80, -1, 1, 1, 5, 9, 2, false, true);
        characters[2] = new Character("Charlie", "Rogue", 4, 60, -1, -1, 1, 4, 8, 1, true, false);
        characters[3] = new Character("Dave", "Cleric", 3, 40, 1, -1, 1, 3, 7, 2, false, true);
        characters[4] = new Character("Eve", "Paladin", 2, 20, 0, 1, 1, 2, 6, 3, true, false);
        characters[5] = new Character("Frank", "Druid", 1, 10, 0, -1, 1, 1, 5, 1, false, true);
        characters[6] = new Character("Grace", "Hunter", 0, 50, 1, 0, 1, 0, 4, 3, true, false);
        characters[7] = new Character("Hank", "Monk", 6, 70, -1, 0, 1, 6, 3, 2, false, true);
        characters[8] = new Character("Ivy", "Bard", 5, 90, 1, 1, 0, 5, 2, 1, true, false);
        characters[9] = new Character("Jack", "Sorcerer", 4, 30, -1, -1, 0, 4, 1, 1, false, true);
        
        
        for (Character character : characters) 
        {
            character.getname();
            character.getwork();
            character.getPerformance(character.point);
            character.survive(character.life, character.start);
            character.getpoint(character.life, character.start, character.attempt);
            character.gamecondition(character.start, character.end);
            character.getPosition2D();
            character.getPosition3D();
            character.performActionBasedOnRank();
            character.getgamecondition(character.start, character.end);
        }
        
        Warrior warrior = new Warrior("Alice", 6, 100, 1, 1, 1, 6, 10, 3, true, false, 15, 10, 20);
                       warrior.displayStats();

       
        warrior.heavyAttack();

      
        warrior.defend(20);

       
        warrior.rest();

        
        warrior.survive(warrior.life, false);

        
        warrior.gamecondition(warrior.start, warrior.end);

       
        warrior.getPosition2D();

       
        warrior.getPosition3D();

       
        warrior.performActionBasedOnRank();

        
        warrior.getPerformance(warrior.point);

        
        warrior.getpoint(warrior.life, warrior.start, warrior.attempt);
        Mage mage = new Mage("Bob", 5, 80, -1, 1, 1, 5, 9, 2, false, true, 20, 25); 
       
        mage.castSpell();
       
       mage.regenerateMana(); 
       mage.performActionBasedOnRank();
    }
}

    }
}

  }
}
public class MyClass
{
  public static void main(String args[])
  {
        Character[] characters = new Character[10];
        characters[0] = new Character("Alice", "Warrior", 6, 100, 1, 1, 1, 6, 10, 3, true, false);
        characters[1] = new Character("Bob", "Mage", 5, 80, -1, 1, 1, 5, 9, 2, false, true);
        characters[2] = new Character("Charlie", "Rogue", 4, 60, -1, -1, 1, 4, 8, 1, true, false);
        characters[3] = new Character("Dave", "Cleric", 3, 40, 1, -1, 1, 3, 7, 2, false, true);
        characters[4] = new Character("Eve", "Paladin", 2, 20, 0, 1, 1, 2, 6, 3, true, false);
        characters[5] = new Character("Frank", "Druid", 1, 10, 0, -1, 1, 1, 5, 1, false, true);
        characters[6] = new Character("Grace", "Hunter", 0, 50, 1, 0, 1, 0, 4, 3, true, false);
        characters[7] = new Character("Hank", "Monk", 6, 70, -1, 0, 1, 6, 3, 2, false, true);
        characters[8] = new Character("Ivy", "Bard", 5, 90, 1, 1, 0, 5, 2, 1, true, false);
        characters[9] = new Character("Jack", "Sorcerer", 4, 30, -1, -1, 0, 4, 1, 1, false, true);
        
        
        for (Character character : characters) 
        {
            character.getname();
            character.getwork();
            character.getPerformance(character.point);
            character.survive(character.life, character.start);
            character.getpoint(character.life, character.start, character.attempt);
            character.gamecondition(character.start, character.end);
            character.getPosition2D();
            character.getPosition3D();
            character.performActionBasedOnRank();
            character.getgamecondition(character.start, character.end);
        }
        
        Warrior warrior = new Warrior("Alice", 6, 100, 1, 1, 1, 6, 10, 3, true, false, 15, 10, 20);
                       warrior.displayStats();

       
        warrior.heavyAttack();

      
        warrior.defend(20);

       
        warrior.rest();

        
        warrior.survive(warrior.life, false);

        
        warrior.gamecondition(warrior.start, warrior.end);

       
        warrior.getPosition2D();

       
        warrior.getPosition3D();

       
        warrior.performActionBasedOnRank();

        
        warrior.getPerformance(warrior.point);

        
        warrior.getpoint(warrior.life, warrior.start, warrior.attempt);
        Mage mage = new Mage("Bob", 5, 80, -1, 1, 1, 5, 9, 2, false, true, 20, 25); 
       
        mage.castSpell();
       
       mage.regenerateMana(); 
       mage.performActionBasedOnRank();
    }
}

    }
}

  }
}
public class MyClass
{
  public static void main(String args[])
  {
        Character[] characters = new Character[10];
        characters[0] = new Character("Alice", "Warrior", 6, 100, 1, 1, 1, 6, 10, 3, true, false);
        characters[1] = new Character("Bob", "Mage", 5, 80, -1, 1, 1, 5, 9, 2, false, true);
        characters[2] = new Character("Charlie", "Rogue", 4, 60, -1, -1, 1, 4, 8, 1, true, false);
        characters[3] = new Character("Dave", "Cleric", 3, 40, 1, -1, 1, 3, 7, 2, false, true);
        characters[4] = new Character("Eve", "Paladin", 2, 20, 0, 1, 1, 2, 6, 3, true, false);
        characters[5] = new Character("Frank", "Druid", 1, 10, 0, -1, 1, 1, 5, 1, false, true);
        characters[6] = new Character("Grace", "Hunter", 0, 50, 1, 0, 1, 0, 4, 3, true, false);
        characters[7] = new Character("Hank", "Monk", 6, 70, -1, 0, 1, 6, 3, 2, false, true);
        characters[8] = new Character("Ivy", "Bard", 5, 90, 1, 1, 0, 5, 2, 1, true, false);
        characters[9] = new Character("Jack", "Sorcerer", 4, 30, -1, -1, 0, 4, 1, 1, false, true);
        
        
        for (Character character : characters) 
        {
            character.getname();
            character.getwork();
            character.getPerformance(character.point);
            character.survive(character.life, character.start);
            character.getpoint(character.life, character.start, character.attempt);
            character.gamecondition(character.start, character.end);
            character.getPosition2D();
            character.getPosition3D();
            character.performActionBasedOnRank();
            character.getgamecondition(character.start, character.end);
        }
        
        Warrior warrior = new Warrior("Alice", 6, 100, 1, 1, 1, 6, 10, 3, true, false, 15, 10, 20);
                       warrior.displayStats();

       
        warrior.heavyAttack();

      
        warrior.defend(20);

       
        warrior.rest();

        
        warrior.survive(warrior.life, false);

        
        warrior.gamecondition(warrior.start, warrior.end);

       
        warrior.getPosition2D();

       
        warrior.getPosition3D();

       
        warrior.performActionBasedOnRank();

        
        warrior.getPerformance(warrior.point);

        
        warrior.getpoint(warrior.life, warrior.start, warrior.attempt);
        Mage mage = new Mage("Bob", 5, 80, -1, 1, 1, 5, 9, 2, false, true, 20, 25); 
       
        mage.castSpell();
       
       mage.regenerateMana(); 
       mage.performActionBasedOnRank();
    }
}

    }
}

  }
}
    }
}

    }
}

  }
}
    }
}

    }
}

  }
}
    }
}

    }
}

  }
}
    }
}

    }
}

  }
}
