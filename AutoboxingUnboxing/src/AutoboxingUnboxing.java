public class AutoboxingUnboxing {

    public static void main (String[] args){

        //Autoboxing (se convierten de tipos primitivos a tipos objetos)

        Integer enteroObj = 10;
        Float flotanteObj = 15.2F;
        Double dobleObj = 40.1;

        System.out.println("Autoboxing");
        System.out.println("Entero Obj: " + enteroObj.intValue());
        System.out.println("Flotante Obj: " + flotanteObj.floatValue());
        System.out.println("Double Obj: " + dobleObj.doubleValue());


        //AutoUnboxing (se convierten de obejtos a tipos primitivos)

        int entero = enteroObj;
        float flotante = flotanteObj;
        double doble = dobleObj;

        System.out.println("\nUnboxing");
        System.out.println("Entero: " + entero);
        System.out.println("Flotante: " + flotante);
        System.out.println("Double: " + doble);
    }
}
