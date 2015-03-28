public class Moto extends MedioDeTransporte{
	
	Moto(int CantidadPasajeros, double VelocidadMaxima)
	{
	super(CantidadPasajeros, VelocidadMaxima);
	}
	@Override
	int getCantidadDeLLantas()
	{
	CantidadLlantas=2;
	return CantidadLlantas;
	}
}