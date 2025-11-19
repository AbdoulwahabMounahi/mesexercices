public class Post{
int Id;
static int NextId=0;
String Contenu;
int Likes;
String Auteur;

public Post(String Contenu,String Auteur){
    this.Contenu=Contenu;
    this.Auteur=Auteur;
    this.Id=NextId++;
    this.Likes=0;
}

public int  getId(){
    return Id;
}
public String getAuteur(){
    return Auteur;
}
public String getContenu(){
    return Contenu;
}
public int getLikes(){
    return Likes;
}

public int Liker(){
    return Likes++;
}

public String toString(){
    return "Post #"+getId()+" par "+getAuteur()+":"+getContenu()+" "+getLikes()+" Likes";
}

public static void main(String[] args){
    Post P=new Post("je suis Abdoul je vous salue","Abdoul-wahab");
    Post P1=new Post("je suis nigerien ","Ali");

    System.out.println(P.toString());
    System.out.println(P1.toString());
}


}
