package tntela;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Aluno {
    private String nome;
    private int idade;
    private String sala;
    private String turno;
    private String pais;
    private int numero;
    private String cidade;
    private String ano;
    
      
    public void cadAluno(String nome,String idade,String sala,String turno, String pais,String numero,String cidade,String ano){
        try{
            File pasta = new File(sala);
            pasta.mkdir();
            
            FileOutputStream arquivo = new FileOutputStream(sala+"/"+nome+".txt");
            PrintWriter pw = new PrintWriter(arquivo);
            
            pw.println(nome+" ;"+idade+" ;"+sala+" ;"+turno+" ;"+pais+" ;"+numero+" ;"+cidade+" ;"+ano+" ;");
            
            pw.close();
            arquivo.close();
         
        }catch(Exception e){
            System.out.println("erro");
        }
    }
    
    public void sala1(){
        File file = new File("sala1");
        File[] f = file.listFiles();
        
        for (int i = 0; i < f.length; i++) {
            System.out.println(""+f[i]);
            
        }
    }
    
    public static void main(String[] argr){
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    
}
