
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Noticia n = new Noticia("10 muertos",
				"hoy",
				"DC",
				"Sobredosis de programación");
		Periodico p = new Periodico();
		p.AgregarNoticia(n);
		p.ImprimirPeriodico();
	}

}
