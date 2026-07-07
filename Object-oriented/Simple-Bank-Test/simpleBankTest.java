import java.util.Scanner;

public class simpleBankTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        simpleBank conta = new simpleBank();
        int option = 0;

        conta.credit = 1200;
        conta.amount = 0;
        conta.usuario = "";
        conta.contatos = new String[5];

        while (option != 7) {
            System.out.println("Select a option -- \n 1 - Change account name \n 2 - Change the money amount \n 3 - Insert a name to contatos list " +
                    "\n 4 - Check the account balance \n 5- See contacts list \n 6 - Show full balance (credit + balance) \n 7 - leave");

            option = scan.nextInt();

            switch (option) {

                case 1:
                    conta.changeAccountsName();
                    break;

                case 2:
                    System.out.println("Type the value to the account balance");
                    conta.amount = scan.nextInt();
                    System.out.println("Now you account balance is $ "+conta.amount);
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
                    System.out.println(conta.showFullBalance());
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }
}
