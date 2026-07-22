package academy.devdojo.maratonajava.desafios.Associations.Challenge01.domain;

public class Way {
    private String plate;
    private double maximumWeightCapacity;
    private Driver driver;
    private Delivery[] deliveries;

    public Way(String plate, double maximumWeightCapacity, Driver driver, Delivery... deliveries){
        this.plate = plate;
        this.maximumWeightCapacity = maximumWeightCapacity;
        this.driver = driver;
        this.deliveries = deliveries;
    }

    public void record(){
        System.out.println("##### REPORT #####");
        System.out.println("Plate: " + this.plate);
        System.out.println("---- DRIVER ----");
        System.out.println("Drriver's name: " + this.driver.getName());
        System.out.println("Driver's work record: " + this.driver.getWorkRecord());
        System.out.println("---- DELIVERY ----");
        double sum = 0;
        for(Delivery delivery : this.deliveries){
            System.out.println("Tranking Number: " + delivery.getTranckingNumber());
            System.out.println("Destination: " + delivery.getDestination());
            System.out.println("Weight: " + delivery.getWeight());
            sum += delivery.getWeight();
            System.out.println("*******************************************");
        }

        if(sum > this.maximumWeightCapacity){
            System.out.println("The capacity exceeded");
        }else{
            System.out.println("The capacity dind't exceed");
        }



    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getMaximumWeightCapacity() {
        return maximumWeightCapacity;
    }

    public void setMaximumWeightCapacity(double maximumWeightCapacity) {
        this.maximumWeightCapacity = maximumWeightCapacity;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Delivery[] getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(Delivery... deliveries) {
        this.deliveries = deliveries;
    }
}
