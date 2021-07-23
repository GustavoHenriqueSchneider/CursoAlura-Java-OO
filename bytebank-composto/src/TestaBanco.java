public class TestaMetodo2 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.saldo = 100;
        conta1.deposita(50);
        System.out.println(conta1.saldo);

        boolean sucessoSaque = conta1.saca(15);
        if (sucessoSaque)
            System.out.println("Saque realizado com sucesso, saldo atual: " + conta1.saldo);
        else
            System.out.println("Não foi possivel sacar devido saldo abaixo do valor, saldo atual: " + conta1.saldo);

        Conta conta2 = new Conta();
        conta2.deposita(500);

        boolean sucessoTransferencia = conta2.transfere(200, conta1);
        if (sucessoTransferencia)
            System.out.println("Transferencia realizada com sucesso, saldo atual: " + conta2.saldo);
        else
            System.out.println("Não foi possivel transferir devido saldo abaixo do valor, saldo atual: " + conta2.saldo);
    }
}
