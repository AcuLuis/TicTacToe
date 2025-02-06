
package JUEGO;

import javax.swing.ImageIcon;

public class TICTACTOE extends javax.swing.JFrame {
    
    String turno="";
    int[][] matriz = new int[3][3];
    int cont;
    public TICTACTOE() {
        initComponents();
        turno="";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 2;
            }
        }
        cont=0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_uno = new javax.swing.JButton();
        btn_dos = new javax.swing.JButton();
        btn_tres = new javax.swing.JButton();
        btn_cuatro = new javax.swing.JButton();
        btn_cinco = new javax.swing.JButton();
        btn_seis = new javax.swing.JButton();
        btn_siete = new javax.swing.JButton();
        btn_ocho = new javax.swing.JButton();
        btn_nueve = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("panel");

        btn_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unoActionPerformed(evt);
            }
        });

        btn_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dosActionPerformed(evt);
            }
        });

        btn_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tresActionPerformed(evt);
            }
        });

        btn_cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuatroActionPerformed(evt);
            }
        });

        btn_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cincoActionPerformed(evt);
            }
        });

        btn_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seisActionPerformed(evt);
            }
        });

        btn_siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sieteActionPerformed(evt);
            }
        });

        btn_ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ochoActionPerformed(evt);
            }
        });

        btn_nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueveActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuatroActionPerformed
        if(turno.equals("") || !turno.equals("circulo")){
            ImageIcon icono = new ImageIcon("src/IMAGES//equis.png");
            this.btn_cuatro.setIcon(icono);
            turno="circulo";
            matriz[1][0]=1;
        }else{
            ImageIcon icono = new ImageIcon("src/IMAGES//circulo.png");
            this.btn_cuatro.setIcon(icono);
            turno="equis";
            matriz[1][0]=0;
        }
        this.btn_cuatro.setEnabled(false);
        cont++;
    }//GEN-LAST:event_btn_cuatroActionPerformed

    private void btn_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unoActionPerformed
        if(turno.equals("") || !turno.equals("circulo")){
            ImageIcon icono = new ImageIcon("src/IMAGES//equis.png");
            this.btn_uno.setIcon(icono);
            turno="circulo";
            matriz[0][0]=1;
        }else{
            ImageIcon icono = new ImageIcon("src/IMAGES//circulo.png");
            this.btn_uno.setIcon(icono);
            turno="equis";
            matriz[0][0]=0;
        }
        this.btn_uno.setEnabled(false);
        cont++;
    }//GEN-LAST:event_btn_unoActionPerformed

    private void btn_sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sieteActionPerformed
        if(turno.equals("") || !turno.equals("circulo")){
            ImageIcon icono = new ImageIcon("src/IMAGES//equis.png");
            this.btn_siete.setIcon(icono);
            turno="circulo";
            matriz[2][0]=1;
        }else{
            ImageIcon icono = new ImageIcon("src/IMAGES//circulo.png");
            this.btn_siete.setIcon(icono);
            turno="equis";
            matriz[2][0]=0;
        }
        this.btn_siete.setEnabled(false);
        cont++;
    }//GEN-LAST:event_btn_sieteActionPerformed

    private void btn_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dosActionPerformed
        if(turno.equals("") || !turno.equals("circulo")){
            ImageIcon icono = new ImageIcon("src/IMAGES//equis.png");
            this.btn_dos.setIcon(icono);
            turno="circulo";
            matriz[0][1]=1;
        }else{
            ImageIcon icono = new ImageIcon("src/IMAGES//circulo.png");
            this.btn_dos.setIcon(icono);
            turno="equis";
            matriz[0][1]=0;
        }
        this.btn_dos.setEnabled(false);
        cont++;
    }//GEN-LAST:event_btn_dosActionPerformed

    private void btn_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tresActionPerformed
        if(turno.equals("") || !turno.equals("circulo")){
            ImageIcon icono = new ImageIcon("src/IMAGES//equis.png");
            this.btn_tres.setIcon(icono);
            turno="circulo";
            matriz[0][2]=1;
        }else{
            ImageIcon icono = new ImageIcon("src/IMAGES//circulo.png");
            this.btn_tres.setIcon(icono);
            turno="equis";
            matriz[0][2]=0;
        }
        this.btn_tres.setEnabled(false);
        cont++;
    }//GEN-LAST:event_btn_tresActionPerformed

    private void btn_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cincoActionPerformed
        if(turno.equals("") || !turno.equals("circulo")){
            ImageIcon icono = new ImageIcon("src/IMAGES//equis.png");
            this.btn_cinco.setIcon(icono);
            turno="circulo";
            matriz[1][1]=1;
        }else{
            ImageIcon icono = new ImageIcon("src/IMAGES//circulo.png");
            this.btn_cinco.setIcon(icono);
            turno="equis";
            matriz[1][1]=0;
        }
        this.btn_cinco.setEnabled(false);
        cont++;
    }//GEN-LAST:event_btn_cincoActionPerformed

    private void btn_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seisActionPerformed
        if(turno.equals("") || !turno.equals("circulo")){
            ImageIcon icono = new ImageIcon("src/IMAGES//equis.png");
            this.btn_seis.setIcon(icono);
            turno="circulo";
            matriz[1][2]=1;
        }else{
            ImageIcon icono = new ImageIcon("src/IMAGES//circulo.png");
            this.btn_seis.setIcon(icono);
            turno="equis";
            matriz[1][2]=0;
        }
        this.btn_seis.setEnabled(false);
        cont++;
    }//GEN-LAST:event_btn_seisActionPerformed

    private void btn_ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ochoActionPerformed
        if(turno.equals("") || !turno.equals("circulo")){
            ImageIcon icono = new ImageIcon("src/IMAGES//equis.png");
            this.btn_ocho.setIcon(icono);
            turno="circulo";
            matriz[2][1]=1;
        }else{
            ImageIcon icono = new ImageIcon("src/IMAGES//circulo.png");
            this.btn_ocho.setIcon(icono);
            turno="equis";
            matriz[2][1]=0;
        }
        this.btn_ocho.setEnabled(false);
        cont++;
    }//GEN-LAST:event_btn_ochoActionPerformed

    private void btn_nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueveActionPerformed
        if(turno.equals("") || !turno.equals("circulo")){
            ImageIcon icono = new ImageIcon("src/IMAGES//equis.png");
            this.btn_nueve.setIcon(icono);
            turno="circulo";
            matriz[2][2]=1;
        }else{
            ImageIcon icono = new ImageIcon("src/IMAGES//circulo.png");
            this.btn_nueve.setIcon(icono);
            turno="equis";
            matriz[2][2]=0;
        }
        this.btn_nueve.setEnabled(false);
        cont++;
    }//GEN-LAST:event_btn_nueveActionPerformed
    public void resetea(){
        turno="";
        cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 2;
            }
        }
        this.btn_uno.setEnabled(true);
        this.btn_uno.setIcon(null);
        
        this.btn_dos.setEnabled(true);
        this.btn_dos.setIcon(null);
        
        this.btn_tres.setEnabled(true);
        this.btn_tres.setIcon(null);
        
        this.btn_cuatro.setEnabled(true);
        this.btn_cuatro.setIcon(null);

        this.btn_cinco.setEnabled(true);
        this.btn_cinco.setIcon(null);
        
        this.btn_seis.setEnabled(true);
        this.btn_seis.setIcon(null);

        this.btn_siete.setEnabled(true);
        this.btn_siete.setIcon(null);
        
        this.btn_ocho.setEnabled(true);
        this.btn_ocho.setIcon(null);
        
        this.btn_nueve.setEnabled(true);
        this.btn_nueve.setIcon(null);
    }
    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        this.resetea();
    }//GEN-LAST:event_btn_resetActionPerformed

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
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TICTACTOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cinco;
    private javax.swing.JButton btn_cuatro;
    private javax.swing.JButton btn_dos;
    private javax.swing.JButton btn_nueve;
    private javax.swing.JButton btn_ocho;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_seis;
    private javax.swing.JButton btn_siete;
    private javax.swing.JButton btn_tres;
    private javax.swing.JButton btn_uno;
    // End of variables declaration//GEN-END:variables
}
