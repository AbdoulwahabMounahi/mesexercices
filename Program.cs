namespace exercice3Tp2;

class Program
{
    static int somme(int a, int b)
    {
        return a + b;
    }
    static void Tableau()
    {
        int taille;
        int sum=0;

        Console.WriteLine("donner la taille du tableau:");
        taille = int.Parse(Console.ReadLine());
        int[] tab = new int[taille];
        for(int i = 0; i < taille; i++)
        {
            Console.WriteLine("donner un entier:");
            tab[i] = int.Parse(Console.ReadLine());
            sum += tab[i];
        }
        Console.WriteLine("la somme des elements du tableau est :"+sum);
    }
    
    static void Main(string[] args)
    {
        Console.WriteLine("donner un entier :");
        int a = int.Parse(Console.ReadLine());
        Console.WriteLine("donner un autre entier :");
        int b = int.Parse(Console.ReadLine());
        int resultat=somme(a,b);
        Console.WriteLine("la somme est :" + resultat);
        
        Tableau();

      

    }
}
