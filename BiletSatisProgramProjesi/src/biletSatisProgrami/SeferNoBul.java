package biletSatisProgrami;

public class SeferNoBul {
    private String kalkisYeri;
    private String varisYeri;
    private int yolcuSeferNo;
    private String kalkisSaati;

    public String getKalkisYeri() {
        return kalkisYeri;
    }

    public void setKalkisYeri(String kalkisYeri) {
        this.kalkisYeri = kalkisYeri;
    }
    public String getVarisYeri() {
        return varisYeri;
    }

    public void setVarisYeri(String varisYeri) {
        this.varisYeri = varisYeri;
    }



    public String getKalkisSaati() {
        return kalkisSaati;
    }

    public void setKalkisSaati(String kalkisSaati) {
        this.kalkisSaati = kalkisSaati;
    }


    public int getYolcuSeferNo() {
        return yolcuSeferNo;
    }

    public void setYolcuSeferNo(int yolcuSeferNo) {
        this.yolcuSeferNo = yolcuSeferNo;
    }

    public int seferNoBul(String kalkisYeri,String varisYeri){
        if (kalkisYeri.equalsIgnoreCase("Ankara")&&varisYeri.equalsIgnoreCase("Istanbul")){
            yolcuSeferNo=1;
        }else if(kalkisYeri.equalsIgnoreCase("Istanbul")&&varisYeri.equalsIgnoreCase("Ankara")){
            yolcuSeferNo=2;
        } else if(kalkisYeri.equalsIgnoreCase("Ankara")&&varisYeri.equalsIgnoreCase("Izmir")){
            yolcuSeferNo=3;
        }else if(kalkisYeri.equalsIgnoreCase("Izmir")&&varisYeri.equalsIgnoreCase("Ankara")){
            yolcuSeferNo=4;
        }else if(kalkisYeri.equalsIgnoreCase("Istanbul")&&varisYeri.equalsIgnoreCase("Izmir")){
            yolcuSeferNo=5;
        }else if(kalkisYeri.equalsIgnoreCase("Izmir")&&varisYeri.equalsIgnoreCase("Istanbul")){
            yolcuSeferNo=6;
        }
        return this.yolcuSeferNo;
    }



}
