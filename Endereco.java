import java.util.Scanner;

public class Endereco {
    private String pais;
    private String estado;
    private String cidade;
    private String rua;
    public String ndc;    //NÚMERO DA CASA
    public String cep;

    private Scanner scString = new Scanner(System.in);

    public Endereco(){
        System.out.println("\n*** Registrar Endereço ***\n");
        System.out.println("País: ");
        pais = scString.nextLine();
        System.out.println("Estado: ");
        estado = scString.nextLine();
        System.out.println("Cidade: ");
        cidade = scString.nextLine();
        System.out.println("Rua: ");
        rua = scString.nextLine();
        System.out.println("Número da casa: ");
        ndc = scString.nextLine();
        System.out.println("CEP: ");
        cep = scString.nextLine();
    }

    public void exibirEndereco(){
        System.out.println("País: " + pais);
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
        System.out.println("Rua: " + rua);
        System.out.println("Número da casa: " + ndc);
        System.out.println("CEP: " + cep);
    }

}
