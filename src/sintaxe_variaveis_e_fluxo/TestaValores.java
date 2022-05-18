package sintaxe_variaveis_e_fluxo;

public class TestaValores {

    public static void main(String[] args) {

        int primeiroNumero = 5;
        int segundoNumero = 7;
        segundoNumero = primeiroNumero;
        primeiroNumero = 10;

        //quanto vale o segundo ?
        System.out.println(segundoNumero); //5
    }
}
