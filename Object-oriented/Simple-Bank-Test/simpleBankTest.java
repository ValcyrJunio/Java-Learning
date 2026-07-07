import java.util.Scanner;

public class simpleBankTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        simpleBank conta = new simpleBank();
        int option = 0;
        double value;
        conta.amount = 0;
        conta.usuario = "";
        conta.contatos = new String[5];

        while (option != 7) {
            System.out.println("Select a option -- \n 1 - Change account name \n 2 - Deposit \n 3 - Insert a name to contatos list " +
                    "\n 4 - Check the account balance \n 5- See contacts list \n 6 - Withdraw \n 7 - leave");

            option = scan.nextInt();

            switch (option) {

                case 1:
                    conta.changeAccountsName();
                    break;

                case 2:
                    System.out.println("Type the value to deposit");
                    value = scan.nextDouble();
                    conta.deposit(value);
                    break;
                case 3:
                    conta.addContactsToList();
                    break;
                case 4:
                    conta.checkAccountBalance();
                    break;
                case 5:
                    conta.showAllContacts();
                    break;
                case 6:
                    System.out.println("Type the value to withdraw");
                    value = scan.nextDouble();
                    conta.withdraw(value);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }
}
