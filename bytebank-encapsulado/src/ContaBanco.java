public class ContaBanco {
    private double saldo = 0;
    private int agencia = 42;
    private int numero;
    private DadosCliente titular;
    private static int total;

    public ContaBanco(int agencia, int numero){
        setAgencia(agencia);
        setNumero(numero);
        ContaBanco.total++;
        System.out.println("o total de contas é " + total);
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        //else
        return false;
    }

    public boolean transfere(double valor, ContaBanco destino) {
        boolean podeTransferir = saca(valor);
        if (podeTransferir) {
            destino.deposita(valor);
            return true;
        }
        //else
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    private void setNumero(int numero) {
        if(agencia<=0)
            return;
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    private void setAgencia(int agencia) {
        if(agencia<=0)
            return;
        this.agencia = agencia;
    }

    public DadosCliente getTitular() {
        return this.titular;
    }

    public void setTitular(DadosCliente titular) {
        this.titular = titular;
    }

    public static int getTotal(){
        return ContaBanco.total;
    }
}