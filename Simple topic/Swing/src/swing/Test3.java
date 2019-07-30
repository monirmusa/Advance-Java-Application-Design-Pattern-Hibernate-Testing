
package swing;

import javax.swing.JOptionPane;

/**
 *
 * @author Monirujjaman musa
 */
public class Test3 {
    public static void main(String[] args) {
       int choice=JOptionPane.showConfirmDialog(null,"Do you want Quait this program","Musa",JOptionPane.YES_NO_OPTION); 
       
       if(choice==JOptionPane.YES_OPTION)
       {
           System.exit(0); // program will be close//
       }
        
       else
       {
       System.out.print("you have clicked no option");//console show this message//
       }
   }
    
}
