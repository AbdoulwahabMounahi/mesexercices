#include "voiture.h"
#include<iostream>
#include<string.h>
 using namespace std;

void Voiture::initialise(char * imat, char *color,float p){
    strcpy(immatriculation,imat);
    strcpy(couleur, color);
    poids=p;
}

void Voiture::affiche(void){
  message("Caracteristiques de la voiture");
  cout<<endl<<"Immatriculation:"<<immatriculation<<endl;
  cout<<"Poids:"<<poids<<endl;

}
void Voiture::message(char *msg){
  cout<<msg<<endl;
}

Voiture::Voiture()
//constructeur de la classe Voiture

{
memset(immatriculation,NULL,10); //Initialise


memset(couleur,NULL,20); //Initialise la
couleur poids=0; // Initialise le poids
}
