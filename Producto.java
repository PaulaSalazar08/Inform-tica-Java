package Programas;

public class Producto {
	//Atributos
	private int idproducto; //id con minúscula pq es int
	private String Descripcion;
	private double precio; //minúscula pq es double
	//Constructor (hay que hacerlo con el source generate constructor with fields)
	public Producto(int idproducto, String descripcion) {
		this.idproducto = idproducto;
		Descripcion = descripcion;
	}
	public Producto(int idProducto);
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	//El constructor está sobrecargado (dos versiones del mismo método) //MÉTODOS SIEMPRE EN MINÚSCULA
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//Método que devuelve todos los atributos como una cadena separados por espacios
	public String getIdProductoDescripcionPrecio() {
		String LineaProducto="";
		LineaProducto=idproducto+" "+Descripcion+" "+precio;
		return(LineaProducto);
	}
	public String getIdProductoDescripcionPrecio(int iva) {
		String LineaProducto="";
		LineaProducto=idproducto+" "+Descripcion+" "+(precio+(precio*iva)/100); //suma el precio que tenía más el precio con iva
		return(LineaProducto);
	}

}
