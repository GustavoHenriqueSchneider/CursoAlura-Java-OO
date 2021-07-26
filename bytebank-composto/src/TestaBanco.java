public class TestaBanco {
    public static void main(String[] args) {
        Cliente gustavo = new Cliente();
        gustavo.cpf = "123456";
        gustavo.nome = "Gustavo";
        gustavo.profissao = "programador";

        ContaBancaria contaGustavo = new ContaBancaria();
        contaGustavo.deposita(100);
        contaGustavo.titular = gustavo;

        System.out.println(contaGustavo.titular.nome);


        //Testar conta sem cliente

        ContaBancaria contaGustavo2 = new ContaBancaria();
        contaGustavo2.titular = new Cliente();
        System.out.println(contaGustavo2.titular);

        contaGustavo2.titular.nome = "Gustavo2";
        System.out.println(contaGustavo2.titular.nome);

        contaGustavo2.titular.endereco.bairro = "Teste Bairro";
        System.out.println(contaGustavo2.titular.endereco.bairro);
    }
}
