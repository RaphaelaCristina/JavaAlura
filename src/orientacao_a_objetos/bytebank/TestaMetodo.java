package orientacao_a_objetos.bytebank;

public class TestaMetodo {

    public static void main(String[] args) {

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println("Saldo da conta do Paulo R$" + contaDoPaulo.saldo);

        System.out.println(" ");

        boolean conseguiuRetirar = contaDoPaulo.saca(100);
        System.out.println("O saldo da conta do Paulo após o saque é: R$" + contaDoPaulo.saldo );
        System.out.println(conseguiuRetirar);

        System.out.println(" ");

        boolean conseguiuRetirarNovo = contaDoPaulo.saca(100);
        System.out.println("O saldo da conta do Paulo após o saque é: R$" + contaDoPaulo.saldo );
        System.out.println(conseguiuRetirarNovo);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        System.out.println("O saldo da conta da Marcela é: R$" + contaDaMarcela.saldo);

        boolean transferencia = contaDaMarcela.transfere(5000, contaDoPaulo);
        if(transferencia){
            System.out.println("Transferência realizada com sucesso");
            System.out.println("O saldo da conta da Marcela após a transferência é: R$" + contaDaMarcela.saldo);
            System.out.println("O saldo da conta do Paulo após receber a transferência da Marcela é: R$" + contaDoPaulo.saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar a trasnferência");
        }


        contaDoPaulo.titular = "Paulo Silveira";
        System.out.println(contaDoPaulo.titular);

    }
}
