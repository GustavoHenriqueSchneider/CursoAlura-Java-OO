public class TestarValores {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco(1337, 25123);

        ContaBanco conta2 = new ContaBanco(1337, 32462);

        ContaBanco conta3 = new ContaBanco(1337, 12347);

        System.out.println(ContaBanco.getTotal());
    }
}
