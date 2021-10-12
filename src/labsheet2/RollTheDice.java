package labsheet2;

import javax.swing.*;

public class RollTheDice {
    public static char rollTheDice(){
        int playRoll;
        int compRoll = (int)(Math.random()*11) + 2;
        String message = "The computer rolled " + compRoll + "\nNow return to show the player roll.";

        JOptionPane.showMessageDialog(null, message, "Computer Roll",
                JOptionPane.INFORMATION_MESSAGE);

        playRoll = (int)(Math.random()*11) + 2;

        JOptionPane.showMessageDialog(null, "The player rolled " + playRoll, "Player Roll",
                JOptionPane.INFORMATION_MESSAGE);

        if (compRoll > playRoll) {
            return 'c';
        } else if (compRoll < playRoll) {
            return 'p';
        } else {
            return 'd';
        }
    }

    public static void main(String[] args) {
        int comp = 0, play = 0, draw = 0, numGames = 0;
        char result;
        String answer = JOptionPane.showInputDialog("Would you like to play a game?");

        while (answer.equals("yes")) {
            result = rollTheDice();

            numGames++;

            if (result == 'c') {
                comp++;
            } else if (result == 'p') {
                play++;
            } else {
                draw++;
            }

            String endgame = String.format("Games played: %s\nComputer wins: %s\nPlayer wins: %s\nDraws: %s",
                    numGames, comp, play, draw);
            JOptionPane.showMessageDialog(null, endgame, "Game Info",
                    JOptionPane.INFORMATION_MESSAGE);

            answer = JOptionPane.showInputDialog("Would you like to play another game?");
        }
        JOptionPane.showMessageDialog(null, "Thanks for playing!", "Farewell",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
