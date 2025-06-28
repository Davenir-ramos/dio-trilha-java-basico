import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception  {
        //TODO:Conhecer e importar  a classe Scanner
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
            System.out.println("Ola "+ name+"\nObrigado por criar uma conta em nosso banco,");
            System.out.println("Sua agência é:"+ branchNumber+", Conta:"+ accountNumber + " e seu Saldo R$:"+ accountBalance + " já está disponível para saque.");
            scanner.close();
    }
}
