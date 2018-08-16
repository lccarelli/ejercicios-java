public class Seniority extends Persona{

    public int points;
    public String Jr = "Jr";
    public String Ssr = "Ssr";
    public String Sr = "Sr";


    public String calcularSeniority (){


        if (points >= 0 && points <= 10) {
            return Jr;
        }
        else if (points >= 11 && points <= 20){
            return Ssr;
        }
        else {
            return Sr;
        }
    }

}
