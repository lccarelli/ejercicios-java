

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;


    //bloque de inicializacion estattico
    static {

        //iniciamos el idPersonas desde el valor 10
        contadorPersonas=10;

        //aqui no se pueden usar variables no estaticas
        //idPersona = 1;
        System.out.println("ejecuta bloque estatico");
    }

    //bloque de codigo para inicializar atributos de la clase
    //el bloque se copia a cada constructor de la clase

    {
        System.out.println("ejecuta bloque inicializador");
        idPersona = ++contadorPersonas;
    }

    Persona(){
        System.out.println("ejecuta constructor");
    }

    public int getIdPersona(){
        return idPersona;
    }
}
