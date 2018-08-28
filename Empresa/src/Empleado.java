public class Empleado {

    private int legajo;
    private String nombre;
    private float sueldo;

    public static float SUELDO_BASICO = 300f;

    public Empleado(){

        this.legajo = 0;
        this.nombre = new String();
        this.sueldo = 0.0f;

    }

    //Constructor, inicializacion de variables

    public Empleado(int legajo, String nombre, float sueldo){

        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public float getSueldo(){
        return(this.sueldo);
    }
}
