public class Hademe extends OkulUser {
    private String giysi;
public Hademe(){

}


    public String getGiysi() {
        return giysi;
    }

    public void setGiysi(String giysi) {
        this.giysi = giysi;
    }

    public Hademe(String name, String surname, String giysi) {
        super(name, surname);
        this.giysi = giysi;

    }
}

