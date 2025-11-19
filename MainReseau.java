import java.util.Scanner;

public class MainReseau {
    public static void main(String[] args) {

        System.out.println("Bienvenue dans le  mini réseau social !");
        ReseauSocial R = new ReseauSocial();

        System.out.println("1.Ajouter un utilisateur:");
        System.out.println("2.Afficher la fil d'actualite:");
        System.out.println("3.Publier un Post:");
        System.out.println("4.Liker un post:");
        System.out.println("5.Voir mes posts:");
        System.out.println("6.Afficher les utilisateurs:");
        System.out.println("7.Supprimer un utilisateur:");
        System.out.println("8.Quitter:");

       
        Utilisateur U1=R.ajouterUtilisateur("Abdoul-wahab");
        Utilisateur U2=new Utilisateur("Ali");
        U2=R.ajouterUtilisateur("Ali");
        
        R.PublierPost("Abdoul-wahab","je suis content d'etre ici");
            R.PublierPost("Ali","Bonjour tout le monde");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer votre choix:");

        int choix = scanner.nextInt();

        
            switch (choix) {
                case 1:
                    System.out.println("Entrez le nom de l'utilisateur:");
                    String nomUtilisateur = scanner.next();
                    R.ajouterUtilisateur(nomUtilisateur);
                    System.out.println("Utilisateur ajouté avec succès.");

                    break;

                case 2:
                    R.afficherFil();

                    break;
                case 3:
                    System.out.println("Entrez le nom de l'utilisateur:");
                    String nomUtilisateurPost = scanner.next();
                    System.out.println("Entrez le contenu du post:");
                    String contenuPost = scanner.next();
                    R.PublierPost(nomUtilisateurPost, contenuPost);
                    System.out.println("Post publié avec succès.");

                    break;
                case 4:
                    System.out.println("Entrez l'ID du post à liker:");
                    int idPost = scanner.nextInt();
                    R.LikerPost(idPost);
                    System.out.println("Post liké avec succès.");

                    break;
                case 5:
                    System.out.println("Entrez le nom de l'utilisateur:");
                    String nomUtilisateurVoirPosts = scanner.next();
                    Utilisateur U = R.chercherUtilisateur(nomUtilisateurVoirPosts);
                    if (U != null) {
                        U.afficherMesPosts();
                    } else {
                        System.out.println("Utilisateur non trouvé.");
                    }

                    break;
                case 6:
                    R.afficherUtilisateurs();

                    break;
                case 7:
                    System.out.println("Entrez le nom de l'utilisateur à supprimer:");
                    String nomUtilisateurSupprimer = scanner.next();
                    boolean supprime = R.SupprimerUtilisateur(nomUtilisateurSupprimer);
                    if (supprime) {
                        System.out.println("Utilisateur supprimé avec succès.");
                    } else {
                        System.out.println("Utilisateur non trouvé.");
                    }

                    break;
                case 8:
                    System.out.println("Quitter le programme. Au revoir!");
                    break;

                default:
                    break;
            }

        }

    }


