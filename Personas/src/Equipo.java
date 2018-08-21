import java.util.ArrayList;

public class Equipo {

    ArrayList<Persona> Personas = new ArrayList<>();
    private Persona p1;

    public Equipo () {

            //Creamos equipo
            Persona p1 = new Persona(01,"Laura", "Carelli","Dev", Seniority.JUNIOR, 10);

        }

        public void agregarPersona(Persona p1){
            Personas.add(p1);
            System.out.println(Personas);

        }

        //public void mostrarEquipo(){
//            System.out.println(agregarPersona());
//        }



        public Equipo (ArrayList<Persona> pers){
            Personas = pers;
        }

    public void agregarPersona() {
        this.p1 = p1;
        Personas.add(p1);
        System.out.println(Personas);
    }
}
