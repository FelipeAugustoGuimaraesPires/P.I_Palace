package dao;

import Modal.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ClienteDAO {
    
    public static boolean salvar(Cliente obj) {
        boolean retorno=false;
        Connection conexao=null;
        
        try {
            //passo 1 carregar o drive
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 2 abrir a conexão
            
            String url = "jdbc:mysql://localhost:3306/LojaInformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3 prepara o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("insert into cliente "
                    + "(Nome, Cpf, Email, DataNascimento, Sexo, Estado, Cidade, Telefone, "
                    + "EstadoCivil) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getCpf());
            comandoSQL.setString(3, obj.getEmail());
            comandoSQL.setDate(4, new java.sql.Date(obj.getDataNascimento().getTime()));
            comandoSQL.setString(5, obj.getSexo());
            comandoSQL.setString(6, obj.getEstado());
            comandoSQL.setString(7, obj.getCidade());
            comandoSQL.setString(8, obj.getTelefone());
            comandoSQL.setString(9, obj.getEstadoCivil());

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
    
    public static ArrayList<Cliente> Listar() {
        ArrayList<Cliente> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from cliente");
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Cliente obj = new Cliente();
                    obj.setId(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setCpf(rs.getString("Cpf"));
                    obj.setEmail(rs.getString("Email"));
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
    
    public static ArrayList<Cliente> ListaAlterar(int id) {
        ArrayList<Cliente> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from cliente where Id like "+id);
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Cliente obj = new Cliente();
                    obj.setId(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setCpf(rs.getString("Cpf"));
                    obj.setEmail(rs.getString("Email"));
                    obj.setDataNascimento(rs.getDate("DataNascimento"));
                    obj.setSexo(rs.getString("Sexo"));
                    obj.setEstado(rs.getString("Estado"));
                    obj.setCidade(rs.getString("Cidade"));
                    obj.setTelefone(rs.getString("Telefone"));
                    obj.setEstadoCivil(rs.getString("EstadoCivil"));
                    
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
    
    public static ArrayList<Cliente> Listar(String nome) {
        ArrayList<Cliente> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from cliente where Nome like '"+nome+"%' ");
            
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Cliente obj = new Cliente();
                    obj.setId(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setCpf(rs.getString("Cpf"));
                    obj.setEmail(rs.getString("Email"));
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
    public static ArrayList<Cliente> ListarCpf(String cpf) {
        ArrayList<Cliente> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from cliente where Cpf like '"+cpf+"%' ");
            
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Cliente obj = new Cliente();
                    obj.setId(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setCpf(rs.getString("Cpf"));
                    obj.setEmail(rs.getString("Email"));
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
            PreparedStatement comandoSQL = conexao.prepareStatement("delete from cliente where Id like ?");
            
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
    
    public static boolean atualizar(Cliente obj, int id) {
        boolean retorno=false;
        Connection conexao=null;
        
        try {
            //passo 1 carregar o drive
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 2 abrir a conexão
            
            String url = "jdbc:mysql://localhost:3306/LojaInformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3 prepara o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("Update cliente set Nome = ?, "
                    + "Cpf = ?, Email = ?, DataNascimento = ?, Sexo = ?, Estado = ?, Cidade = ?, "
                    + "Telefone = ?, EstadoCivil = ? where Id like "+id);
            
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getCpf());
            comandoSQL.setString(3, obj.getEmail());
            comandoSQL.setDate(4, new java.sql.Date(obj.getDataNascimento().getTime()));
            comandoSQL.setString(5, obj.getSexo());
            comandoSQL.setString(6, obj.getEstado());
            comandoSQL.setString(7, obj.getCidade());
            comandoSQL.setString(8, obj.getTelefone());
            comandoSQL.setString(9, obj.getEstadoCivil());

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
    
}
