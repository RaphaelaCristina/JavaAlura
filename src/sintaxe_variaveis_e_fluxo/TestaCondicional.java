package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {

    public static void main(String[] args) {

        System.out.println("Testando condicionais");
        int idade = 18;
        int quantidadePessoas = 1;
        if (idade >= 18){
            System.out.println("Você tem mais de 18 anos");
            System.out.println("Seja bem vindo(a)");
        } else if (quantidadePessoas >= 2){
            System.out.println("Você não tem 18 anos mas pode entrar pois está acompanhado");
            System.out.println("Seja bem vindo(a)");
        } else {
            System.out.println("Infelizmente você não pode entrar pois além de não ter 18 anos," +
                    " não está acompanhado");
        }

    }
}
