package aboutMeStudy;// TeuSziz☄ 20/07/2026
// Estudo deo controle de fluxo (Try e Catch)


import java.util.InputMismatchException; // exceção relatada pela IDE
import java.util.Locale; // importa a biblioteca
import java.util.Scanner; // importa a biblioteca do scanner

public class aboutMe{

    public static void main(String[] Args){
        try { // Inicia o bloco de Try Catch

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //define as funções de conversão do scanner

            System.out.println("Digite seu nome (primeiro nome):"); // recebe o nome
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:"); // recebe o sobrenome
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade:"); // recebe a idade
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura:"); // recebe a altura
            double altura = scanner.nextDouble();

            // imprime as informções recebidas pelo scanner

            System.out.println("Olá me chamo" + " " + nome + " " + sobrenome);
            System.out.println(" ");
            System.out.println("Minha idade é" + " " + idade);
            System.out.println(" ");
            System.out.println("Minha altura é" + " " + altura + "Cm");
            System.out.println(" ");
            System.out.println("Essas são minhas informações");
        }
            catch (InputMismatchException e){ // executa o comando para a exceção
                System.out.println("Os campos idade e altura, devem ser preenchidos de forma numérica");
                System.out.println("Por favor, insira novamente os valores corretamente");
            }
    }
}