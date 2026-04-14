package Programas;

public class Circunferencia {
	private Punto Centro;  //Con punto hacemos referencia a la clase de antes
	private float radio;
	//CONSTRUCTOR
	public Circunferencia(Punto Centro,float radio){
		this.Centro=Centro;
		this.radio=radio;  //Esto es una encapsulación, utilizar set y get para acceder a una clase
	}
	public Punto getCentro() {
		return Centro;
	}
	public void setCentro(Punto centro) {
		Centro = centro;
	}
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	public double getArea() {
		double Area;
		Area=3.1416*radio*radio;
		return Area;
	}
	
}
