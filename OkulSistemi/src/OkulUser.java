public class OkulUser {
    public OkulUser (){
    }

    public OkulUser(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private String name ;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
