public class Enum {

    public static void main(String[] args){

        //vALORES DE LA ENUMERACION
        System.out.println("Valor 1: " + Dias.LUNES);

        //HACEMOS UN TEST DEL DIA UTILIZADO
        indicarDia(Dias.VIERNES);

        //Utilizamos la enumeracion de paises
        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("Paises en amierica: " + Continentes.AMERICA.getPaises());

        //Hacemos el test del numero de paises por continente
        System.out.println("");
        indicarPaises(Continentes.AFRICA);

        //Imprimimos los continentes
        System.out.println("");
        imprimirContinentes();
    }




    public static void indicarDia(Dias dias){
        switch (dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Ultimo dia habil de la semana");
                break;
            case SABADO:
                System.out.println("Hoy se SALE");
                break;
                default:
                    System.out.println("Siempre hay que ir a misa");
        }
    }

    public static void indicarPaises(Continentes continentes){
        switch (continentes){
            //Podemos usar algun valor constante
            //de la enumeracion directamente
            case AFRICA:
                System.out.println("No. Paises en " + continentes + ": " + continentes.getPaises());
                break;
                default:
                    System.out.println("Y asi seguimos con los demas continentes");
        }
    }

    public static void imprimirContinentes(){
        //utilizamos un forEach
        for(Continentes c: Continentes.values()){
            System.out.println("Continente: " + c + " contiene " + c.getPaises() + "paises.");
        }
    }
}
