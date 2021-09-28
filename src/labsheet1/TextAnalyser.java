package labsheet1;

import javax.swing.*;

public class TextAnalyser {
    public static void main(String[] args){
        int counter = 3;
        int lCount = 1000;
        String[] texts = new String[3];
        do {
            int loop = 4 - counter;
            int vowel = 0;
            int space = 1;
            int ed = 0;
            String input = JOptionPane.showInputDialog("Please enter piece of text " + loop);
            texts[loop-1] = input;
            lCount = input.length();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                // Fix
                char nextC = input.charAt(i+1);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowel++;
                } else if (c == ' ') {
                    space++;
                }
                // Fix
                if (c == 'e' && nextC == 'd') {
                    ed++;
                }
            }
            JOptionPane.showMessageDialog(null, String.format("Number of characters: %d\nNumber of lowercase vowels: %d\n" +
                    "Number of words: %d\nNumber of times \"ed\" appears in the text: %d", lCount, vowel, space, ed), "loop" + loop, JOptionPane.INFORMATION_MESSAGE);
            counter--;
        } while (counter > 0);
    }
}
