package labsheet1;

import javax.swing.*;

public class TextAnalyser {
    public static void main(String[] args){
        int counter = 3;
        int lCount = 1;
        int totalWords = 0;
        String shortestText = "";
        do {
            int loop = 4 - counter;
            int vowel = 0;
            int words = 1;
            int ed = 0;
            char nextChar = ' ';
            String input = JOptionPane.showInputDialog("Please enter piece of text " + loop);
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (i<input.length()-1) {
                    nextChar = input.charAt(i+1);
                }
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowel++;
                } else if (c == ' ') {
                    words++;
                }
                // Fix
                if (c == 'e' && nextChar == 'd') {
                    ed++;
                }
            }
            JOptionPane.showMessageDialog(null, String.format("Number of characters: %d\nNumber of lowercase vowels: %d\n" +
                    "Number of words: %d\nNumber of times \"ed\" appears in the text: %d", lCount, vowel, words, ed), "loop" + loop, JOptionPane.INFORMATION_MESSAGE);
            counter--;

            if (lCount == 1) {
                shortestText = input;
            } else if (input.length() < shortestText.length()) {
                shortestText = input;
            }

            totalWords += words;
        } while (counter > 0);

        String message = String.format("Shortest text: %s\nAverage number of words: %.0f", shortestText, (totalWords/3f));

        JOptionPane.showMessageDialog(null, message, "Overall Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
