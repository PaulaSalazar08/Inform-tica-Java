package Programas;

public class ManejaProductos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto Producto_1; //Si es una clase mejor con mayúscula
		Producto_1=new Producto(1,"Pienso para perros");
		Producto_1.setPrecio(10.00);
		System.out.println(Producto_1.getIdProductoDescripcionPrecio());
		System.out.println(Producto_1.getIdProductoDescripcionPrecio(21)); //El 21% es el IVA
		
	}

}
