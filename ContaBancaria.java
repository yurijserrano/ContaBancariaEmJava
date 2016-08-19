public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        if (saldo < 0) throw new IllegalArgumentException();
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double quantia){
        if (quantia < 0) throw new IllegalArgumentException();
        this.saldo = this.saldo + quantia;
    }
    public void saque(double quantia){
        if (saldo < quantia) throw new IllegalArgumentException();
        this.saldo = this.saldo - quantia;
    }
}
