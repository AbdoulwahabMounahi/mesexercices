public class Element {
    Article A1;
    long Quantite;
    public Element(Article A1,long Quantite){
        this.A1=A1;
        this.Quantite=Quantite;
    }

    public Element(String Nom, double Prix,long Quantite){
        this.A1=new Article(Nom, Prix );
        this.Quantite=Quantite;
    }
     public Article getArticle(){
        return A1;
     }
     public long getQuantite(){
        return Quantite;
     }
     public String getReferenceArticle(String Nom,double Prix){
        return A1.modifier(Nom, Prix);
     }
     public String getNomArticle(){
        return A1.getNom();
     }

     public double getPrixArticle(){
        return A1.getPrix();
     }

     public void setArticle(Article A1){
        this.A1=A1;
     }

     public void setQuantite(long Quantite){
        this.Quantite=Quantite;
     }

     public void incrementerQuantite(long qte){
        this.Quantite+=qte;
     }
     public void decrementerQuantite(long qte){
        this.Quantite-=qte;
     }

     public void modifier(String Nom,double Prix,long quantite){
        Article article=new Article(Nom,Prix);
        this.A1=article;
        this.Quantite=quantite;

     }

     public boolean equals(String ref){
        return A1.getReference().equals(ref);
     }
     public boolean equals(Article A1){
        return A1.getReference().equals(A1.getReference());

     }

     public String toString(){
        return "Element [article=id=<"+A1.getID()+">,nom=<"+A1.getNom()+">, reference=<"+getReferenceArticle(getNomArticle(), getPrixArticle())+">, prix=<"+getPrixArticle()+">, quantite=<"+Quantite+">]";
     }

   }
