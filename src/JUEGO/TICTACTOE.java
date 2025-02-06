
package JUEGO;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
        this.btn_uno.setEnabled(false);
        this.btn_dos.setEnabled(false);
        this.btn_tres.setEnabled(false);
        this.btn_cuatro.setEnabled(false);
        this.btn_cinco.setEnabled(false);
        this.btn_seis.setEnabled(false);
        this.btn_siete.setEnabled(false);
        this.btn_ocho.setEnabled(false);
        this.btn_nueve.setEnabled(false);
        
        this.btn_circulo.setEnabled(true);
        this.btn_equis.setEnabled(true);
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
        btn_reset1 = new javax.swing.JButton();
        btn_equis = new javax.swing.JButton();
        btn_circulo = new javax.swing.JButton();

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

        btn_reset1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_reset1.setText("RESET");
        btn_reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reset1ActionPerformed(evt);
            }
        });

        btn_equis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_equis.setText("X");
        btn_equis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equisActionPerformed(evt);
            }
        });

        btn_circulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_circulo.setText("O");
        btn_circulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_circuloActionPerformed(evt);
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
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_equis, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_circulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
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
                .addComponent(btn_reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_circulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_equis, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ganador(){
        if(cont>=3){
            System.out.println("\n");
            // figura matriz
            for (int k = 0; k < 3; k++) {
                for (int h = 0; h < 3; h++) {
                    System.out.print(matriz[k][h]);
                }
                System.out.println("");
            }
            boolean gano=false;
            String g = "";
            // filas
            for(int k=0; k<3; k++){
                String fila="";
                for(int h=0; h<3; h++){
                    fila= fila+Integer.toString(matriz[k][h]);
                }
                if(fila.equals("000") || fila.equals("111")){
                    gano=true;
                    g = "fila";
                }
            }
            // columnas
            for(int k=0; k<3; k++){
                String columna="";
                for(int h=0; h<3; h++){
                    columna= columna+Integer.toString(matriz[h][k]);
                }
                if(columna.equals("000") || columna.equals("111")){
                    gano=true;
                    g = "columna";
                }
            }
            // diagonal principal
            String diagonal_p="";
            for(int k=0; k<3; k++){
                for(int h=0; h<3; h++){
                    if(k==h){
                        diagonal_p=diagonal_p+Integer.toString(matriz[k][h]);
                    }
                }
            }
            if(diagonal_p.equals("000") || diagonal_p.equals("111")){
                gano=true;
                g="diagonal principal";
            }
            // diagonal secundaria
            String diagonal_s="";
            for(int k=0; k<3; k++){
                for(int h=0; h<3; h++){
                    if(k+h==2){
                        diagonal_s=diagonal_s+Integer.toString(matriz[k][h]);
                    }
                }
            }
            if(diagonal_s.equals("000") || diagonal_s.equals("111")){
                gano=true;
                g="diagonal secundaria";
            }
            if(gano){
                if(turno.equals("circulo")){
                    JOptionPane.showMessageDialog(null, "GANO EQUIS");
                }else{
                    JOptionPane.showMessageDialog(null, "GANO CIRCULO");
                }
                System.out.println("gano por "+g);
                this.resetea();
            }
        }
    }
    
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
        this.ganador();
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
        this.ganador();
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
        this.ganador();
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
        this.ganador();
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
        this.ganador();
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
        this.ganador();
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
        this.ganador();
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
        this.ganador();
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
        this.ganador();
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
        this.btn_uno.setEnabled(false);
        this.btn_uno.setIcon(null);
        
        this.btn_dos.setEnabled(false);
        this.btn_dos.setIcon(null);
        
        this.btn_tres.setEnabled(false);
        this.btn_tres.setIcon(null);
        
        this.btn_cuatro.setEnabled(false);
        this.btn_cuatro.setIcon(null);

        this.btn_cinco.setEnabled(false);
        this.btn_cinco.setIcon(null);
        
        this.btn_seis.setEnabled(false);
        this.btn_seis.setIcon(null);

        this.btn_siete.setEnabled(false);
        this.btn_siete.setIcon(null);
        
        this.btn_ocho.setEnabled(false);
        this.btn_ocho.setIcon(null);
        
        this.btn_nueve.setEnabled(false);
        this.btn_nueve.setIcon(null);
        
        this.btn_equis.setEnabled(true);
        this.btn_circulo.setEnabled(true);
    }
    private void btn_reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset1ActionPerformed
        this.resetea();
    }//GEN-LAST:event_btn_reset1ActionPerformed

    private void btn_equisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equisActionPerformed
        turno="equis";
        this.btn_equis.setEnabled(false);
        this.btn_circulo.setEnabled(false);
        
        this.btn_uno.setEnabled(true);
        this.btn_dos.setEnabled(true);
        this.btn_tres.setEnabled(true);
        this.btn_cuatro.setEnabled(true);
        this.btn_cinco.setEnabled(true);
        this.btn_seis.setEnabled(true);
        this.btn_siete.setEnabled(true);
        this.btn_ocho.setEnabled(true);
        this.btn_nueve.setEnabled(true);
    }//GEN-LAST:event_btn_equisActionPerformed

    private void btn_circuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_circuloActionPerformed
        turno="circulo";
        this.btn_circulo.setEnabled(false);
        this.btn_equis.setEnabled(false);
        
        this.btn_uno.setEnabled(true);
        this.btn_dos.setEnabled(true);
        this.btn_tres.setEnabled(true);
        this.btn_cuatro.setEnabled(true);
        this.btn_cinco.setEnabled(true);
        this.btn_seis.setEnabled(true);
        this.btn_siete.setEnabled(true);
        this.btn_ocho.setEnabled(true);
        this.btn_nueve.setEnabled(true);
    }//GEN-LAST:event_btn_circuloActionPerformed

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
    private javax.swing.JButton btn_circulo;
    private javax.swing.JButton btn_cuatro;
    private javax.swing.JButton btn_dos;
    private javax.swing.JButton btn_equis;
    private javax.swing.JButton btn_nueve;
    private javax.swing.JButton btn_ocho;
    private javax.swing.JButton btn_reset1;
    private javax.swing.JButton btn_seis;
    private javax.swing.JButton btn_siete;
    private javax.swing.JButton btn_tres;
    private javax.swing.JButton btn_uno;
    // End of variables declaration//GEN-END:variables
}
