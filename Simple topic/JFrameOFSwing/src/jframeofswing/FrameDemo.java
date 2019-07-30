
package jframeofswing;

import javax.swing.JFrame;// for 9 line's  object//

public class FrameDemo {
    public static void main(String[] args) {
      
        JFrame frame=new JFrame();// object create//
        
        frame.setVisible(true);// to see  window on screne//
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to off cntinuasly running program//
    //
        frame.setSize(200,50);//for size//
                         /*frame.setLocationRelativeTo(null);//for center//       */
        frame.setLocation(400,300);//400 from right,200 from up//
    //
        frame.setBounds(200, 50, 400, 300);//Mixed up of setSize and SetLocation//
        frame.setTitle("Musa");
        frame.setResizable(false);// minimize and maximize cannot be done//
        
        
        
    }
}
