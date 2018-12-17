package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.funcionario;

public class FuncionarioDAO extends ExeculteSQL {
    public FuncionarioDAO(Connection con){
        super(con);
    }
    public boolean Logar(String login, String senha){
        boolean finalResult = false;
        try{
            String consulta = "select nome, senha from funcionario" + " where nome = '" +login+ "' and senha = '" +senha+ "'";
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    funcionario a = new funcionario();
                    a.setLogin(rs.getString(1));
                    a.setSenha(rs.getString(2));
                    finalResult = true;
                }
        }
        }catch (SQLException ex){
            ex.getMessage();
        }
        return finalResult;
    }
    
     public String Inserir_Funcionario(funcionario a){
        String sql = "insert into funcionario value(0,?,?,?)";
        try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          
          ps.setString(1, a.getNome());
          ps.setString(2, a.getLogin());
          ps.setString(3, a.getSenha());
          
          if(ps.executeUpdate() < 0){
              return "Inserido com sucesso.";
          }else{
              return "Erro ao inserir";
          }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    public List<funcionario> ListarFuncionario(){
        String sql = "select nome,email,senha from funcionario";
        List<funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    funcionario a = new funcionario();
                    a.setNome(rs.getString(1));
                    a.setLogin(rs.getString(2));
                    a.setSenha(rs.getString(3));
                    
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
    public List<funcionario> Pesquisar_Nome_Funcionario(String nome){
        String sql = "Select idfuncionario, nome, senha, login, cod" + "from funcionario where nome Like'" + nome + "%'";
         List<funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    funcionario a = new funcionario();
                    a.setCod(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setSenha(rs.getString(3));
                    a.setLogin(rs.getString(4));
                    
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
    public List<funcionario> Persquisar_Cod_Funcionario(int cod){
        String sql = "Select idfuncionario, nome, senha, login, cod" + "from funcionario where nome idfuncionario = '" + cod + "'";
         List<funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    funcionario a = new funcionario();
                    a.setCod(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setSenha(rs.getString(3));
                    a.setLogin(rs.getString(4));
                    
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
    public List<funcionario> ListarComboFuncionario(){
        
        String sql = "select nome from funcionario order by nome ";
        List<funcionario> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    
                    funcionario a = new funcionario();
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
    
    public boolean Testar_Funcionario(int cod){
        boolean Resultado = false;
        try{
            
            String sql = "Select * from funcionario where id_funcionario = " +  cod + "";
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
    
    public List<funcionario> CapturarFuncionario(int cod){
        String sql = "select nome,email,senha from funcionario where id_funcionario =" + cod + " ";
        List<funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while (rs.next()){
                    funcionario a = new funcionario();
                    a.setNome(rs.getString(1));
                    a.setSenha(rs.getString(2));
                    a.setLogin(rs.getString(3));
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
    
    public List<funcionario> ConsultaCodigoFuncionario(String nome){
        
        String sql = "select id_funcionario from funcionario where nome = '" + nome + "'";
        List<funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    funcionario a = new funcionario();
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
    
    public String Excluir_Funcionario(funcionario a ){
        String sql = "delete from funcionario where id_funcionario = ? and nome = ?";
        
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
    
    public String Alterar_Funcionario(funcionario a){
        String sql = "update funcionario set nome = ?, email = ?, senha = ? WHERE id_funcionario = ?";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getLogin());
            ps.setString(3, a.getSenha());
            ps.setInt(4, a.getCod());
            if(ps.executeUpdate() > 0){
                return "Atualizado com sucesso.";
            }else{
                return "Erro ao Atualizar";
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
}
