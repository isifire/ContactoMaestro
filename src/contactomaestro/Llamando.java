
package contactomaestro;

import java.util.Random;

/**
 *
 * @author Isidro Benitez Zapico UO285039
 */
public class Llamando extends javax.swing.JFrame {


    Principal vprincipal;

    public Llamando() {
        initComponents();
        this.setVisible(true);
        java.util.Timer T = new java.util.Timer();
        for (int i = 1; i <= 11; i = i + 1) {
            java.util.TimerTask TTask = new java.util.TimerTask() {
                public void run() {
                    manejadorTimerLlamada();
                }
            };
            T.schedule(TTask, i * 250);
        }
    }
    
    
            public void manejadorTimerLlamada() {
        int Valor = this.barLlamar.getValue();
        if (Valor == 100) { // Terminó
            Random n = new Random();
            int aleatorio = n.nextInt(2);
            switch(aleatorio){
                case 0:
                    this.lblEstadoLlamada.setText("Ha colgado");
                    break;
                case 1:
                    this.lblEstadoLlamada.setText("No responde");
                    break;
                case 2:
                    this.lblEstadoLlamada.setText("Ha habido un error inesperado");
                    break;
            }
            this.btnColgar.setText("Cerrar");
            Valor = 0;
        } else {
            this.barLlamar.setValue(Valor + 10);
            this.lblEstadoLlamada.setText("Llamando" + ".");
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barLlamar = new javax.swing.JProgressBar();
        lblEstadoLlamada = new javax.swing.JLabel();
        btnColgar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Llamada");

        lblEstadoLlamada.setText("Llamando...");

        btnColgar.setText("Colgar");
        btnColgar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColgarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(barLlamar, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblEstadoLlamada)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnColgar)
                        .addGap(151, 151, 151))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblEstadoLlamada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barLlamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnColgar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnColgarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColgarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnColgarActionPerformed

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
            java.util.logging.Logger.getLogger(Llamando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Llamando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Llamando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Llamando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JProgressBar barLlamar;
    private javax.swing.JButton btnColgar;
    javax.swing.JLabel lblEstadoLlamada;
    // End of variables declaration//GEN-END:variables
}
