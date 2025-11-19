
class Article
{
    int Reference;
    string Designation;
    float Prix;

    public Article()
    {
        this.Reference = Reference;
        this.Designation = Designation;
        this.Prix = Prix;
    }

    public Article(int Reference, string Designation, float Prix)
    {
        this.Reference = Reference;
        this.Designation = Designation;
        this.Prix = Prix;
    }

    public void Saisir()
    {
        Console.WriteLine("Donner la reference d'un article:");
        Reference = int.Parse(Console.ReadLine());
        Console.WriteLine("Donner la Designation:");
        Designation = Console.ReadLine();
        Console.WriteLine("Donner le prix:");
        Prix = float.Parse(Console.ReadLine());

    }
    
    public void Afficher()
    {
        Console.WriteLine($" reference={Reference} --designation={Designation} --prix={Prix}");
    }
}