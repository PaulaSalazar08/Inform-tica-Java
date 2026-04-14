package Programas;

public class Fecha { //private es encapsulación, para q no lo vean desde fuera
	private int dia; //se borra el super, pq no es una clase hija
	private int mes;
	private int anio;
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	//Método sobrecargado q saque la fecha por pantalla: si no recibe nada q lo escriba con barras, sin embargo si recibe la palabra fecha que lo escriba
	public String getDiaMesAnio() {
		String CadenaFecha=""; //Cuando es una clase en mayúscula
		CadenaFecha=dia+"/"+mes+"/"+anio;
		return(CadenaFecha);
	}
	public String getDiaMesAnio(String tipoFormato) { //String es recibe una palabra para que no sea el mismo que antes
		String CadenaFecha="";
		String nombreMes[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		CadenaFecha=dia+" de "+nombreMes[mes-1]+" de "+anio; //nombreMes es como un vector de palabras
		return(CadenaFecha);
	}

}
