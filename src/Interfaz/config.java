
package Interfaz;

/**
 *
 * @author DANIEL
 */
public class config extends javax.swing.JDialog {

    
    public config(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(700, 50);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        aceptar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        stop_txt = new javax.swing.JTextField();
        step_txt = new javax.swing.JTextField();
        initial_txt = new javax.swing.JTextField();
        final_txt = new javax.swing.JTextField();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aceptar.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ok.png"))); // NOI18N
        aceptar.setBorder(null);
        aceptar.setContentAreaFilled(false);
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aceptar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ok1.png"))); // NOI18N
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, 60));

        titulo.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Configuraciones");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 330, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stop_txt.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        stop_txt.setForeground(new java.awt.Color(33, 63, 83));
        stop_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stop_txt.setBorder(null);
        jPanel2.add(stop_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 90, 40));

        step_txt.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        step_txt.setForeground(new java.awt.Color(33, 63, 83));
        step_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        step_txt.setBorder(null);
        jPanel2.add(step_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 90, 40));

        initial_txt.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        initial_txt.setForeground(new java.awt.Color(33, 63, 83));
        initial_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        initial_txt.setBorder(null);
        jPanel2.add(initial_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 90, 40));

        final_txt.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        final_txt.setForeground(new java.awt.Color(33, 63, 83));
        final_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        final_txt.setBorder(null);
        jPanel2.add(final_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 90, 40));

        titulo1.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        titulo1.setForeground(new java.awt.Color(51, 51, 51));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Stop Time");
        titulo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 110, 40));

        titulo2.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        titulo2.setForeground(new java.awt.Color(51, 51, 51));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Step Time");
        titulo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 110, 40));

        titulo3.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        titulo3.setForeground(new java.awt.Color(51, 51, 51));
        titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo3.setText("Initial Value");
        titulo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 120, 40));

        titulo4.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        titulo4.setForeground(new java.awt.Color(51, 51, 51));
        titulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo4.setText("Final Value");
        titulo4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 110, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_aceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                config dialog = new config(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton aceptar;
    public static javax.swing.JTextField final_txt;
    public static javax.swing.JTextField initial_txt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField step_txt;
    public static javax.swing.JTextField stop_txt;
    public static javax.swing.JLabel titulo;
    public static javax.swing.JLabel titulo1;
    public static javax.swing.JLabel titulo2;
    public static javax.swing.JLabel titulo3;
    public static javax.swing.JLabel titulo4;
    // End of variables declaration//GEN-END:variables
}
