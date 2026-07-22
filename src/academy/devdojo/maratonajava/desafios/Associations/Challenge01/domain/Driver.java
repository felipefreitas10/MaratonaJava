package academy.devdojo.maratonajava.desafios.Associations.Challenge01.domain;

public class Driver {
    private String name;
    private String workRecord; //relatótio de trabalho

    public Driver(String name, String workRecord){
        this.name = name;
        this.workRecord = workRecord;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getWorkRecord(){
        return this.workRecord;
    }

    public void setWorkRecord(String workRecord){
        this.workRecord = workRecord;
    }


}
