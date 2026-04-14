package Programas;

public class Persona {
	//atributos
	String Dni;
	String Nombre;
	String Apellido1;
	String Apellido2;
	int edad;
	float altura;
	char genero; //char es solo una letra, sin embargo, string es una cadena de caracteres
	//constructor (mismo nombre que la clase) Reserva memoria para la clase
	public Persona(String NuevoDni) {
		Dni=NuevoDni;
	}
	public Persona(String NuevoDni,String NuevoNombre,String NuevoApellido1,String NuevoApellido2){ 
		Dni=NuevoDni;
		Nombre=NuevoNombre;
		Apellido1=NuevoApellido1;
		Apellido2=NuevoApellido2;
	}
	//Métodos
	void MuestraNombrePantalla(){ //void es "no devuelvo nada"
		System.out.println(Nombre);
		
	}
	void MuestraNombrePantalla(String tratamiento) {
		System.out.println(tratamiento+" "+Nombre);
	}
	String DevuelveInicialNombre(){
		String inicial;
		inicial=Nombre.substring(0,1);
		return inicial;
		
	}
	String DevuelveNombreApe1Ape2() {
		String cadena="";
		cadena=Nombre+Apellido1+Apellido2;
		return cadena;
	}
	//Haz un método que devuelva una contraseña creada
	//con las 3 primeras letras del nombre y 3 de los apellidos
	//y los dos primeros digitos del DNI
	String getPassword() {
		String password=Nombre.substring(0,3)+Apellido1.substring(0,3)+Apellido2.substring(0,3)+Dni.substring(0,3);
		return(password);
	}
	
	
}