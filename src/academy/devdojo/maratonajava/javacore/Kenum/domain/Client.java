package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Client {

    public enum Day {
        MONDAY(1), TUESDAY(2),
        WEDNESDAY(3), THUSDAY(4),
        FRIDAY(5), SATURDAY(6), SUNDAY(7);

        public final int VALOR;

        Day(int valor){
            this.VALOR = valor;
        }
    }

    public String name;
    public TypeClient typeClient;
    public Day day;
    public TypePay typePay;

    public Client(String name, TypeClient typeClient, Day day, TypePay typePay) {
        this.name = name;
        this.typeClient = typeClient;
        this.day = day;
        this.typePay = typePay;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", typeClientValue=" + typeClient.getValue() +
                ", typeClientName=" + typeClient.getNameReport() +
                ", day = " + day + " " + day.VALOR +
                ", typeClientName=" + typePay +
                '}';
    }
}