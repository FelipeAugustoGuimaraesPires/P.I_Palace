
package Modal;

import java.util.Date;

public class Funcionario {
    
    private int ID;
    private String nome;
    private String sexo;
    private String estado;
    private Date dataNascimento;
    private String telefone;
    private String cpf;

    public Funcionario() {
    }

    public Funcionario(String nome, String sexo, String estado, Date dataNascimento, String telefone, String cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.estado = estado;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
