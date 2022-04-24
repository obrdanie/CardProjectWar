//Daniel O'Brien - Anne Cho - Group Project - 3/5/2022
package com.company;

import java.util.Scanner;


public class Game {

    //Initiation of the scanner object, player and groupofcards. The scanner is for getting user input
    Scanner input = new Scanner(System.in);
    GroupOfCards game = new GroupOfCards();
    //default name is user
    Player player = new Player("User");


    //Play function that uses while loops to instantiates the game
    public void play() {
        game.createDeck();
        game.shuffle();
        game.splitDeck();

        //Prompts user for input prompt
        System.out.println("PLAY [1]");
        System.out.println("CHANGE NAME [2]");
        System.out.println("EXIT [3]");

        //while loop that initiates the game
        while (true) {
            //gets user input
            int i = input.nextInt();
            //if statement that checks if the user wants to play
            if (i == 1) {
                //another while loop for the main game
                while (true) {
                    //if statements that check if the users won or lost
                    if (game.getUserEmpty() == true) {
                        System.out.println("You Won The Game Congrats");
                        break;
                    }

                    else if (game.getAiEmpty() == true) {
                        System.out.println("The AI Won, Try Next Time");
                        break;
                    }

                    //prompts for the users name and next input
                    System.out.println(player.getName() + ":");
                    System.out.println("FLIP CARD [1]");
                    System.out.println("EXIT [2]");

                    int e = input.nextInt();

                    //calculates round
                    if (e == 1) {
                        game.calculateRound();
                    }
                    //exits game
                    else if (e == 2) {
                        break;
                    }

                }
            }
            //changes username
            else if (i == 2) {
                System.out.println("What do you want the new name to be? : ");
                String newName = input.nextLine();
                player.setName(newName);
            }
            //exits game
            else if (i == 3) {
                break;
            }
            //if they input something else, it prompts them with wrong input
            else {
                System.out.println("Wrong Input");
            }
            //reloops if for whatever reason none of the options are chosen
            System.out.println("PLAY [1]");
            System.out.println("CHANGE NAME [2]");
            System.out.println("EXIT [3]");
        }
    }


}//end class
