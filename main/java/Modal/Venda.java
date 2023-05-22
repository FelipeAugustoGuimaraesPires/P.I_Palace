/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modal;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Venda {
    private int id;
    private String produto;
    private int qnt;
    private int cpfCli;
    private Date data;

    public Venda() {
    }

    public Venda(int id, String produto, int qnt, int cpfCli, Date data) {
        this.id = id;
        this.produto = produto;
        this.qnt = qnt;
        this.cpfCli = cpfCli;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public int getCpfCli() {
        return cpfCli;
    }

    public void setCpfCli(int cpfCli) {
        this.cpfCli = cpfCli;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
