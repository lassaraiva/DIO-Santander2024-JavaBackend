import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Informe sua agência (000-0): ");
        String agencia = scanner.nextLine();
        
        System.out.print("Informe o número de sua conta: ");
        Integer numero = scanner.nextInt();
     
        System.out.print("Informe seu saldo(00.00): ");
        String saldo = scanner.next();
        Double.parseDouble(saldo);
        scanner.close();
        
        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque!");
        
    }
}