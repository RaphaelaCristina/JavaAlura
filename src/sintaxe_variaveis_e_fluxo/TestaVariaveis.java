package sintaxe_variaveis_e_fluxo;

public class TestaVariaveis {

    public static void main(String[] args) {

        System.out.println("Olá novo teste");

        int idade = 24;
        String nome = "Raphaela";
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos");

        idade = 30 + 10;
        System.out.println(idade); //será impresso 40

        idade = 7 * 5 + 2;
        System.out.println(idade); //será impresso 37

    }
}
