package model;

public class OrdemServico {
    
    private String dataEntrada;
    private String dataSaida;
    private String fomaPagamento;
    private int valorServico;

    public OrdemServico() {}

    public OrdemServico(String dataEntrada, String dataSaida, Cliente cliente, Funcionario funcionario, Veiculo veiculo, String fomaPagamento, Estoque pecasUsadas) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.fomaPagamento = fomaPagamento;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getFomaPagamento() {
        return fomaPagamento;
    }

    public void setFomaPagamento(String fomaPagamento) {
        this.fomaPagamento = fomaPagamento;
    }

    public int getValorServico() {
        return valorServico;
    }

    public void setValorServico(int valorServico) {
        this.valorServico = valorServico;
    }
}
