package Ex1;

import Exceptions.*;

public class Num {
	
	/**
	 * @return le pgcd de n et d
	 * @throws NegativeArgumentException si n ou d <= 0
	 */  
	public static int pgcd(int n, int d) throws NegativeArgumentException {
		if (d == 0) {
			return n;  
		}
		if (n < 0 || d < 0) {
			throw new NegativeArgumentException();
		}
        else {
        		return pgcd (d, n % d);
        }
		
	}
	
	/**
	 * @return un entier correspondant à l'élément le plus haut de a
	 * @throws NullPointerException si a == null
	 */
	public static int greatest (int[] a) throws NullPointerException{
		if(a == null){
			throw new NullPointerException ("Ex1.Num.greatest(int [])");
		}

		int max = a[0];
		for(int i=0; i<a.length; i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		return max;
	}
	
	 /**
	 * @return un entier correspondant à la somme des éléments de a
	  *@throws NullPointerException si a == null
	 */
	public static int sum (int[] a) throws NullPointerException{
		if(a == null){
			throw new NullPointerException ("Ex1.Num.sum(int [])");
		}

		int total=0;
		for(int i=0; i<a.length; i++){
			total=total+a[i]; 
		}
		return total;
	}
	
	/**
	 * @return true si p est un nombre pair, false sinon
	 */
	public static boolean isEven (int p){
		if(p%2==0)return true;
		return false;
	}
	
	/**
	 * @return true si p est un nombre premier, false sinon
	 * @throws NegativeArgumentException si p est négatif
	 */
	public static boolean isPrime (int p) throws NegativeArgumentException{
		if(p < 0){
			throw new NegativeArgumentException("Ex1.Num.isPrime(int)");
		}
		if(p<=1) {
			return false;
		}
        for(int i = 2;i*i<=p;i++)
        {
            if (p%i ==0)
            return false;
            i++;
        }
        return true;
	}
	
	/**
	 * @modifies a
	 * @effects a est multiplié par la somme des éléments de b
	 * @throws NullPointerException si a == null || b = null
	 */
	public static void combine(int[] a, int[] b) throws NullPointerException{
		if(a == null || b == null){
			throw new NullPointerException("Ex1.Num.combine(int[], int[])");
		}
		int totalB=sum(b);
		for(int i=0; i<a.length; i++){
			a[i]=a[i]*totalB;
		}
	}
	
	/**
	 * @requires a est trie de manière croissante
	 * @return i tel que a[i] == x sinon
	 * @throws NotFoundException si x n'appartient pas a a
	 * @throws NullPointerException si a == null
	 * @throws NotSortedException si a n'est pas trié
	 */
	public static int search(int[] a, int x) throws NotFoundException, NullPointerException, NotSortedException {
		if(a == null){
			throw new NullPointerException("Ex1.Num.search(int[], int) - NullPointer");
		}
		boolean tabTri = true;
		for(int j = 0; j < a.length; j++){
			for(int k = j; k < a.length; k++){
				if(a[j] > a[k]){
					tabTri = false;
				}
			}
		}
		if(!tabTri){
			throw new NotSortedException("Ex1.Num.search(int[], int) - Not sorted");
		}

		for(int i=0; i<a.length; i++){
			if(a[i]==x){		
				return i;
			}
		}
		throw new NotFoundException("Ex1.Num.search(int[], int) - Not Found");
	}

	//Méthode pour test
	public static void afficheElements(int[] a) {
		int tailleTab = a.length;
		for(int i = 0; i < tailleTab; i++) {
			System.out.println("Element # " + i + " = "+ a[i]);
		}
	}
}
