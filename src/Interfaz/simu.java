package Interfaz;

import Clases.pro;
import Clases.pro1;
import static Interfaz.grafica.graf_img;
import com.mathworks.engine.EngineException;
import com.mathworks.engine.MatlabEngine;
import com.mathworks.engine.MatlabSyntaxException;
import java.awt.Image;
import java.net.URL;
import java.util.concurrent.CancellationException;
import javax.swing.ImageIcon;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DANIEL
 */
public class simu extends javax.swing.JFrame {

    boolean controlv = true, controlv2 = true, controlv3 = true;
    pro pr2;
    int x = 0;
    pro1 agua;
    config cg = new config(this, true);
    grafica g = new grafica(this, true);

    public simu() {
        initComponents();
        setLocationRelativeTo(null);
        agua = new pro1(p30, p31);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        v3 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        p37 = new rojerusan.componentes.RSProgressBar();
        p36 = new rojerusan.componentes.RSProgressBar();
        p35 = new rojerusan.componentes.RSProgressBar();
        p34 = new rojerusan.componentes.RSProgressCircle();
        p33 = new rojerusan.componentes.RSProgressBar();
        p32 = new rojerusan.componentes.RSProgressBar();
        p31 = new rojerusan.componentes.RSProgressCircle();
        p30 = new rojerusan.componentes.RSProgressBar();
        p29 = new rojerusan.componentes.RSProgressBar();
        p28 = new rojerusan.componentes.RSProgressBar();
        p27 = new rojerusan.componentes.RSProgressBar();
        p26 = new rojerusan.componentes.RSProgressBar();
        p25 = new rojerusan.componentes.RSProgressBar();
        p24 = new rojerusan.componentes.RSProgressBar();
        p23 = new rojerusan.componentes.RSProgressBar();
        p22 = new rojerusan.componentes.RSProgressBar();
        p21 = new rojerusan.componentes.RSProgressBar();
        p20 = new rojerusan.componentes.RSProgressBar();
        p19 = new rojerusan.componentes.RSProgressBar();
        p10 = new javax.swing.JProgressBar();
        p8 = new javax.swing.JProgressBar();
        p7 = new rojerusan.componentes.RSProgressBar();
        p6 = new rojerusan.componentes.RSProgressBar();
        p5 = new rojerusan.componentes.RSProgressBar();
        p18 = new javax.swing.JProgressBar();
        p17 = new javax.swing.JProgressBar();
        p16 = new javax.swing.JProgressBar();
        p15 = new javax.swing.JProgressBar();
        p14 = new javax.swing.JProgressBar();
        p13 = new javax.swing.JProgressBar();
        p12 = new javax.swing.JProgressBar();
        p11 = new javax.swing.JProgressBar();
        p9 = new javax.swing.JProgressBar();
        p4 = new rojerusan.componentes.RSProgressBar();
        p1 = new rojerusan.componentes.RSProgressBar();
        p2 = new rojerusan.componentes.RSProgressBar();
        p3 = new rojerusan.componentes.RSProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        j3 = new javax.swing.JLabel();
        iniciar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        conf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        v3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v3MouseClicked(evt);
            }
        });
        fondo.add(v3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 50, 50));

        v2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v2MouseClicked(evt);
            }
        });
        fondo.add(v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 60, 60));

        v1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v1MouseClicked(evt);
            }
        });
        fondo.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 174, 70, 50));

        p37.setBackground(new java.awt.Color(204, 204, 204));
        p37.setForeground(new java.awt.Color(255, 51, 51));
        p37.setValue(0);
        p37.setBorderPainted(false);
        p37.setOrientacion(rojerusan.componentes.RSProgressBar.ORIENTACION.VERTICAL);
        p37.setStringPainted(false);
        fondo.add(p37, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 20, 40));

        p36.setBackground(new java.awt.Color(204, 204, 204));
        p36.setForeground(new java.awt.Color(51, 204, 255));
        p36.setValue(0);
        p36.setBorderPainted(false);
        p36.setStringPainted(false);
        fondo.add(p36, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 40, 20));

        p35.setBackground(new java.awt.Color(204, 204, 204));
        p35.setForeground(new java.awt.Color(51, 204, 255));
        p35.setValue(0);
        p35.setBorderPainted(false);
        p35.setStringPainted(false);
        fondo.add(p35, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 110, 20));

        p34.setForeground(new java.awt.Color(255, 102, 102));
        p34.setValue(0);
        p34.setBorderPainted(false);
        p34.setStringPainted(false);
        fondo.add(p34, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 50, 60));

        p33.setBackground(new java.awt.Color(204, 204, 204));
        p33.setForeground(new java.awt.Color(255, 51, 51));
        p33.setValue(0);
        p33.setBorderPainted(false);
        p33.setStringPainted(false);
        fondo.add(p33, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 120, 20));

        p32.setBackground(new java.awt.Color(204, 204, 204));
        p32.setForeground(new java.awt.Color(255, 51, 51));
        p32.setValue(0);
        p32.setBorderPainted(false);
        p32.setOrientacion(rojerusan.componentes.RSProgressBar.ORIENTACION.VERTICAL);
        p32.setStringPainted(false);
        fondo.add(p32, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 20, 40));

        p31.setForeground(new java.awt.Color(51, 204, 255));
        p31.setToolTipText("");
        p31.setValue(0);
        p31.setBorderPainted(false);
        p31.setStringPainted(false);
        fondo.add(p31, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 70, 80));

        p30.setBackground(new java.awt.Color(204, 204, 204));
        p30.setForeground(new java.awt.Color(51, 204, 255));
        p30.setValue(0);
        p30.setBorderPainted(false);
        p30.setStringPainted(false);
        fondo.add(p30, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 50, 20));

        p29.setBackground(new java.awt.Color(204, 204, 204));
        p29.setForeground(new java.awt.Color(51, 204, 255));
        p29.setValue(0);
        p29.setBorderPainted(false);
        p29.setStringPainted(false);
        fondo.add(p29, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 50, 20));

        p28.setBackground(new java.awt.Color(204, 204, 204));
        p28.setForeground(new java.awt.Color(204, 0, 0));
        p28.setValue(0);
        p28.setBorderPainted(false);
        p28.setStringPainted(false);
        fondo.add(p28, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 70, 20));

        p27.setBackground(new java.awt.Color(204, 204, 204));
        p27.setForeground(new java.awt.Color(204, 0, 0));
        p27.setValue(0);
        p27.setBorderPainted(false);
        p27.setStringPainted(false);
        fondo.add(p27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 260, 20));

        p26.setBackground(new java.awt.Color(204, 204, 204));
        p26.setForeground(new java.awt.Color(204, 0, 0));
        p26.setValue(0);
        p26.setBorderPainted(false);
        p26.setOrientacion(rojerusan.componentes.RSProgressBar.ORIENTACION.VERTICAL);
        p26.setStringPainted(false);
        fondo.add(p26, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 20, 50));

        p25.setBackground(new java.awt.Color(204, 204, 204));
        p25.setForeground(new java.awt.Color(204, 0, 0));
        p25.setValue(0);
        p25.setBorderPainted(false);
        p25.setStringPainted(false);
        fondo.add(p25, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 160, 20));

        p24.setBackground(new java.awt.Color(204, 204, 204));
        p24.setForeground(new java.awt.Color(204, 0, 0));
        p24.setValue(0);
        p24.setBorderPainted(false);
        p24.setStringPainted(false);
        fondo.add(p24, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 50, 10));

        p23.setBackground(new java.awt.Color(204, 204, 204));
        p23.setForeground(new java.awt.Color(204, 0, 0));
        p23.setValue(0);
        p23.setBorderPainted(false);
        p23.setOrientacion(rojerusan.componentes.RSProgressBar.ORIENTACION.VERTICAL);
        p23.setStringPainted(false);
        fondo.add(p23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 10, 180));

        p22.setBackground(new java.awt.Color(204, 204, 204));
        p22.setForeground(new java.awt.Color(255, 102, 102));
        p22.setValue(0);
        p22.setBorderPainted(false);
        p22.setOrientacion(rojerusan.componentes.RSProgressBar.ORIENTACION.VERTICAL);
        p22.setStringPainted(false);
        fondo.add(p22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 70, 30));

        p21.setBackground(new java.awt.Color(204, 204, 204));
        p21.setForeground(new java.awt.Color(204, 0, 0));
        p21.setValue(0);
        p21.setBorderPainted(false);
        p21.setOrientacion(rojerusan.componentes.RSProgressBar.ORIENTACION.VERTICAL);
        p21.setStringPainted(false);
        fondo.add(p21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 70, 70));

        p20.setBackground(new java.awt.Color(204, 204, 204));
        p20.setForeground(new java.awt.Color(204, 0, 0));
        p20.setValue(0);
        p20.setBorderPainted(false);
        p20.setOrientacion(rojerusan.componentes.RSProgressBar.ORIENTACION.VERTICAL);
        p20.setStringPainted(false);
        fondo.add(p20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 20, 40));

        p19.setBackground(new java.awt.Color(204, 204, 204));
        p19.setForeground(new java.awt.Color(204, 0, 0));
        p19.setValue(0);
        p19.setBorderPainted(false);
        p19.setStringPainted(false);
        fondo.add(p19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 270, 20));
        fondo.add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 50, -1));
        fondo.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 60, -1));

        p7.setBackground(new java.awt.Color(204, 204, 204));
        p7.setForeground(new java.awt.Color(255, 51, 51));
        p7.setValue(0);
        p7.setBorderPainted(false);
        p7.setOrientacion(rojerusan.componentes.RSProgressBar.ORIENTACION.VERTICAL);
        p7.setStringPainted(false);
        fondo.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 20, 180));

        p6.setBackground(new java.awt.Color(204, 204, 204));
        p6.setForeground(new java.awt.Color(255, 51, 51));
        p6.setValue(0);
        p6.setBorderPainted(false);
        p6.setOrientacion(rojerusan.componentes.RSProgressBar.ORIENTACION.VERTICAL);
        p6.setStringPainted(false);
        fondo.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 20, 180));

        p5.setBackground(new java.awt.Color(204, 204, 204));
        p5.setForeground(new java.awt.Color(255, 51, 51));
        p5.setValue(0);
        p5.setBorderPainted(false);
        p5.setOrientacion(rojerusan.componentes.RSProgressBar.ORIENTACION.VERTICAL);
        p5.setStringPainted(false);
        fondo.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 20, 180));
        fondo.add(p18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 100, -1));
        fondo.add(p17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 100, -1));
        fondo.add(p16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 100, -1));
        fondo.add(p15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 100, -1));
        fondo.add(p14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 100, -1));
        fondo.add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 100, -1));
        fondo.add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 100, -1));
        fondo.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 100, -1));
        fondo.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 100, -1));

        p4.setBackground(new java.awt.Color(204, 204, 204));
        p4.setForeground(new java.awt.Color(255, 51, 51));
        p4.setValue(0);
        p4.setBorderPainted(false);
        p4.setOrientacion(rojerusan.componentes.RSProgressBar.ORIENTACION.VERTICAL);
        p4.setStringPainted(false);
        fondo.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 20, 40));

        p1.setBackground(new java.awt.Color(204, 204, 204));
        p1.setForeground(new java.awt.Color(255, 51, 51));
        p1.setValue(0);
        p1.setBorderPainted(false);
        p1.setOrientacion(rojerusan.componentes.RSProgressBar.ORIENTACION.VERTICAL);
        p1.setStringPainted(false);
        fondo.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 20, 60));

        p2.setBackground(new java.awt.Color(204, 204, 204));
        p2.setForeground(new java.awt.Color(255, 51, 51));
        p2.setValue(0);
        p2.setBorderPainted(false);
        p2.setStringPainted(false);
        fondo.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 190, 20));

        p3.setBackground(new java.awt.Color(204, 204, 204));
        p3.setForeground(new java.awt.Color(255, 51, 51));
        p3.setValue(0);
        p3.setBorderPainted(false);
        p3.setStringPainted(false);
        fondo.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 30, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/evaporador.png"))); // NOI18N
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 860, 490));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Grafica"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(j3, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(j3, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, 410, 360));

        iniciar.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        iniciar.setForeground(new java.awt.Color(255, 255, 255));
        iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/play.png"))); // NOI18N
        iniciar.setBorder(null);
        iniciar.setContentAreaFilled(false);
        iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iniciar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/play1.png"))); // NOI18N
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Modelados - Simulacion Evaporador");
        titulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "Autores: Daniel Luna - Duvan Botello - Camilo Ojeda - Marlon Mejia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Open Sans", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        conf.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        conf.setForeground(new java.awt.Color(255, 255, 255));
        conf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cong.png"))); // NOI18N
        conf.setBorder(null);
        conf.setContentAreaFilled(false);
        conf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        conf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        conf.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cong1.png"))); // NOI18N
        conf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1337, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(conf)
                .addGap(45, 45, 45)
                .addComponent(iniciar)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniciar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        pr2 = new pro(p2, p1, p3, p4, p5, p6, p7, p19, p20, p21, p22, p23, p24, p25, p26, p27, p29, p32, p33, p34, p35, p36, p37);
        pr2.tiempollenado.start();

        Thread tiempollenado2 = new Thread() {
            public void run() {

                while (true) {
                    System.out.println("");
                    if (pr2.acabo == true) {
                        try {
                            conexcionm();
                            break;
                        } catch (EngineException ex) {
                            Logger.getLogger(simu.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(simu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

            }
        };
        tiempollenado2.start();
    }//GEN-LAST:event_iniciarActionPerformed
    public void conexcionm() throws EngineException, InterruptedException {
        String param_stop = "set_param('model_evap','StopTime','" + cg.stop_txt.getText() + "')";
        String param_step = "set_param('model_evap/Step1','Time','" + cg.step_txt.getText() + "')";
        String param_inicial = "set_param('model_evap/Step1','Before','" + cg.initial_txt.getText() + "')";
        String param_final = "set_param('model_evap/Step1','After','" + cg.final_txt.getText() + "')";

        MatlabEngine eng = MatlabEngine.startMatlab();
        Future<Void> cargar1 = eng.evalAsync("sim('model_evap')");
        while (!cargar1.isDone()) {
            System.out.println("Loading Simulink model...");
            Thread.sleep(5000);
        }
        Future<Void> param1 = eng.evalAsync(param_stop);
        while (!param1.isDone()) {
            System.out.println("Tomando parametro stop...");
            Thread.sleep(5000);
        }
        Future<Void> param2 = eng.evalAsync(param_step);
        while (!param2.isDone()) {
            System.out.println("Tomando parametro step...");
            Thread.sleep(5000);
        }
        Future<Void> param3 = eng.evalAsync(param_inicial);
        while (!param3.isDone()) {
            System.out.println("Tomando parametro initial...");
            Thread.sleep(5000);
        }
        Future<Void> param4 = eng.evalAsync(param_final);
        while (!param4.isDone()) {
            System.out.println("Tomando parametro final...");
            Thread.sleep(5000);
        }
        Future<Void> carga2 = eng.evalAsync("sim('model_evap')");
        while (!carga2.isDone()) {
            System.out.println("Loading Simulink model...");
            Thread.sleep(5000);
        }
        Future<Void> empezar = eng.evalAsync("set_param(gcs,'SimulationCommand','Start')");
        while (!empezar.isDone()) {
            System.out.println("Running Simulation...");
            Thread.sleep(5000);
        }
        Future<Void> var = eng.evalAsync("simu=evalin('base','simu');");
        while (!var.isDone()) {
            System.out.println("Tomando variable global...");
            Thread.sleep(5000);
        }

        Future<Void> gra = eng.evalAsync("plot(simu(:,1),simu(:,2))");
        Future<Void> tit = eng.evalAsync("title('Comportamiento - Grafica Final')");
        Future<Void> xl = eng.evalAsync("xlabel('Tiempo')");
        Future<Void> yl = eng.evalAsync("ylabel('Salida')");
        Future<Void> gr = eng.evalAsync("grid on");
        Future<Void> pimg = eng.evalAsync("print('graf_evap','-djpeg')");
        eng.close();
        
        Image img = new ImageIcon("graf_evap.jpg").getImage();
        ImageIcon img2 = new ImageIcon(img.getScaledInstance(370, 315, Image.SCALE_SMOOTH));
        j3.setIcon(img2);
    }
    private void confActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confActionPerformed
        cg.setVisible(true);
    }//GEN-LAST:event_confActionPerformed

    private void v1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v1MouseClicked

        if (controlv == true) {
            p8.setIndeterminate(true);
            p9.setIndeterminate(true);
            p10.setIndeterminate(true);
            p11.setIndeterminate(true);
            p12.setIndeterminate(true);
            p13.setIndeterminate(true);
            p14.setIndeterminate(true);
            p15.setIndeterminate(true);
            p16.setIndeterminate(true);
            p17.setIndeterminate(true);
            p18.setIndeterminate(true);
            controlv = false;
        } else {
            p8.setIndeterminate(false);
            p9.setIndeterminate(false);
            p10.setIndeterminate(false);
            p11.setIndeterminate(false);
            p12.setIndeterminate(false);
            p13.setIndeterminate(false);
            p14.setIndeterminate(false);
            p15.setIndeterminate(false);
            p16.setIndeterminate(false);
            p17.setIndeterminate(false);
            p18.setIndeterminate(false);
            controlv = true;
        }
    }//GEN-LAST:event_v1MouseClicked

    private void v2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v2MouseClicked
        if (controlv2 == true) {
            p28.setValue(100);
            controlv2 = false;
        } else {
            p28.setValue(0);
            controlv2 = true;
        }
    }//GEN-LAST:event_v2MouseClicked

    private void v3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v3MouseClicked
        if (controlv3 == true) {
            p30.setValue(100);
            for (int seg = 0; seg <= 100; seg++) {
                p31.setValue(seg);
            }
            controlv3 = false;
        } else {
            p30.setValue(0);
            p31.setValue(0);
            controlv3 = true;
        }
    }//GEN-LAST:event_v3MouseClicked

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
            java.util.logging.Logger.getLogger(simu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(simu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(simu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(simu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton conf;
    private javax.swing.JPanel fondo;
    public static javax.swing.JButton iniciar;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private rojerusan.componentes.RSProgressBar p1;
    private javax.swing.JProgressBar p10;
    private javax.swing.JProgressBar p11;
    private javax.swing.JProgressBar p12;
    private javax.swing.JProgressBar p13;
    private javax.swing.JProgressBar p14;
    private javax.swing.JProgressBar p15;
    private javax.swing.JProgressBar p16;
    private javax.swing.JProgressBar p17;
    private javax.swing.JProgressBar p18;
    private rojerusan.componentes.RSProgressBar p19;
    private rojerusan.componentes.RSProgressBar p2;
    private rojerusan.componentes.RSProgressBar p20;
    private rojerusan.componentes.RSProgressBar p21;
    private rojerusan.componentes.RSProgressBar p22;
    private rojerusan.componentes.RSProgressBar p23;
    private rojerusan.componentes.RSProgressBar p24;
    private rojerusan.componentes.RSProgressBar p25;
    private rojerusan.componentes.RSProgressBar p26;
    private rojerusan.componentes.RSProgressBar p27;
    private rojerusan.componentes.RSProgressBar p28;
    private rojerusan.componentes.RSProgressBar p29;
    private rojerusan.componentes.RSProgressBar p3;
    private rojerusan.componentes.RSProgressBar p30;
    private rojerusan.componentes.RSProgressCircle p31;
    private rojerusan.componentes.RSProgressBar p32;
    private rojerusan.componentes.RSProgressBar p33;
    private rojerusan.componentes.RSProgressCircle p34;
    private rojerusan.componentes.RSProgressBar p35;
    private rojerusan.componentes.RSProgressBar p36;
    private rojerusan.componentes.RSProgressBar p37;
    private rojerusan.componentes.RSProgressBar p4;
    private rojerusan.componentes.RSProgressBar p5;
    private rojerusan.componentes.RSProgressBar p6;
    private rojerusan.componentes.RSProgressBar p7;
    private javax.swing.JProgressBar p8;
    private javax.swing.JProgressBar p9;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel v2;
    private javax.swing.JLabel v3;
    // End of variables declaration//GEN-END:variables
}
