public class Ventas {

    public static void main(String[] args){

        //Creamos varios objetos vacios Producto
        Producto p1 = new Producto("Camisa", 50.00);
        Producto p2 = new Producto ("Pantalon", 100.00);
        Producto p3 = new Producto ("Corbata", 30.00);

        //Creamos un objeto Orden
        Orden orden1 = new Orden();

        //Agregamos los productos a la orden
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.agregarProducto(p3);

        //imprimimos la orden
        orden1.mostrarOrden();


        //creamos una segunda orden
        Orden orden2 = new Orden();

        //Creamos nuevos productos
        Producto p4 = new Producto("Jardinero", 140.00);
        Producto p5 = new Producto("Sweater", 80.00);

        //Agregamos los nuevos productos a la orden 2
        orden2.agregarProducto(p1 );
        orden2.agregarProducto(p4);
        orden2.agregarProducto(p5);

        //imprimimos la orden 2
        System.out.println("");
        orden2.mostrarOrden();
    }
}
