package banco;

public class Conta_Corrente extends Conta  {
    @Override
    public String toString() {
        return "Conta_Corrente{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
