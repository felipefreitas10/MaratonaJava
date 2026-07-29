package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Manager extends Employee{
    //If every Employee must have a name and a salary then every Manager must have a name and a salary
    public Manager(String name, double salary){
        super(name, salary);
    }

    @Override
    public void bonus() {
        this.salary = this.salary + this.salary*0.2;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
