import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TechStore {
    public static String genererReference(String nomProduit, int id) {
        StringBuilder reference = new StringBuilder();

        // Parcours du nom du produit
        for (int i = 0; i < nomProduit.length(); i++) {
            // Si l'indice est divisible par 5 et que le caractère n'est pas un espace
            if (i % 5 == 0 && nomProduit.charAt(i) != ' ') {
                reference.append(nomProduit.charAt(i));
            }
        }
        // Ajout de l'ID à la fin de la référence
        reference.append(id);

        // Retourne la référence en majuscules
        return reference.toString().toUpperCase();
    }

    public void ajouterArticle(ArrayList<String> NomA, ArrayList<Double> PrixA, ArrayList<Integer> IDa,
            ArrayList<String> ReferenceA) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder referenceArticle = new StringBuilder();
        System.out.println("Donner le nom de l'article à ajouter:");
        String nom = scanner.nextLine();
        System.out.println("Donner l'ID de l'article à ajouter:");
        int idArticle = scanner.nextInt();
        System.out.println("Donner le prix de l'article à ajouter:");
        double prix = scanner.nextDouble();

        referenceArticle.append(genererReference(nom, idArticle));
        ReferenceA.add(referenceArticle.toString());
        NomA.add(nom);
        PrixA.add(prix);
        IDa.add(idArticle);
        System.out.println("L'article a été ajouté avec succès avec la référence: " + referenceArticle.toString());
    }

    public void modifierArticle(ArrayList<String> RefA, ArrayList<Double> PrixA) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner la référence de l'article à modifier:");
        String refA = scanner.nextLine();
        System.out.println("Donner le nouveau prix de l'article:");
        double newPrice = scanner.nextDouble();
        for (int i = 0; i < RefA.size(); i++) {
            if (RefA.get(i).equals(refA)) {
                PrixA.set(i, newPrice);
                System.out.println("Le prix de l'article avec la référence " + refA + " a été modifié à " + newPrice);
                return;
            }
        }
    }

    public void affichageCroissant(ArrayList<Integer> IDa, ArrayList<String> refa, ArrayList<String> NomA,
            ArrayList<Double> PrixA) {

        PrixA.sort((a, b) -> Double.compare(a, b));
        for (int i = 0; i < PrixA.size(); i++) {
            int index = PrixA.indexOf(PrixA.get(i));
            System.out
                    .println("ID: " + IDa.get(index) + " | Référence: " + refa.get(index) + " | Nom: " + NomA.get(index)
                            + " | Prix: " + PrixA.get(index) + " FCFA");
        }
    }

    public void affichageDecroissant(ArrayList<Integer> IDa, ArrayList<String> refa, ArrayList<String> NomA,
            ArrayList<Double> PrixA) {

        PrixA.sort((a, b) -> b.compareTo(a));
        for (int i = 0; i < PrixA.size(); i++) {
            int index = PrixA.indexOf(PrixA.get(i));
            System.out
                    .println("ID: " + IDa.get(index) + " | Référence: " + refa.get(index) + " | Nom: " + NomA.get(index)
                            + " | Prix: " + PrixA.get(index) + " FCFA");
        }
    }

    public void supprimerArticle(ArrayList<String> RefA, ArrayList<Double> PrixA, ArrayList<String> NomA,
            ArrayList<Integer> IDa) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner la référence de l'article à supprimer:");
        String refA = scanner.nextLine();
        for (int i = 0; i < RefA.size(); i++) {
            if (RefA.get(i).equals(refA)) {
                RefA.remove(i);
                PrixA.remove(i);
                NomA.remove(i);
                IDa.remove(i);
                System.out.println("L'article avec la référence " + refA + " a été supprimé.");
                
                return;

            }
            
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soyez les bienvenus !!");
        System.out.println("-0:Gérant");
        System.out.println("-1:Client");
        System.out.println("Qui êtes vous??");
        int a = scanner.nextInt();
        scanner.nextLine();

        TechStore g = new TechStore();

        ArrayList<Integer> ID = new ArrayList<Integer>();
        ArrayList<String> Reference = new ArrayList<String>();
        ArrayList<String> Nom = new ArrayList<String>();
        ArrayList<Double> Prix = new ArrayList<Double>();
        for (int i = 0; i < 5; i++) {
            ID.add(i);
        }
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

        if (a == 0) {

            System.out.println("-0:Ajouter un article");
            System.out.println("-1:Modifier un article");
            System.out.println("-2:Consulter les articles");
            System.out.println("-3:Supprimer un article");

        } else if (a == 1) {
            System.out.println("Bonjour cher/Chere Client(e)");
        } else {
            System.out.println("Cette action n'est pas autorisée");
        }

        if (a == 0) {
            System.out.println("Quelle action voulez-vous effectuer?");
            int choix = scanner.nextInt();
            switch (choix) {
                case 0:
                    // Ajouter un article
                    g.ajouterArticle(Nom, Prix, ID, Reference);
                    break;

                case 1:
                    // Modifier un article
                    g.modifierArticle(Reference, Prix);
                    break;
                case 2:
                    // Consulter les articles
                    g.affichageCroissant(ID, Reference, Nom, Prix);
                    break;
                case 3:
                    // Supprimer un article
                    g.supprimerArticle(Reference, Prix, Nom, ID);
                    break;

            }
        }

        scanner.close();

    }
}
