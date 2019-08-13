
public class Noticia {
	String titulo;
	String fecha;
	String autor;
	String cuerpo;
	
	
	public Noticia(String titulo, String fecha, String autor, String cuerpo) {
		super();
		this.titulo = titulo;
		this.fecha = fecha;
		this.autor = autor;
		this.cuerpo = cuerpo;
	}


	void ImprimirNoticia() {
		System.out.println("_____________________________");
		System.out.println("-"+titulo+"-");
		System.out.println("Autor: " + autor + ", Fecha: " + fecha );
		System.out.println(cuerpo);
		System.out.println("_____________________________");
	}
}
