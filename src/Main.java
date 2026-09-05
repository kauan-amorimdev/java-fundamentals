public class Main {
    public static void main(String[] args) {
        BankAccount c1 = new BankAccount("12345");
        BankAccount c2 = new BankAccount("kauan", "123");
        BankAccount c3 = new BankAccount("1234", 89.4);
        BankAccount c4 = new BankAccount("kauan", 6000.0, "1");
        mostrar(c1);
        mostrar(c2);
        mostrar(c3);
        mostrar(c4);
        System.out.println("Foram criadas: " + BankAccount.contadorC + " contas");
    }

    public static void mostrar(BankAccount conta){
        System.out.println("titular: " + conta.getTitular() + " saldo: " + conta.getSaldo() + " id: " + conta.getIdt());
    }
}