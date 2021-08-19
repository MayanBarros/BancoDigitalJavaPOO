public class Main {
    public static void main(String[] args) {

        Cliente mayan = new Cliente();
        mayan.setNome("Mayan Barros da Silva");

        Conta contaCorrente = new ContaCorrente(mayan);
        contaCorrente.depositar(1000);
        Conta contaPoupanca = new ContaPoupanca(mayan);
        contaPoupanca.depositar(500);

        contaCorrente.transferir(500, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
