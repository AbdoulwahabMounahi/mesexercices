import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReseauSocial {
    ArrayList<Utilisateur> utilisateurs;
    ArrayList<Post>TousLesPosts;

    public ReseauSocial() {
        utilisateurs = new ArrayList<Utilisateur>();
        TousLesPosts = new ArrayList<Post>();
    }

    public Utilisateur ajouterUtilisateur(String Nom){
        Utilisateur U= new Utilisateur(Nom);
        utilisateurs.add(U);
        return U;
    }

    public Utilisateur chercherUtilisateur(String Nom){
        for(Utilisateur U:utilisateurs){
            if(U.getNom().equals(Nom)){
                return U;
            }
        }
        return null;
    }
    public void PublierPost(String NomUtilisateur,String Contenu){
        Utilisateur U=chercherUtilisateur(NomUtilisateur);
        if(U!=null){
            Post P=U.publier(Contenu);
            TousLesPosts.add(P);
        }
    }
    public void afficherFil(){
        for(Post P:TousLesPosts){
            System.out.println(P.toString());
        }
    }
    public void LikerPost(int IdPost){
        for(Post P:TousLesPosts){
            if(P.getId()==IdPost){
                P.Liker();
                
            }
        }
    }
    public void afficherUtilisateurs(){
        for(Utilisateur U:utilisateurs){
            System.out.println(U.toString());
        }
    }
    public boolean SupprimerUtilisateur(String Nom){
        Utilisateur U=chercherUtilisateur(Nom);
        if(U!=null){
            utilisateurs.remove(U);
            return true;
        }
        return false;
    }



    
}
