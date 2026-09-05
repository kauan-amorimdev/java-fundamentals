public class BankAccount {
    private String titular;
    private double saldo;
    private String idt;
    static int contadorC;


    public BankAccount(String idt){
        this("Desconhecido", 0, idt);
    }

    public BankAccount(String idt, double saldo){
        this("desconhecido", saldo, idt);
    }
    public BankAccount(String titular, String idt){
        this(titular, 0, idt);
    }

    public BankAccount(String titular, double saldo, String idt){
        this.titular = titular;
        this.idt = idt;
        this.saldo = saldo;
        contadorC++;
    }
    public String getTitular(){
        return titular;
}

    public String getIdt(){
        return idt;
    }
    public double getSaldo(){
        return saldo;
    }
}