public class Main {


    public static void main(String[] args) {

        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado(20, "Pedro", 1200f);

        System.out.println("Sueldo de e1 : " + e1.getSueldo());
    }
}
