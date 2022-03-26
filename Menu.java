import java.util.Scanner;

public class Menu {
    private Pessoa[] pessoas = new Pessoa[30];

    private Scanner sc = new Scanner(System.in);

    int decisao = 0;

    public Menu(){
        do{
            System.out.println("\n---------------------");
            System.out.println("       CORREIOS ");
            System.out.println("---------------------");
            System.out.println("1 - Adicionar Pesssoa");
            System.out.println("2 - Exibir pessoas");
            System.out.println("3 - Enviar carta");
            System.out.println("4 - Sair");
            System.out.println("---------------------");
            decisao = sc.nextInt();
            System.out.println("---------------------");

            switch(decisao){
                case 1:
                    adicionarPessoa();
                    break;
                case 2:
                    verPessoas();
                    break;
                case 3:
                    enviarCarta();
                    break;
                case 4:
                    System.out.println("\nSaindo...");
                    break;
                default:
                     System.out.println("\nOPÇÃO INVÁLIDA");  
            }

        } while (decisao != 4);
    }


    
    private void adicionarPessoa(){
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i] == null){
                Pessoa pessoaAux = new Pessoa();
                pessoas[i] = pessoaAux;
                break;
            }
        }
    }



    private void verPessoas(){
        System.out.println("\nPessoas Registradas: ");
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i] != null){
                pessoas[i].exibirPessoa();
            }
        }
    }



    private void enviarCarta(){
        Carta carta = new Carta();
        Pessoa destinatario = pesquisarDestinatario(carta.enddestinatario.cep, carta.enddestinatario.ndc);
        boolean envioBemSucedido = destinatario.adicionarCarta(carta);
        if (envioBemSucedido == true){
            System.out.println("\nCarta enviada com sucesso!");
        } else{
            System.out.println("\nHouve um erro no envio da carta!");
        }
    }



    private Pessoa pesquisarDestinatario(String cep, String ndc){
       Pessoa destinatarioEncontrado = null;
       for(int i = 0; i < pessoas.length; i++){
           if (pessoas[i] != null){
              if((pessoas[i].endereco.cep.equalsIgnoreCase(cep)) && (pessoas[i].endereco.ndc.equalsIgnoreCase(ndc))){
                destinatarioEncontrado = pessoas[i];
               }
           }
       } 
       return destinatarioEncontrado;
    }



}
