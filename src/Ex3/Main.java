package Ex3;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws MauvaisAgeException {
        //Création de Eleve
        String nomEleve1 = "Dupont";
        String prenomEleve1 = new String("Albert");
        boolean sexeEleve1 = true;
        int ageEleve1 = 15;
        Eleve ecolier1 = new Eleve(nomEleve1, prenomEleve1, sexeEleve1, ageEleve1);

        //Création de Eleve
        Eleve ecolier2 = new Eleve("Fili", "Robin", false, 12);
        Eleve ecolier3 = new Eleve("Gates", "Bill", true, 14);

        //Création de Inscription
        ArrayList<Eleve> gosses = new ArrayList();
        gosses.add(ecolier1);
        gosses.add(ecolier2);
        gosses.add(ecolier3);
        Inscription stage = new Inscription(gosses);

        //Ajout de nouv eleves
        Eleve ecolier4 = new Eleve("Hazard", "Caroline", false, 19);
        Eleve ecolier5 = new Eleve("Haaaa", "Dolf", true, 1);

        try {
            stage.inscrireEleve(ecolier4);
            stage.inscrireEleve(ecolier5);
        }
        catch(MauvaisAgeException e){
            e.printStackTrace();
        }
        //Affichage des élèves
        System.out.println("\n" + stage.toString());

        //Test similaire
        Eleve ecolierTest = new Eleve("Hazard", "Caroline", false, 19);
        System.out.println("Similaire ? " + ecolierTest.equals(ecolier4));
        Eleve ecolierTest2 = new Eleve("Ga", "Caroline", false, 19);
        System.out.println("Similaire ? " + ecolierTest.equals(ecolierTest2));

    }


}
