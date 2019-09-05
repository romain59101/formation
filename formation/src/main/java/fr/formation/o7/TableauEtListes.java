package fr.formation.o7;

import java.util.Arrays;
import java.util.List;

public class TableauEtListes {

	public static void main(String[] args) {

		System.out.println("TABLEAUX");
		// Déclarez un tableau, ne pas spécifiez le nombre d'éléments.
		int[] array1;
		 
		// Initialisez le tableau de 100 éléments
		// Les éléments n'ont pas été assignés une valeur précise.
		array1 = new int[100];
		 
		// Déclarez un tableau, spécifiez le nombre d'éléments.
		// Les éléments n'ont pas été assigné une valeur spécifique.
		double[] array2 = new double[10];
		 
		// Déclarez un tableau avec les éléments qui sont assignés une valeur précise.
		// Ce tableau comporte 4 éléments.
		long[] array3= {10L, 23L, 30L, 11L};
		
		
		// Déclarez un tableau de 5 éléments
        int[] myArray = new int[5];
 
        // Remarque : l'indice du le premier élément du tableau est  0 
        // Assignement des valeurs au premier élément (index 0)
        myArray[0] = 10;
 
        // Assignement la valeur au deuxième élément (index 1)
        myArray[1] = 14;
 
        myArray[2] = 36;
        myArray[3] = 27;
 
        // Assignement la valeur au cinquième élément (le dernier élément du tableau)
        myArray[4] = 18;
 
        // Imprimez  l'éléments count sur l'écran
        System.out.println("Array Length=" + myArray.length);
 
        // Imprimez l'élément à l'index 3 (quatrième élément dans le tableau)
        System.out.println("myArray[3]=" + myArray[3]);
 
        // Utilisez une boucle for pour imprimer les éléments dans le tableau.
        for (int index = 0; index < myArray.length; index++) {
            System.out.println("Element " + index + " = " + myArray[index]);
        }
        
     // Utilisez une boucle for pour assigner la valeur aux éléments du tableau.
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 100 * i * i + 3;
        }
        System.out.println("myArray[3] = " + myArray[3]);
        
        
        int[] years = new int[] { 2001, 1994, 1995, 2000, 2017 };
        
        // Arrangez
        Arrays.sort(years);
 
        for (int year : years) {
            System.out.println("Year: " + year);
        }
 
        // Convertissez un tableau en chaîne (string)
        String yearsString = Arrays.toString(years);
 
        System.out.println("Years: " + yearsString);
 
        // Créez une liste (List) de plusieurs valeurs.
        List<String> names = Arrays.asList("Tom", "Jerry", "Donald");
 
        for (String name : names) {
            System.out.println("Name: " + name);
        }
        
        
	}
	
	

}
