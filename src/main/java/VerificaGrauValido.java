public class VerificaGrauValido {

    public static boolean verificaGrauEsfericoValido (Double valor){
        for(double i = -15.0; i <= 0; i+= 0.25){
            if(valor.equals(i)){
                return true;
            }
        }
        return false;
    }

    public static boolean verificaGrauCilindricoValido (Double valor){
        for(double i = -6.0; i <= 0; i+= 0.25){
            if(valor.equals(i)){
                return true;
            }
        }
        return false;
    }

}
