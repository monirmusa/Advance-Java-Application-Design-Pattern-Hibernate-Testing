
package swing;

import javax.swing.JOptionPane;

/**
 *
 * @author Monirujjaman musa
 */
public class Test2 {
    
    public static void main(String[] args) {
        String f_name=JOptionPane.showInputDialog(null,"Enter Your First Name","Info box",JOptionPane.QUESTION_MESSAGE);/*name+header+question icone*/
        String l_name=JOptionPane.showInputDialog(null,"Enter Your Last Name");
        
         String name= f_name+" "+l_name;
         JOptionPane.showMessageDialog(null,"Your Full Name is " +name);
    }
}
