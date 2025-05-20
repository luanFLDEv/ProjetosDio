import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de cheque especial");
        System.out.println("Cheque especial com valor de:"+limiteChequeEspecial);
        System.out.println("Digite seu saldo em conta");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o valor de saque");
        double saque = scanner.nextDouble();


        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Saque de:"+saque+" realizada com sucesso");
            // TODO: Imprimir "Saque realizada com sucesso."
        } else{
            if(saque<=saldo+limiteChequeEspecial){
                System.out.println("Saque de:"+saque+" realizado com cheque especial");
            }else{
                System.out.println("Não é possivel realizar o saque pois ultrapassa o limite de cheque especial");
            }
            // TODO: Verificar se o saque ultrapassa o limite do cheque especial
            // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
            // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}