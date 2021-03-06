package labsheet12.exercise1;

//BorderLayoutWindowEvent.java
/*This program shows how the BorderLayout layout manager and window-events
operate*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

    public class BorderLayoutWindowEvent extends JFrame implements WindowListener {

        private JButton[] jb;

        public BorderLayoutWindowEvent() {
            super("Demonstrating BorderLayout & WindowEvent");

            BorderLayout layout = new BorderLayout(6, 8);
            setLayout(layout);

            String[] regions = {BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST,
                    BorderLayout.WEST, BorderLayout.CENTER};

            jb = new JButton[regions.length];

            for (int i = 0; i < regions.length; i++) {
                jb[i] = new JButton(regions[i]);
                add(jb[i],regions[i]);
            }

            addWindowListener(this);
            setSize(400, 300);

            setVisible(true);
        }


        public static void main(String args[]) {
            BorderLayoutWindowEvent b = new BorderLayoutWindowEvent();
        }

        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {

        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }

        private class WindowEventHandler implements WindowListener {

            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window now opened", "Opening Window",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            //hides the window on closing by default (so application is still actually running in background)
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Now closing window", "Closing Window",
                        JOptionPane.INFORMATION_MESSAGE);
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exiting Application Confirmation",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if(choice==JOptionPane.YES_OPTION)
                    dispose();
            }

            //method only called when dispose() is called on the relevant window from elsewhere
            public void windowClosed(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window Closed (Disposed)", "Window Closed (Disposed)",
                        JOptionPane.INFORMATION_MESSAGE);
            }


            public void windowIconified(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window Minimised", "Window Minimised",
                        JOptionPane.INFORMATION_MESSAGE);

                int random = (int)(Math.random()*5);

                remove(jb[random]); //remove a random button from the JFrame window
            }


            public void windowDeiconified(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window Unminimised", "Window Unminimised",
                        JOptionPane.INFORMATION_MESSAGE);
            }


            public void windowActivated(WindowEvent e) {
                 //better to use console here to prevent logical error
                System.out.println("Window Activated");
            }


            public void windowDeactivated(WindowEvent e) {
                //better to use console here to prevent logical error
                System.out.println("Window Deactivated");
            }
        }
    }
