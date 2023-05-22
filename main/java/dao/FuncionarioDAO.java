/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Modal.Funcionario;
import Modal.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class FuncionarioDAO {
    public static boolean salvar(Funcionario obj) {
        boolean retorno=false;
        Connection conexao=null;
        
        try {
            //passo 1 carregar o drive
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 2 abrir a conexão
            
            String url = "jdbc:mysql://localhost:3306/LojaInformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3 prepara o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("insert into funcionario "
                    + "(Nome, Cpf, DataNascimento, Sexo, Estado, Telefone) "
                    + "values (?, ?, ?, ?, ?, ?)");
            
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getCpf());
            comandoSQL.setDate(3, new java.sql.Date(obj.getDataNascimento().getTime()));
            comandoSQL.setString(4, obj.getSexo());
            comandoSQL.setString(5, obj.getEstado());
            comandoSQL.setString(6, obj.getTelefone());

                //passo 4 Executar comando SQL
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno=true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexão");
        }
        
        return retorno;
    }
    
    public static ArrayList<Funcionario> Listar() {
        ArrayList<Funcionario> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from funcionario");
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Funcionario obj = new Funcionario();
                    obj.setID(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setCpf(rs.getString("Cpf"));
                    obj.setTelefone(rs.getString("Telefone"));
                    
                    listaRetorno.add(obj);
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir conexão");
        }
        
        return listaRetorno;
    }
    
     public static ArrayList<Funcionario> ListarId(String id) {
        ArrayList<Funcionario> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from funcionario where id like "+id);
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Funcionario obj = new Funcionario();
                    obj.setID(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setCpf(rs.getString("Cpf"));
                    obj.setTelefone(rs.getString("Telefone"));
                    
                    listaRetorno.add(obj);
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir conexão");
        }
        
        return listaRetorno;
    }
     
      public static ArrayList<Funcionario> ListarCPF(String cpf) {
        ArrayList<Funcionario> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from funcionario where cpf like "+cpf);
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Funcionario obj = new Funcionario();
                    obj.setID(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setCpf(rs.getString("Cpf"));
                    obj.setTelefone(rs.getString("Telefone"));
                    
                    listaRetorno.add(obj);
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir conexão");
        }
        
        return listaRetorno;
    }
      
       public static ArrayList<Funcionario> Listar(String id, String cpf) {
        ArrayList<Funcionario> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from funcionario where id like "+id+" and cpf like "+cpf);
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Funcionario obj = new Funcionario();
                    obj.setID(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setCpf(rs.getString("Cpf"));
                    obj.setTelefone(rs.getString("Telefone"));
                    
                    listaRetorno.add(obj);
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir conexão");
        }
        
        return listaRetorno;
    }
       
       public static ArrayList<Funcionario> ListaAlterar(int id) {
        ArrayList<Funcionario> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from funcionario where Id like "+id);
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Funcionario obj = new Funcionario();
                    obj.setNome(rs.getString("Nome"));
                    obj.setCpf(rs.getString("Cpf"));
                    obj.setDataNascimento(rs.getDate("DataNascimento"));
                    obj.setSexo(rs.getString("Sexo"));
                    obj.setEstado(rs.getString("Estado"));
                    obj.setTelefone(rs.getString("Telefone"));
                    
                    listaRetorno.add(obj);
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir conexão");
        }
        
        return listaRetorno;
    }
       
       public static boolean excluir(int id){
        boolean retorno=false;
        Connection conexao=null;
        
        try {
            //passo 1 carregar o drive
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            
            //passo 2 abrir a conexão
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
                
            //passo 3 prepara o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("delete from funcionario where Id like ?");
            
            comandoSQL.setInt(1, id);
            
            //passo 4 Executar comando SQL
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno=true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexão");
        }
        
        return retorno;
    }
       
       public static boolean Atualizar(int id, Funcionario obj) {
        boolean retorno=false;
        Connection conexao=null;
        
        try {
            //passo 1 carregar o drive
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 2 abrir a conexão
            
            String url = "jdbc:mysql://localhost:3306/LojaInformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3 prepara o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("update funcionario where id "
                    + "like "+id+" set Nome = ?, Cpf = ?, DataNascimento = ?, Sexo = ?, "
                    + "Estado = ?, Telefone = ?");
            
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getCpf());
            comandoSQL.setDate(3, new java.sql.Date(obj.getDataNascimento().getTime()));
            comandoSQL.setString(4, obj.getSexo());
            comandoSQL.setString(5, obj.getEstado());
            comandoSQL.setString(6, obj.getTelefone());

                //passo 4 Executar comando SQL
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno=true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir a conexão");
        }
        
        return retorno;
    }
       
    public static Funcionario pegaId(String cpf) {
        Funcionario Retorno = new Funcionario();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from funcionario where cpf like "+cpf);
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                Funcionario obj = new Funcionario();
                obj.setID(rs.getInt("Id"));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir conexão");
        }
        
        return Retorno;
    }
    
}
