public class Conta {
    private String titular;
    private double saldo;

    public Conta(){
        this("Desconhecido", 0);
    }
    public Conta(String titular){
        this(titular,0);
    }
    public Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
}
