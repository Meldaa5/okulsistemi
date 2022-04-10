public class Main {

    public static void main(String[] args) {
	OkulUser okuluser = new OkulUser( );
	Hademe hademe= new Hademe();
hademe.setName("hasan");
hademe.setSurname("kara");
hademe.setGiysi("kırmızı");
     Oğretmen oğretmen=new Oğretmen();
     oğretmen.setName("hüseyin");
     oğretmen.setSurname("karal");
     oğretmen.setVeli(45);
        System.out.println(oğretmen.getVeli() );
        System.out.println(oğretmen.getName());
        OkulManager okulManager2=new HademeManger();
        okulManager2.hesapla(1000,hademe);
        OkulManager okulManager1=new OğretmenManager();
        okulManager1.hesapla(1005,oğretmen);

    }
}
