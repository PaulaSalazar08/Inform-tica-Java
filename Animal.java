package Programas;

public class Animal extends Producto { //hija de la clase producto
	//Atributos
	private String TipoAnimal;
	private Fecha FechaNacimientoAnimal;
	
	public Animal(int idProducto, String descripcion,Fecha FechaNacimientoAnimal) {
		super(idProducto,descripcion); //SI NO SE PONER DEL COLOR ADECUADO ES QUE LE FALTA UNA LLAVE
		this.FechaNacimientoAnimal=FechaNacimientoAnimal;
		// TODO Auto-generated constructor stub
	}

	public String getTipoAnimal() {
		return TipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}

	public Fecha getFechaNacimientoAnimal() {
		return FechaNacimientoAnimal;
	}

	public void setFechaNacimientoAnimal(Fecha fechaNacimientoAnimal) {
		FechaNacimientoAnimal = fechaNacimientoAnimal;
	}
	//Calcular edad entre el animal y el ordenador
}
