package deneme;
import java.util.Date;
import java.io.*;
public class Siparis {
	
	private Yemek yemek;
	private Icecek icecek;
	public Garson garson;
	private Musteri musteri;
	public Date tarih;
	public static long siparis_no;
	Date saat=new Date();
	Siparis(){}
	Siparis (Yemek yemek,Icecek icecek, Garson garson,Musteri musteri,Date tarih) {
	this.yemek=yemek;
	this.icecek=icecek;
	this.garson=garson;
	this.musteri=musteri;
	this.tarih=tarih;
	}
	public void siparisBilgisi() {
		 System.out.println("Sipariş Numarası: " + siparis_no );
	        System.out.println("Müşteri: " + musteri.getAd());
	        System.out.println("Garson: " + garson.getAd());
	        System.out.println("Yemek: " + (yemek != null ? yemek.getAd() + " - " + yemek.getFiyat() : "-"));
	        System.out.println("İçecek: " + (icecek != null ? icecek.getAd() + " - " + icecek.getFiyat() : "-"));
	        System.out.println("Tarih: " + tarih);
	        System.out.println("-------------");
	}
	public void siparisYazdir(PrintWriter yazici) {
        
            yazici.println("Sipariş Numarası: " + siparis_no);
            yazici.println("Müşteri: " + musteri.getAd());
            yazici.println("Garson: " + garson.getAd());
            yazici.println("Yemek: " + (yemek != null ? yemek.getAd() + " - " + yemek.getFiyat() : "-"));
            yazici.println("İçecek: " + (icecek != null ? icecek.getAd() + " - " + icecek.getFiyat() : "-"));
            yazici.println("Tarih: " + tarih);
      
           
     }
   }

