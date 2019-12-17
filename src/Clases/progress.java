
package Clases;

import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

/**
 *
 * @author Duvan Botello
 */
public class progress extends SwingWorker<Integer, String>{
    
    private JProgressBar jpbar;

    public progress(JProgressBar jpbar) {
        this.jpbar = jpbar;
    }
    
    
    @Override
    protected Integer doInBackground() throws Exception {
        getJpbar().setIndeterminate(true);
        Thread.sleep(1000);
        getJpbar().setIndeterminate(false);
        return 0;
    }

    /**
     * @return the jpbar
     */
    public JProgressBar getJpbar() {
        return jpbar;
    }

    /**
     * @param jpbar the jpbar to set
     */
    public void setJpbar(JProgressBar jpbar) {
        this.jpbar = jpbar;
    }
    
}
