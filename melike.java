package deneme;

import java.util.Scanner;
import java.util.Stack;

public class melike {
	
	public static void main (String[] args) {	
  Urun y1= new Yemek("Margarita",110,"pizza");
  Urun y2= new Yemek("Pepperoni",130,"pizza");
  Urun y3= new Yemek("BigMac",120,"hamburger");
  Urun i1= new Icecek("Kola",15,"kutu");
  Urun i2= new Icecek("Kola",20,"şişe");
  Urun i3= new Icecek("Ayran",10,"kucuk");
  Urun i4= new Icecek("Ayran",15,"buyuk");
  Musteri m1=new Musteri("Ayşe Hanım");
  Musteri m2=new Musteri("Selin Hanım");
  Musteri m3=new Musteri("Kaan Bey");
  Garson g1=new Garson("Serkan Bey");
  Garson g2=new Garson("Nazlı Hanım");
  Garson g3=new Garson("Ahmet Bey");
  
  Restoran r1= new Restoran();
  
  r1.menuyeUrunEkle(y1);
  r1.menuyeUrunEkle(y2);
  r1.menuyeUrunEkle(y3);
  r1.menuyeUrunEkle(i1);
  r1.menuyeUrunEkle(i2);
  r1.menuyeUrunEkle(i3);
  r1.menuyeUrunEkle(i4);
  r1.menuyuGoster();
  r1.garsonEkle(g1);
  r1.garsonEkle(g2);
  r1.garsonEkle(g3);
  r1.musteriEkle(m1);
  r1.musteriEkle(m2);
  r1.musteriEkle(m3);
  
  r1.rastgeleSiparislerOlustur();
  
}
	 
}				
	


