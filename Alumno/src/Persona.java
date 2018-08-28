public class Persona {

    private int codigo;
    protected String nombre;

    public Persona(){



    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarDatosPersona(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
    }
}
