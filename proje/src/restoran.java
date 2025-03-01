package deneme;

public class Garson extends Kisi {
Garson( String ad){
	super(ad);
}
public void siparisAl(Siparis s,Siparis siparisler) {
		s.garson= this;
		siparisler.siparisYazdır(null);
		
}
}
