import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // afficher un message de bienvenue
        System.out.println("Bienvenue à la GBA, que souhaitez-vous faire ?");

        // créer un objet Comptecourant
        CompteCourant gravenMoney = new CompteCourant("Graven", 12000);
        gravenMoney.afficherSolde();
        gravenMoney.deposerArgent(300);
        gravenMoney.afficherSolde();
        gravenMoney.retirerArgent(13000);
        gravenMoney.afficherSolde();

    }

}
