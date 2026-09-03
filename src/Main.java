public class Main {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("kauan");
        Aluno aluno3 = new Aluno("kauan", "123456");
        mostrar(aluno1, aluno2, aluno3);
    }
    public static void mostrar(Aluno aluno1, Aluno aluno2, Aluno aluno3){
        System.out.println("Nome: " + aluno1.getNome() + " Matricula: " + aluno1.getMatricula());
        System.out.println("Nome: " + aluno2.getNome() + " Matricula: " + aluno2.getMatricula());
        System.out.println("Nome: " + aluno3.getNome() + " Matricula: " + aluno3.getMatricula());
    }
}