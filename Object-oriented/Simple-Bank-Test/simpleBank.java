import java.util.Scanner;

public class simpleBank {
    Scanner scan = new Scanner(System.in);


    String usuario;
    Boolean especial;
    double amount;
    int credit;
    String [] contatos;
    int total;

    void checkAccountBalance(){
        System.out.printf("%s have the amount of $ %d in your account ", usuario, amount);
    }

    void addContactsToList(){
    if (total <= contatos.length){
        System.out.println("Type the contact's name -\n");
        contatos[total] = scan.nextLine();
        System.out.println(contatos[total] + " Added to the list");
        total++;
        } else {
        System.out.println("Contact's list is full");
    }

    }
     void changeAccountsName() {
         usuario = scan.next();
         System.out.println("Account's name changed to " + usuario);

     }
     void showAllContacts(){
        System.out.println("Position -  Name");
        for (int i = 0 ; i < total ; i++ ){
            System.out.printf(" %d - %s \n", i+1, contatos[i]);
        }
    }
    double deposit(double value){
         amount += value;
        System.out.printf("The amount of %.2f successfully deposited to your account \n", value);
        return amount;
    }
    double showFullBalance(){
            return credit + amount;
    }
    double withdraw(double value){
        if (amount >= value) {
            amount -= value;
            System.out.println("The amount of %.2f was successfully withdrew of your count ");
            return amount;
        } else {
            System.out.println("Not enough money");
        }
        return amount;
    }

}
