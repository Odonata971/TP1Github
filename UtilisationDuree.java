/*
 * UtilisationDuree.java
 */

package lesdurees;

import java.util.Scanner;

/**
 * Utilisation des méthodes traitant les durées
 */
/**
 * @author flori
 *
 */
/**
 * @author flori
 *
 */
public class UtilisationDuree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testChaine();
    }
    
    

    /**
     * Teste les données pour voir si elles sont différentes
     * les unes des autres ou non
     * Renvoie le nombre de données différentes dans les 
     * 3 durées saisies
     */
    public static void testDifferente() {
        int[] d1; // première durée
        int[] d2; // deuxième durée
        int[] d3; // troisième

        d1 = DureeHMS.saisirDuree("Saisie de la première durée : ");
        d2 = DureeHMS.saisirDuree("Saisie de la deuxième durée : ");
        d3 = DureeHMS.saisirDuree("Saisie de la troisième durée : ");

        System.out.println("Parmi ces 3 durées, "
                + DureeHMS.combienDifferentes(d1, d2, d3) + " sont différentes.");

    }
    
    
    /**
     * Teste l'ordre des données entrées
     * Renvoie si les données sont dans l'ordre ou non
     */
    public static void testOrdre() {
        int[] d1; // première durée
        int[] d2; // deuxième durée
        int[] d3; // troisième

        d1 = DureeHMS.saisirDuree("Saisie de la première durée : ");
        d2 = DureeHMS.saisirDuree("Saisie de la deuxième durée : ");
        d3 = DureeHMS.saisirDuree("Saisie de la troisième durée : ");

        System.out.println("ces 3 durées sont "
                + (DureeHMS.ordre(d1, d2, d3) ? " ordonnées " : " dans le désordre"));

    }

  

    /**
     * Test la chaîne,
     * Si celle-ci est une durée, alors cela renvoie OK !!
     * Sinon elle renvoie ERREUR !!!
     */
    public static void testChaine() {
        Scanner entree = new Scanner(System.in);
        String phrase;
        System.out.print("Vous allez entrer une chaine et le programme vérifiera"
        				 + " si elle est bien dans le format hh:mm:ss."
        				 + "\nLe separateur ':' peut etre remplace par n'importe"
        				 + " quel caractere.\n\t==>");
        phrase = entree.nextLine();
        if (DureeHMS.estChaineDuree(phrase)) {
            System.out.printf("La chaine %s respecte bien le format hh:mm:ss.",phrase);
        } else {
            System.out.println("ERREUR !!!");
        }
    }
}