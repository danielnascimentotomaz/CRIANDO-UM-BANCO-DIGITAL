package banco;

public abstract class Conta implements IDConta {

    //CONSTANTE:
    private static int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 1;
    /////////////////////////////////////////
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;

    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public void sacar(double valor) {
        this.setSaldo(getSaldo() - valor);

    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(getSaldo() + valor);

    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);

    }



    }

