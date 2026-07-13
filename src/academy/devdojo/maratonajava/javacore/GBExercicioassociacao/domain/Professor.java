package academy.devdojo.maratonajava.javacore.GBExercicioassociacao.domain;

public class Professor {
    private String name;
    private String specialty;
    private Seminario seminario[];

    public Professor(String name, String specialty){
        this.name = name;
        this.specialty = specialty;
    }


    //sobrecarga de construtores
    public Professor(String name, String specialty, Seminario... seminario){
        this(name, specialty);
        this.seminario = seminario;
    }

    public void imprimindoProfessor(){
        System.out.println("Name: "+ this.name);
        System.out.println("Especialidade" + this.specialty);
        if(this.seminario == null) return;

        System.out.println("Seminários:");
        for(Seminario semi : this.seminario){
            System.out.println("Título: " + semi.getTitulo());
            System.out.println("Local: " + semi.getLocal().getEndereo());
            for(Aluno alunos : semi.getAlunos()){
                System.out.println(alunos.getName());
            }
        }
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSpecialty(){
        return this.specialty;
    }

    public void setSpecialty(String epecialty){
        this.specialty = specialty;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

}
