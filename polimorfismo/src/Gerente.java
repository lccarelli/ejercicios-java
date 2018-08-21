public class Gerente extends Empleado{

    private String departamento;

    public Gerente (String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //sobre escribimos el metodo padre heredado
    public String obtenerDetalles(){
        //observamos que para no repetir codigo, podemos utilizar
        //el metodo del padre y solo agregar a este metodo de la clase hija
        //esto es invocar un metodo sobreescrito
        return super.obtenerDetalles() +  ", departamento: " + departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }


}
