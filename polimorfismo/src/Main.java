public class Main {
    public static void main(String[] args){

        Empleado emp = new Empleado("Juan", 1000);
        imprimirDetalles(emp);

        Gerente ger = new Gerente("Karla", 2000, "Finanzas");
        imprimirDetalles(ger);
    }

    //observamos que el tipo que recibe el metodo es de tipo pare(empleado)
    //sin embargo al momento de ejecutar el metodo, se ejecuta el del hijo (gerente)
    //eso es el polimorfismo, multiples formas pero en tiempo de ejecucion

    public static void imprimirDetalles(Empleado emp){
        System.out.println(emp.obtenerDetalles());
    }
}
