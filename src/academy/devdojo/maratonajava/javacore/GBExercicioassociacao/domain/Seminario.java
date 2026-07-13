package academy.devdojo.maratonajava.javacore.GBExercicioassociacao.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    //Imprimindo as informações do seminário
    public void imprimirSeminario(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Alunos: ");
        for(Aluno aluno : this.alunos){
            System.out.println(aluno.getName());
        }

        System.out.println("Local: " + this.local.getEndereo());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    //cadastrando os alunos
    public void setAlunos(Aluno... alunoooos) {
       this.alunos = alunoooos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
