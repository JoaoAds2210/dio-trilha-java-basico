import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = sc.nextDouble();
        sc.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Conta criada com sucesso!");

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    
    
    sc.close();
    }
}
