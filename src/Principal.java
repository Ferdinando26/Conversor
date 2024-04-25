import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while(executando){

            System.out.println("Bem vindo(a) ao conversor de moedas! Escolha uma das opções abaixo.");
            System.out.println("-------------------------------------------------------------------");

            System.out.println("Selecione a opção de conversão:");
            System.out.println("1) Dolár ==> Peso Argentino");
            System.out.println("2) Peso Argentino ==> Dolár");
            System.out.println("3) Dolár ==> Real Brasileiro");
            System.out.println("4) Real Brasileiro ==> Dolár");
            System.out.println("5) Dolár ==> Peso Colombiano");
            System.out.println("6) Peso Colombiano ==> Dolár");

            String busca = scanner.nextLine();
            String baseCode = "";
            String targetCode = "";

            switch (busca) {
                case "1":
                    baseCode = "USD";
                    targetCode = "ARS";
                    break;
                case "2":
                    baseCode = "ARS";
                    targetCode = "USD";
                    break;
                case "3":
                    baseCode = "USD";
                    targetCode = "BRL";
                    break;
                case "4":
                    baseCode = "BRL";
                    targetCode = "USD";
                    break;
                case "5":
                    baseCode = "USD";
                    targetCode = "COP";
                    break;
                case "6":
                    baseCode = "COP";
                    targetCode = "USD";
                    break;
                case "7":
                    System.out.println("Encerrando o programa...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            if (!executando) {
                break;
            }

            try {
                System.out.println("Digite o valor para conversão:");
                String valor = scanner.nextLine();
                CambioConvertido resultado = ConversorDeMoedas.converterCambio(baseCode, targetCode, valor);
                System.out.println("Valor " + valor + " " + baseCode + " corresponde ao valor final de =>>> "
                        + resultado.conversion_result()
                        + " " + targetCode);
            } catch (IOException | InterruptedException e) {
                System.out.println("Erro ao consultar a API: " + e.getMessage());
            }
        }
    }
}

