public class TesteSacaNegativo {
    public static void main(String[] args){
        ContaBancaria testeConta = new ContaBancaria();

        testeConta.deposita(100);
        System.out.println(testeConta.saca(100));

        System.out.println(testeConta.getSaldo());
    }
}
