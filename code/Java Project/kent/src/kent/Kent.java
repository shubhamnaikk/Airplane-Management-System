/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kent;

/**
 *
 * @author Administrator
 */
public class Kent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
         
         java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Reciept().setVisible(true);
                new kentmaine().setVisible(true);
            }
        });
         
         
    }
    
}
