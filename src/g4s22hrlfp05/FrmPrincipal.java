/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s22hrlfp05;

import Operaciones.Dividir;
import Operaciones.Multiplicar;
import Operaciones.Restar;
import Operaciones.Sumar;

/**
 *
 * @author Ana Cecilia
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        grupo_botones.add(rbSuma);
        grupo_botones.add(rbResta);
        grupo_botones.add(rbMultiplicacion);
        grupo_botones.add(rbDivision);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_botones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnsuma = new javax.swing.JButton();
        txtnum1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        txtresultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbSuma = new javax.swing.JRadioButton();
        rbResta = new javax.swing.JRadioButton();
        rbMultiplicacion = new javax.swing.JRadioButton();
        rbDivision = new javax.swing.JRadioButton();
        btncalcula = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btnmultiplica = new javax.swing.JButton();
        btndivision = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Operaciones");

        jLabel2.setText("Insertar el primer número");

        jLabel3.setText("Inserte el segundo número");

        btnsuma.setText("Suma");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });

        txtnum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultado");

        jLabel5.setText("Opciones");

        rbSuma.setText("Suma");

        rbResta.setText("Resta");

        rbMultiplicacion.setText("Multiplicación");

        rbDivision.setText("División");

        btncalcula.setText("Calcular");
        btncalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculaActionPerformed(evt);
            }
        });

        btnresta.setText("Resta");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });

        btnmultiplica.setText("Multiplicación");
        btnmultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicaActionPerformed(evt);
            }
        });

        btndivision.setText("División");
        btndivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnum1)
                            .addComponent(txtnum2)
                            .addComponent(txtresultado, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnsuma)
                        .addGap(18, 18, 18)
                        .addComponent(btnresta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmultiplica)
                        .addGap(18, 18, 18)
                        .addComponent(btndivision)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbDivision)
                    .addComponent(rbSuma)
                    .addComponent(rbResta)
                    .addComponent(rbMultiplicacion)
                    .addComponent(btncalcula))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbSuma)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbResta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbMultiplicacion)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsuma)
                    .addComponent(rbDivision)
                    .addComponent(btnresta)
                    .addComponent(btnmultiplica)
                    .addComponent(btndivision))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btncalcula))
                    .addComponent(jLabel4))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum2ActionPerformed

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        // TODO add your handling code here:
        Sumar sumar = new Sumar();
        int n1, n2;
        n1 = Integer.parseInt(txtnum1.getText().toString());
        n2 = Integer.parseInt(txtnum2.getText().toString());
        
        txtresultado.setText(String.valueOf(sumar.suma(n1, n2)));
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btncalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculaActionPerformed
        // TODO add your handling code here:
        int n1, n2;
        n1 = Integer.parseInt(txtnum1.getText().toString());
        n2 = Integer.parseInt(txtnum2.getText().toString());
        
        if (rbSuma.isSelected() == true){
            Sumar sumar = new Sumar();
            txtresultado.setText(String.valueOf(sumar.suma(n1, n2)));
            
        }else if (rbResta.isSelected() == true){
             Restar restar = new Restar();
        txtresultado.setText(String.valueOf(restar.resta(n1, n2)));
        
        }else if (rbMultiplicacion.isSelected() == true){
             Multiplicar multiplicar = new Multiplicar();
        txtresultado.setText(String.valueOf(multiplicar.multiplica(n1, n2)));
        
        }else if (rbDivision.isSelected() == true){
            Dividir dividir = new Dividir();
          txtresultado.setText(String.valueOf(dividir.divide(n1, n2)));   
        }
            
            
    }//GEN-LAST:event_btncalculaActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        // TODO add your handling code here:
        int n1, n2;
        n1 = Integer.parseInt(txtnum1.getText().toString());
        n2 = Integer.parseInt(txtnum2.getText().toString());
        Restar restar = new Restar();
        txtresultado.setText(String.valueOf(restar.resta(n1, n2)));
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnmultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicaActionPerformed
        // TODO add your handling code here:
         int n1, n2;
         n1 = Integer.parseInt(txtnum1.getText().toString());
         n2 = Integer.parseInt(txtnum2.getText().toString());
         Multiplicar multiplicar = new Multiplicar();
         txtresultado.setText(String.valueOf(multiplicar.multiplica(n1, n2)));
    }//GEN-LAST:event_btnmultiplicaActionPerformed

    private void btndivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisionActionPerformed
        // TODO add your handling code here:
         int n1, n2;
         n1 = Integer.parseInt(txtnum1.getText().toString());
         n2 = Integer.parseInt(txtnum2.getText().toString());
         Dividir dividir = new Dividir();
          txtresultado.setText(String.valueOf(dividir.divide(n1, n2)));
    }//GEN-LAST:event_btndivisionActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcula;
    private javax.swing.JButton btndivision;
    private javax.swing.JButton btnmultiplica;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.ButtonGroup grupo_botones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbDivision;
    private javax.swing.JRadioButton rbMultiplicacion;
    private javax.swing.JRadioButton rbResta;
    private javax.swing.JRadioButton rbSuma;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    private javax.swing.JTextField txtresultado;
    // End of variables declaration//GEN-END:variables
}
