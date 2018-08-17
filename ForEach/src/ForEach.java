public class ForEach {

    public static void main(String[] args){

        //creamos un arreglo de personas
        Persona[] personas = {new Persona("juan"), new Persona("Karla")};

        //iteramos cada elemento del arreglo de personas
        for(Persona p : personas){
            //accedemos a las propiedades y/o metodos del objeto
            String nombre = p.getNombre();
            System.out.println("Nombre persona: " + nombre);
        }
        System.out.println("");

        //creamos un arreglo de enteros
        int[] edades = {15, 20, 41, 50};

        //iteramos el arreglo
        for(int edad : edades){
            System.out.println("edad: " + edad);
        }
    }
}
