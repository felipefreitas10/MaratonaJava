package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TypeClient {
    //We might have attributes in class enum
    PESSOA_JURISDICA(1, "Pessoa Jurídica"),    // We are setting values to the enumerations
    PESSOA_FISICA(2, "Pessoa Física");

    private int value; //We can save the value of enums to get after
    private String nameReport; //It's more recommend to use final attributes

    //For us to have attributes in enumerations, we must have a constructor to set the values at the moment that the enumerations is called.
    TypeClient(int value, String nameReport) {
        this.value = value;
        this.nameReport = nameReport;
    }

    public static TypeClient clientTypeByNameReport(String nameReport){
        for(TypeClient typeClient : values()){
            if(typeClient.getNameReport().equals(nameReport)){
                return typeClient;
            }
        }
        return null;
    }

    public int getValue(){
        return this.value;
    }

    public String getNameReport(){
        return this.nameReport;
    }


}
