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
public class Cliente {
    private int id;
    private String nome;
    private String email;
    private String sexo;
    private String estado;
    private String cidade;
    private String estadoCivil;
    private String nomeBusca;
    private String cpfBusca;
    private Date dataNascimento;
    private String telefone;
    private String cpf;

    public Cliente() {
    }

    public Cliente(String nome, String email, String sexo, String estado, String cidade, String estadoCivil, Date dataNascimento, String telefone, String cpf) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.estado = estado;
        this.cidade = cidade;
        this.estadoCivil = estadoCivil;
        this.nomeBusca = nomeBusca;
        this.cpfBusca = cpfBusca;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.cpf = cpf;
    }
    
    public Cliente(String nomeBusca, String cpfBusca) {
        this.nomeBusca = nomeBusca;
        this.cpfBusca = cpfBusca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNomeBusca() {
        return nomeBusca;
    }

    public void setNomeBusca(String nomeBusca) {
        this.nomeBusca = nomeBusca;
    }

    public String getCpfBusca() {
        return cpfBusca;
    }

    public void setCpfBusca(String cpfBusca) {
        this.cpfBusca = cpfBusca;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    
}