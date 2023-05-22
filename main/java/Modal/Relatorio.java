/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modal;

/**
 *
 * @author Dell
 */
public class Relatorio {
    private String vendedorBusca;
    
    private String vendedorTblSin;
    
    private String nomeProdTblAna;
    
    private int dataDeBusca;
    private int dataAteBusca;
    private int cpfBusca;
    
    private int dataTblSin;
    private int cpfTblSin;
    private int valorTotTblSin;
    
     private int valorTotTblAna;
    private int valorUnitTblAna;
    private int idTblAna;
    private int qntTblAna;

    public Relatorio() {
    }

    public Relatorio(String vendedorBusca, String vendedorTblSin, String nomeProdTblAna, int dataDeBusca, int dataAteBusca, int cpfBusca, int dataTblSin, int cpfTblSin, int valorTotTblSin, int valorTotTblAna, int valorUnitTblAna, int idTblAna, int qntTblAna) {
        this.vendedorBusca = vendedorBusca;
        this.vendedorTblSin = vendedorTblSin;
        this.nomeProdTblAna = nomeProdTblAna;
        this.dataDeBusca = dataDeBusca;
        this.dataAteBusca = dataAteBusca;
        this.cpfBusca = cpfBusca;
        this.dataTblSin = dataTblSin;
        this.cpfTblSin = cpfTblSin;
        this.valorTotTblSin = valorTotTblSin;
        this.valorTotTblAna = valorTotTblAna;
        this.valorUnitTblAna = valorUnitTblAna;
        this.idTblAna = idTblAna;
        this.qntTblAna = qntTblAna;
    }

    public String getVendedorBusca() {
        return vendedorBusca;
    }

    public void setVendedorBusca(String vendedorBusca) {
        this.vendedorBusca = vendedorBusca;
    }

    public String getVendedorTblSin() {
        return vendedorTblSin;
    }

    public void setVendedorTblSin(String vendedorTblSin) {
        this.vendedorTblSin = vendedorTblSin;
    }

    public String getNomeProdTblAna() {
        return nomeProdTblAna;
    }

    public void setNomeProdTblAna(String nomeProdTblAna) {
        this.nomeProdTblAna = nomeProdTblAna;
    }

    public int getDataDeBusca() {
        return dataDeBusca;
    }

    public void setDataDeBusca(int dataDeBusca) {
        this.dataDeBusca = dataDeBusca;
    }

    public int getDataAteBusca() {
        return dataAteBusca;
    }

    public void setDataAteBusca(int dataAteBusca) {
        this.dataAteBusca = dataAteBusca;
    }

    public int getCpfBusca() {
        return cpfBusca;
    }

    public void setCpfBusca(int cpfBusca) {
        this.cpfBusca = cpfBusca;
    }

    public int getDataTblSin() {
        return dataTblSin;
    }

    public void setDataTblSin(int dataTblSin) {
        this.dataTblSin = dataTblSin;
    }

    public int getCpfTblSin() {
        return cpfTblSin;
    }

    public void setCpfTblSin(int cpfTblSin) {
        this.cpfTblSin = cpfTblSin;
    }

    public int getValorTotTblSin() {
        return valorTotTblSin;
    }

    public void setValorTotTblSin(int valorTotTblSin) {
        this.valorTotTblSin = valorTotTblSin;
    }

    public int getValorTotTblAna() {
        return valorTotTblAna;
    }

    public void setValorTotTblAna(int valorTotTblAna) {
        this.valorTotTblAna = valorTotTblAna;
    }

    public int getValorUnitTblAna() {
        return valorUnitTblAna;
    }

    public void setValorUnitTblAna(int valorUnitTblAna) {
        this.valorUnitTblAna = valorUnitTblAna;
    }

    public int getIdTblAna() {
        return idTblAna;
    }

    public void setIdTblAna(int idTblAna) {
        this.idTblAna = idTblAna;
    }

    public int getQntTblAna() {
        return qntTblAna;
    }

    public void setQntTblAna(int qntTblAna) {
        this.qntTblAna = qntTblAna;
    }
    
    
    
}
