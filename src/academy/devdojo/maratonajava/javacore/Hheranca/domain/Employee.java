package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Employee extends Person {
    //this class will have every Person's attribute and method plus its attributes and method
    public double salary;

    static{
        System.out.println("In static initialization block from Employee");
    }

    {
        System.out.println("In initialization block 1 from Employee");
    }

    {
        System.out.println("In inictialization block 2 from Employee");
    }

//    public Employee(String name){ -> It's not possible because every time that we create a constructor in subclass we must use some constructor from superclass
//        this.name = name;
//    }

    public Employee(String name){
        super(name);
        System.out.println("In constructor from Employee");
    }

    public Employee(String name, double salary){
        super(name); //The super class' constructor
        this.salary = salary;
    }

    public Employee(String name, String cpf, double salary){
        super(name, cpf);
        this.salary = salary;
    }

    public Employee(String name, String cpf, double salary, Address address){
        super(name, cpf, address);
        this.salary = salary;
    }

    //super -> references to super class
    //overwriting the method
    public void printObject(){
        super.printObject(); //we are called the method printObject of super class, not the object but the super class application for this employee object
        System.out.println(this.salary);
    }

    public void report(){
        System.out.println("I " + this.name + " have a salary of " + this.salary + " pounds");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
