public class Sprint {

    private final int idEquipo;
    private final Persona personas[];
    private static int contadorEquipo;
    private int contadorPersonas;
    private static final int maxPointsSprint = 40;


    public Sprint(){
        this.idEquipo = ++contadorEquipo;
        personas = new Persona[maxPointsSprint];

    }

    public void agregarPersona(Persona persona){
        if (contadorPersonas < maxPointsSprint){
            personas[contadorPersonas++] = persona;

        }
        else {
            System.out.println("se ha superado el maximo de points: " + maxPointsSprint);
        }
    }
    public double calcularTotal() {
        double total = 0;
        for(int i = 0; i < contadorPersonas; i++){
            total += personas[i].getPoints();
        }
        return total;
    }



    public void mostrarEquipo(){
        System.out.println("Equipo #: " + idEquipo);
        System.out.println("Personas del Equipo #" + idEquipo + ":");
        for (int i = 0; i < contadorPersonas; i++){
            System.out.println(personas[i]);
        }
    }
}
