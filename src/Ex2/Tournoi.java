package Ex2;
import Exceptions.NoAdversaireException;

import java.util.ArrayList;

/**
 * @Overview : un Tournoi représente un ensemble de Joueur
 * Un Tournoi est mutable
 * De manière générale, un Tournoi est définit comme {t1, ti, ... , tn}
 * où ti est le ieme Joueur du Tournoi.
 *
 * @IR
 * @Invariant
 */
public class Tournoi {

    private ArrayList<Joueur> list;

    //Constructeurs
    public Tournoi(){

    }

    public Tournoi(ArrayList<Joueur> j) {
        list = j;
    }

    /**
     *
     * @modifies /
     * @return un ensemble de joueur dont le classement correspond à celui fourni en entrée
     * @throws NoAdversaireException s'il n'y a pas d'adversaire
     */
    public ArrayList<Joueur> rechercherAdversaire(String a) throws NoAdversaireException {
        ArrayList<Joueur> listJoueurs = new ArrayList<>();

        for (Joueur j : list) {
            if (j.getClassement().equals(a)){
                System.out.println("J'ai trouvé : " + j.toString());
                listJoueurs.add(j);
            }
        }
        if(listJoueurs.isEmpty()){
            throw new NoAdversaireException("Ex2.Tournoi.rechercherAdversaire(String)");
        }
        return listJoueurs;
    }

    /**
     * @requires b >= 0
     * @modifies joueur
     * @effects  joueur.points_post = b
     */
    public void bonus(Joueur a, int b) {
        a.setPoints(b);
    }
}
