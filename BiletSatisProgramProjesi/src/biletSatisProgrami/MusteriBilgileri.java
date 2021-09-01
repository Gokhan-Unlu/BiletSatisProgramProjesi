package biletSatisProgrami;

public class MusteriBilgileri {
    private String musteriIsmi;
    private int musteriYasi;
    private String kalkisSaati;
    public String bilet;
    private int biletUcreti;
    private int yolcuSeferNo;
    private String kalkisYeri;
    private String varisYeri;
    private  String koltuk;

    public String getBilet() { return bilet; }
    public void setBilet(String bilet) { this.bilet = bilet; }
    public int getBiletUcreti() { return biletUcreti; }
    public void setBiletUcreti(int biletUcreti) { this.biletUcreti = biletUcreti; }
    public int getYolcuSeferNo() { return yolcuSeferNo; }
    public void setYolcuSeferNo(int yolcuSeferNo) { this.yolcuSeferNo = yolcuSeferNo; }
    public String getKalkisYeri() { return kalkisYeri; }
    public void setKalkisYeri(String kalkisYeri) { this.kalkisYeri = kalkisYeri; }
    public String getVarisYeri() { return varisYeri; }
    public void setVarisYeri(String varisYeri) { this.varisYeri = varisYeri; }
    public String getKoltuk() { return koltuk; }
    public void setKoltuk(String koltuk) { this.koltuk = koltuk; }
    public String getKalkisSaati() {
        return kalkisSaati;
    }
    public void setKalkisSaati(String kalkisSaati) {
        this.kalkisSaati = kalkisSaati;
    }
    public String getMusteriIsmi() {
        return musteriIsmi;
    }
    public void setMusteriIsmi(String musteriIsmi) {
        this.musteriIsmi = musteriIsmi;
    }
    public int getMusteriYasi() {
        return musteriYasi;
    }
    public void setMusteriYasi(int musteriYasi) {
        this.musteriYasi = musteriYasi;
    }


      public String biletBas(String musteriIsmi,String kalkisYeri,String varisYeri,int biletUcreti){
          System.out.println("========================="+"\nSayin "+musteriIsmi+ "\n"+"Hareket Yeriniz :" +kalkisYeri+"\n"+"Varis Yeriniz :"+varisYeri+"\n"+"Bilet Ücreti :"+biletUcreti +"\n=========================" );
        return bilet;
      }
}
