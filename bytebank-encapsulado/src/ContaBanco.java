public class ContaBancaria {
    private double saldo = 0;
    int agencia = 42, numero;
    Cliente titular;

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

    public boolean transfere(double valor, ContaBancaria destino) {
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
}