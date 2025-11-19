public class Article{
    static int ID=0;
    String Nom;
    String Reference;
    double Prix;


    public Article(String Nom,double Prix){
        this.Nom=Nom;
        this.Prix =Prix;
    }


    public  int getID(){
        
        return ID++;
    }

    public String getReference(){
        return Reference;
    }

    public String getNom(){
        return Nom;
    }

    public double getPrix(){
        return Prix;
    }


    
    public void setReference(String Reference){
        this.Reference=Reference;
    }

    public void setNom(String Nom){
        this.Nom=Nom;
    }

    public void setPrix(double Prix){
        this.Prix=Prix;
    }

    public String modifier(String Nom,int ID){
        StringBuilder Name=new StringBuilder();

        for(int i=0;i<Nom.length();i++){
             if(Nom.charAt(i)!=' ' &&i%5==0){
                Name.append(Nom.charAt(i));
             }

        }
        Name.append(ID);

        return Name.toString();

        

    }

    public String  modifier(String Nom,double Prix){
           return modifier(Nom, ID);
    }

    public String toString(){
        Reference=modifier(Nom, Prix);
        return "id= <"+ID+">, nom= <"+Nom+">, reference= <"+Reference+">, prix= <"+Prix+">";
    }




    public static void main(String[] args){
        Article A1=new Article("manette",1500);
        
        
        System.out.println(A1.toString());
    }
}