#ifndef VOITURE_H_INCLUDED
#define VOITURE_H_INCLUDED
class Voiture
{
    public:
    Voiture();
    void initialise(char *,char *,float);
    void affiche(void);

    private:
        char immatriculation[10];
        char couleur[20];
        float poids;
        void message(char *);

};


#endif // VOITURE_H_INCLUDED
