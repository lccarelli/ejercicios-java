package paquete2;
import paquete1.Clase1;

public class Clase3 extends Clase1{

    public Clase3(){

        //Constructor protegido, al ser una subclase puede acceder
        //aunque este en otro paquete
        super(1, 2);
        //acceso package, y al estar fuera de paquete esta restringido
        //super(1,2,3);
        //acceso privado, restringido
        //super(1,2,3,4)

    }

    public void pruebaDesdeClase3(){

        //acceso a clase 1 desde clase 2
        //clase extiende de clase 1
         Clase1 c1 = new Clase1();
         System.out.println("");
         System.out.println("Atributo publico: " + c1.atrPublico + "o heredado: " + atrPublico);
         System.out.println("Atributo protegido (heredao): " + atrProtegido);
         System.out.println("Atributo default: No se puede acceder desde un paquete externo");
         System.out.println("Atributo private: Acceso negado");


         //Constructor publico
         new Clase1();
         //los demas constructores no se pueden probar asi, sino desde el constructor de esta clase
        //ya que esta es una subclase en otro paquete

        System.out.println("");
        System.out.println("Metodo publico: " + c1.metodoPublico() + "o heredado: " + metodoPublico());
        System.out.println("Metodo protegido (heredao): " + metodoProtegido());
        System.out.println("Metodo default: No se puede acceder desde un paquete externo");
        System.out.println("metodo private: Acceso negado");




    }


}
