package biletSatisProgrami;

import java.util.concurrent.ForkJoinPool;

public class BiletUcretHesaplama {
    private int biletUcreti;
    private int normalUcret;
    private int yolcuSeferNo;
    private int yolcuYasi;

    public int getBiletUcreti() {
        return biletUcreti;
    }
    public void setBiletUcreti(int biletUcreti) {
        this.biletUcreti = biletUcreti;
    }
    public int getYolcuYasi() {
        return yolcuYasi;
    }

    public void setYolcuYasi(int yolcuYasi) {
        this.yolcuYasi = yolcuYasi;
    }

    //========================================
    public int getYolcuSeferNo() {
        return yolcuSeferNo;
    }

    public void setYolcuSeferNo(int yolcuSeferNo) {
        this.yolcuSeferNo = yolcuSeferNo;
    }

    public int normalUcret(int yolcuSeferNo){
        if(yolcuSeferNo==1){
            normalUcret=50;
        }else if(yolcuSeferNo==2){
            normalUcret=50;
        }else if(yolcuSeferNo==3){
            normalUcret=80;
        }else if (yolcuSeferNo==4){
            normalUcret=80;
        }else if(yolcuSeferNo==5){
            normalUcret=100;
        }else if (yolcuSeferNo==6) {
            normalUcret = 100;
        }
        return normalUcret;
    }
    public int biletUcret(int yolcuYasi,int normalUcret) {
        if (yolcuYasi <= 18) {
            biletUcreti = normalUcret / 2;
        } else {
            biletUcreti = normalUcret;
        }
            return biletUcreti;
        }


}

