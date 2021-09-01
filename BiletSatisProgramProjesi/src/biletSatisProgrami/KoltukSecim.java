package biletSatisProgrami;

import java.util.ArrayList;
import java.util.List;

public class KoltukSecim  extends MusteriBilgileri{

    private String koltuk;
    private int yolcuSeferNo;

        StringBuffer otobus1=new StringBuffer("==1. Otobus Kalan Bos Koltuklarimiz=======\n"+"41  37  33  29  25  21  17  13  09  05  01\n42  38  34  30  26  22  18  14  10  06  02\n43  39  35  31  27  23  19  15  11  07  03\n44  40  36  32  28  24  20  16  12  08  04");
        StringBuffer otobus2=new StringBuffer("==2. Otobus Kalan Bos Koltuklarimiz=======\n"+"41  37  33  29  25  21  17  13  09  05  01\n42  38  34  30  26  22  18  14  10  06  02\n43  39  35  31  27  23  19  15  11  07  03\n44  40  36  32  28  24  20  16  12  08  04");
        StringBuffer otobus3=new StringBuffer("==3. Otobus Kalan Bos Koltuklarimiz=======\n"+"41  37  33  29  25  21  17  13  09  05  01\n42  38  34  30  26  22  18  14  10  06  02\n43  39  35  31  27  23  19  15  11  07  03\n44  40  36  32  28  24  20  16  12  08  04");
        StringBuffer otobus4=new StringBuffer("==4. Otobus Kalan Bos Koltuklarimiz=======\n"+"41  37  33  29  25  21  17  13  09  05  01\n42  38  34  30  26  22  18  14  10  06  02\n43  39  35  31  27  23  19  15  11  07  03\n44  40  36  32  28  24  20  16  12  08  04");
        StringBuffer otobus5=new StringBuffer("==5. Otobus Kalan Bos Koltuklarimiz=======\n"+"41  37  33  29  25  21  17  13  09  05  01\n42  38  34  30  26  22  18  14  10  06  02\n43  39  35  31  27  23  19  15  11  07  03\n44  40  36  32  28  24  20  16  12  08  04");
        StringBuffer otobus6=new StringBuffer("==6. Otobus Kalan Bos Koltuklarimiz=======\n"+"41  37  33  29  25  21  17  13  09  05  01\n42  38  34  30  26  22  18  14  10  06  02\n43  39  35  31  27  23  19  15  11  07  03\n44  40  36  32  28  24  20  16  12  08  04");


    public StringBuffer getOtobus1() {
        return otobus1;
    }

    public void setOtobus1(StringBuffer otobus1) {
        this.otobus1 = otobus1;
    }

    public StringBuffer getOtobus2() {
        return otobus2;
    }

    public void setOtobus2(StringBuffer otobus2) {
        this.otobus2 = otobus2;
    }

    public StringBuffer getOtobus3() {
        return otobus3;
    }

    public void setOtobus3(StringBuffer otobus3) {
        this.otobus3 = otobus3;
    }

    public StringBuffer getOtobus4() {
        return otobus4;
    }

    public void setOtobus4(StringBuffer otobus4) {
        this.otobus4 = otobus4;
    }

    public StringBuffer getOtobus5() {
        return otobus5;
    }

    public void setOtobus5(StringBuffer otobus5) {
        this.otobus5 = otobus5;
    }

    public StringBuffer getOtobus6() {
        return otobus6;
    }

    public void setOtobus6(StringBuffer otobus6) {
        this.otobus6 = otobus6;
    }




        public int getYolcuSeferNo() {
            return yolcuSeferNo;
        }
        public void setYolcuSeferNo(int yolcuSeferNo) {
            this.yolcuSeferNo = yolcuSeferNo;
        }

        public String getKoltuk() {
            return koltuk;
        }
        public void setKoltuk(String koltuk) {
            this.koltuk = koltuk;
        }




        public  void koltukDurumu(int yolcuSeferNo,String koltuk){

            if(yolcuSeferNo==1){
                System.out.println(this.otobus1=otobus1.replace(otobus1.indexOf(koltuk),otobus1.indexOf(koltuk)+koltuk.length(),"XX"));
            }if(yolcuSeferNo==2){
                System.out.println(this.otobus2.replace(this.otobus2.indexOf(koltuk),otobus2.indexOf(koltuk)+koltuk.length(),"XX"));
            }if(yolcuSeferNo==3){
                this.otobus3.replace(otobus3.indexOf(koltuk),otobus3.indexOf(koltuk)+koltuk.length(),"XX");
            }if(yolcuSeferNo==4){
                this.otobus4.replace(otobus4.indexOf(koltuk),otobus4.indexOf(koltuk)+koltuk.length(),"XX");
            }if(yolcuSeferNo==5){
                this.otobus5.replace(otobus5.indexOf(koltuk),otobus5.indexOf(koltuk)+koltuk.length(),"XX");
            }if(yolcuSeferNo==6){
                this.otobus6.replace(otobus6.indexOf(koltuk),otobus6.indexOf(koltuk)+koltuk.length(),"XX");

            }
        }
        List<String> yolcuListesi1=new ArrayList<>();
    List<String> yolcuListesi2=new ArrayList<>();
    List<String> yolcuListesi3=new ArrayList<>();
    List<String> yolcuListesi4=new ArrayList<>();
    List<String> yolcuListesi5=new ArrayList<>();
    List<String> yolcuListesi6=new ArrayList<>();


    public List<String> getYolcuListesi1() {
        return yolcuListesi1;
    }

    public void setYolcuListesi1(List<String> yolcuListesi1) {
        this.yolcuListesi1 = yolcuListesi1;
    }

    public void yolcuListesi(String musteriIsmi, int yolcuSeferNo){
        if(yolcuSeferNo==1) {
     yolcuListesi1.add(musteriIsmi);
           System.out.println("1. Otobus Yolcu Listesi :"+yolcuListesi1.toString());
        } if(yolcuSeferNo==2) {
            yolcuListesi2.add(musteriIsmi);
            System.out.println("2. Otobus Yolcu Listesi :"+yolcuListesi2.toString());
            } if(yolcuSeferNo==3) {
            yolcuListesi3.add(musteriIsmi);
            System.out.println("3. Otobus Yolcu Listesi :"+yolcuListesi3.toString());
            }if(yolcuSeferNo==4) {
            yolcuListesi4.add(musteriIsmi);
            System.out.println("4. Otobus Yolcu Listesi :"+yolcuListesi4.toString());
            } if (yolcuSeferNo == 5) {
            yolcuListesi5.add(musteriIsmi);
            System.out.println("5. Otobus Yolcu Listesi :"+yolcuListesi5.toString());
            } if (yolcuSeferNo == 6) {
            yolcuListesi6.add(musteriIsmi);
            System.out.println("6. Otobus Yolcu Listesi :"+yolcuListesi6.toString());

              }


        }


}