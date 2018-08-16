public class Orden {

    //palabra final significa que ya el atributo no puede ser modificado
    private final int idOrden;

    //arreglo de tipo Producto
    private final Producto productos[];

    //constante para generar el idOrden de cada objeto que se cree
    //contabiliza el numero de productos que se han agregado al arreglo
    private static int contadorOrdenes;

    //cuantos productos se han agregado al arreglo de productos
    private int contadorProductos;

    //constante del numero maximo de productos dentro del arreglo
    private static final int maxProductos =10;


    //constructor vacio de la clase
    //utilizamos la variable contadorOrdenes que es de tipo statico
    //cada vez que creemos un objeto de tipo orden vamos a generar un nuevo id, entonces el id orden va a ser único

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        //instaciamos nuestro arreglo de productos
        productos = new Producto[maxProductos];
        // new => reservamos espacio de memoria
        // [maxProductos] => definimos la cantidad máxima de espacio reservado
    }

    //definimos un metodo de tipo publico - void => no va a regresar nada
    //agregar producto, este metodo nos va a permitir agregar un nuevo objeto de tipo producto al arreglo productos[]

    public void agregarProducto(Producto producto){
        //si los productos agregados no superan al máximo
        //de productos, agregamos el nuevo producto
        if (contadorProductos < maxProductos){
            //agregamos el nuevo producto al arreglo
            //e incrementamos el contador de productos
            productos[contadorProductos++] = producto;
            //en el array productos[] indicamos el indice de contador productosiii
        }
        else {
            System.out.println("se ha superado el maximo de productos: " + maxProductos);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for(int i = 0; i < contadorProductos; i++){
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Orden #: " + idOrden);
        System.out.println("Total de la orden #" + idOrden + ": $" + calcularTotal());
        System.out.println("Productos de la Orden #" + idOrden + ":");
        for (int i = 0; i < contadorProductos; i++){
            System.out.println(productos[i]);
        }
    }

}
