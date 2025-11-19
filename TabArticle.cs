class TabArticle
{
    int nbArticle;
    Article[] LesArticles;

    public TabArticle(int N)
    {
        nbArticle = N;
        LesArticles = new Article[N];

        for(int i = 0; i < nbArticle; i++)
        {
            LesArticles[i] = new Article();
        }




    }
    public void Saisir()
    {
       
        Console.WriteLine("Donner la taile du tableau d'article:");
        nbArticle = int.Parse(Console.ReadLine());

        for(int i = 0; i < nbArticle; i++)
        {
            LesArticles[i].Saisir(); 
        }
        
           
        

    }
    
    public void Afficher()
    {
         
          for(int i = 0; i < nbArticle; i++)
        {
            LesArticles[i].Afficher(); 
        }
       
    }


}