import java.util.ArrayList;
import java.util.List;

public class Periodico {
	String nombre = "Tahuantinsuyo";
	String fecha ="12/08/2019";
	List<Noticia> noticias;
	
	public Periodico() {
		noticias = new ArrayList<Noticia>();
	}
	
	void ImprimirPeriodico() {
		System.out.println("========================");
		System.out.println("Diario " + nombre);
		System.out.println(fecha);
		System.out.println("========================");
		for(Noticia n : noticias) {
			n.ImprimirNoticia();
		}
		
	}
	
	void AgregarNoticia(Noticia n) {
		noticias.add(n);
	}
}
