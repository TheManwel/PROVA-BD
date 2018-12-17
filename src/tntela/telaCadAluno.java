package tntela;

import DAO.*;
import java.io.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;


/**
 *
 * @author MANUEL GUSTAVO
 */
public class telaCadAluno extends javax.swing.JFrame {

    /**
     * Creates new form telaCadAluno
     */
    public telaCadAluno() {
        initComponents();
        setSize(1366,1025);
        setLocationRelativeTo(this);
        Mostra();
    }
   
     public void Mostra(){
        Connection con = Conexao.AbrirConexao();
        AlunoDAO bd = new AlunoDAO(con);
        List<AlunoModelo> lista = new ArrayList<>();
        lista = bd.ListarAluno();
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();
    
    while(tbm.getRowCount() > 0){
        tbm.removeRow(0);
    }
    
        int i = 0;
        for (AlunoModelo tab : lista){
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getNome(), i, 0);
            jTable.setValueAt(tab.getResponsavel(), i, 1);
            jTable.setValueAt(tab.getIdade(), i, 2);
            jTable.setValueAt(tab.getCidade(), i, 3);
            jTable.setValueAt(tab.getSala(), i, 4);
            jTable.setValueAt(tab.getTelefone(), i, 5);
            jTable.setValueAt(tab.getTurno(), i, 6);
            jTable.setValueAt(tab.getAno_escolar(), i, 7);
            i++;
        }
        Conexao.FecharConexao(con);
    }
         
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTF_Turno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTF_Sala = new javax.swing.JTextField();
        jTF_Idade = new javax.swing.JTextField();
        jTF_Nome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTF_Ano = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTF_Responsavel = new javax.swing.JTextField();
        jTF_Cidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTF_Telefone = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("CADASTRO DE ALUNOS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 20, 444, 49);

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setLayout(null);
        jPanel2.add(jTF_Turno);
        jTF_Turno.setBounds(70, 120, 170, 30);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TURNO:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 120, 49, 20);
        jPanel2.add(jTF_Sala);
        jTF_Sala.setBounds(72, 83, 170, 30);
        jPanel2.add(jTF_Idade);
        jTF_Idade.setBounds(72, 47, 170, 30);
        jPanel2.add(jTF_Nome);
        jTF_Nome.setBounds(72, 11, 170, 30);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ANO ESCOLAR:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(740, 140, 190, 30);

        jTF_Ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_AnoActionPerformed(evt);
            }
        });
        jPanel2.add(jTF_Ano);
        jTF_Ano.setBounds(1010, 140, 170, 29);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SALA:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(19, 83, 43, 20);
        jPanel2.add(jTF_Responsavel);
        jTF_Responsavel.setBounds(1010, 20, 170, 30);
        jPanel2.add(jTF_Cidade);
        jTF_Cidade.setBounds(1010, 60, 170, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("IDADE:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 50, 40, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NÚMERO(CELL):");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(740, 100, 130, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CIDADE:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(740, 60, 50, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOME DO PAI/RESPONSÁVEL:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(740, 20, 240, 40);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOME:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 20, 40, 10);

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setText("SAIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(1070, 180, 60, 30);

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setText("VOLTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(393, 170, 100, 40);

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setText("EXCLUIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(500, 123, 140, 40);

        jButton5.setBackground(new java.awt.Color(255, 255, 51));
        jButton5.setText("ALTERAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(650, 170, 110, 40);

        jToggleButton1.setText("CADASTRAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1);
        jToggleButton1.setBounds(500, 170, 140, 40);

        try {
            jTF_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jTF_Telefone);
        jTF_Telefone.setBounds(1009, 100, 170, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(100, 80, 1200, 220);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "RESPONSAVEL", "IDADE", "CIDADE", "SALA", "TELEFONE", "TURNO", "ANO ESCOLAR"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 300, 1350, 370);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 1457, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            new tela1().setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            new Tela2().setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTF_AnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_AnoActionPerformed
      
        
    }//GEN-LAST:event_jTF_AnoActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
           //String nome = jTF_NumeroCliente.getText();
           String nome = jTF_Nome.getText();
           int idade = Integer.parseInt(jTF_Idade.getText());
           int sala = Integer.parseInt(jTF_Sala.getText());
           String turno = jTF_Turno.getText();
           String responsavel = jTF_Responsavel.getText();
           String cidade = jTF_Cidade.getText();
           String telefone = (String) jTF_Telefone.getText();
           int ano = (int) Integer.parseInt(jTF_Ano.getText());
           
               Connection con = Conexao.AbrirConexao();
               AlunoDAO sql = new AlunoDAO(con);
               AlunoModelo b = new AlunoModelo();
               
               //a.setNome(nome);
               b.setNome(nome);
               b.setResponsavel(responsavel);
               b.setIdade(idade);
               b.setCidade(cidade);
               b.setSala(sala);
               b.setTelefone(telefone);
               b.setTurno(turno);
               b.setAno_escolar(ano);
               
               System.out.println(""+nome);
               System.out.println(""+responsavel);
               System.out.println(""+idade);
               System.out.println(""+cidade);
               System.out.println(""+sala);
               System.out.println(""+telefone);
               System.out.println(""+ano);
               
               sql.Inserir_Aluno(b);
               Conexao.FecharConexao(con);
               
               //jTF_Nome.setText("");
               jTF_Nome.setText("");
               jTF_Responsavel.setText("");
               jTF_Idade.setText("");
               jTF_Cidade.setText("");
               jTF_Sala.setText("");
               jTF_Telefone.setText("");
               jTF_Turno.setText("");
               jTF_Ano.setText("");

               JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso", "Carlos Alberto", JOptionPane.INFORMATION_MESSAGE);
               sql.ListarAluno();
               Mostra();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new TelaAlterar().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new ExcluirAluno().setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(telaCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTF_Ano;
    private javax.swing.JTextField jTF_Cidade;
    private javax.swing.JTextField jTF_Idade;
    private javax.swing.JTextField jTF_Nome;
    private javax.swing.JTextField jTF_Responsavel;
    private javax.swing.JTextField jTF_Sala;
    private javax.swing.JFormattedTextField jTF_Telefone;
    private javax.swing.JTextField jTF_Turno;
    private javax.swing.JTable jTable;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
