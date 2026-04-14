package Programas;

public class ManejaPuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto miPuntito;
		miPuntito=new Punto(4,3);
		System.out.println("Coordenada x= "+miPuntito.getCoordX());
		System.out.println("Coordenada y= "+miPuntito.getCoordY());
		System.out.println(miPuntito.getCoordsFormatoTexto());
	}

}
