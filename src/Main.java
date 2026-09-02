import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Aluno aluno1 = new Aluno("rodrigo", 5.4);
    mostrarAluno(aluno1);
    aluno1.setNota(4.3);
    mostrarAluno(aluno1);
    }

    public static void mostrarAluno(Aluno aluno){
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota: " + aluno.getNota());
    }
}