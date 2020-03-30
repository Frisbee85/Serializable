import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 3812017177088226528L;


    private String firstName;
    private String lastNAme;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public Person(String firstNAme, String lastNAme) {
        setFirstName(firstNAme);
        setLastNAme(lastNAme);
    }
}
