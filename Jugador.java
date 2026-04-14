package Programas;

public class Jugador extends Persona{
	String posicion;
	int numero;
	//constructor
	public Jugador(String NuevoDni, String NuevoNombre, String NuevoApellido1, String NuevoApellido2,String posicion) {
		super(NuevoDni, NuevoNombre, NuevoApellido1, NuevoApellido2); //Lo que hace el super es mandarlo a la clase original
		this.posicion=posicion;
		// TODO Auto-generated constructor stub
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNumeroNombre() {
		return(numero+" "+Nombre);
	}
	

}
