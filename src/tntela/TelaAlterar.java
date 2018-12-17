package tntela;

import DAO.AlunoDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.AlunoModelo;


public class TelaAlterar extends javax.swing.JFrame {
    public TelaAlterar() {
        initComponents();
        setSize(690,525);
        setLocationRelativeTo(this);
    }
    
     private void InserirDados(int cod){
     
           Connection con = Conexao.AbrirConexao();
           AlunoDAO sql = new AlunoDAO(con);
           List<AlunoModelo> lista = new ArrayList<>();
           lista = sql.CapturarAluno(cod);
           
           for (AlunoModelo a : lista){
            
               jTF_Nome.setText(a.getNome());
               jTF_Resp.setText(a.getResponsavel());
               jTF_Idade.setText("" + a.getIdade());
               jTF_Cidade.setText(a.getCidade());
               jTF_Sala.setText("" + a.getSala());
               jTF_Numero.setText("" + a.getTelefone());
               jTF_Turno.setText(a.getTurno());
               jTF_Ano.setText("" + a.getAno_escolar());
          }
        Conexao.FecharConexao(con);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTF_NomeAluno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTF_Cidade = new javax.swing.JTextField();
        jTF_Nome = new javax.swing.JTextField();
        jTF_Resp = new javax.swing.JTextField();
        jTF_Idade = new javax.swing.JTextField();
        jTF_Sala = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTF_Numero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTF_Turno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTF_Ano = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("ALTERAR ALUNO");

        jTF_NomeAluno.setBackground(new java.awt.Color(0, 51, 51));
        jTF_NomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_NomeAlunoActionPerformed(evt);
            }
        });

        jButton1.setText("PROCURAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("NOME:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTF_NomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTF_NomeAluno)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 677, 126);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("NOME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 140, 72, 39);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("RESP.:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 200, 72, 39);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("CIDADE:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 320, 72, 39);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("IDADE:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 260, 72, 39);
        getContentPane().add(jTF_Cidade);
        jTF_Cidade.setBounds(100, 320, 200, 40);

        jTF_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_NomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTF_Nome);
        jTF_Nome.setBounds(100, 140, 200, 40);
        getContentPane().add(jTF_Resp);
        jTF_Resp.setBounds(100, 200, 200, 40);
        getContentPane().add(jTF_Idade);
        jTF_Idade.setBounds(100, 260, 200, 40);
        getContentPane().add(jTF_Sala);
        jTF_Sala.setBounds(430, 140, 200, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("SALA:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(360, 140, 72, 39);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("NÚMERO:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 200, 72, 39);
        getContentPane().add(jTF_Numero);
        jTF_Numero.setBounds(430, 200, 200, 40);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("TURNO:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 260, 72, 39);
        getContentPane().add(jTF_Turno);
        jTF_Turno.setBounds(430, 260, 200, 40);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("ANO:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(360, 320, 72, 39);
        getContentPane().add(jTF_Ano);
        jTF_Ano.setBounds(430, 320, 200, 40);

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(540, 400, 80, 50);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton3.setText("ALTERAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(100, 400, 200, 50);

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton4.setText("SAIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(440, 400, 80, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new telaCadAluno().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           String nome = jTF_Nome.getText();
           String codigo = jTF_NomeAluno.getText();
           int idade = Integer.parseInt(jTF_Idade.getText());
           int sala = Integer.parseInt(jTF_Sala.getText());
           String turno = jTF_Turno.getText();
           String responsavel = jTF_Resp.getText();
           String cidade = jTF_Cidade.getText();
           String telefone = (String) jTF_Numero.getText();
           int ano = (int) Integer.parseInt(jTF_Ano.getText());
        if(nome.equals("") || turno.equals("") || responsavel.equals("") || cidade.equals("") || telefone.equals("")){
               JOptionPane.showMessageDialog(null, "nenhum campo pode esta vazio", "Carlos Alberto", JOptionPane.WARNING_MESSAGE);
               
           }else{
            int cod = Integer.parseInt(codigo);
            Connection con = Conexao.AbrirConexao();
            AlunoDAO sql = new AlunoDAO(con);
            AlunoModelo a = new AlunoModelo();

            a.setNome(nome);
            a.setResponsavel(responsavel);
            a.setIdade(idade);
            a.setCidade(cidade);
            a.setSala(sala);
            a.setTelefone(telefone);
            a.setTurno(turno);
            a.setAno_escolar(ano);
            a.setCod(cod);
            
            sql.Alterar_Aluno(a);
            Conexao.FecharConexao(con);

            jTF_Nome.setText("");
            jTF_Resp.setText("");
            jTF_Idade.setText("");
            jTF_Cidade.setText("");
            jTF_Sala.setText("");
            jTF_Numero.setText("");
            jTF_Turno.setText("");
            jTF_Ano.setText("");
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso", "Carlos Alberto", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTF_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_NomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigo = jTF_NomeAluno.getText();
        Connection con = Conexao.AbrirConexao();
        AlunoDAO sql = new AlunoDAO(con);
        int cod = Integer.parseInt(codigo);
        if(sql.Testar_Aluno(cod) == false){
            JOptionPane.showMessageDialog(null, "Código não encontrado no banco", "Carlos Alberto", JOptionPane.WARNING_MESSAGE);
        }
       
        jTF_Nome.setText("");
        jTF_Resp.setText("");
        jTF_Idade.setText("");
        jTF_Cidade.setText("");
        jTF_Sala.setText("");
        jTF_Numero.setText("");
        jTF_Turno.setText("");
        jTF_Ano.setText("");
        
        InserirDados(cod);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTF_NomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_NomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_NomeAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTF_Ano;
    private javax.swing.JTextField jTF_Cidade;
    private javax.swing.JTextField jTF_Idade;
    private javax.swing.JTextField jTF_Nome;
    private javax.swing.JTextField jTF_NomeAluno;
    private javax.swing.JTextField jTF_Numero;
    private javax.swing.JTextField jTF_Resp;
    private javax.swing.JTextField jTF_Sala;
    private javax.swing.JTextField jTF_Turno;
    // End of variables declaration//GEN-END:variables
}
