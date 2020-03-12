package Ex2;

/**
 * @overview Joueur participant à un tournoi est complètement spécifié par le triplet {classement, nom, points}
 * un Joueur est mutable
 * @invariant points >= 0
 */
public class Joueur {
    private String classement;
    private String nom;
    private int points;

    public Joueur(String c, String n, int p) {
        classement = c;
        nom = n;
        points = p;
    }

    /**
     *
     * @returns this.classement
     */
    public String getClassement() {
        return classement;
    }

    /**
     *
     * @returns un String contenant le nom du joueur, son classement, et ses points
     */
    public String toString() {
        return "nom : " + nom + ", classé : " + classement + " avec : " + points + "points";
    }

    /**
     *
     * @modifies this.points
     * @effects this.points_post = p
     */
    public void setPoints(int p) {
        points = p;
    }
}