public class Oğretmen extends OkulUser {
    private int veli ;
    public Oğretmen(){

    }

    public int getVeli() {
        return veli;
    }

    public void setVeli(int veli) {
        this.veli = veli;
    }

    public Oğretmen(String name, String surname, int veli) {
        super(name, surname);
        this.veli = veli;

    }
}
