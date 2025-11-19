using System.Collections.Generic;
using System.IO.Compression;
class ListArticle
{
    List<Article> LesArticles;

    public ListArticle()
    {
        LesArticles=new List<Article>();
    }
    public void Ajouter(Article article)
    {
        LesArticles.Add(article);
    }

    public void Supprimer(Article article)
    {
        LesArticles.Remove(article);
    }
    
    public void Afficher()
    {
        foreach(Article A in LesArticles)
        {
            A.Afficher();
        }
    }

}