import java.util.ArrayList;

public class Utilisateur {
    String Nom;
    ArrayList<Post> mesPosts;

    public Utilisateur(String Nom) {
        this.Nom = Nom;
        mesPosts = new ArrayList<Post>();
    }

    public String getNom() {
        return Nom;
    }

    public Post publier(String Contenu) {
        Post P = new Post(getNom(), Contenu);
        mesPosts.add(P);
        return P;
    }

    public ArrayList<Post> getMesPosts() {
        return mesPosts;
    }

    public void afficherMesPosts() {
        for (Post P : mesPosts) {
            System.out.println(P.toString());
        }
    }

    public String toString() {
        Utilisateur U = new Utilisateur(Nom);
        return "Utilisateur:" + U.getNom() + "(" + U.mesPosts.size() + ")";
    }
}
