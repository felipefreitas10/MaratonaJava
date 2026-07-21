package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected Address address;

    static {
        System.out.println("In static initialization block from Person");
    }

    {
        System.out.println("In initialization block 1 from Person");
    }

    {
        System.out.println("In initialization block 2 from Person");
    }


    public Person(String name){
        this.name = name;
        System.out.println("In constructor from Person");
    }

    //overload of constructor
    public Person(String name, String cpf){
        this(name);
        this.cpf = cpf;
    }

    public Person(String name, String cpf, Address address){
        this(name, cpf);
        this.address = address;
    }

    //print this object
    public void printObject(){
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.address.getStreet() + ", " + this.address.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
