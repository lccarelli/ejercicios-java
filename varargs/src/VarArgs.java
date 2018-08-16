public class VarArgs {

    public static void main(String[] args){

        //imprimimos varios numeros
        imprimirNumeros(20, 13, 23, 25);

        //dif con forEach
        imprimirNumerosForEach(232, 343, 454);

        //varios parametros
        variosParametros("Juan", true, 15, 20, 14);
    }

    public static void imprimirNumeros(int... numeros){

        //recorremos cada elemento
        int elemento;
        for(int i= 0; i < numeros.length; i++){
            elemento = numeros[i];
            System.out.println("Elemento: " + elemento);
        }
    }

    public static void imprimirNumerosForEach(int... numeros){

        //usamos un foreach en lugar de un for normal
        for(int numero : numeros){
            System.out.println("El numero es: " + numero);
        }
    }

    public static void variosParametros(String nombre, boolean valido, int... numeros) {
        System.out.println("NOmbre: " + nombre);
        System.out.println("Valido: " + valido);

        //usamos un foreach
        for(int numero : numeros) {
            System.out.println("El numero es: " + numero);
        }

    }
}

