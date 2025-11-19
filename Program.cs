namespace TP3_ex1;




class Program
{
    static void Main(string[] args)
    {
        Article a = new Article();

        a.Saisir();
        a.Afficher();

        TabArticle T = new TabArticle(5);

        T.Saisir();
        T.Afficher();

        ListArticle L = new ListArticle();
        L.Ajouter(a);
        L.Afficher();
       

      
        


    }
}
