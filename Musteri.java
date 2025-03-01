package deneme;

import java.util.Date;

public class Musteri extends Kisi {
 Musteri(String ad){
	 super(ad);
 }
 public Siparis siparisVer(Yemek yemek, Icecek icecek) {
	  return new Siparis(yemek,icecek, null, this, new Date());
 }
  
}
