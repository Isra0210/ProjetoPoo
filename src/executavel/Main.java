 package executavel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import model.Cliente;
import model.Estoque;
import model.Fornecedor;
import model.Funcionario;
import model.OrdemServico;
import model.Veiculo;
import java.io.IOException;
import java.util.Scanner;
import model.Pessoa;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        
        Scanner leitor = new Scanner(System.in);
        //do sistema
        Estoque estoque = new Estoque();
        Fornecedor fornecedor = new Fornecedor("Axios", "11999273125", "01.023.895/0001-01", "axios@outlook.com", "Rua America centro Itapetininga");
        Funcionario funcionario = new Funcionario("José Carlos", "145.864.453-88", "45988280969", "Rua Jõao de Abreu São José dos Pinhais Centro", "Mecânico");
        //colocados pelo usuário
        Cliente cliente = new Cliente();
        Pessoa pessoa = cliente;//Polimorfismo de Objeto
        OrdemServico os = new OrdemServico();
        Veiculo veiculo = new Veiculo();
        
        //Informaçõe do veiculo
        System.out.print("Informe a placa do veículo:");
        String numPlaca = leitor.nextLine();
        System.out.print("Informe a cor do veículo: ");
        String cor = leitor.nextLine();
        System.out.print("Informe o modelo do veículo: ");
        String modelo = leitor.nextLine();
        System.out.print("Informe sobre a peça utilizada: ");
        String peca = leitor.nextLine();
        System.out.print("Informe o valor da peca: ");
        float valorPeca = leitor.nextFloat();
        System.out.print("Informe a porcentagem em cima da peça: ");
        int porcentagem = leitor.nextInt();
        System.out.print("Informe a quantidade de peca utilizada: ");
        int quantidadePeca = leitor.nextInt();
        //Informações do cliente 
        leitor.nextLine();
        System.out.print("Descrição do serviço efetuado: ");
        String descricao = leitor.nextLine();
        System.out.print("Informe o nome do cliente: ");
        String nome = leitor.nextLine();
        System.out.print("Informe o cpf do cliente: ");
        String cpf = leitor.nextLine();
        System.out.print("Informe o telefone do cliente: ");
        String telefone = leitor.nextLine();
        System.out.print("Informe o endereco do cliente: ");
        String endereco = leitor.nextLine();
        System.out.print("Informe a data de entrada do veiculo: ");
        String dataEntrada = leitor.nextLine();
        System.out.print("Informe a previsão da data de saída do veiculo: ");
        String dataSaida = leitor.nextLine();
        System.out.print("Informe a forma de pagamento: ");
        String formaPagamento = leitor.nextLine();
        System.out.print("Valor da mao de Obra: ");
        int valorServico = leitor.nextInt();
        
        //setando ao veiculo
        veiculo.setPlaca(numPlaca); 
        veiculo.setCor(cor);
        veiculo.setModelo(modelo);
        //estoque
        estoque.setPeca(peca);
        estoque.setValor(valorPeca);
        estoque.setPorcentagem(porcentagem);
        estoque.setQuantidade(quantidadePeca);
        //setando ao cliente
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
        cliente.setEndereco(endereco);
        //Ordem de Servico
        os.setDataEntrada(dataEntrada);
        os.setDataSaida(dataSaida);
        os.setFomaPagamento(formaPagamento);
        os.setValorServico(valorServico);
        
        //Limpando o console
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(10);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
        } 
        catch (AWTException ex) {}

        //Exibindo a OS
        System.out.println("====================================================================");
        System.out.println("Data de entrada: " +os.getDataEntrada());
        System.out.println("Data de saída: " +os.getDataSaida());
        System.out.println("Nome: " +cliente.getNome());
        System.out.println("Cpf: " +cliente.getCpf());
        System.out.println("Endereco: " +cliente.getEndereco());
        System.out.println("Funcionario responsavel: " +funcionario.getNome() + " - " + funcionario.getCargo());
        System.out.println("Placa: " +veiculo.getPlaca());
        System.out.println("Veículo: " +veiculo.getModelo());
        System.out.println("Cor: " +veiculo.getCor());
        System.out.println("Peça: " +estoque.getPeca());
        System.out.println("Descrição: " +descricao);
        System.out.println("Pagamento: " +os.getFomaPagamento());  
        float valorFinal = os.getValorServico() + estoque.valorVenda();
        System.out.println("Valor total: " +valorFinal);
        System.out.println("=========================SALVO COM SUCESSO==========================");
    }
}