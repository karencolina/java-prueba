
public class Humano extends SerVivo implements IComportamientoSerVivo{
	
	@Override
	public int CumpliAnio() {
		edad=edad+1;
		return edad;
	}

}
