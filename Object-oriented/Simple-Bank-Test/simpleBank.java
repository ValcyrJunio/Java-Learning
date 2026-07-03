import java.util.Scanner;

public class simpleBank {
    Scanner scan = new Scanner(System.in);

    String usuario;
    Boolean especial;
    int amount;
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

}
