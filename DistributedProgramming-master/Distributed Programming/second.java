import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

   public class second extends JPanel implements ActionListener{
      private Timer animator;
      private ImageIcon imageArray[];
      private int delay = 50, totalFrames = 32, currentFrame = 0;
   
 
      
         public second() {
            imageArray = new ImageIcon[totalFrames];
            for (int i=0; i < imageArray.length; i++) {
               imageArray[i] = new ImageIcon("racecar" + i + ".png");
            }
            animator = new Timer(delay, this);
            animator.start();
           
         }
         
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (currentFrame >= imageArray.length) {
                currentFrame = 0;
            }
            currentFrame++;
            imageArray[currentFrame].paintIcon(this, g, 0, 0);
            
         }
         public void actionPerformed(ActionEvent e) {
            repaint();
         }
       
      }
