package model;

public class Estoque {
    
    private String peca;
    private int quantidade;
    private float valor;
    private int porcentagem;
    private float valorFinalPeca;
    
    public Estoque(){}

    public Estoque(String peca, int quantidade, float valor, int porcentagem) {
        this.peca = peca;
        this.quantidade = quantidade;
        this.valor = valor;
        this.porcentagem = porcentagem;
    }
    
    public float valorVenda(){
        valorFinalPeca = (valor + ((valor * quantidade) * ((porcentagem * 10) / 100)));
        return valorFinalPeca;
    }
    
    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }
        
}
