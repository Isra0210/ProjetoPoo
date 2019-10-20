package model;

public class Cliente extends Pessoa {
        
    public Cliente(){}
    
    public Cliente(String cargo, String nome, String cpf, String telefone, String endereco) {
        super.Pessoa(nome, cpf, telefone, endereco);
    }
    
}
