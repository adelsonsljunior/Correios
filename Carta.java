import java.util.Scanner;


public class Carta {
    private String titulo;
    private String texto;
    private String remetente;
    public Endereco enddestinatario; //endereço do destinatário
    
    private Scanner scString = new Scanner(System.in);
    
    public Carta(){
        System.out.println("\n*** Registrar Carta ***\n");
        System.out.println("Título: ");
        titulo = scString.nextLine();
        System.out.println("Texto: ");
        texto = scString.nextLine();
        System.out.println("Remetente: ");
        remetente = scString.nextLine();
        System.out.println("Endereço do destinatário: ");
        enddestinatario = new Endereco();
            
    }  

    

    public void exibirCarta(){
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Texto: " + texto);
        System.out.println("Remetente: " + remetente);
        System.out.println("Endereço do destinatário: ");
        enddestinatario.exibirEndereco();
    }
}
