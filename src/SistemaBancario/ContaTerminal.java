package SistemaBancario;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{

    public static void main(String [] Args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira o código da Agência! ");
        String IdAgency = scanner.nextLine();

        System.out.println("Insira o número da Conta: ");
        int NCount = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Insira o nome do cliente: ");
        String ClientName = scanner.nextLine();

        System.out.println("Insira o seu saldo: ");
        double Balance = scanner.nextDouble();

        System.out.println("Olá" + " " + ClientName + "!" + " " +
                "Obrigo por criar uma conta em nosso banco." + " " +
                "Sua Agência é: "  + IdAgency + " " + ", conta:" + " " +
                NCount + " " + "e seu saldo:" + " " + Balance + " " + "Já está disponível! " );

    }

}