public class Persona extends Equipo {

    private String nombre;
    private String apellido;
    private String puesto;
    private String seniority;
    private int points;

    public Persona(String nombre, String apellido, String puesto, String seniority, int points) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.seniority = seniority;
        this.points = points;
    }

    @Override
    public String toString(){
        return "Persona {" + "nombre: " + nombre + ", apellido: " + apellido +", puesto: "+ puesto + ", seniority: " + seniority + ", points: " + points + "}";
    }
}
