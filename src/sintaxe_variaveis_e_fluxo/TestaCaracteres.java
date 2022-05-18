package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {

    public static void main(String[] args) {

        char letra = 'a';
        System.out.println("Isso é um char: " + letra);

        char valor = 66;
        System.out.println(valor); //Convertera na tabela ascii

        // valor = valor +1 ;//Um char cabe num intero mas um inteiro não cabe num char

        //convertendo
        valor = (char) (valor + 1);
        System.out.println(valor);


        String palavra = "Alura cursos online de tecnologia";
        System.out.println("Isso é uma string " + palavra);

        palavra = palavra + 2020;
        System.out.println(palavra); //vai concatenar o numero com a palavra


    }
}
