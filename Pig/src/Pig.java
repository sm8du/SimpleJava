import java.util.Scanner;
import java.util.Random;

public class Pig {

 /**
  * @param args
  */
 public static void main(String[] args) {
  System.out.println("Welcome to Pig!!!");
  System.out.println("The player who accumulates a total of 50 or more points wins!!!");

  Scanner keyboard = new Scanner(System.in);
  int player1Bank = 0, player2Bank = 0;
  Random randomGenerator = new Random();
  int dieRoll1 = 0, dieRoll2 = 0;
  int winningScore = 50;
  char response1, response2;

  while (player1Bank < winningScore && player2Bank < winningScore) {
   int tempplayer1Bank = 0, templayer2Bank = 0;
   dieRoll1 = 0;
   dieRoll2 = 0;
   while (player1Bank < winningScore && dieRoll1 != 1) {
    System.out.println();
    System.out.print("Player 1 Roll or bank?: ");
    response1 = keyboard.nextLine().charAt(0); // Player one jank

    if (response1 == 'R' || response1 == 'r') {
     dieRoll1 = randomGenerator.nextInt(6) + 1;
     if (dieRoll1 != 1) {
      tempplayer1Bank += dieRoll1;
      System.out.println("You rolled a " + dieRoll1
       + ". Your total this turn is " + tempplayer1Bank + " and your overall total is still "+player1Bank+"!");
     } else if (dieRoll1 == 1){
      System.out.println("You rolled a one, your overall total is still: "+ player1Bank);
      break;}

    }

    if (response1 == 'B' || response1 == 'b') {
     player1Bank += tempplayer1Bank;
     System.out.println("Your overall total is now " + player1Bank);
     break;
    }
    
     
   
   }

   if (player1Bank >= winningScore){
    System.out.println("You won, Player 1!");
    System.out.println("Good Game!");
    System.exit(0);
   }
   
   while (player2Bank < winningScore && dieRoll2 != 1) {
    System.out.println();
    System.out.print("Player 2 Roll or bank?: ");
    response2 = keyboard.nextLine().charAt(0); // Player two jank

    if (response2 == 'R' || response2 == 'r') {
     dieRoll2 = randomGenerator.nextInt(6) + 1;
     if (dieRoll2 != 1) {
      templayer2Bank += dieRoll2;
      System.out.println("You rolled a " + dieRoll2+ ". Your total this turn  is still " + templayer2Bank 
        +" and your overall total is "+player2Bank+"!");}
     else if (dieRoll2 == 1){
      System.out.println("You rolled a one, your overall total is still: "+ player2Bank);
      break;}

    }

    if (response2 == 'B' || response2 == 'b') {
     player2Bank += templayer2Bank;
     System.out.println("Your overall total is now " + player2Bank);
     break;
    }
   }
 
   if (player2Bank >= winningScore){
    System.out.println("You won, Player 2!");
    System.out.println("Good Game!");
    System.exit(0);
   }
  
  } 
 }
}

 