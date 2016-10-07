/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author w8
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        txtFilas.requestFocusInWindow();
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdAutomatico, cmdManual, cmdOperar};
        Helper.HabilitarBotones(botonesH);
        Helper.DeshabilitarBotones(botonesD);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtColumnas = new javax.swing.JTextField();
        txtFilas = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cmdLimpiar = new javax.swing.JButton();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdOperar = new javax.swing.JButton();
        cmbOpciones = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatrizResultante = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizInicial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taller Matrices 2");
        setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("N° de columnas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("N° de filas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtColumnas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColumnasKeyTyped(evt);
            }
        });
        jPanel1.add(txtColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 50, -1));

        txtFilas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilasKeyTyped(evt);
            }
        });
        jPanel1.add(txtFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 50, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdLimpiar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        cmdCrear.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        cmdManual.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel2.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        cmdAutomatico.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdAutomatico.setText("Automatico");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        cmdOperar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdOperar.setText("Operar");
        cmdOperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdOperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        cmbOpciones.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Letra B", "Letra K", "Letra M", "Letra W", "Letra Q", "Letra J", "Letra G", "Letra R", "Figura 1", "Figura 2", "Figura 3", "Figura 4" }));
        jPanel2.add(cmbOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 340, 90));

        tblMatrizResultante.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblMatrizResultante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatrizResultante.setEnabled(false);
        jScrollPane1.setViewportView(tblMatrizResultante);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 260, 200));

        tblMatrizInicial.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblMatrizInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatrizInicial.setEnabled(false);
        jScrollPane2.setViewportView(tblMatrizInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 260, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(622, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm, tm2;
        int nf = 0, nc = 0;
        int sw = 1;
        tm = (DefaultTableModel) tblMatrizInicial.getModel();
        tm2 = (DefaultTableModel) tblMatrizResultante.getModel();

        try {
            nf = Integer.parseInt(txtFilas.getText());
            nc = Integer.parseInt(txtColumnas.getText());
        } catch (NumberFormatException e) {
            Helper.mensaje(this, "Por favor digite datos validos", "Error", 2);
            sw = 0;
        }

        if (sw == 1) {
            if (nf == 0) {
            Helper.mensaje(this, "No puede ser cero", "Error", 2);
            txtFilas.requestFocusInWindow();
            txtFilas.selectAll();
        } else if (nc == 0) {
            Helper.mensaje(this, "No puede ser cero", "Error", 2);
            txtColumnas.requestFocusInWindow();
            txtColumnas.selectAll();
        } else if (nf > 10) {
            Helper.mensaje(this, "No puede ser mayor a 10", "Error", 2);
            txtFilas.requestFocusInWindow();
            txtFilas.selectAll();
        } else if (nc > 10) {
            Helper.mensaje(this, "No puede ser mayor a 10", "Error", 2);
            txtColumnas.requestFocusInWindow();
            txtColumnas.selectAll();
        } else if (nf < 5) {
            Helper.mensaje(this, "No puede ser menor a 5", "Error", 2);
            txtFilas.requestFocusInWindow();
            txtFilas.selectAll();
        } else if (nc < 5) {
            Helper.mensaje(this, "No puede ser menor a 5", "Error", 2);
            txtColumnas.requestFocusInWindow();
            txtColumnas.selectAll();
        } else {
            tm.setRowCount(nf);
            tm.setColumnCount(nc);

            tm2.setRowCount(nf);
            tm2.setColumnCount(nc);
            
            JButton botonesH[] = {cmdLimpiar, cmdAutomatico, cmdManual};
                JButton botonesD[] = {cmdCrear, cmdOperar};
                Helper.HabilitarBotones(botonesH);
                Helper.DeshabilitarBotones(botonesD);
                txtColumnas.setEditable(false);
                txtFilas.setEditable(false);
        }
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
        Helper.TablaPorDefecto(tblMatrizInicial);
        Helper.TablaPorDefecto(tblMatrizResultante);

        JButton botonesH[] = {cmdLimpiar, cmdCrear};
        JButton botonesD[] = {cmdOperar, cmdAutomatico, cmdManual};
        Helper.HabilitarBotones(botonesH);
        Helper.DeshabilitarBotones(botonesD);
        txtFilas.setText("");
        txtColumnas.setText("");
        txtFilas.setEditable(true);
        txtColumnas.setEditable(true);
        txtFilas.requestFocusInWindow();
        cmbOpciones.setSelectedIndex(0);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        // TODO add your handling code here:
        int nf, nc, res, aux;
        double n;
        boolean sw = true;
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    aux = 1;
                    try {
                        n = Double.parseDouble(Helper.RecibirDatos(this, "Digite el elemento en la posición: [" + i + "][" + j + "]"));
                        tblMatrizInicial.setValueAt((int) n, i, j);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Digite la información correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                        aux = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        System.out.println(res);
                        if (res == 0) {
                            aux = 1;
                            j = nc;
                            i = nf;
                            sw = false;
                            JButton botonesH[] = {cmdCrear, cmdLimpiar};
                            JButton botonesD[] = {cmdAutomatico, cmdManual, cmdOperar};
                            Helper.HabilitarBotones(botonesH);
                            Helper.DeshabilitarBotones(botonesD);
                            Helper.TablaPorDefecto(tblMatrizInicial);
                            Helper.TablaPorDefecto(tblMatrizResultante);
                        } else {
                            aux = 0;
                            JButton botonesH[] = {cmdOperar, cmdLimpiar};
                            JButton botonesD[] = {cmdAutomatico, cmdManual, cmdCrear};
                            Helper.HabilitarBotones(botonesH);
                            Helper.DeshabilitarBotones(botonesD);
                        }

                    }
                } while (aux == 0);

            }

        }
    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed
        // TODO add your handling code here:
        int nf, nc;
        int n;
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 25 + 1);
                tblMatrizInicial.setValueAt(n, i, j);
            }
        }

        JButton botonesH[] = {cmdLimpiar, cmdOperar};
        JButton botonesD[] = {cmdCrear, cmdAutomatico, cmdManual};
        Helper.HabilitarBotones(botonesH);
        Helper.DeshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdOperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperarActionPerformed
        // TODO add your handling code here:
        int op, nf, nc, pares, aux;

        op = cmbOpciones.getSelectedIndex();
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        Helper.LimpiarTabla(tblMatrizResultante);
        switch (op) {
            case 0:
                if (nf >= 5 && nc >= 5) {
                    if (nf % 2 == 1) {
                        Helper.LetraB(tblMatrizInicial, tblMatrizResultante);
                    } else {
                        Helper.mensaje(this, "El número de filas debe ser impar", "Error", 2);
                    }
                } else {
                    Helper.mensaje(this, "No se puede resolver", "Error", 2);
                }
                break;
            case 1:
                if (nf >= 5 && nc > 4) {
                    if (nf % 2 == 1) {
                        Helper.LetraK(tblMatrizInicial, tblMatrizResultante);
                    } else {
                        Helper.mensaje(this, "El número de filas debe ser impar", "Error", 2);
                    }
                } else {
                    Helper.mensaje(this, "No se puede resolver", "Error", 2);
                }
                break;
            case 2:
                if (nf % 2 == 1 && nc % 2 == 1) {
                    if (nf == nc) {
                        Helper.LetraM(tblMatrizInicial, tblMatrizResultante);
                    } else {
                        Helper.mensaje(this, "No se puede resolver, las filas y columnas deben ser iguales", "Error", 2);
                    }
                } else {
                    Helper.mensaje(this, "El número de filas y columnas debe ser impar", "Error", 2);
                }
                break;
            case 3:
                if (nf % 2 == 1 && nc % 2 == 1) {
                    if (nf == nc) {
                        Helper.LetraW(tblMatrizInicial, tblMatrizResultante);
                    } else {
                        Helper.mensaje(this, "No se puede resolver, las filas y columnas deben ser iguales", "Error", 2);
                    }
                } else {
                    Helper.mensaje(this, "El número de filas y columnas debe ser impar", "Error", 2);
                }
                break;
            case 4:
                if (nf >= 5 && nc >= 5) {
                    Helper.LetraQ(tblMatrizInicial, tblMatrizResultante);
                } else {
                    Helper.mensaje(this, "No se puede resolver, debe ser mayor o igual a 5", "Error", 2);
                }
                break;
            case 5:
                if (nf >= 5 && nc >= 5) {
                    Helper.LetraJ(tblMatrizInicial, tblMatrizResultante);
                } else {
                    Helper.mensaje(this, "No se puede resolver", "Error", 2);
                }
                break;
            case 6:
                if (nf >= 6 && nc >= 5) {
                    Helper.LetraG(tblMatrizInicial, tblMatrizResultante);
                } else {
                    Helper.mensaje(this, "No se puede resolver", "Error", 2);
                }
                break;
            case 7:
                if (nf >= 5 && nc >= 5) {
                    if (nf == nc) {
                        Helper.LetraR(tblMatrizInicial, tblMatrizResultante);
                    } else {
                        Helper.mensaje(this, "No se puede resolver, deben ser iguales", "Error", 2);
                    }
                } else {
                    Helper.mensaje(this, "No se puede resolver", "Error", 2);
                }
                break;
            case 8:
                if (nf % 2 == 1 && nc % 2 == 1) {
                    if (nf == nc) {
                        Helper.Figura1(tblMatrizInicial, tblMatrizResultante);
                    }
                } else {
                    Helper.mensaje(this, "No se puede resolver, las filas y columnas debe ser impares", "Error", 2);
                }
                break;
            case 9:
                if (nf % 2 == 1 && nc % 2 == 1) {
                    if (nf == nc) {
                        Helper.Figura2(tblMatrizInicial, tblMatrizResultante);
                    }
                } else {
                    Helper.mensaje(this, "No se puede resolver, las filas y columnas debe ser impares", "Error", 2);
                }
                break;
            case 10:
                if (nf % 2 == 0 && nc % 2 == 0) {
                    if (nf == nc) {
                        Helper.Figura3(tblMatrizInicial, tblMatrizResultante);
                    }
                } else {
                    Helper.mensaje(this, "El número de filas y columnas debe ser par", "Error", 2);
                }
                break;
            case 11:
                if (nf % 2 == 1 && nc % 2 == 1) {
                    if (nf == nc) {
                        Helper.Figura4(tblMatrizInicial, tblMatrizResultante);
                    } else {
                        Helper.mensaje(this, "El número de filas y columnas debe ser iguales", "Error", 2);
                    }
                } else {
                    Helper.mensaje(this, "El número de filas y columnas deben ser iguales", "Error", 2);
                }
                break;
        }
    }//GEN-LAST:event_cmdOperarActionPerformed

    private void txtFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtFilasKeyTyped

    private void txtColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColumnasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtColumnasKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOpciones;
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMatrizInicial;
    private javax.swing.JTable tblMatrizResultante;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    // End of variables declaration//GEN-END:variables
}