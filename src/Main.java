import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Générer un nombre aléatoire entre 1 et 100
        Random random = new Random();
        int nombreSecret = random.nextInt(100) + 1;

        // Créer le scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        int nombreEssais = 10; // Nombre maximum d'essais
        boolean aGagne = false;

        System.out.println("=== Jeu de Devinettes ===");
        System.out.println("Devinez un nombre entre 1 et 100 !");
        System.out.println("Vous avez " + nombreEssais + " essais.");

        // Boucle principale du jeu
        for (int essai = 1; essai <= nombreEssais; essai++) {

            System.out.println("\nEssai " + essai + "/" + nombreEssais);
            System.out.print("Votre nombre : ");

            // Lire l'entrée de l'utilisateur
            int devine = scanner.nextInt();

            // Comparer avec le nombre secret
            if (devine < nombreSecret) {
                System.out.println("Trop petit ! Essayez plus grand.");
            } else if (devine > nombreSecret) {
                System.out.println("Trop grand ! Essayez plus petit.");
            } else {
                // L'utilisateur a trouvé le bon nombre
                System.out.println("🎉 Bravo ! Vous avez gagné en " + essai + " essai(s) !");
                aGagne = true;
                break; // Fin de la boucle
            }
        }

        // Si l'utilisateur n'a pas trouvé après 10 essais
        if (!aGagne) {
            System.out.println("\n😢 Vous avez perdu ! Le nombre secret était : " + nombreSecret);
        }

        scanner.close();
    }
}