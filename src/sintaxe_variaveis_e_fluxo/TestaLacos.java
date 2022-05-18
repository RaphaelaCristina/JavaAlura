package sintaxe_variaveis_e_fluxo;

public class TestaLacos {

    public static void main(String[] args) {

        for (int multiplicador = 1; multiplicador <= 10 ; multiplicador++){
            System.out.println("Começando a tabuada do " + multiplicador);
            for(int contador = 0; contador <=10 ; contador++){
                System.out.print(multiplicador * contador); //para espaçar os números
                System.out.print(" ");
            }
            System.out.println(); //para pular linha entre as tabuadas

        }
    }
}
