/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tntela;

import DAO.AlunoDAO;
import DAO.Conexao;
import DAO.FuncionarioDAO;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.funcionario;

/**
 *
 * @author MANUEL GUSTAVO
 */
public class telaCadFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form telaCadFuncionario
     */
    public telaCadFuncionario() {
        initComponents();
        Mostra();
    }
    
    public void Mostra(){
        Connection con = Conexao.AbrirConexao();
        FuncionarioDAO bd = new FuncionarioDAO(con);
        List<funcionario> lista = new ArrayList<>();
        lista = bd.ListarFuncionario();
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();
    
    while(tbm.getRowCount() > 0){
        tbm.removeRow(0);
    }
    
        int i = 0;
        for (funcionario tab : lista){
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getNome(), i, 0);
            jTable.setValueAt(tab.getLogin(), i, 1);
            jTable.setValueAt(tab.getSenha(), i, 2);
            i++;
        }
        Conexao.FecharConexao(con);
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
        jPanel2 = new javax.swing.JPanel();
        jTF_Nome = new javax.swing.JTextField();
        jTF_Senha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTF_Email = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("CADASTRO DE FUNCIONARIO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 20, 540, 49);

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setLayout(null);
        jPanel2.add(jTF_Nome);
        jTF_Nome.setBounds(490, 20, 170, 30);
        jPanel2.add(jTF_Senha);
        jTF_Senha.setBounds(870, 20, 310, 30);

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(480, 120, 140, 40);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SENHA:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(800, 20, 240, 40);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOME:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(440, 30, 40, 10);

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setText("SAIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(1060, 120, 100, 40);

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setText("VOLTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(370, 120, 110, 40);

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setText("EXCLUIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(480, 80, 140, 40);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EMAIL:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(70, 20, 40, 30);
        jPanel2.add(jTF_Email);
        jTF_Email.setBounds(120, 20, 170, 30);

        jButton5.setBackground(new java.awt.Color(255, 255, 51));
        jButton5.setText("ALTERAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(620, 120, 110, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(100, 80, 1200, 170);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "EMAIL", "SENHA"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 250, 1460, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1457, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome = jTF_Nome.getText();
        String Email = jTF_Email.getText();
        String Senha = jTF_Senha.getText();
        if(nome.equals("") || Email.equals("") || Senha.equals("")){
            JOptionPane.showMessageDialog(null, "nenhum campo pode esta vazio", "Carlos Alberto", JOptionPane.WARNING_MESSAGE);

        }else{
            Connection con = Conexao.AbrirConexao();
            FuncionarioDAO sql = new FuncionarioDAO(con);
            funcionario a = new funcionario();

            //a.setCodigo(codigo);
            a.setNome(nome);
            a.setLogin(Email);
            a.setSenha(Senha);
            
            sql.Inserir_Funcionario(a);
            Conexao.FecharConexao(con);

            jTF_Nome.setText("");
            jTF_Email.setText("");
            jTF_Senha.setText("");
            JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso", "Carlos Alberto", JOptionPane.INFORMATION_MESSAGE);
            sql.ListarFuncionario();
            Mostra();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new tela1().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Tela2().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new TelaAlterarFuncionario().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new ExcluirFuncionario().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(telaCadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTF_Email;
    private javax.swing.JTextField jTF_Nome;
    private javax.swing.JTextField jTF_Senha;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}