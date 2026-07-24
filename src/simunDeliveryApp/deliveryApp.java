package simunDeliveryApp;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class deliveryApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Random random = new Random();

        //Tabela de nomes lanches cardápio
        String hamburguer = "Hambúrguer";
        String fritas = "Fritas";
        String aneisDeCebola = "Anéis de cebola";
        String hotDog = "HotDog";
        String nuggetsDeFrango = "Nuggets de frango";

        //Tabela de nomes bebidas cardápio
        String cocaCola = "Coca Cola";
        String chaGelado = "Chá gelado";
        String sucoDeLaranja = "Suco de laranja";
        String guarana = "Guaraná";
        String cervejaLata = "Cerveja lata";

        //Tabela de nomes doces cardápio
        String brigadeiro = "Brigadeiro";
        String beijinho = "Beijinho";
        String pacoca = "Paçoca";
        String peDeMoleque = "Pé de moleque";
        String balaDeGoma = "Bala de Goma";


        //Tabela de nomes milkshakes cardápio
        String milkChocolate = "Milkshake de Chocolate";
        String milkMorango = "Milkshake de morango";
        String milkBaunilha = "Milkshake de baunilha";
        String milkDoceDeLeite = "Milkshake de doce de leite";
        String milkCafe = "Milkshake de café";


        //Tabela de valores dos lanches
        double valorHamburguer = 10;
        double valorFritas = 6;
        double valorAneisDeCebola = 6;
        double valorHotDog = 9;
        double valorNuggetsDeFrango = 8;

        //Tabela de valores das bebidas
        double valorCocaCola = 5;
        double valorChaGelado = 4;
        double valorSucoDeLaranja = 4;
        double valorGuarana = 5;
        double valorcervejaLata = 3;

        //Tabela de valores dos doces
        double valorbrigadeiro = 2;
        double valorBeijinho = 2;
        double valorPacoca = 3;
        double valorPeDeMoleque = 4;
        double valorBalaDeGoma = 2;

        //Tabela de valores dos milkshakes
        double valorMilkChocolate = 8;
        double valorMilkMorango = 8;
        double valorMilkBaunilha = 8;
        double valorMilkDoceDeLeite = 8;
        double valorMilkCafe = 8;

        //início do programa
        System.out.println("Olá! Bem-Vindo ao Rango Express! \n Nosso cardápio é: \n");

        //Cardápio

        System.out.println("LANCHES \n");
        System.out.println(hamburguer + ": " + " " + "R$" + valorHamburguer);
        System.out.println(fritas + ": " + " " + "R$" + valorFritas);
        System.out.println(aneisDeCebola + ": " + " " + "R$" + valorAneisDeCebola);
        System.out.println(hotDog + ": " + " " + "R$" + valorHotDog);
        System.out.println(nuggetsDeFrango + ": " + " " + "R$" + valorNuggetsDeFrango);

        System.out.println("\n BEBIDAS \n");
        System.out.println(cocaCola + ": " + " " + "R$" + valorCocaCola);
        System.out.println(chaGelado + ": " + " " + "R$" + valorChaGelado);
        System.out.println(sucoDeLaranja + ": " + " " + "R$" + valorSucoDeLaranja);
        System.out.println(guarana + ": " + " " + "R$" + valorGuarana);
        System.out.println(cervejaLata + ": " + " " + "R$" + valorcervejaLata);

        System.out.println("\n DOCES \n");
        System.out.println(brigadeiro + ": " + " " + "R$" + valorbrigadeiro);
        System.out.println(beijinho + ": " + " " + "R$" + valorBeijinho);
        System.out.println(pacoca + ": " + " " + "R$" + valorPacoca);
        System.out.println(peDeMoleque + ": " + " " + "R$" + valorPeDeMoleque);
        System.out.println(balaDeGoma + ": " + " " + "R$" + valorBalaDeGoma);

        System.out.println("\n MILKSHAKES \n");
        System.out.println(milkChocolate + ": " + " " + "R$" + valorMilkChocolate);
        System.out.println(milkMorango + ": " + " " + "R$" + valorMilkMorango);
        System.out.println(milkBaunilha + ": " + " " + "R$" + valorMilkBaunilha);
        System.out.println(milkDoceDeLeite + ": " + " " + "R$" + valorMilkDoceDeLeite);
        System.out.println(milkCafe + ": " + " " + "R$" + valorMilkCafe);

        //Scanner Pedidos
        String resposta;
        double total = 0;

        System.out.println("Antes de prosseguirmos precisamos de algumas informações suas");

        System.out.println("Digite seu nome (primeiro nome): "); // recebe o nome
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:"); // recebe o sobrenome
        String sobrenome = scanner.next();
        scanner.nextLine();

        System.out.println("Digite sua idade:"); // recebe a idade
        int idade = scanner.nextInt();

        System.out.println("Digite seu CPF:"); // recebe a idade
        long cpf = scanner.nextLong();

        System.out.println("Digite seu endereço (somente nome da rua):"); // recebe a idade
        String endereco = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o número da casa:"); // recebe a idade
        int numeroDaCasa = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual sera sua primeira adição ao carrinho " + nome + "? " + "\n*Por favor digite os nomes exatamente como estão escritos no cardápio.\n");

        do {

            System.out.println("Qual será sua adição ao carrinho?");
            String pedido = scanner.nextLine();

            //Lanches
            if (pedido.equalsIgnoreCase(hamburguer)) {
                total += valorHamburguer;
                System.out.println("Hambúrguer adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(fritas)) {
                total += valorFritas;
                System.out.println("Fritas adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(aneisDeCebola)) {
                total += valorAneisDeCebola;
                System.out.println("Anéis de cebola adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(hotDog)) {
                total += valorHotDog;
                System.out.println("HotDog adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(nuggetsDeFrango)) {
                total += valorNuggetsDeFrango;
                System.out.println("Nuggets de frango adicionado ao carrinho!");
            }

            //Bebidas
            else if (pedido.equalsIgnoreCase(cocaCola)) {
                total += valorCocaCola;
                System.out.println("CocaCola adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(chaGelado)) {
                total += valorChaGelado;
                System.out.println("Chá gelado adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(sucoDeLaranja)) {
                total += valorSucoDeLaranja;
                System.out.println("Suco de laranja adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(guarana)) {
                total += valorGuarana;
                System.out.println("Guaraná adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(cervejaLata)) {
                total += valorcervejaLata;
                System.out.println("Cerveja de lata adicionado ao carrinho!");
            }

            //Doces
            else if (pedido.equalsIgnoreCase(brigadeiro)) {
                total += valorbrigadeiro;
                System.out.println("Brigadeiro adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(beijinho)) {
                total += valorBeijinho;
                System.out.println("Beijinho adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(pacoca)) {
                total += valorPacoca;
                System.out.println("Paçoca adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(peDeMoleque)) {
                total += valorPeDeMoleque;
                System.out.println("Pé de moleque adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(balaDeGoma)) {
                total += valorBalaDeGoma;
                System.out.println("Bala de goma adicionado ao carrinho!");
            }

            //Milkshakes
            else if (pedido.equalsIgnoreCase(milkChocolate)) {
                total += valorMilkChocolate;
                System.out.println("Milkshake de chocolate adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(milkMorango)) {
                total += valorMilkMorango;
                System.out.println("Milkshake de morango adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(milkBaunilha)) {
                total += valorMilkBaunilha;
                System.out.println("Milkshake de baunilha adicionado ao carrinho!");
            } else if (pedido.equalsIgnoreCase(milkCafe)) {
                total += valorMilkCafe;
                System.out.println("Milkshake de café adicionado ao carrinho!");
            } else {
                System.out.println("Ops! Produto não encontrado.\nPor favor, digite um produto do cardápio.");
            }

            System.out.println("Deseja adicionar outro produto ao carrinho? (sim/nao): ");
            resposta = scanner.nextLine();

            System.out.println("Total da compra sem o frete é: R$" + total);

        }
        while (resposta.equalsIgnoreCase("sim"));
        System.out.println("pedido finalizado!");


        //sorteio de qual será o frete
        int frete = random.nextInt(7);
        if (frete == 0) {
            frete = 1;
        }
        if (frete == 1) {
            frete = 12;
        }
        if (frete == 2) {
            frete = 10;
        }
        if (frete == 3) {
            frete = 2;
        }
        if (frete == 4) {
            frete = 6;
        }
        if (frete == 5) {
            frete = 7;
        }
        if (frete == 6) {
            frete = 0;
            System.out.println("Parabéns você recebeu frete grátis \n");
        }

        int tempoDeEntrega = random.nextInt(7);
        if (tempoDeEntrega == 0) {
            tempoDeEntrega = 40;
        }
        if (tempoDeEntrega == 1) {
            tempoDeEntrega = 10;
        }
        if (tempoDeEntrega == 2) {
            tempoDeEntrega = 5;
        }
        if (tempoDeEntrega == 3) {
            tempoDeEntrega = 20;
        }
        if (tempoDeEntrega == 4) {
            tempoDeEntrega = 30;
        }
        if (tempoDeEntrega == 5) {
            tempoDeEntrega = 23;
        }
        if (tempoDeEntrega == 6) {
            tempoDeEntrega = 34;
        }

            System.out.println("Parabéns você recebeu frete grátis \n");

        //notificando o usuário do frete
        System.out.println("\nAguarde um momento, enquanto estamos calculando o frete para o seu endereço!");
        System.out.println("...\n");

        System.out.println("O frete para a sua região será: " + frete + "\n");


        System.out.println("\nAguarde um momento, enquanto estamos buscando seu entregador!");
        System.out.println("...\n");

        // sorteio de quem será o motoboy

        String[] motoboys = {
                null,
                "Lucas",
                "Rafael",
                "Robison",
                "Joaquim",

        };

        int motoboy;

        do {
            motoboy = random.nextInt(6);

            if (motoboy == 0) {
                System.out.println("Ops! nenhum motoboy disponível no momento!\n" +
                        "Tente novamente mais tarde.");
                System.out.println("Deseja buscar novamente? (sim/nao)");
                resposta = scanner.nextLine();

            } else {
                System.out.println("Seu entregador é: " + motoboys[motoboy]);
                System.out.println("O valor total do seu pedido com o frete é: R$" + (total + frete));
                System.out.println("Obrigado por comprar conosco!\nVolte sempre!");
                System.out.println("O tempo de entrega estimado é de: " + tempoDeEntrega + "min");
                break;
            }
        }

        while (resposta.equalsIgnoreCase("sim"));
    }


}




