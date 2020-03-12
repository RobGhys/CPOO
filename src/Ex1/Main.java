package Ex1;

import Exceptions.NegativeArgumentException;
import Exceptions.NotFoundException;
import Exceptions.NotSortedException;

public class Main {
    public static void main (String args[]) throws NotFoundException, NotSortedException {
        System.out.println("Coucou et bienvenue dans ce TP 4 de CPOO\n----------------------------");

        //Test exception méthode greatest
        int[] tabTest = null;
        try{
            System.out.println("Max du tab1 : " + Num.greatest(tabTest));
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        int[] tabTest2 = {2,5,6,9,871,11};
        try{
            System.out.println("Max du tab2 : " + Num.greatest(tabTest2));
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }

        //Test exception méthode sum
        try{
            System.out.println("Sum tab 1 : " + Num.sum(tabTest));
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }

        //Test exception isPrime
        int nbr1 = 7;
        int nbr2 = -20;
        int nbr3 = 4;
        try{
            System.out.println("Is prime : " + nbr1 + " ? -> " + Num.isPrime(nbr1));
            //System.out.println("Is prime : " + nbr2 + " ? -> " + Ex1.Num.isPrime(nbr2));
            System.out.println("Is prime : " + nbr3 + " ? -> " + Num.isPrime(nbr3));
        }
        catch (NegativeArgumentException e){
            e.printStackTrace();
        }

        //Test combine
        int[] tabTest3 = {3,8,9,12};
        try{
            Num.combine(tabTest3, tabTest2);
            System.out.println("Combine tabTest3 + tabTest2 : ");
            Num.afficheElements(tabTest3);
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }

        try{
            Num.combine(tabTest3, tabTest);
            System.out.println("Combine tabTest3 + tabTest : ");
            Num.afficheElements(tabTest3);
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }

        //Test exception search
        int[] tabTrie = {1,2,3,4,5};
        int[] tabNonTrie = {2,1,4,8,3};
        int valSeek = 3;
        int valSeek2 = 8;
        try{
            System.out.println("Valeur " + valSeek + " présente ? -> " + Num.search(tabTrie, valSeek));
        }
        catch (NullPointerException | NotFoundException | NotSortedException e){
            e.printStackTrace();
        }

        //Test avec un tableau trié
        //Doit produire une erreur de Not found
        try{
            System.out.println("Valeur " + valSeek2 + " présente ? -> " + Num.search(tabTrie, valSeek2));
        }
        catch (NullPointerException | NotFoundException | NotSortedException e){
            e.printStackTrace();
        }

        //Test avec un tableau non trié
        //Doit produire une erreur de Not sorted + une erreur de Not found
        try{
            System.out.println("Valeur " + valSeek + " présente ? -> " + Num.search(tabNonTrie, valSeek));
        }
        catch (NullPointerException | NotFoundException | NotSortedException e){
            e.printStackTrace();
        }
    }
}
