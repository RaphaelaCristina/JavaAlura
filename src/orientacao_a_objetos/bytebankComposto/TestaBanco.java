package orientacao_a_objetos.bytebankComposto;

public class TestaBanco {

    public static void main(String[] args) {

        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "145.114.878-06";
        paulo.profissao = "programador";

        ContaComposta contaDoPaulo = new ContaComposta();
        contaDoPaulo.deposita(100);

        //Associa o cliente paulo a conta contaDoPaulo
        contaDoPaulo.titular = paulo;
        System.out.println("O nome do titular da conta do Paulo é: " + contaDoPaulo.titular.nome);
    }
}
