public class MedioDeTransporte {
	
		int CantidadPasajeros;
		double VelocidadMaxima;
		int CantidadLlantas;
		
		MedioDeTransporte(int CantidadPasajeros, double VelocidadMaxima)
			{
				this.CantidadPasajeros = CantidadPasajeros;
				this.VelocidadMaxima = VelocidadMaxima;
			}
		
		int getCantidadPasajeros()
			{
				return CantidadPasajeros;
			}
		
		void setCantidadPasajeros()
			{
				this.CantidadPasajeros = CantidadPasajeros;
			}
	
		double getVelocidadMaxima()
			{
				return VelocidadMaxima;
			}
	
		void setVelocidadMaxima()
			{
				this.VelocidadMaxima = VelocidadMaxima;
			}
		
		int getCantidadDeLLantas()
			{
				CantidadLlantas=0;
				return CantidadLlantas;
			}
	
		void setCantidadDeLLantas()
			{
				this.CantidadLlantas = CantidadLlantas;
			}
}