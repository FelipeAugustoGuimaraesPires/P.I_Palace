/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Modal.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class LoginDAO {
    public static boolean salvar(Login obj, int id) {
        boolean retorno=false;
        Connection conexao=null;
        
        try {
            //passo 1 carregar o drive
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 2 abrir a conexão
            
            String url = "jdbc:mysql://localhost:3306/LojaInformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3 prepara o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("insert into login (Login, Senha, Fk_Funcionario) values (?, ?, "+id+")");
            
            comandoSQL.setString(1, obj.getLogin());
            comandoSQL.setString(2, obj.getSenha());

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
