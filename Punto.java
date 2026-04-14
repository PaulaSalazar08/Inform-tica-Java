package Programas;

public class Punto {
	float coordX;
	float coordY;
	public Punto(float coordX, float coordY){
		this.coordX=coordX;
		this.coordY=coordY;
	}
	//Métodos getters
	float getCoordX(){
		return(coordX);
	}
	float getCoordY() {
		return(coordY);
	}
	//Métodos setters
	void setCoordX(float coordX){
		this.coordX=coordX;
	}
	void setCoordY(float coordY) {
		this.coordY=coordY;
	}
	String getCoordsFormatoTexto(){
		String texto="";
		texto=texto+"Las coordenadas del punto son ("+coordX+","+coordY+")";
		return(texto);
	}

}
