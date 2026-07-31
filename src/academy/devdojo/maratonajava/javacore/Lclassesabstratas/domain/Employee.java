package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Employee {
    protected String name;
    protected double salary;

    //even though it is Abstract Class it'll have a constructor 'cause this constructor may be called in the extends class
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        bonus();
    }

    public abstract void bonus();

    public void impirmir(){
        System.out.println(this.name);
    }

}

