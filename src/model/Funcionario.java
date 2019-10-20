package model;

public class Funcionario extends Pessoa{

    private String cargo;
    
    public Funcionario(){}
    
    //Sobrecarga
    public Funcionario(String nome, String cpf, String telefone, String endereco, String cargo) {
        super.Pessoa(nome, cpf, telefone, endereco);
        this.cargo = cargo;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    //Sobrescrita
    @Override
    public void aniversario(){
        System.out.println("Parabéns, você recebeu um dia de Folga!");
    }
}
