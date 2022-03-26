import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    public Endereco endereco;
    private Carta[] cartas = new Carta[10];
    
    private Scanner sc = new Scanner(System.in);
    private Scanner scString = new Scanner(System.in);

    public Pessoa(){
        System.out.println("\n*** Registrar Pessoa ***\n");
        System.out.println("Nome: ");
        nome = scString.nextLine();
        System.out.println("Idade: ");
        idade = sc.nextInt();
        endereco = new Endereco();
    }



    public void exibirPessoa(){
        System.out.println("\n*** Informações da Pessoa ***\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("\nEndereço: \n");
        endereco.exibirEndereco();
        System.out.println("\nCartas Recebidas: ");
        exibirCartas();
    }



    public boolean adicionarCarta(Carta novaCarta){
        boolean resultadoDoEnvio = false;
        for(int i = 0; i < cartas.length; i++){
            if (cartas[i] == null){
                cartas[i] = novaCarta;
                resultadoDoEnvio = true;
                break;
            }
        }
        return resultadoDoEnvio;
    }



    private void exibirCartas(){
        for(int i = 0; i < cartas.length; i++){
            if (cartas[i] != null){
                cartas[i].exibirCarta();
            }
        }
    }


    
}
