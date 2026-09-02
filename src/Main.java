import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Pessoa p1 = new Pessoa("Carlos", 22);
    mostrar(p1);
    p1.setIdade(35);
    p1.setNome("teste ja");
    mostrar(p1);
    }

    public static void mostrar(Pessoa p1){
        System.out.println("nome: " + p1.getNome());
        System.out.println("idade: " + p1.getIdade());
    }
}