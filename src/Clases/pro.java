
package Clases;

import javax.swing.JProgressBar;

/**
 *
 * @author Duvan Botello
 */
public class pro {

    public boolean acabo = false;
    private JProgressBar jpbar1, jpbar2,jpbar3,jpbar4,jpbar5,jpbar6,jpbar7,jpbar19,jpbar20,jpbar21,jpbar22,jpbar23,jpbar24,jpbar25,
            jpbar26,jpbar27,jpbar29,jpbar32,jpbar33,jpbar34,jpbar35,jpbar36,jpbar37;

     public Thread tiempollenado = new Thread(){
           public void run(){
               
               try {
                   for(int seg =0; seg <= 100; seg++){
                       jpbar1.setValue(seg);
                       tiempollenado.sleep(10);
                       
                   }
                   for(int seg =0; seg <= 100; seg++){
                       jpbar2.setValue(seg);
                       tiempollenado.sleep(10);
                       
                   }
                   jpbar3.setValue(100);

                   for(int seg =0; seg <= 100; seg++){
                       jpbar4.setValue(seg);
                       tiempollenado.sleep(10);
                       
                   }
                   
                   for(int seg =0; seg <= 100; seg++){
                       jpbar5.setValue(seg);
                       jpbar6.setValue(seg);
                       jpbar7.setValue(seg);
                       tiempollenado.sleep(10);
                       
                   }
                   
                   jpbar19.setIndeterminate(true);
                   jpbar20.setIndeterminate(true);
                   
                   for(int seg =0; seg <= 100; seg++){
                       jpbar21.setValue(seg);
                       tiempollenado.sleep(10);
                       
                   }
                   
                                   
                   jpbar22.setIndeterminate(true);
                   
                   jpbar29.setValue(100);
                  
                   jpbar34.setValue(100);
                   jpbar35.setIndeterminate(true);
                   jpbar36.setIndeterminate(true);
                   jpbar37.setIndeterminate(true);
                   jpbar32.setIndeterminate(true);
                   jpbar33.setIndeterminate(true);
                   
                   jpbar23.setValue(100);
                   jpbar24.setValue(100);
                   jpbar25.setValue(100);
                   jpbar26.setValue(100);
                   
                   for(int seg =0; seg <= 100; seg++){
                       jpbar27.setValue(seg);
                       tiempollenado.sleep(10);
                       
                   }  
                   acabo= true;
               } catch (Exception e) {
               }
 
           }
       };
     
    public pro(JProgressBar jpbar, JProgressBar jpbar2,JProgressBar jpbar3,
            JProgressBar jpbar4,JProgressBar jpbar5,JProgressBar jpbar6,JProgressBar jpbar7
            ,JProgressBar jpbar19,JProgressBar jpbar20,JProgressBar jpbar21,JProgressBar jpbar22,
            JProgressBar jpbar23,JProgressBar jpbar24,JProgressBar jpbar25,JProgressBar jpbar26,
            JProgressBar jpbar27,JProgressBar jpbar29,JProgressBar jpbar32,JProgressBar jpbar33,JProgressBar jpbar34,
            JProgressBar jpbar35,JProgressBar jpbar36,JProgressBar jpbar37) {
        this.jpbar1 = jpbar;
        this.jpbar2 = jpbar2;
        this.jpbar3 = jpbar3;
        this.jpbar4 = jpbar4;
        this.jpbar5 = jpbar5;
        this.jpbar6 = jpbar6;
        this.jpbar7 = jpbar7;
        this.jpbar19 = jpbar19;
        this.jpbar20 = jpbar20;
        this.jpbar21 = jpbar21;
        this.jpbar22 = jpbar22;
        this.jpbar23 = jpbar23;
        this.jpbar24 = jpbar24;
        this.jpbar25 = jpbar25;
        this.jpbar26 = jpbar26;
        this.jpbar27 = jpbar27;
        this.jpbar29 = jpbar29;
        this.jpbar32 = jpbar32;
        this.jpbar33 = jpbar33;
        this.jpbar34 = jpbar34;
        this.jpbar35 = jpbar35;
        this.jpbar36 = jpbar36;
        this.jpbar37 = jpbar37;           

    }

}
