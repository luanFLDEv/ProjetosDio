//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//public class VerificadorNumeroConta {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vamos realizar a verificacao da sua conta");
//        System.out.println("Digite o numero da sua conta");
//        try {
//            String numeroConta = scanner.nextLine();
//            // TODO: Chamar o método que veritica se o número da conta é valido
//            verificarNumeroConta(numeroConta);
//            // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
//            System.out.println("Conta verificada com sucesso");
//        } catch (IllegalArgumentException e) {
//            // TODO: Informar que o número de conta é inválido e exibir a mensagem de erro
//            System.out.println("Erro: " + e.getMessage());
//        } finally {
//            // Fechar o scanner para evitar vazamentos de recursos
//            scanner.close();
//        }
//    }
//
//    private static void verificarNumeroConta(String numeroConta) {
//        if (numeroConta.length() != 8) {
//            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
//            // TODO: Lançar uma IllegalArgumentException com a seguinte mensagem:
//            // "Numero de conta invalido. Digite exatamente 8 digitos."
//        }
//    }
//}