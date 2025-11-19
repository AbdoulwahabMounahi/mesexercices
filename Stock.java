import java.util.ArrayList;

public class Stock {
    ArrayList<Element> articleList;

    public Stock() {
        this.articleList = new ArrayList<Element>();
    }

    public Stock(ArrayList<Element> articleList) {
        this.articleList = articleList;
    }

    public Stock(ArrayList<String> nom, ArrayList<Double> prix, ArrayList<Long> quantite) {
        Element E = new Element(nom.get(0), prix.get(0), quantite.get(0));
        this.articleList = new ArrayList<Element>();
        this.articleList.add(E);
    }

    public ArrayList<Element> getArticleList() {
        return articleList;
    }

    public int getArticleNb() {
        return articleList.size();
    }

    public void setArticleList(ArrayList<Element> articleList) {
        this.articleList = articleList;
    }

    public void ajouterArticle(Article A1, long Quantite) {
        Element E = new Element(A1, Quantite);
        this.articleList.add(E);
    }

    public void ajouterArticle(String Nom, double Prix, long Quantite) {
        Element E = new Element(Nom, Prix, Quantite);
        this.articleList.add(E);
    }

    public Element trouverArticle(String ref) {
        for (Element E : articleList) {
            if (E.equals(ref)) {
                return E;
            }
        }
        return null;
    }

    public void modifierArticle(String ref, String Nom, double Prix, long quantite) {
        Element E = trouverArticle(ref);
        if (E != null) {
            E.modifier(Nom, Prix, quantite);
        }
    }

    public void supprimerarticle(String ref) {
        Element E = trouverArticle(ref);
        if (E != null) {
            articleList.remove(E);
        }
    }

    public void incrementerQuantiteArticle(String ref, long qte) {
        Element E = trouverArticle(ref);
        if (E != null) {
            E.incrementerQuantite(qte);
        }
    }

    public void decrementerQuantiteArticle(String ref, long qte) {
        Element E = trouverArticle(ref);
        if (E != null) {
            E.decrementerQuantite(qte);
        }
    }

    public String toString() {
        String sb = "";
        for (int i=0;i<getArticleNb();i++) {
           
             
            sb += getArticleList().get(i).toString() + "\n";
            
        }
        return sb;

        
    }
}