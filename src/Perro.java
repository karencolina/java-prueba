
public class Perro extends SerVivo implements IComportamientoSerVivo{
	
	@Override
	public int CumpliAnio() {
		edad=edad+7;
		return edad;
	}

}
