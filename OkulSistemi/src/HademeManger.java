public class HademeManger extends OkulManager {
    public HademeManger() {
    }

    @Override
    public void hesapla(int sayı,OkulUser okulUser) {
        double katsayı=3.2;
       double maaş= sayı*katsayı;
        System.out.println(maaş + " " + okulUser.getName());
    }
}
