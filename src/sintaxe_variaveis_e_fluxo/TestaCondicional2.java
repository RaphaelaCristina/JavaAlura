package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {

    public static void main(String[] args) {

        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        if(idade >= 18 && acompanhado ){
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar pois além de não tem 18 anos," +
                    "você não está acompanhado.");
        }
    }

}
