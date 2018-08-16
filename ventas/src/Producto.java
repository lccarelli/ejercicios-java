public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //constructor vacio
    private Producto() {
        //asignamos el id producto unico por cada objeto creado
        this.idProducto = ++contadorProductos;
    }

    //constructor sobrecargado de dos argumentos
    public Producto(String nombre, double precio){
        //Llamamos al constructor vacio para asignar el id de producto
        this();
        this.nombre = nombre;
        this.precio = precio;

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "Producto {" + "idProducto #" + idProducto + ", nombre = " + nombre + ", precio = " + precio + "}";
    }

}
