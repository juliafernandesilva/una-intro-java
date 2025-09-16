
public class DadosPessoais {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

       
        System.out.println("Digite seu nome completo:");
        
       
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        
       
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura (ex: 1.75):");
        
        
        double altura = scanner.nextDouble();

        System.out.println("---------------------------");
        System.out.println("Dados informados:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("---------------------------");

        scanner.close();
    }
}