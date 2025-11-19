#include<iostream>

 using namespace std;

class Cercle{
private:
    float centre_x;
    float centre_y;
    float rayon;


public:

    Cercle(){
        centre_x=0;
        centre_y=0;
        rayon=0;
    }


    float getCentre_x(){
    return centre_x;

    }
    float getCentre_y(){
    return centre_y;
    }
    float getRayon(){
    return rayon;
    }

    void setCentre_x(float dx){
    centre_x=dx;
    }
    void setCentre_y(float dy){
    centre_y=dy;
    }
    void setRayon(float r){
    rayon=r;
    }
    void Saisie( ){
    cout<<"Donner l'abscisse du centre de votre cercle:"<<endl;
    cin>>centre_x;
    cout<<"Donner l'ordonnee:"<<endl;
    cin>>centre_y;

    cout<<"Donner le rayon du cercle"<<endl;
    cin>>rayon;
    }

    void afficher(){
    cout<<"x="<<centre_x<<endl;
    cout<<"y="<<centre_y<<endl;
    cout<<"Rayon"<<rayon;

    }

    float Surface(){
    return 3.14*rayon*rayon;

    }

    float Circonference(){
    return 2*rayon*3.14;
    }




};



int main(){

    Cercle c;
    c.Saisie();
    c.afficher();
    float S=c.Surface();
    cout<<"la surface de ce cercle est:"<<S<<endl;
    float C=c.Circonference();
    cout<<"la circonference est :"<<C<<endl;


return 0;

}
