/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgame;



/**
 *
 * @author Ben Kaeder and Erich Vrany
 */
public class FinalGame extends NewJFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame().setVisible(true);

            }
        });

        //jTextArea1.setText("asdf");
        
    }

}
