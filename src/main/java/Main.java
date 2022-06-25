import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer estoqueLentePrime = 1;
        Map<String,Double> grausVisaoCliente = new HashMap<>();

        try{
            Double recebeValor;
            do{
                System.out.println("Informe o grau esférico do olho direito. Ex: valores iterados de -0,25 em 0,25.");
                recebeValor = scanner.nextDouble();
                if(VerificaGrauValido.verificaGrauEsfericoValido(recebeValor)){
                    grausVisaoCliente.put("grauEsferDireito", recebeValor);
                }else{
                    System.out.println("Grau que foi informado é inválido!");
                }
            }while(!grausVisaoCliente.containsKey("grauEsferDireito"));

            do{
                System.out.println("Informe o grau esférico do olho esquerdo: ");
                recebeValor = scanner.nextDouble();
                if(VerificaGrauValido.verificaGrauEsfericoValido(recebeValor)){
                    grausVisaoCliente.put("grauEsferEsquerdo", recebeValor);
                }else{
                    System.out.println("Grau que foi informado é inválido!");
                }
            }while(!grausVisaoCliente.containsKey("grauEsferEsquerdo"));

            do{
                System.out.println("Informe o grau cilindrico do olho direito: ");
                recebeValor = scanner.nextDouble();
                if(VerificaGrauValido.verificaGrauCilindricoValido(recebeValor)){
                    grausVisaoCliente.put("grauCilinDireito", recebeValor);
                }else{
                    System.out.println("Grau que foi informado é inválido!");
                }
            }while(!grausVisaoCliente.containsKey("grauCilinDireito"));

            do{
                System.out.println("Informe o grau cilindrico do olho esquerdo: ");
                recebeValor = scanner.nextDouble();
                if(VerificaGrauValido.verificaGrauCilindricoValido(recebeValor)){
                    grausVisaoCliente.put("grauCilinEsquerdo", recebeValor);
                }else{
                    System.out.println("Grau que foi informado é inválido!");
                }
            }while(!grausVisaoCliente.containsKey("grauCilinEsquerdo"));

            String resultadoCalculo = CalcularGrau.calcularGrau(estoqueLentePrime, grausVisaoCliente);

            System.out.println(resultadoCalculo);
        } catch(Error e){
            e.getCause();
        }

    }
}

