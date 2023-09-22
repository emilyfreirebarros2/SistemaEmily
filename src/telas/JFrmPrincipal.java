/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import padraoNovo.JDlgPesquisProdutoNovo;
import padraoNovo.JDlgPesquisaVendedorNovo;

/**
 *
 * @author 08060243136
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrmPrincipal
     */
    public JFrmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Sistemas de Vendas");
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1_efb = new javax.swing.JMenu();
        jMnuUsuarios_efb = new javax.swing.JMenuItem();
        jMnuCliente_efb = new javax.swing.JMenuItem();
        jMnuProduto_efb2 = new javax.swing.JMenuItem();
        jMnuVendedor_efb2 = new javax.swing.JMenuItem();
        jSeparator1_efb = new javax.swing.JPopupMenu.Separator();
        jMnuSair_efb = new javax.swing.JMenuItem();
        jMenu3_efb = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1_efb.setMnemonic('C');
        jMenu1_efb.setText("Cadastros");

        jMnuUsuarios_efb.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios_efb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        jMnuUsuarios_efb.setMnemonic('U');
        jMnuUsuarios_efb.setText("Usuários");
        jMnuUsuarios_efb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuarios_efbActionPerformed(evt);
            }
        });
        jMenu1_efb.add(jMnuUsuarios_efb);

        jMnuCliente_efb.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCliente_efb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clientes.png"))); // NOI18N
        jMnuCliente_efb.setMnemonic('c');
        jMnuCliente_efb.setText("Cliente");
        jMnuCliente_efb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuCliente_efbActionPerformed(evt);
            }
        });
        jMenu1_efb.add(jMnuCliente_efb);

        jMnuProduto_efb2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProduto_efb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produtos.png"))); // NOI18N
        jMnuProduto_efb2.setMnemonic('P');
        jMnuProduto_efb2.setText("Produto Novo");
        jMnuProduto_efb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProduto_efb2ActionPerformed(evt);
            }
        });
        jMenu1_efb.add(jMnuProduto_efb2);

        jMnuVendedor_efb2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendedor_efb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendedor.png"))); // NOI18N
        jMnuVendedor_efb2.setMnemonic('V');
        jMnuVendedor_efb2.setText("Vendedor Novo");
        jMnuVendedor_efb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendedor_efb2ActionPerformed(evt);
            }
        });
        jMenu1_efb.add(jMnuVendedor_efb2);
        jMenu1_efb.add(jSeparator1_efb);

        jMnuSair_efb.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair_efb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        jMnuSair_efb.setMnemonic('r');
        jMnuSair_efb.setText("Sair");
        jMnuSair_efb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSair_efbActionPerformed(evt);
            }
        });
        jMenu1_efb.add(jMnuSair_efb);

        jMenuBar1.add(jMenu1_efb);

        jMenu3_efb.setText("Movimento");
        jMenuBar1.add(jMenu3_efb);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuUsuarios_efbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuarios_efbActionPerformed
        JDlgUsuarios jDlgUsuarios = new JDlgUsuarios(null, true);
        jDlgUsuarios.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuUsuarios_efbActionPerformed

    private void jMnuSair_efbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSair_efbActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuSair_efbActionPerformed

    private void jMnuCliente_efbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuCliente_efbActionPerformed
        JDlgCliente jDlgCliente = new JDlgCliente(null, true);
        jDlgCliente.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuCliente_efbActionPerformed

    private void jMnuProduto_efb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProduto_efb2ActionPerformed
        // TODO add your handling code here:
        JDlgPesquisProdutoNovo jDlgPesquisProdutoNovo=new JDlgPesquisProdutoNovo(null,true);
        jDlgPesquisProdutoNovo.setVisible(true);
    }//GEN-LAST:event_jMnuProduto_efb2ActionPerformed

    private void jMnuVendedor_efb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendedor_efb2ActionPerformed
        // TODO add your handling code here:
        JDlgPesquisaVendedorNovo jDlgPesquisaVendedorNovo=new JDlgPesquisaVendedorNovo(null, true);
        jDlgPesquisaVendedorNovo.setVisible(true);
    }//GEN-LAST:event_jMnuVendedor_efb2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1_efb;
    private javax.swing.JMenu jMenu3_efb;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnuCliente_efb;
    private javax.swing.JMenuItem jMnuProduto_efb2;
    private javax.swing.JMenuItem jMnuSair_efb;
    private javax.swing.JMenuItem jMnuUsuarios_efb;
    private javax.swing.JMenuItem jMnuVendedor_efb2;
    private javax.swing.JPopupMenu.Separator jSeparator1_efb;
    // End of variables declaration//GEN-END:variables
}
