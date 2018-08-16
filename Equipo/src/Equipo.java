public class Equipo {

    public static void main (String[] args){
        //Creo persona
        Persona p1 = new Persona("Laura", "Carelli", "Dev", "jr", 5);
        Persona p2 = new Persona("Maxi", "Britez", "Scrum Master", "sr", 20);
        Persona p3 = new Persona("Matias", "Alexander", "QA", "ssr", 10);
        Persona p4 = new Persona("Matias", "Alexander", "QA", "ssr", 10);

        Sprint sprint1 = new Sprint();

        //Agregamos las personas al equipo
        sprint1.agregarPersona(p1);
        sprint1.agregarPersona(p2);
        sprint1.agregarPersona(p3);
        sprint1.agregarPersona(p4);


        //imprimimos la sprint
        sprint1.mostrarEquipo();
    }


}
