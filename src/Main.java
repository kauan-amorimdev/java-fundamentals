public class Main {
    public static void main(String[] args){
    Conta conta1 = new Conta();
    Conta conta2 = new Conta("kauan");
    Conta conta3 = new Conta("kauan", 2000.0);
    mostrar(conta1, conta2, conta3);
    }

    public static void mostrar(Conta conta1, Conta conta2, Conta conta3){
        System.out.println("Titular: " + conta1.getTitular() + " Saldo: R$ " + conta1.getSaldo());
        System.out.println("Titular: " + conta2.getTitular() + " Saldo: R$" + conta2.getSaldo());
        System.out.println("Titular: " + conta3.getTitular() + " Saldo: R$" + conta3.getSaldo());
    }
}