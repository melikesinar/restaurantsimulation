package deneme;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Restoran {
 private ArrayList<Urun>  menu= new ArrayList<Urun>();
 private  ArrayList<Siparis>  siparisler= new ArrayList<Siparis>();
 private  ArrayList<Musteri>  musteriler= new ArrayList<Musteri>();
 private  ArrayList<Garson>  garsonlar= new ArrayList<Garson>();
 
 Restoran(){}
  public void menuyeUrunEkle(Urun urun) {
	  menu.add(urun);
	  menu.toArray();
  }
  public void musteriEkle(Musteri musteri) {
	  musteriler.add(musteri);
  }
  public void garsonEkle(Garson garson) {
	 garsonlar.add(garson);
 }
  public void menuyuGoster() {
	  System.out.println("---MENU---");
	  for(Urun yemek :menu) {
		 yemek.urunBilgisi();
	  }
  }
  public void rastgeleSiparislerOlustur() {
	  Random random = new Random();
      
	  for (int i = 0; i < 10; i++) {
		  
		  int siparisTuru = random.nextInt(3); // 0: sadece yemek, 1: sadece içecek, 2: yemek ve içecek
          Yemek ryemek = null;
          Icecek ricecek = null;

          if (siparisTuru == 0) {
              ryemek= (Yemek) menu.get(random.nextInt(3));
          } else if (siparisTuru == 1) {
        	  ricecek= (Icecek) menu.get(random.nextInt(3) + 3);
          } else if (siparisTuru == 2) {
        	  ryemek= (Yemek) menu.get(random.nextInt(3));
        	  ricecek= (Icecek) menu.get(random.nextInt(3) + 3);
          }
		  int rmusteri=random.nextInt(musteriler.size());
		  int rgarson=random.nextInt(garsonlar.size());
		  Musteri musteri = musteriler.get(rmusteri);	
	      Garson garson = garsonlar.get(rgarson);
	      
	      Siparis siparis = musteri.siparisVer(ryemek, ricecek);
	      siparis.garson = garson;
	      siparis.siparis_no = i+1;
	      garson.siparisAl(siparis, siparis);

  }
  }
}
