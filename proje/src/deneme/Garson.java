package deneme;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Garson extends Kisi {
	Garson( String ad){
		super(ad);
	}
	public void siparisAl(Siparis s,Siparis siparisler) {
			s.garson= this;
			s.siparisBilgisi();
			
			String klasorAdi = "Siparisler";
	        File klasor = new File(klasorAdi);
	        if (!klasor.exists()) {
	            klasor.mkdir();
	        }
	        
			String dosyaAdi = klasorAdi + "/siparis_" + s.siparis_no + ".txt";
	    try(   PrintWriter yazici = new PrintWriter(new FileWriter(dosyaAdi))){
			s.siparisYazdir(yazici);
	        
			
	        } catch (IOException e) {      	
	        }}}
	

