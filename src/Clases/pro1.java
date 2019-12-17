
package Clases;

import javax.swing.JProgressBar;

/**
 *
 * @author Duvan Botello
 */
public class pro1 {

    private JProgressBar jpbar30, jpbar31;

    public Thread tiempollenado = new Thread() {
        public void run() {
            try {
                    
                   jpbar30.setValue(100);                   
                   for(int seg =0; seg <= 100; seg++){
                       jpbar31.setValue(seg);
                       tiempollenado.sleep(30);
                       
                   }
                   

            } catch (Exception e) {
            }

        }
    };

    public pro1(JProgressBar jpbar30, JProgressBar jpbar31) {
        this.jpbar30 = jpbar30;
        this.jpbar31 = jpbar31;
    }

}
