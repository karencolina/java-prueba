
public class Main {

	public static void main(String[] args) {
		
		SerVivo h= new Humano();
		h.setEdad(55);
		
		SerVivo p= new Perro();
		p.setEdad(7);
		
		// Casteo:  convierte lo que esta despues del parentesis en lo que esta dentro
		
		IComportamientoSerVivo unSerVivo = (IComportamientoSerVivo) h;
		IComportamientoSerVivo otroSerVivo = (IComportamientoSerVivo) p;
		
		System.out.println(h.getEdad());
		System.out.println(p.getEdad());
		
		h.CumpliAnio();
		p.CumpliAnio();
		
		System.out.println(h.getEdad());
		System.out.println(p.getEdad());
		

	}

}
