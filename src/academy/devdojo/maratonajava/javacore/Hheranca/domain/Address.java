package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Address {
    private String street;
    private String cep;

    public void print(){
        Person p = new Person("Ricardo Izeckson"); //Even though this class does not inherit from class "Person", it will have access to these attributes because they are in the same package.
        p.name = "Kaká";
    }
    public Address(String street, String cep) {
        this.street = street;
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
