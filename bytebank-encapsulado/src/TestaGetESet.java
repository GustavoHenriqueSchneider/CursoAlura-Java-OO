public class TestaGetESet {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco(432,1234);

        System.out.println(conta.getNumero());

        conta.setTitular(new DadosCliente());
        conta.getTitular().setNome("Gustavo");
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().getEndereco().setRua("Rua tal");

        System.out.println(conta.getTitular().getEndereco().getRua());
    }
}
