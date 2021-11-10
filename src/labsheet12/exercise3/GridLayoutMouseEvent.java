package labsheet12.exercise3;

//GridLayoutMouseEvent.java
/*This program shows how the GridLayout layout manager and mouse-events
operate*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GridLayoutMouseEvent extends JFrame implements MouseListener {

    private ArrayList<JLabel> jlabels;
    private int clickEventCounter;
    private int result=-1;
    private boolean gameOver=false;
    private Color defaultColour = getBackground();

    private final ImageIcon xImage = new ImageIcon("labsheet12/sampleprogram2/images/cross.gif");
    private final ImageIcon oImage = new ImageIcon("labsheet12/sampleprogram2/images/nought.gif");

    public GridLayoutMouseEvent() {
        super("Demonstrating GridLayout & MouseEvent");

        GridLayout layout = new GridLayout(4, 4, 0,0);
        setLayout(layout);

        jlabels = new ArrayList<>(16);

        System.out.println(layout.getRows()*layout.getColumns());
        for (int i = 0; i <= jlabels.size(); i++) {
            jlabels.set(i, new JLabel("" + (i + 1), SwingConstants.CENTER));
            jlabels.get(i).setBorder(BorderFactory.createEtchedBorder(0, Color.GREEN, Color.RED));
            add(jlabels.get(i));
            jlabels.get(i).addMouseListener(this);
        }

        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }


    public static void main(String[] args) {
        GridLayoutMouseEvent b = new GridLayoutMouseEvent();
    }


    public void mouseClicked(MouseEvent e) {
        clickEventCounter++;

        JLabel label = (JLabel) e.getSource();

        if(!label.getText().equals("")){
            label.setText("");
            if(clickEventCounter%2==1)
                label.setIcon(xImage);
            else
                label.setIcon(oImage);
        }
        else {
            JOptionPane.showMessageDialog(null, "This cell has already been clicked!", "Error!!",
                    JOptionPane.ERROR_MESSAGE);
            clickEventCounter--;
        }



        if(clickEventCounter>=8&&clickEventCounter<=16) {
            result = checkForWinner();

            if (result == 1)
                JOptionPane.showMessageDialog(null, "Player 1 wins!", "Player 1 wins!!",
                        JOptionPane.INFORMATION_MESSAGE);
            else if (result == 2)
                JOptionPane.showMessageDialog(null, "Player 2 wins!", "Player 2 wins!!",
                        JOptionPane.INFORMATION_MESSAGE);
        }

        if(clickEventCounter==16 && result==0) {
            JOptionPane.showMessageDialog(null, "Neither player wins!", "A Tie!!",
                    JOptionPane.INFORMATION_MESSAGE);

            gameOver = true;
        }

        if(result==1 || result==2 || (result==0 && gameOver)) {
            JOptionPane.showMessageDialog(null, "Game Over", "Game Over!!",
                    JOptionPane.INFORMATION_MESSAGE);

             /*I have omitted about 6/7 lines of code here which reset the game back to its original state
             so the user can play again. This is for an exercise that follows this */
        }


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
        JLabel label = (JLabel) e.getSource();
        label.setOpaque(true);
        label.setBackground(Color.CYAN);
    }


    public void mouseExited(MouseEvent e) {
        JLabel label = (JLabel) e.getSource();
        label.setBackground(defaultColour);
    }

    public int checkForWinner(){
        /*I have omitted about 50 lines of code here which check to see whether
        there was a winner and returns the winner. Returning 1 means player 1 wins,
        returning 2 means player 2 wins and returning 0 means neither player wins.
        This is for an exercise that follows this sample program*/
        return 0;
    }
}
