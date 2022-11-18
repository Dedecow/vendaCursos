import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double java = 149.0;
        double html5 = 99.0;
        double python = 299.0;
        System.out.println("Olá, Digite seu nome para visualizar a lista de cursos: ");
        String nome = teclado.nextLine();
        System.out.println("Bem vinde " + nome +  " escolha uma opção: 1 - Java Completo 2- HTML5, CSS e PHP 3 - Python ");

        int escolha = teclado.nextInt();
        switch (escolha){
            case 1: System.out.println(" Curso completo de Java para iniciantes, preço promocional R$ " + java); break;
            case 2: System.out.println(" Curso de Html5, CSS e PHP, por R$ " + html5);break;
            case 3: System.out.println(" Curso completo de Python por R$ " + python);break;
            default: System.out.println(" Você realmente digitou 1, 2 ou 3 ?");break;
        }
        if (escolha == 1 ) {
            System.out.println("Quantos acessos você vai comprar? ");
            int acessos = teclado.nextInt();
            System.out.printf("Investimento total R$ %.2f%n", acessos*java);
        }
       else {
           if (escolha == 2) {
            System.out.println("Quantos acessos você vai comprar? ");
            int acessos = teclado.nextInt();
            System.out.printf("Investimento total R$ %.2f%n", acessos * html5);
            }
            else {
               System.out.println("Quantos acessos você vai comprar? ");
               int acessos = teclado.nextInt();
               System.out.printf("Investimento total R$ %.2f%n", acessos * python);

           }
            System.out.println("Agradecemos sua escolha por nossos serviços. ");
        }
            teclado.close();
    }
}