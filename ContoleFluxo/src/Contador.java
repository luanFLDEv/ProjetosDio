import java.util.Scanner;

public class Contador {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos executar um controle de fluxo,passe dois numero, imremos imprimir de um até outro e contar quantos numeros foram impressoes");
        System.out.println("Primeiro numero");
        int num1 = scanner.nextInt();

        System.out.println("Segundo numero");
        int num2 = scanner.nextInt();

        System.out.println("Vamos realizar a contagem");

        try{
            contar(num1,num2);
        }catch (ParametrosInvalidosExeption exeptions) {
            System.out.println("O segundo numero deve ser maior que o primerio");
        }

        }
    public static void  contar(int num1,int num2) throws ParametrosInvalidosExeption {
        if(num2<=num1){
            throw new ParametrosInvalidosExeption();
        }
        int contagem=(num2-num1);
        for(int i=num1;i<=num2;i++){
            System.out.println(i);
        }
        System.out.println("Contagem por um total de "+contagem+" numeros");
    }
}