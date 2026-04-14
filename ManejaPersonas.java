package Programas;

public class ManejaPersonas {

	public static void main(String[] args) {
		Persona persona1,persona2;
		persona1=new Persona("12345678A","Miguel","Serrano","Samitier");
		persona1.MuestraNombrePantalla();
		System.out.println(persona1.DevuelveNombreApe1Ape2());
		System.out.println(persona1.DevuelveInicialNombre());
		System.out.println("Password= "+persona1.getPassword());
		persona2=new Persona("00000000Z");
		
		Jugador jugador1;
		jugador1=new Jugador("33333333W","Lamine","Yamal","","extremo");
		jugador1.setNumero(10);
		System.out.println(jugador1.getNumeroNombre());

	}

}