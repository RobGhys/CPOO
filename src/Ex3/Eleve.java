package Ex3;

/**
 * @Overview un Eleve est un élève complètement représenté par le tuple {nom, prenom, sexe, age}
 * Un Eleve est mutable
 */
public class Eleve {
    String nom;
    String prenom;
    boolean sexe; // true = homme; false = femme.
    int age;

    //Constructeurs
    public Eleve(){

    }

    public Eleve(String n, String p, boolean s, int a) {
        nom = n;
        prenom = p;
        sexe = s;
        age = a;
    }

    /**
     * requires e != null
     * @returns true si this est similaire à e, false sinon
     */
    public boolean equals(Eleve e){
        if(! (this.nom.equals(e.nom))){
            return false;
        }
        if(! (this.prenom.equals(e.prenom))){
            return false;
        }
        if(! (this.sexe == e.sexe)){
            return false;
        }
        if(! (this.age == e.age)){
            return false;
        }
        return true;
    }

    public String toString() {
        String s = "";
        if(sexe == true){
            s = "garçon";
        }
        else{
            s = "fille";
        }
        return "Eleve : " + prenom + " " + nom + " (" + s + " , " + age + " ans)";
    }
}
