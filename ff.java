package tutorials;
 import java.util.Random;
 import java.util.Scanner;
public class Main{
public static void main(String [] args)
{
//system objects
Scanner in=new Scanner(System.in);
Random rand= new Random();
 
//game variables
String [] enemies={"skeleton","mage","assassin","werewolf","titan","demon"};
int maxenemyhealth=75;
int enemyattackdamage=25;

//player 
int health=100;
int attackdamage=50;
int numhealthpotion=3;
int healthpotionheal=50;
int potiondropchance=50;
boolean running=true;
System.out.println("welcome to dungeon");
GAME:
while(running){
System.out.println("____________________");
int enemyhealth=rand.nextInt(maxenemyhealth);
String enemy=enemies[rand.nextInt(enemies.length)];
System.out.println("\t"+ enemy+"has appeared");
while(enemyhealth>0)
{
System.out.println("your hp"+ health);
System.out.println("enemy hp"+enemyhealth);
System.out.println("\n\twhat would u like to do");
System.out.println(" \t 1 attack");
System.out.println("\t 2 heal");
System.out.println("\t 3 run");

String input=in.nextLine();
if( input.equals("1"))
{
int damagedealt=rand.nextInt(attackdamage);
int damagetaken=rand.nextInt(enemyattackdamage);

enemyhealth-=damagedealt;
health-=damagetaken;
System.out.println("u strike enemy for"+damagedealt+"your health"+health);
if(health<1)
{
System.out.println("you lost health");
break;
}
}
else if(input.equals("2"))
{
if(numhealthpotion>1)
{
health+=healthpotionheal;
System.out.println("you heal for"+healthpotionheal);
numhealthpotion--;

}
else
{ System.out.println("no potion left");
}
}
else if(input.equals("3"))
{
System.out.println("you run from "+enemy);
continue GAME;
}
else
{
    System.out.println("invalid");
}
}
if(health<1)
 {
System.out.println("ypu limp from dungen");
break;
}
System.out.println("enemy was defeated"+enemy+ "u have hp left"+health);
System.out.println("what would u like to do now 1-exit dungeon 2- continue");

String input=in.nextLine();
 while(!input.equals("1")&&!input.equals("2"))
{
System.out.println("invalid");
input=in.nextLine();
}

if(input.equals("1"))
System.out.println("ypu continue");
if(input.equals("1"))
{
System.out.println("ypu exit");
break;
}
}
}
}
