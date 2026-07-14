package academy.devdojo.maratonajava.desafios.Desafio01.domain;

public class Delivery {
    private String tranckingNumber;
    private String destination;
    private double weight;

    public Delivery(String tranckingNumber, String destination, double weight){
        this.tranckingNumber = tranckingNumber;
        this.destination = destination;
        this.weight = weight;
    }

    public String getTranckingNumber(){
        return this.tranckingNumber;
    }

    public void setTranckingNumber(String tranckingNumber){
        this.tranckingNumber = tranckingNumber;
    }

    public String getDestination(){
        return this.destination;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}

