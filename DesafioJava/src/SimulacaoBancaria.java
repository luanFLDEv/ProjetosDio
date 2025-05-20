import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
// CODIGO DE OUTRA MANEIRA MAIS BONITA
//import java.util.Scanner;
//
//public class SimulacaoBancaria {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double saldo = 0;
//        boolean continuar = true;
//
//        while (continuar) {
//            System.out.println("Ola senhor(a), qual opção deseja executar no seu banco?");
//            System.out.println("1-DEPOSITO");
//            System.out.println("2-SAQUE");
//            System.out.println("3-CONSULTAR SALDO");
//            System.out.println("0-ENCERRAR ");
//            int opcao = scanner.nextInt();
//
//            switch (opcao) {
//                case 1:
//                    System.out.println("Qual valor deseja depoistar?");
//                    double valordeposito=scanner.nextDouble();
//                    saldo=saldo+valordeposito;
//                    System.out.println("depoisto feito com sucesso,saldo atual R$:"+saldo);
//                    break;
//                case 2:
//                    System.out.println("Qual valor do saque?");
//                    double saque=scanner.nextDouble();
//                    if(saque>saldo){
//                        System.out.println("O valor de saque é maior que o saldo da conta");
//                    }else{
//                        saldo=saldo-saque;
//                        System.out.println("Saque de "+ saque+" realizado com sucesso,saldo atual R$:"+saldo);
//                    }
//                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
//                    break;
//                case 3:
//                    System.out.println("Saldo em conta "+saldo);
//                    // TODO: Exibir o saldo atual da conta.
//                    break;
//                case 0:
//                    System.out.println("Programa encerrado.");
//                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
//                    break;
//                default:
//                    System.out.println("Opção inválida. Tente novamente.");
//            }
//        }
//        scanner.close();
//    }
//}
