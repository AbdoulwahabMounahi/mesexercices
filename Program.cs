

namespace Exercice4tp2;

class Program
{
    static void Main(string[] args)
    {
        string str = "  C# programming 2024 or Csharp programming 2024  ";
        Console.WriteLine("la taille de cette chaine est :" + str.Length);
        Console.WriteLine("la position de la premiere occurence de C est :" + str.IndexOf('C'));
        Console.WriteLine("la position de la derniere occurence de C est :" + str.LastIndexOf('C'));
        Console.WriteLine("la chaine sans espace de debut et de fin est :" + str.Trim());
        string str1 = str.Trim().Substring(0, 2);
        Console.WriteLine("les deux premiers caracteres de la chaine sont :" + str1);

        int cpt;
        cpt = 0;
        foreach (char c in str)
        {
            if (char.IsDigit(c))
            {
                cpt++;

            }

        }
         Console.WriteLine("les chiffres presents dans la chaine sont :" + cpt);

    }
}
