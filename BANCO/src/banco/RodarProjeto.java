package banco;

public class RodarProjeto {
    public static void main(String[] args) {
        Conta_Corrente p1 = new Conta_Corrente();
        p1.setSaldo(278);

        Conta_Poupanca c1 = new Conta_Poupanca();

        p1.transferir(100,c1);


        System.out.println(p1);
        System.out.println(c1);









    }


}
