public class Character 
{
    public String name;
    public String work;
    public int performance;
    public int life;
    public int x;
    public int y;
    public int z;
    public int point=0;
    public int rank;
    public boolean attack=false;
    public int attempt=5;
    public boolean start;
    public boolean end;
    public Character(String name, String work, int performance, int life, int x, int y, int z, int point, int rank,int attempt,boolean start,boolean end) 
    {
        this.name = name;
        this.work = work;
        this.performance = performance;
        this.life = life;
        this.x = x;
        this.y = y;
        this.z = z;
        this.point = point;
        this.rank = rank;
        this.attempt=attempt;
        this.start=start;
        this.end=end;
    }
    public String getname()
    {
        System.out.println("The name of character is:"+name);
        return name;
    }
    public String getwork()
    {
        System.out.println("The work of character is:"+work);
        return work;
    }
   public void getPerformance(int point)
   {
    if (point == 6)
    {
        System.out.println("The performance of character is excellent.");
    } 
    else if (point == 5)
    {
        System.out.println("The performance of character is very good.");
    } 
    else if (point == 4) 
    {
        System.out.println("The performance of character is good.");
    } 
    else if (point == 3)
    {
        System.out.println("The performance of character is average.");
    }
    else if (point == 2)
    {
        System.out.println("The performance of character is below average.");
    }
    else if (point == 1) 
    {
        System.out.println("The performance of character is poor.");
    } 
    else if (point == 0) 
    {
        System.out.println("The performance of character is very poor.");
    } else
    {
        System.out.println("Invalid point value.");
    }
   }
    public void survive(int life,boolean attack)
    {
        if(!attack)
        {
            while(life>0)
            {
                life=life/5;
            }
            System.out.println("The  character is surviving.The present life is:"+life);
        }
        if(!attack&&life==0)
        {
            System.out.println("The  character is not surviving.The present life is 0.");
        }
        if(attack)
        {
            System.out.println("The  character is  surviving.The present life is unchanged.The present life is:"+life);
        }
    }
    public void getpoint(int life,boolean attack,int attempt)
    {
        if(!attack)
        {
            while(life>0&&attempt>0)
            {
                life=life/10;
                point+=5;
                attempt--;
            }
            System.out.println("The current point is:"+point+"Remaining attempt is:"+attempt);
        }
        if(attempt==0)
        {
            System.out.println("Game over.The attempt is 0");
        }
    }
    public void gamecondition(boolean start,boolean end)
    {
        if(start==true&&end==false)
        {
            System.out.println("Game started.");
        }
        if(start==false&&end==true)
        {
            System.out.println("Game end.");
        }
    }
    public String getPosition2D() 
    {
    if (x == 0 && y == 0)
    {
        System.out.println("The position is in origin. The current position is: (" + x + "," + y + ")");
        return "The position is in origin. The current position is: (" + x + "," + y + ")";
    } 
    else if (x > 0 && y > 0)
    {
        System.out.println("The position is in the 1st quadrant. The current position is: (" + x + "," + y + ")");
        return "The position is in the 1st quadrant. The current position is: (" + x + "," + y + ")";
    } 
    else if (x < 0 && y > 0)
    {
        System.out.println("The position is in the 2nd quadrant. The current position is: (" + x + "," + y + ")");
        return "The position is in the 2nd quadrant. The current position is: (" + x + "," + y + ")";
    } 
    else if (x < 0 && y < 0)
    {
        System.out.println("The position is in the 3rd quadrant. The current position is: (" + x + "," + y + ")");
        return "The position is in the 3rd quadrant. The current position is: (" + x + "," + y + ")";
    } 
    else if (x > 0 && y < 0)
    {
        System.out.println("The position is in the 4th quadrant. The current position is: (" + x + "," + y + ")");
        return "The position is in the 4th quadrant. The current position is: (" + x + "," + y + ")";
    } 
    else if (x == 0 && y > 0)
    {
        System.out.println("The position is on the positive y-axis. The current position is: (" + x + "," + y + ")");
        return "The position is on the positive y-axis. The current position is: (" + x + "," + y + ")";
    } 
    else if (x == 0 && y < 0)
    {
        System.out.println("The position is on the negative y-axis. The current position is: (" + x + "," + y + ")");
        return "The position is on the negative y-axis. The current position is: (" + x + "," + y + ")";
    } 
    else if (y == 0 && x > 0)
    {
        System.out.println("The position is on the positive x-axis. The current position is: (" + x + "," + y + ")");
        return "The position is on the positive x-axis. The current position is: (" + x + "," + y + ")";
    } 
    else if (y == 0 && x < 0)
    {
        System.out.println("The position is on the negative x-axis. The current position is: (" + x + "," + y + ")");
        return "The position is on the negative x-axis. The current position is: (" + x + "," + y + ")";
    } 
    else
    {
        System.out.println("The position is somewhere in the 2D plane. The current position is: (" + x + "," + y + ")");
        return "The position is somewhere in the 2D plane. The current position is: (" + x + "," + y + ")";
    }
}
public String getPosition3D() 
{
    if (x == 0 && y == 0 && z == 0) 
    {
        System.out.println("The position is at the origin. The current position is: (" + x + "," + y + "," + z + ")");
        return "The position is at the origin. The current position is: (" + x + "," + y + "," + z + ")";
    }
    else if (x > 0 && y > 0 && z > 0) 
    {
        System.out.println("The position is in the 1st octant. The current position is: (" + x + "," + y + "," + z + ")");
        return "The position is in the 1st octant. The current position is: (" + x + "," + y + "," + z + ")";
    } 
    else if (x < 0 && y > 0 && z > 0)
    {
        System.out.println("The position is in the 2nd octant. The current position is: (" + x + "," + y + "," + z + ")");
        return "The position is in the 2nd octant. The current position is: (" + x + "," + y + "," + z + ")";
    } 
    else if (x < 0 && y < 0 && z > 0)
    {
        System.out.println("The position is in the 3rd octant. The current position is: (" + x + "," + y + "," + z + ")");
        return "The position is in the 3rd octant. The current position is: (" + x + "," + y + "," + z + ")";
    } 
    else if (x > 0 && y < 0 && z > 0)
    {
        System.out.println("The position is in the 4th octant. The current position is: (" + x + "," + y + "," + z + ")");
        return "The position is in the 4th octant. The current position is: (" + x + "," + y + "," + z + ")";
    }
    else if (x > 0 && y > 0 && z < 0)
    {
        System.out.println("The position is in the 5th octant. The current position is: (" + x + "," + y + "," + z + ")");
        return "The position is in the 5th octant. The current position is: (" + x + "," + y + "," + z + ")";
    } 
    else if (x < 0 && y > 0 && z < 0) 
    {
        System.out.println("The position is in the 6th octant. The current position is: (" + x + "," + y + "," + z + ")");
        return "The position is in the 6th octant. The current position is: (" + x + "," + y + "," + z + ")";
    } 
    else if (x < 0 && y < 0 && z < 0)
    {
        System.out.println("The position is in the 7th octant. The current position is: (" + x + "," + y + "," + z + ")");
        return "The position is in the 7th octant. The current position is: (" + x + "," + y + "," + z + ")";
    } 
    else if (x > 0 && y < 0 && z < 0)
    {
        System.out.println("The position is in the 8th octant. The current position is: (" + x + "," + y + "," + z + ")");
        return "The position is in the 8th octant. The current position is: (" + x + "," + y + "," + z + ")";
    } else 
    {
        System.out.println("The position is somewhere in the 3D space. The current position is: (" + x + "," + y + "," + z + ")");
        return "The position is somewhere in the 3D space. The current position is: (" + x + "," + y + "," + z + ")";
    }
}
 public void performActionBasedOnRank() 
 {
        if (rank == 10)
        {
            System.out.println("Rank 10: You are a Legend!");
        } 
        else if (rank == 9)
        {
            System.out.println("Rank 9: You are a Master!");
        } 
        else if (rank == 8) 
        {
            System.out.println("Rank 8: You are an Expert!");
        } 
        else if (rank == 7) 
        {
            System.out.println("Rank 7: You are a Professional!");
        } 
        else if (rank == 6)
        {
            System.out.println("Rank 6: You are a Competent!");
        } 
        else if (rank == 5)
        {
            System.out.println("Rank 5: You are an Intermediate!");
            
        }
        else if (rank == 4)
        {
            System.out.println("Rank 4: You are a Novice!");
            
        }
        else if (rank == 3)
        {
            System.out.println("Rank 3:You are noob!");
        }
        else if (rank == 2)
        {
            System.out.println("Rank 2:You are bad!");
        }
         else if (rank == 1)
        {
            System.out.println("Rank 1:You are starting!");
        }
        if(rank<0)
        {
             System.out.println("Invalid!");
        }
 }
 public void getgamecondition(boolean start,boolean end)
 {
     if(start==true&&end==false)
     {
         System.out.println("Game is started");
      }
      if(start==false&&end==true)
     {
         System.out.println("Game is ended");
      }
}
}
