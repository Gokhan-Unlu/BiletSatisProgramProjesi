package biletSatisProgrami;

import java.util.Scanner;

public class BiletSatisMain extends MusteriBilgileri {
    // private int yolcuseferNo;

    public static void main(String[] args) {
//==================YOLCU BILGILERI AD SOYAD YAS================
       StringBuffer yolcuGiris=new StringBuffer("Evet");
        MusteriBilgileri musteri1 = new MusteriBilgileri();
        SeferNoBul seferNoBul = new SeferNoBul();
        BiletUcretHesaplama musteriBilet = new BiletUcretHesaplama();
        KoltukSecim koltukSecim2 = new KoltukSecim();
        //=====================================================

        while (yolcuGiris.charAt(0)=='E'||yolcuGiris.charAt(0)=='e') {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Yolcu Ismini Giriniz");
            String name = scanner.nextLine();
            musteri1.setMusteriIsmi(name);
            System.out.println("Yolcu Yasini Giriniz");
            int yolcuYasi = scanner.nextInt();
            musteri1.setMusteriYasi(yolcuYasi);
            System.out.println("Kalkis Yerini Seciniz : Ankara, Istanbul, Izmir");
            String kalkisYeri = scanner.next();
            seferNoBul.setKalkisYeri(kalkisYeri);
            System.out.println("Varis Yerini Seciniz : Ankara, Istanbul, Izmir");
            String varisYeri = scanner.next();
            seferNoBul.setVarisYeri(varisYeri);
            System.out.println("Koltuk No Giriniz");
            String koltuk = scanner.next();
            koltukSecim2.setKoltuk(koltuk);

            //========================================================

            //========================================================

            musteriBilet.setYolcuYasi(yolcuYasi);

            //==========================BILET BAS======================
            System.out.println(musteri1.biletBas(musteri1.getMusteriIsmi(), seferNoBul.getKalkisYeri(), seferNoBul.getVarisYeri(), musteriBilet.biletUcret(musteri1.getMusteriYasi(), musteriBilet.normalUcret(seferNoBul.seferNoBul(seferNoBul.getKalkisYeri(), seferNoBul.getVarisYeri())))));
            //=============================================

            int yolcuSeferNo = seferNoBul.getYolcuSeferNo();
            koltukSecim2.setYolcuSeferNo(seferNoBul.getYolcuSeferNo());
            koltukSecim2.koltukDurumu(seferNoBul.getYolcuSeferNo(),koltuk);
            koltukSecim2.yolcuListesi(musteri1.getMusteriIsmi(),yolcuSeferNo);
            System.out.println("Yolcu Girisi Yapmak istiyor musunuz===E//H");
            yolcuGiris.replace(0,1,scanner.next());


        };


        }
    }


