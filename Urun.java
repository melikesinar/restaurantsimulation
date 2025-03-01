package deneme;

public abstract class Urun {
 protected String ad;
 protected double fiyat;
 
   Urun(String ad,double fiyat){
	   this.ad=ad;
	   this.fiyat=fiyat;
   }
   public String getAd() {
	   return this.ad;
   }
   public double getFiyat() {
	   return this.fiyat;
   }
   public abstract void urunBilgisi(); 
	  
}
