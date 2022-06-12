import java.util.Scanner;

public class LendoTeclado {
    Scanner scan = new Scanner(System.in);

    void infosCliente () {
        System.out.println("Qual o seu nome: ");
        String name = scan.next();

        System.out.println("Digite sua idade: ");
        int age = scan.nextInt();

        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
    }

}
