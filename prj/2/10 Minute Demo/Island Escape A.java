/**
  * file: islandEscape.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Final Project
  * due date: May 4, 2017
  * version: 1.0A
  * 
  */

  /**
  * islandEscape
  * 
  * This class allows for the game to begin by printing
  * a brief title screen.
  */
  
import java.util.Scanner; 
public class islandEscape {
  public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
  printCopyright();
  System.out.println("");
  System.out.println("Press enter to start...");
  System.out.println("");
  input.nextLine();
  clear();
  printStory();
  }
  
  /**
  * printCopyright
  * 
  * This class displays the (fake) copyright information
  * for the game.
  */
  
public static void printCopyright() {
  System.out.println("Island Escape");
  System.out.println("");
  System.out.println("2017  C  Brandon Kline");
  }
  
    /**
  * clear
  * 
  * This class clears the console before the game starts.
  */
  
public static void clear() {
  System.out.print("\033[H\033[2J");  
  System.out.flush();  
  }
  
    /**
  * printStory
  * 
  * This class prints all of the text prompts that make
  * up the game.
  */
  
public static void printStory() {
  System.out.println("You wale up on a deserted island, with no memory of how you got here.");
  System.out.println("All you can seem to recall is that you came from somewhere far away.");
  System.out.println("Knowing that you can't stay here forever, you collect yourself and");
  System.out.println("begin to look around. You manage to spot a beach and a jungle in the");
  System.out.println("distance. What would you like to do?");
  Scanner input = new Scanner(System.in);
  String userinput = input.nextLine();
  if (userinput.equals( "move forward")){
    System.out.println("");
    System.out.println("You walk over to the beach, and can smell the salt of the sea and see");
    System.out.println("a flock of pelicans flying in the distance. You could probably find");
    System.out.println("something of use on this beach. What would you like to do?");	
    }
  String userinput2 = input.nextLine();
  if (userinput2.equals( "search")){
    System.out.println("");
    System.out.println("You find an old machetti laying near the water. It might come in handy.");
    System.out.println("What would you like to do?");
    }
  String userinput3 = input.nextLine();
  if (userinput3.equals( "move forward")){
    System.out.println("");
    System.out.println("You turn around from the sea to face the rest of the island. There");
    System.out.println("seems to be a small opening in a wall of grassy foilage that obscures");
    System.out.println("most of the jungle in front of you. What would you like to do?");
    }
  String userinput4 = input.nextLine();
  if (userinput4.equals( "move forward")){
    System.out.println("");
    System.out.println("You come to a halt as the leaves of the jungle become denser, so much");
    System.out.println("so that it becomes impossible to move forward. What would you like to do?");
    }
  String userinput5 = input.nextLine();
  if (userinput5.equals( "use machetti")){
    System.out.println("");
    System.out.println("You cut through the heavy leafage of the jungle and continue to press");
    System.out.println("onward. You break into the interior of the jungle and find massive trees");
    System.out.println("and many leaves and sticks scattered across the dirt floor. What would");
    System.out.println("you like to do?");
    }
  String userinput6 = input.nextLine();
  if (userinput6.equals( "search")){
    System.out.println("");
    System.out.println("You find a monacle and golden chain lying in the dirt. It looks as if");
    System.out.println("someone had dropped it while passing through here. What would you like");
    System.out.println("to do?");
    }
  String userinput7 = input.nextLine();
  if (userinput7.equals( "move forward")){
    System.out.println("");
    System.out.println("You cut down the thick leafage with your newfound machetti. As you");
    System.out.println("progress deeper into the jungle, you come across a rickety rope bridge,");
    System.out.println("suspended over a chasm below. What would you like to do?");
    }
  String userinput8 = input.nextLine();
  if (userinput8.equals( "search")){
    System.out.println("");
    System.out.println("You find some twine curled up around one of the bridge posts and decide");
    System.out.println("to take it. What would you like to do?");
    }
  String userinput9 = input.nextLine();
  if (userinput9.equals( "move forward")){
    System.out.println("");
    System.out.println("You start to walk across the bridge, but your weight causes a portion of");
    System.out.println("the support to snap. What would you like to do?");
    }
  String userinput10 = input.nextLine();
  if (userinput10.equals( "use machetti")){
    System.out.println("");
    System.out.println("You tie the loose planks of wood together with the twine and the bridge");
    System.out.println("is soon back in working order. What would you like to do?");
    }
  String userinput11 = input.nextLine();
  if (userinput11.equals( "move forward")){
    System.out.print("");
    System.out.println("As you cross the bridge, emerge from the jungle and arrive at the");
    System.out.println("base of the mountain, you notice there is no direct path up to the");
    System.out.println("top. What would you like to do?");
    }
  String userinput12 = input.nextLine();
  if (userinput12.equals( "search")){
    System.out.println("");
    System.out.println("You look around and find some climbing gear. This could be useful.");
    System.out.println("What would you like to do?");
    }
  String userinput13 = input.nextLine();
  if (userinput13.equals( "use climbing gear")){
    System.out.println("");
    System.out.println("You make it halfway up the mountain before you find a proper path");
    System.out.println("and decide to take a break. What would you like to do?");
    }
  String userinput14 = input.nextLine();
  if (userinput14.equals( "search")){
    System.out.println("");
    System.out.println("You find some rocks nearby. Better take them, just in case. What would");
    System.out.println("you like to do?");
    }
  String userinput15 = input.nextLine();
  if (userinput15.equals( "move forward")){
    System.out.println("");
    System.out.println("As you continue hiking up the mountain, you come across a cave. After");
    System.out.println("looking inside, you realize that the cave is a dead end, save for a small");
    System.out.println("unlit braiser at the back. What would you like to do?");
    }
  String userinput16 = input.nextLine();
  if (userinput16.equals( "search")){
    System.out.print("");
    System.out.println("You find a lighter on the floor of the cave that, amazingly, still has");
    System.out.println("some fluid left in it. What would you like to do?");
    }
  String userinput17 = input.nextLine();
  if (userinput17.equals( "use lighter")){
    System.out.print("");
    System.out.println("You light the brasier and a stone rolls back in the rear of the cave,");
    System.out.println("revealing a second room within the tunnel. What would you like to do?");
    }
  String userinput18 = input.nextLine();
  if (userinput18.equals( "move forward")){
    System.out.print("");
    System.out.println("Standing inside the large cavern, you can see plants sprouting up across");
    System.out.println("the room, as well as a huge amount of moss growing on the sides of the");
    System.out.println("walls. What would you like to do?");
    }
  String userinput19 = input.nextLine();
  if (userinput19.equals( "search")){
    System.out.print("");
    System.out.println("You find a pile of dry leaves in the center of the room. You decide to");
    System.out.println("shove some in your pockets and save them for later. What would you like");
    System.out.println("to do?");
    }
  String userinput20 = input.nextLine();
  if (userinput20.equals( "move forward")){
    System.out.print("");
    System.out.println("You exit the large cavern and make your way into a smaller passage off");
    System.out.println("to the side. As you step in, you can see light shining in from the");
    System.out.println("outside. What would you like to do?");
    }
  String userinput21 = input.nextLine();
  if (userinput21.equals( "search")){
    System.out.print("");
    System.out.println("You fint some flint along the sides of the cave. You take some, thinking");
    System.out.println("it might be useful. What would you like to do?");
    }
  String userinput22 = input.nextLine();
  if (userinput22.equals( "move forward")){
    System.out.print("");
    System.out.println("You leave the cave and climb the remaining way up the mountain. You");
    System.out.println("manage to make it to the summit and rest for a while, enjoying the");
    System.out.println("beautiful view. What would you like to do?");
    }
  String userinput23 = input.nextLine();
  if (userinput23.equals( "search")){
    System.out.print("");
    System.out.println("You notice a zipline here at the summit that leads back to the beach.");
    System.out.println("You quickly manage to find a harness and are ready for departure. What");
    System.out.println("would you like to do?");
    }
  String userinput24 = input.nextLine();
  if (userinput24.equals( "use harness")){
    System.out.print("");
    System.out.println("You zipline down the mountain, and before you know it, you're back");
    System.out.println("where you started. You realize you sill need to find a way to get off");
    System.out.println("the island. What would you like to do?");
    }
  String userinput25 = input.nextLine();
  if (userinput25.equals( "use fire")){
    System.out.println("");
    System.out.println("As you look at your gathered materials from your journey, you realize that");
    System.out.println("you could make a fire with what you have collected on your journey. After");
    System.out.println("some effort, you manage to start a fire and are eventually rescued by a");
    System.out.println("passing ship.");
    System.out.println("");
    System.out.print("THE END.");
    }
  }
