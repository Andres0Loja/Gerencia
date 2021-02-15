/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import ec.edu.ups.soap.Sirve;
import ec.edu.ups.soap.SirveService;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 *
 * @author aloja
 */
public class Calculadora extends javax.swing.JFrame {
private static final QName SERVICE_NAME = new QName("http://SOAP.ups.edu.ec/", "sirveService");
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtval1 = new javax.swing.JTextField();
        txtval2 = new javax.swing.JTextField();
        btnSuma = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        txtResta = new javax.swing.JButton();
        txtMultiplicacion = new javax.swing.JButton();
        txtDivicion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        jLabel1.setText("Valor 1");

        jLabel2.setText("Valor 2");

        btnSuma.setText("Suma");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        txtResta.setText("Resta");
        txtResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRestaActionPerformed(evt);
            }
        });

        txtMultiplicacion.setText("Multiplicacion");
        txtMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMultiplicacionActionPerformed(evt);
            }
        });

        txtDivicion.setText("Divicion");
        txtDivicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDivicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtval1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtval2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSuma)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtResta)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMultiplicacion)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDivicion))
                                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtval1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtval2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuma)
                    .addComponent(txtResta)
                    .addComponent(txtMultiplicacion)
                    .addComponent(txtDivicion))
                .addGap(18, 18, 18)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        URL wsdlURL = SirveService.WSDL_LOCATION;
        SirveService ss = new SirveService(wsdlURL, SERVICE_NAME);
        Sirve port = ss.getSirvePort();  
        double _suma_arg0 = Double.parseDouble(txtval1.getText());
        double _suma_arg1 = Double.parseDouble(txtval2.getText());
        double _suma__return = port.suma(_suma_arg0, _suma_arg1);
        txtResultado.setText(_suma__return+"");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void txtRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRestaActionPerformed
        URL wsdlURL = SirveService.WSDL_LOCATION;
        SirveService ss = new SirveService(wsdlURL, SERVICE_NAME);
        Sirve port = ss.getSirvePort();
        double _resta_arg0 = Double.parseDouble(txtval1.getText());
        double _resta_arg1 = Double.parseDouble(txtval2.getText());
        double _resta__return = port.resta(_resta_arg0, _resta_arg1);
        txtResultado.setText(_resta__return+"");
        
    }//GEN-LAST:event_txtRestaActionPerformed

    private void txtMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMultiplicacionActionPerformed
        URL wsdlURL = SirveService.WSDL_LOCATION;
        SirveService ss = new SirveService(wsdlURL, SERVICE_NAME);
        Sirve port = ss.getSirvePort();
        double _multiplicacion_arg0 = Double.parseDouble(txtval1.getText());
        double _multiplicacion_arg1 = Double.parseDouble(txtval2.getText());
        double _multiplicacion__return = port.multiplicacion(_multiplicacion_arg0, _multiplicacion_arg1);
        txtResultado.setText(_multiplicacion__return+"");
        
    }//GEN-LAST:event_txtMultiplicacionActionPerformed

    private void txtDivicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDivicionActionPerformed
        URL wsdlURL = SirveService.WSDL_LOCATION;
        SirveService ss = new SirveService(wsdlURL, SERVICE_NAME);
        Sirve port = ss.getSirvePort(); 
        double _divicion_arg0 = Double.parseDouble(txtval1.getText());
        double _divicion_arg1 = Double.parseDouble(txtval2.getText());
        double _divicion__return = port.divicion(_divicion_arg0, _divicion_arg1);
        txtResultado.setText(_divicion__return+"");
    }//GEN-LAST:event_txtDivicionActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton txtDivicion;
    private javax.swing.JButton txtMultiplicacion;
    private javax.swing.JButton txtResta;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtval1;
    private javax.swing.JTextField txtval2;
    // End of variables declaration//GEN-END:variables
}