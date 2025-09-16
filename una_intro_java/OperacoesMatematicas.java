public class OperacoesMatematicas {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = scanner.nextInt();

        int subtracao = num1 - num2;
        System.out.println("O resultado da subtração do primeiro numero pelo sugundo é:" + subtracao);

        int multiplicacao = num1 * num2;
        System.out.println("O resultado da multiplicação dos dois números é:" + multiplicacao);

        if (num2 != 0){
            double divisao = (double) num1 / num2;
            System.out.println("O resultado da divisão do primeiro número pelo segundo é: " + divisao);
        } else {
            System.out.println("Não é possível dividir por zero.");
        } 
        scanner.close(); 
        }
}
