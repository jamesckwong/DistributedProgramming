import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
 class AFrame extends JFrame
 {
    public static void main( String[] args)
   {
    AFrame w = new AFrame();
    w.setVisible(true);
   }
   AFrame()
   {
   this.setBounds(100, 100, 300, 300);
   InetAddress host = null;
   System.out.println("Looking up host");
   
    try
   

     {
      
      Container cp = getContentPane();
      JLabel hostname = new JLabel("Host name:" + host.getHostName());
      JLabel IPAddress = new JLabel("IP address" + host.getHostAddress());
      cp.add( hostname );
      cp.add( IPAddress);
      }
         catch( UnknownHostException e )
      {
      
     }
   
   
 }
 }

  