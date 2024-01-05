import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // afficher un message de bienvenue
        System.out.println("Welcome to the GBA, what do you want to do?");

        // créer un objet Comptecourant
        CompteCourant flavienMoney = new CompteCourant("Flavien", 12000);
        FlavienMoney.afficherSolde();
        FlavienMoney.deposerArgent(300);
        FlavienMoney.afficherSolde();
        FlavienMoney.retirerArgent(13000);
        FlavienMoney.afficherSolde();

    }

}
