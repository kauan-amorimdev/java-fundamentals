public class Aluno {
    private String matricula;
    private String nome;

    public Aluno(){
        this("Desconhecido", "Sem matricula");
    }

    public Aluno(String nome){
        this(nome, "Sem matricula");
    }
    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getNome(){
        return nome;
    }
    public String getMatricula(){
        return matricula;
    }
}
