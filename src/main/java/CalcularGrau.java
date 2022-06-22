import java.util.Map;

public class CalcularGrau {

    public static String calcularGrau(Integer estoqueLentePrime, Map<String,Double> grausVisaoCliente){
        Double grauEsfericoDireito, grauEsfericoEsquerdo, grauCilindricoDireito, grauCilindricoEsquerdo;
        grauEsfericoDireito = grausVisaoCliente.get("grauEsferDireito");
        grauEsfericoEsquerdo = grausVisaoCliente.get("grauEsferEsquerdo");
        grauCilindricoDireito = grausVisaoCliente.get("grauCilinDireito");
        grauCilindricoEsquerdo = grausVisaoCliente.get("grauCilinEsquerdo");

        if(grauCilindricoDireito < -5.0 || grauCilindricoEsquerdo < -5.0){
            return "Grau Cilindrico muito elevado para as lentes disponiveis";
        }

        if(grauEsfericoDireito <= 0 && grauEsfericoDireito >= -15.0 || grauEsfericoEsquerdo <= 0 && grauEsfericoEsquerdo >= -15.0){
            if(grauEsfericoDireito <= -3.0 && grauEsfericoDireito >= -12.0 || grauEsfericoEsquerdo <= -3.0 && grauEsfericoEsquerdo >= -12.0){
                if(grauCilindricoDireito < 0 && grauCilindricoDireito >= -2.0 && grauCilindricoEsquerdo < 0 && grauCilindricoEsquerdo >= -2.0){
                    if(grauEsfericoDireito <= -3.0 && grauEsfericoDireito >= -10.0 && grauEsfericoEsquerdo <= -3.0 && grauEsfericoEsquerdo >= -10.0){
                        if(estoqueLentePrime > 0){
                            return "Lente Prime";
                        }
                        return "Lente Vision";
                    } else{
                        return "Lente Vision";
                    }
                }
                else if(grauCilindricoDireito < -2.0 || grauCilindricoEsquerdo < -2.0 ){
                    return "Lente Vision";
                }
                else{
                    return "Lente Prime";
                }
            }
            else{
                return "Lente Vision";
            }
        }
        else{
            return "Grau muito elevado para as lentes disponiveis";
        }
    }


}
