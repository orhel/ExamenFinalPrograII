public class Carro extends MedioDeTransporte{

	Carro(int CantidadPasajeros, double VelocidadMaxima)
	{
	super(CantidadPasajeros, VelocidadMaxima);
	}
	@Override
	int getCantidadDeLLantas()
	{
	CantidadLlantas=4;
	return CantidadLlantas;
	}
}