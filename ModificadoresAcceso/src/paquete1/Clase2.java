package paquete1;

public class Clase2 {

    public Clase2(){

        //Prueba constructores
        System.out.println("");

        //Constructor publico
        new Clase1(1);

        //Constructor protegido
        new Clase1(1, 2);

        //Constructor default o package
        new Clase1(1, 2, 3);

        //Constructor private
        //new paquete1.Clase1(1, 2, 3, 4);
        System.out.println("Constructor private: Acceso negado");
    }

    public void pruebaDesdeClase2() {
        //Acceso a paquete1.Clase1 desde paquete1.Clase2
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("Atributo público: " + c1.atrPublico);
        System.out.println("Atributo protegido: " + c1.atrProtegido);
        System.out.println("Atributo default: " + c1.atrPaquete);
        System.out.println("Atributo private: Acceso negado");

        System.out.print("");
        System.out.println("Metodo público: " + c1.metodoPublico());
        System.out.println("Metodo protegido: " + c1.metodoProtegido());
        System.out.println("Metodo default: " + c1.metodoPaquete());
        System.out.println("Metodo privado: Acceso negado");

    }

}
