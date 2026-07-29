package hierarquiaDeExceptionsExemplos;

// Exemplo de RuntimeException

import java.text.NumberFormat; // importa a biblioteca de conversão de números
import java.text.ParseException; // exception parse, identificada pelo terminal import java.text.NumberFormat;


public class runtimeExceptionExemple {

    public static void main(String[] args) {

        Number valor = null; // define o valor da variaável valor e indica que é um número
            try { // testa o bloco e verifica se há exceções
                valor = NumberFormat.getInstance().parse("a1.75"); // tenta fazer a conversão com um erro proposital para testar a exceção.
                    System.out.println(valor); // imprime o valor da conversão

            }
            catch (ParseException e) { // executa o comando para caso haja uma exceção
                throw new RuntimeException("Existe alguma coisa que não é um número no valor inserido, causando o erro de conversão"); // sinaliza a exceção
            }

        }
    }

