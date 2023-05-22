/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Modal.Produto;
import Modal.Venda;
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
public class VendaDAO {
    public static Produto Listar(String id) {
            Produto Retorno = new Produto();
        Connection conexao = null;
        
        try {
            //passo 1- carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //passo 1- abrir conexão
            String url = "jdbc:mysql://localhost:3306/lojainformatica";
            conexao= DriverManager.getConnection(url, "root", "Palmeiras933");
            
            //passo 3- preparar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto where id like "+id);
            
            //passo 4- Executar comando SQL
            ResultSet rs = comandoSQL.executeQuery();
            if(rs!=null){
                //percorro o resultset e passo os valores a um objeto
                Retorno.setNome(rs.getString("Nome"));
                Retorno.setValor(rs.getInt("Valor"));
                Retorno.setDescricao(rs.getString("Descricao"));
                Retorno.setQuantidade(rs.getInt("Quantidade"));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao carregar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir conexão");
        }
        
        return Retorno;
    }
}
