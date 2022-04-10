public class OğretmenManager extends OkulManager {
    public OğretmenManager() {
    }
    @Override
    public void hesapla(int sayı,OkulUser okulUser) {
        double katsayı=5.3;
        double maaş= sayı*katsayı;
        System.out.println(maaş +" " + okulUser.getName() ) ;
        System.out.println("maaşınız hesaplandı");
    }
}
