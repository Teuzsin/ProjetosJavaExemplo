package hierarquiaDeExceptionsExemplos;

//Exemplo de Exception customizada (cepInvalidoException)

public class formatarCep {
    public static void main(String[] args) {
        try { // testa o bloco a procura de exceptions
            String cepFormatado = cepFormatado("7623409"); //define o valor do cep para a simulação, propositalmente errado.
            System.out.println(cepFormatado); // imprime o cep já formatado
        }
        catch (cepInvalidoException e) { // executa caso haja uma exception definida
            System.out.println("O cep não corresponde as regras de negócio"); // indica a exception
        }
    }


    static String cepFormatado(String cep) throws cepInvalidoException{ //lança a exception através da palavra throws
        if(cep.length() != 8)
            throw new cepInvalidoException(); // cria uma exception caso uma condição não respeitar uma regra imposta.

        return "76.234-098"; // modelo que será feita a formatação do cep
    }

}
