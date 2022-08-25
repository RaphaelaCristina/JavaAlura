
package orientacao_a_objetos.bytebankComposto;

public class ContaComposta {

    //atributos

    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            //System.out.println("Sacando R$" + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente, saque não realizado");
            return false;
        }
    }

    public boolean transfere(double valor, orientacao_a_objetos.bytebank.Conta contaDestino) {
        if (this.saldo >= valor) {
            saca(valor);
            System.out.println("Transferindo R$" + valor);
            contaDestino.deposita(valor);
            return true;
        } else {
            System.out.println("Transferência não realizada");
            return false;
        }
    }
}