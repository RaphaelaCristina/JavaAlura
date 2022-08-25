package orientacao_a_objetos.bytebankComposto;

public class TestaContaSemCliente {

    public static void main(String[] args) {

        ContaComposta contaDaMarcela = new ContaComposta();

        /* Dará excessão, pois não foi inicializado/criado um titular
        System.out.println(contaDaMarcela.titular);
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome); */

        contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular);
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);

    }
}
