/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modal;

/**
 *
 * @author Dell
 */
public class Produto {
    private int Id;
    private String nome;
    private String descricao;
    private double valor;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, String descricao, double valor, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
