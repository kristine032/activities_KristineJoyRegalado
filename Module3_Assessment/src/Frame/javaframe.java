/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.Color;
import java.util.Random;
/**
 *
 * @author TinTin
 */
public class javaframe extends javax.swing.JFrame {

    private Thread thread;
    private Runs running = running = new Runs();
    private Random rand = new Random();
    private int ColorHue = 241;
    /**
     * Creates new form javaframe
     */
    public javaframe() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void newyear(){
        H.setBackground(new Color(rand.nextInt(ColorHue), rand.nextInt(ColorHue), rand.nextInt(ColorHue)));
        A.setBackground(new Color(rand.nextInt(ColorHue), rand.nextInt(ColorHue), rand.nextInt(ColorHue)));
        P.setBackground(new Color(rand.nextInt(ColorHue), rand.nextInt(ColorHue), rand.nextInt(ColorHue)));
        p.setBackground(new Color(rand.nextInt(ColorHue), rand.nextInt(ColorHue), rand.nextInt(ColorHue)));
        Y.setBackground(new Color(rand.nextInt(ColorHue), rand.nextInt(ColorHue), rand.nextInt(ColorHue)));
        N.setBackground(new Color(rand.nextInt(ColorHue), rand.nextInt(ColorHue), rand.nextInt(ColorHue)));
        E.setBackground(new Color(rand.nextInt(ColorHue), rand.nextInt(ColorHue), rand.nextInt(ColorHue)));
        W.setBackground(new Color(rand.nextInt(ColorHue), rand.nextInt(ColorHue), rand.nextInt(ColorHue)));
        y.setBackground(new Color(rand.nextInt(ColorHue), rand.nextInt(ColorHue), rand.nextInt(ColorHue)));
        e.setBackground(new Color(rand.nextInt(ColorHue), rand.nextInt(ColorHue), rand.nextInt(ColorHue)));
        a.setBackground(new Color(rand.nextInt(ColorHue), rand.nextInt(ColorHue), rand.nextInt(ColorHue)));
        R.setBackground(new Color(rand.nextInt(ColorHue), rand.nextInt(ColorHue), rand.nextInt(ColorHue)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        H = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        Y = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        W = new javax.swing.JLabel();
        y = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        H.setBackground(new java.awt.Color(255, 153, 153));
        H.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H.setText("H");
        H.setOpaque(true);

        A.setBackground(new java.awt.Color(255, 153, 153));
        A.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A.setText("A");
        A.setOpaque(true);

        P.setBackground(new java.awt.Color(255, 153, 153));
        P.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        P.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P.setText("P");
        P.setOpaque(true);

        p.setBackground(new java.awt.Color(255, 153, 153));
        p.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p.setText("P");
        p.setOpaque(true);

        Y.setBackground(new java.awt.Color(255, 153, 153));
        Y.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        Y.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Y.setText("Y");
        Y.setOpaque(true);

        N.setBackground(new java.awt.Color(255, 153, 153));
        N.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N.setText("N");
        N.setOpaque(true);

        E.setBackground(new java.awt.Color(255, 153, 153));
        E.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        E.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E.setText("E");
        E.setOpaque(true);

        W.setBackground(new java.awt.Color(255, 153, 153));
        W.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        W.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        W.setText("W");
        W.setOpaque(true);

        y.setBackground(new java.awt.Color(255, 153, 153));
        y.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        y.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        y.setText("Y");
        y.setOpaque(true);

        e.setBackground(new java.awt.Color(255, 153, 153));
        e.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        e.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e.setText("E");
        e.setOpaque(true);

        a.setBackground(new java.awt.Color(255, 153, 153));
        a.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setText("A");
        a.setOpaque(true);

        R.setBackground(new java.awt.Color(255, 153, 153));
        R.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        R.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R.setText("R");
        R.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        jButton2.setText("STOP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("YouYuan", 1, 24)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        thread = new Thread(running);
        thread.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            if(thread.isAlive()){
                thread.stop();
            }else{
                System.out.println("Thread alwready stopped!");
            }
        } catch (Exception ex) {
            System.out.println("Thread Not started yet!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(javaframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(javaframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(javaframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(javaframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javaframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel E;
    private javax.swing.JLabel H;
    private javax.swing.JLabel N;
    private javax.swing.JLabel P;
    private javax.swing.JLabel R;
    private javax.swing.JLabel W;
    private javax.swing.JLabel Y;
    private javax.swing.JLabel a;
    private javax.swing.JLabel e;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel p;
    private javax.swing.JLabel y;
    // End of variables declaration//GEN-END:variables
class Runs implements Runnable{
        
        @Override
        public void run() {
            try {
                while (true) {                    
                    Thread.sleep(1);
                    newyear();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    }
}
