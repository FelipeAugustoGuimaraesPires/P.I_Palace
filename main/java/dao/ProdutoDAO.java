package dao;

import Modal.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO {
    public static boolean Salvar(Produto obj) {
        boolean retorno=false;
        Connection conexao=null;
        
        try {
            //passo 1 carregar o drive
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 2 abrir a conexão
            
            String url = "jdbc:mysql://localhost:3306/LojaInformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3 prepara o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("insert into produto "
                    + "(nome, descricao, valor, quantidade) values (?, ?, ?, ?);");
            
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getDescricao());
            comandoSQL.setDouble(3, obj.getValor());
            comandoSQL.setInt(4, obj.getQuantidade());

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
    
    public static ArrayList<Produto> Listar(String nome) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto where "
                    + "Nome like '"+nome+"%'");
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Produto obj = new Produto();
                    obj.setId(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setDescricao(rs.getString("Descricao"));
                    obj.setQuantidade(rs.getInt("Quantidade"));
                    obj.setValor(rs.getDouble("Valor"));
                    
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
    
    public static ArrayList<Produto> Listar(int id, String nome, double valormx, double valormin) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto where "
                    + "id like "+id+" and nome like '"+nome+"' and valor between "+valormin+" "
                            + "and "+valormx);
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Produto obj = new Produto();
                    obj.setId(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setDescricao(rs.getString("Descricao"));
                    obj.setQuantidade(rs.getInt("Quantidade"));
                    obj.setValor(rs.getDouble("Valor"));
                    
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
    
    public static ArrayList<Produto> ListarId(int id, String nome) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto where "
                    + "id like "+id+" and Nome like '"+nome+"%'");
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Produto obj = new Produto();
                    obj.setId(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setDescricao(rs.getString("Descricao"));
                    obj.setQuantidade(rs.getInt("Quantidade"));
                    obj.setValor(rs.getDouble("Valor"));
                    
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
    
    
    
    public static ArrayList<Produto> ListarValorMin(String nome, double valorMin) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto where "
                    + "Nome like '"+nome+"%' and valor >= "+valorMin);
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Produto obj = new Produto();
                    obj.setId(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setDescricao(rs.getString("Descricao"));
                    obj.setQuantidade(rs.getInt("Quantidade"));
                    obj.setValor(rs.getDouble("Valor"));
                    
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
    
    public static ArrayList<Produto> ListarValorMax(String nome, double valorMax) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto where "
                    + "Nome like '"+nome+"%' and valor <= "+valorMax);
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Produto obj = new Produto();
                    obj.setId(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setDescricao(rs.getString("Descricao"));
                    obj.setQuantidade(rs.getInt("Quantidade"));
                    obj.setValor(rs.getDouble("Valor"));
                    
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
    
    public static ArrayList<Produto> ListarValores(String nome, double valorMax, double valorMin) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto where "
                    + "Nome like '"+nome+"%' and valor between "+valorMin+" and "+ valorMax);
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Produto obj = new Produto();
                    obj.setId(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setDescricao(rs.getString("Descricao"));
                    obj.setQuantidade(rs.getInt("Quantidade"));
                    obj.setValor(rs.getDouble("Valor"));
                    
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
    
    public static ArrayList<Produto> ListaAlterar(int id) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto where "
                    + "Id like "+id);
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                while(rs.next()){
                    Produto obj = new Produto();
                    obj.setId(rs.getInt("Id"));
                    obj.setNome(rs.getString("Nome"));
                    obj.setDescricao(rs.getString("Descricao"));
                    obj.setQuantidade(rs.getInt("Quantidade"));
                    obj.setValor(rs.getDouble("Valor"));
                    
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
    
    public static boolean Atualizar(String nome, String descricao, double valor, int qnt , int id) {
        boolean retorno=false;
        Connection conexao=null;
        
        try {
            //passo 1 carregar o drive
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 2 abrir a conexão
            
            String url = "jdbc:mysql://localhost:3306/LojaInformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3 prepara o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("update produto set Nome = '"+nome+"', Descricao = '"+descricao+"', Valor = "+valor+", Quantidade = "+qnt+" where id like "+ id);

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
