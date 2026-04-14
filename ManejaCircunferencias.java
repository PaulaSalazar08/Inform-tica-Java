package Programas;

public class ManejaCircunferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circunferencia miCirculito;
		Punto miCentrito;
		miCentrito=new Punto(3,8);
		float radio=(float) 10;
		miCirculito=new Circunferencia(miCentrito,radio); //Cuando lo envio no hay q poner ni Punto ni float
		System.out.println("ÁREA ="+miCirculito.getArea());
	}

}
