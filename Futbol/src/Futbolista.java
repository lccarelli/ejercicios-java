public class Futbolista extends SeleccionFutbol {

    private int id;
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private int dorsal;
    private String demarcacion;

    // constructor, getter y setter

    public void Concentrarse() {

    }

    public void Viajar() {

    }

    public void jugarPartido() {

    }

    public void entrenar() {

    }

    public Futbolista() {
        super();
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
}
