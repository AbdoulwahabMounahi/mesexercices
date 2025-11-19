import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> Reference = new ArrayList<String>();
        ArrayList<String> Nom = new ArrayList<String>();
        ArrayList<Double> Prix = new ArrayList<Double>();
        ArrayList<Long> Quantite = new ArrayList<Long>();
        Reference.add("prelt50");
        Reference.add("EeB21");
        Reference.add("SpNo2");
        Reference.add("Mu8a3");
        Reference.add("Spa4");

        Nom.add("PC Portable Dell vostro 350005");
        Nom.add("Ecouteur JBL T125BT");
        Nom.add("Smartphone INFINIX Hot 10");
        Nom.add("Micro Casque 588Filaire");
        Nom.add("SMARTPHONE NOKIA C1");

        Prix.add(1999.);
        Prix.add(129.0);
        Prix.add(439.0);
        Prix.add(9.900);
        Prix.add(185.0);

        Quantite.add(50L);
        Quantite.add(200L);
        Quantite.add(150L);
        Quantite.add(75L);
        Quantite.add(100L);
        Stock stock = new Stock(Nom, Prix, Quantite);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Soyez les bienvenus !!");
        System.out.println("-0:Gérant");
        System.out.println("-1:Client");
        System.out.println("Qui êtes vous??");
        int a = scanner.nextInt();
        scanner.nextLine();

        if (a == 0) {
            System.out.println("Bienvenue Gérant");
            
        } else if (a == 1) {
            System.out.println("Bienvenue Client");

        } else {
            System.out.println("Choix invalide. Veuillez redémarrer le programme.");
        }

        if (a == 0) {
            System.out.println("0: Ajouter un article");
            System.out.println("1: Augmenter la quantité d’un article");
            System.out.println("2: Modifier un article");
            System.out.println("3: Supprimer un article");
            System.out.println("4: Consulter stock");
            System.out.println("5: Quitter");
            System.out.println("Quelle action voulez-vous effectuer?");
            int choix = scanner.nextInt();

            switch (choix) {
                case 0:
                    System.out.println("Ajouter un article");
                    System.out.print("Nom de l'article: ");
                    String nom = scanner.next();
                    System.out.print("Prix de l'article: ");
                    double prix = scanner.nextDouble();
                    System.out.print("Quantité de l'article: ");
                    long quantite = scanner.nextLong();
                    Stock nv = new Stock();
                    nv.ajouterArticle(nom, prix, quantite);

                    System.out.println("Article ajouté avec succès.");

                    break;
                case 1:
                    System.out.println("Augmenter la quantité d’un article");
                    System.out.print("Référence de l'article: ");
                    String refInc = scanner.next();
                    System.out.print("Quantité à ajouter: ");
                    long qteInc = scanner.nextLong();
                    stock.incrementerQuantiteArticle(refInc, qteInc);
                    System.out.println("Quantité augmentée avec succès.");
                    break;
                case 2:
                    System.out.println("Modifier un article");
                    System.out.print("Référence de l'article: ");
                    String refMod = scanner.next();
                    System.out.print("Nouveau nom de l'article: ");
                    String newNom = scanner.next();
                    System.out.print("Nouveau prix de l'article: ");
                    double newPrix = scanner.nextDouble();
                    System.out.print("Nouvelle quantité de l'article: ");
                    long newQuantite = scanner.nextLong();
                    stock.modifierArticle(refMod, newNom, newPrix, newQuantite);
                    System.out.println("Article modifié avec succès.");
                    break;
                case 3:
                    System.out.println("Supprimer un article");
                    System.out.print("Référence de l'article: ");
                    String refSup = scanner.next();
                    stock.supprimerarticle(refSup);
                    System.out.println("Article supprimé avec succès.");
                    break;
                case 4:
                    System.out.println("Consulter stock");
                    System.out.println(stock.toString());
                    break;
                case 5:
                    System.out.println("Quitter");
                    break;
                default:
                    System.out.println("Choix invalide.");

            }
        }
    }
}
