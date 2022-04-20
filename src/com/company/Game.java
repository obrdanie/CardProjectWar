//Daniel O'Brien - Anne Cho - Group Project - 3/5/2022
package com.company;

import java.util.Scanner;


public class Game {

    Scanner input = new Scanner(System.in);
    GroupOfCards game = new GroupOfCards();
    Player player = new Player("User");


    public void play() {
        game.createDeck();
        game.shuffle();
        game.splitDeck();

        System.out.println("PLAY [1]");
        System.out.println("CHANGE NAME [2]");
        System.out.println("EXIT [3]");

        while (true) {
            int i = input.nextInt();
            if (i == 1) {
                while (true) {
                    if (game.getUserEmpty() == true) {
                        System.out.println("You Won The Game Congrats");
                        break;
                    }

                    else if (game.getAiEmpty() == true) {
                        System.out.println("The AI Won, Try Next Time");
                        break;
                    }

                    System.out.println(player.getName() + ":");
                    System.out.println("FLIP CARD [1]");
                    System.out.println("EXIT [2]");

                    int e = input.nextInt();

                    if (e == 1) {
                        game.calculateRound();
                    } else if (e == 2) {
                        break;
                    }

                }
            }
            else if (i == 2) {
                System.out.println("What do you want the new name to be? : ");
                String newName = input.nextLine();
                player.setName(newName);
            }
            else if (i == 3) {
                break;
            }
            else {
                System.out.println("Wrong Input");
            }
            System.out.println("PLAY [1]");
            System.out.println("CHANGE NAME [2]");
            System.out.println("EXIT [3]");
        }
    }


}//end class
