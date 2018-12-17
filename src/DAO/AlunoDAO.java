package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class AlunoDAO extends ExeculteSQL{
    
    public AlunoDAO(Connection con) {
        super(con);
    }

       public String Inserir_Aluno(AlunoModelo a){
        
        String sql = "insert into aluno values(0,?,?,?,?,?,?,?,?)";
        
        try{
          PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getResponsavel());
            ps.setInt(3, a.getIdade());
            ps.setString(4, a.getCidade());
            ps.setInt(5, a.getSala());
            ps.setString(6, a.getTelefone());
            ps.setString(7, a.getTurno());
            ps.setInt(8, a.getAno_escolar());
                     
          if(ps.executeUpdate() > 0){
              return "Inserido com sucesso.";
          }else{
              return "Erro ao inserir";
          }
        }catch(SQLException e){
            return e.getMessage();
        }
    }

       public boolean Testar_Aluno(int cod){
        boolean Resultado = false;
        try{
            
            String sql = "Select * from aluno where id_aluno = " + cod + "";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    Resultado = true;
                }
            }
        }catch(SQLException ex){
            ex.getMessage();
        }
        return Resultado;
    }
       
       public String Excluir_Aluno(AlunoModelo a ){
        String sql = "delete from aluno where id_aluno = ? and nome = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getCod());
            ps.setString(2, a.getNome());
            if(ps.executeUpdate() > 0){
                return "Excluir com sucesso.";
            }else{
                return "Erro ao excluir"; 
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
       public List<AlunoModelo> ListarComboAluno(){
        
        String sql = "select nome from aluno order by nome ";
        List<AlunoModelo> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    
                    AlunoModelo a = new AlunoModelo();
                    a.setNome(rs.getString(1));
                    lista.add(a);
                }
                return lista;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
       
       
       
       public List<AlunoModelo> CapturarAluno(int cod){
        String sql = "select nome, responsavel, idade, cidade, sala, telefone, turno, ano_escolar from aluno where id_aluno =" + cod + " ";
        List<AlunoModelo> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while (rs.next()){
                    AlunoModelo a = new AlunoModelo();
                    a.setNome(rs.getString(1));
                    a.setResponsavel(rs.getString(2));
                    a.setIdade(rs.getInt(3));
                    a.setCidade(rs.getString(4));
                    a.setSala(rs.getInt(5));
                    a.setTelefone(rs.getString(6));
                    a.setTurno(rs.getString(7));
                    a.setAno_escolar(rs.getInt(8));
                    lista.add(a);
                }
                return lista;
            }else{
                return null;
            }
        }catch(SQLException e){
            return null;
        }
    }
       
       public List<AlunoModelo> ListarAluno(){
        String sql = "select nome,responsavel,idade,cidade,sala,telefone,turno,ano_escolar from aluno";
        List<AlunoModelo> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    AlunoModelo a = new AlunoModelo();
                    a.setNome(rs.getString(1));
                    a.setResponsavel(rs.getString(2));
                    a.setIdade(rs.getInt(3));
                    a.setCidade(rs.getString(4));
                    a.setSala(rs.getInt(5));
                    a.setTelefone(rs.getString(6));
                    a.setTurno(rs.getString(7));
                    a.setAno_escolar(rs.getInt(8));
                    
                    lista.add(a);
                    
                }
                return lista;
            }else{
                return null; 
              }
            }catch(SQLException e){
                return null;
            }
        }
       
       public String Alterar_Aluno(AlunoModelo a){
        String sql = "update aluno set nome = ?, responsavel = ?, idade = ?, cidade = ?, sala = ?, telefone = ?, turno = ?, ano_escolar = ? WHERE id_aluno = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getResponsavel());
            ps.setInt(3, a.getIdade());
            ps.setString(4, a.getCidade());
            ps.setInt(5, a.getSala());
            ps.setString(6, a.getTelefone());
            ps.setString(7, a.getTurno());
            ps.setInt(8, a.getAno_escolar());
            ps.setInt(9, a.getCod());
            if(ps.executeUpdate() > 0){
                return "Atualizado com sucesso.";
            }else{
                return "Erro ao Atualizar";
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
       public List<AlunoModelo> ConsultaCodigoAluno(String nome){
        
        String sql = "select id_aluno from aluno where nome = '" + nome + "'";
        List<AlunoModelo> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    AlunoModelo a = new AlunoModelo();
                    a.setCod(rs.getInt(1));
                    lista.add(a);
                }
                return lista;
            }else{
                return null;
            }
        }catch(Exception e){
            return null;
        }
        
    }
       
}
