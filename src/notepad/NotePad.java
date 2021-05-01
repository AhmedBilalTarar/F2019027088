
package notepad;

import javax.swing.JFrame;


public class NotePad {

    
    public static void main(String[] args) {
        NotepadGUI objGUI = new NotepadGUI();
        objGUI.setBounds(0, 0, 650, 650);
        objGUI.setTitle("NotePad");
        objGUI.setResizable(false);
        objGUI.setVisible(true);
        objGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
