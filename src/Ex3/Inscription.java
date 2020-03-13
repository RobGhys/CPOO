package Ex3;

import java.util.List;

/**
 * @overview une Inscription est une liste d'élèves participant à un tournoi de tennis.
 * Une Inscription est mutable.
 */
public class Inscription {
    private List<Eleve> elevesInscrits;

    //Constructeurs
    public Inscription(){

    }

    /**
     *
     * @effects initialise this à la List<Eleve> e
     */
    public Inscription (List<Eleve> e){
        this.elevesInscrits = e;
    }

    /**
     * @throws MauvaisAgeException si petitEleve.age < 8 || petitEleve.age > 16, sinon
     * @modifies this
     * @effects ajoute l'Eleve petitEleve à la liste elevesInscrits
     */
    public void inscrireEleve (Eleve petitEleve) throws MauvaisAgeException {
        if( (petitEleve.age < 8) || (petitEleve.age >16) ){
            throw new MauvaisAgeException("Ex3.Inscription.inscrireEleve (Eleve)");
        }
        this.elevesInscrits.add(petitEleve);
    }

    /**
     *
     * @returns true si e n'est pas similaire à l'un des éléments présents dans this.elevesInscrits, false sinon
     */
    public boolean checkNoDoublons(Eleve e){
        int taille = this.elevesInscrits.size();

        for(int i = 0; i < taille; i++){
            if(this.elevesInscrits.get(i).similar(e)){
                return false;
            }
        }
        return true;
    }

    public String toString(){
        int taille = elevesInscrits.size();
        String s = "{ ----------";
        for(int i = 0; i < taille; i++){
            s = s + "\n" + elevesInscrits.get(i).toString();
        }
        return s + "\n---------- }";
    }
}
