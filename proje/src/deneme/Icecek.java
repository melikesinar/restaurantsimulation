package deneme;

public class Icecek extends Urun {
private String boy;

  Icecek (String ad,double fiyat,String boy){
	 super(ad,fiyat);
	 this.boy=boy;
  }
  public void urunBilgisi() {
		 System.out.println("İçecek: "+ ad+"\nFiyat: "+fiyat +"\nBoyut: "+ boy+"\n- - - - - -");
		   
	   }
}
