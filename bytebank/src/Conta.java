public class Conta {
    double saldo;
    int agencia = 42, numero;
    String titular;

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

    public boolean transfere(double valor, Conta destino) {
        boolean podeTransferir = saca(valor);
        if(podeTransferir) {
            destino.deposita(valor);
            return true;
        }
        //else
        return false;
    }
}