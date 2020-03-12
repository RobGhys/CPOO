package Ex2;
import Exceptions.NoAdversaireException;

import java.util.ArrayList;

public class Main {
    public static void main( String[] args) {
        ArrayList<Joueur> lists = new ArrayList<Joueur>();

        Joueur j1 = new Joueur("C2","Germain",0);
        Joueur j2 = new Joueur("C2","Thibaut",0);
        Joueur j3 = new Joueur("D4","Celine",0);
        Joueur j4 = new Joueur("D4","Antoine",0);
        Joueur j5 = new Joueur("C6","Gauthier",0);
        Joueur j6 = new Joueur("E2","Tom",0);
        Joueur j7 = new Joueur("E0","Emilie",0);
        Joueur j8 = new Joueur("E0","Laurent",0);

        lists.add(j1);
        lists.add(j2);
        lists.add(j3);
        lists.add(j4);
        lists.add(j5);
        lists.add(j6);
        lists.add(j7);
        lists.add(j8);

        Tournoi t = new Tournoi(lists);

        try {
            ArrayList<Joueur> adv = t.rechercherAdversaire("D4");

            for (Joueur j : adv) {
                t.bonus(j, 10);
                System.out.println(j.toString() + "\n");
            }
        }
        catch (NoAdversaireException e){
            e.printStackTrace();
        }

        //Test erreur : pas d'adversaire
        System.out.println("\n------------------------------------");

        Tournoi t2 = new Tournoi(lists);
        try {
            ArrayList<Joueur> adversaire2 = t2.rechercherAdversaire("D7");

            for (Joueur i : adversaire2) {
                t2.bonus(i, 10);
                System.out.println(i.toString() + "\n");
            }
        }
        catch (NoAdversaireException e){
            e.printStackTrace();
        }
    }
}
