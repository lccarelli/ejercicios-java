public class Main {

    public static void main(String[] args){

        FiguraGeometrica figura;

        figura = new Circulo();
        //Determina solo un tipo el que corresponda con la jerarquia
        determinaTipo(figura);
        //Determina todos los tipos posibles
        System.out.println("Todos los tipos");
        determinaTodosLosTipos(figura);
    }

    private static void determinaTodosLosTipos(FiguraGeometrica figura){
        if(figura instanceof Elipse){
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        }
        if(figura instanceof Circulo){
            //Procesa algo particular del circulo
            System.out.println("Es un circulo");
        }
        if(figura instanceof FiguraGeometrica){
            //Procesa algo particular de la Figura Geometrica
            System.out.println("Es una figura Geometrica");
        }
        if(figura instanceof Object){
            System.out.println("Es un objeto");
        }else{
            System.out.println("No se encontro el tipo");
        }
    }

    private static void determinaTipo(FiguraGeometrica figura){
        if(figura instanceof Elipse){
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        }
        else if(figura instanceof Circulo){
            //Procesa algo particular del circulo
            System.out.println("Es un circulo");
        }
        else if(figura instanceof FiguraGeometrica){
            //Procesa algo particular de la Figura Geometrica
            System.out.println("Es una Figura Geometrica");
        }
        else if(figura instanceof Object){
            //Procesa algo particular de la clase object
            System.out.println("Es un Objecto");
        }
        else{
            System.out.println("No se encontro el tipo");
        }
    }
}
