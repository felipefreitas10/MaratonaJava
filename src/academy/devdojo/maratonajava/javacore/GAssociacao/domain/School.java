package academy.devdojo.maratonajava.javacore.GAssociacao.domain;

public class School {
    public String name;
    public Teacher[] teachers;

    public void imprime(){
        System.out.println(this.name);
        if(this.teachers == null) return;

        for( Teacher teacher : this.teachers ){
            System.out.println(teacher.getName());
        }
    }

    public School(String name) {
        this.name = name;
    }

    //Sobrecarga de contrutores e varags
    public School(String name, Teacher... teachers){
        this(name);
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeacher() {
        return teachers;
    }

    public void setTeacher(Teacher[] teacher) {
        this.teachers = teacher;
    }
}
