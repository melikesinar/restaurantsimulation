package deneme;

public class Yemek extends Urun {
 private String tur;
  Yemek(String ad,double fiyat,String tur){
	 super(ad,fiyat);
	 this.tur=tur;
 }
   public void urunBilgisi() {
	 System.out.println("Yemek: "+ ad+"\nFiyat: "+fiyat +"\nTür: "+ tur+"\n- - - - - -");
	   
   }
}
