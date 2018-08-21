public class Persona{

    private String nombre;
    private String apellido;
    private String puesto;
    private String Seniority;
    private int points;

    public Persona(String nombre, String apellido, String puesto, String Seniority, int points) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.Seniority = Seniority;
        this.points = points;
    }

    @Override
    public String toString(){
        return "Persona {" + "nombre: " + nombre + ", apellido: " + apellido +", puesto: "+ puesto + ", seniority: " + Seniority + ", points: " + points + "}";
    }
}