public static void help() { 
  Scanner input = new Scanner(System.in);
  String userinput = input.nextLine();
  if (userinput.equals( "help")){
    System.out.println("These commands can be used in game:");
    System.out.println("move forward - allows the payer to progress to the next area.");
    System.out.println("move back - allows the payer to return to the previous area.");
    System.out.println("search - allows the payer to search the current area for helpful items.");
    System.out.println("use 'item x' - allows the player to use an item to solve a puzzle.");
    System.out.println("inventory - prints a list of every item in the player's inventory");
    System.out.println("help - brings up the list of commands that the player can use.");
    }
  }
    /**
  * Location
  * 
  * This class stores all of the locations and puzzle
  *  variables for the game.
  */
  
public class Location {
  int beach;
  int jun_o;
  int jun_i;
  int mtn_b;
  int mtn_h;
  int mtn_c1;
  int mtn_c2;
  int mtn_c3;
  int mtn_s;
  int shore;
  boolean puz1;
  boolean puz2;
  boolean puz3;
  boolean puz4;
  boolean puz5;
		
  public void beach() {
	    int locnum = 1;
		boolean havePuz = false;
		}
	  public void jun_o() {
		int locnum = 2;
		boolean havePuz = true;
		}
	  public void jun_i() {
		int locnum = 3;
		boolean havePuz = true;
		}
	  public void mtn_b() {
		int locnum = 4;
		boolean havePuz = true;
		}
	  public void mtn_h() {
		int locnum = 5;
		boolean havePuz = false;
		}
	  public void mtn_c1() {
		int locnum = 6;
		boolean havePuz = true;
		}
	  public void mtn_c2() {
		int locnum = 7;
		boolean havePuz = false;
		}
	  public void mtn_c3() {
		int locnum = 8;
		boolean havePuz = false;
		}
	  public void mtn_s() {
		int locnum = 9;
		boolean havePuz = false;
		}
	  public void shore() {
		int locnum = 10;
		boolean havePuz = true;
		}
	  public void puz1() {
		boolean puzSolved = false;
		}
	  public void puz2() {
		boolean puzSolved = false;
		}
	  public void puz3() {
		boolean puzSolved = false;
		}
	  public void puz4() {
		boolean puzSolved = false;
		}
	  public void puz5() {
		boolean puzSolved = false;
		}
	}
}

  /**
  * Inventory
  * 
  * This class stores all of the inventory
  * variables for the gaame.
  */

public class Inventory {
	{
	  boolean machetti;
	  boolean monacle;
	  boolean twine;
	  boolean c_gear;
	  boolean rocks;
      boolean lighter;
	  boolean leaves;
	  boolean flint;
	  boolean harness;
	  boolean fire;
	  }
	public void machetti() {
	  boolean haveItem = false;
	  boolean usedItem = false;
	  }
	public void monacle() {
	  boolean haveItem = false;
	  boolean usedItem = false;
	  }
	public void twine() {
	  boolean haveItem = false;
	  boolean usedItem = false;
	  }
	public void c_gear() {
      boolean haveItem = false;
	  boolean usedItem = false;
	  }
	public void rocks() {
	  boolean haveItem = false;
	  boolean usedItem = false;
	  }
	public void lighter() {
	  boolean haveItem = false;
	  boolean usedItem = false;
	  }
	public void leaves() {
      boolean haveItem = false;
	  boolean usedItem = false;
	  }
	public void flint() {
	  boolean haveItem = false;
	  boolean usedItem = false;
	  }
	public void harness() {
	  boolean haveItem = false;
	  boolean usedItem = false;
	  }
	public void fire() {
	  boolean haveItem = false;
	  boolean usedItem = false;
	  }
	}