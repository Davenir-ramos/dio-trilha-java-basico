import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)   {

        //TODO: Importar a classe Scanner para ler dados do teclado
            Scanner scanner = new Scanner (System.in);

        // Exibir as mensagens para o novo usuário
            System.out.println("\nSeja Bem Vindo!");

        // Obter pela scanner os valores digitados no terminal
            System.out.println("Por favor, digite seu  nome");
            String  name = scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência");
            String branchNumber = scanner.next();

            System.out.println("Por favor, digite o número da Conta");
            int accountNumber = scanner.nextInt();

            double accountBalance = 100.50;

        // Exibir a mensagem conta criada
            System.out.printf("Olá %s,\nObrigado por criar uma conta em nosso banco,", name);
            System.out.printf("\nSua agência é %s, Conta %d e seu Saldo R$ %.2f  já está disponível para saque.", branchNumber, accountNumber, accountBalance);
        
        //Fecha o scanner
            scanner.close();
    }
}
