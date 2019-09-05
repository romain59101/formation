package fr.formation.o7;

public class Boucles {

	public static void main(String[] args) {

		/* FOR
		// start_value: Valeur initiale
		// end_value: Valeur finale
		// increment_number: La valeur augmente après chaque étape de l'itération.
		for ( start_value; end_value; increment_number ) {
		   // Faites quelque chose ici ...
		}*/
		
		
		 // Déclarez une variable 'step', décrivant l'étape de la boucle (quelle boucle)
        int step = 1;
 
        // Déclarez une variable 'value' avec la valeur initiale est 0
        // Après chaque itération 'value', la valeur augmentera 3
        // Et la boucle se terminera lorsque la valeur supérieure ou égale à 10
        for (int value = 0; value < 10; value = value + 3) {
 
            System.out.println("Step =" + step + "  value = " + value);
 
            // Augmentez la valeur 'step' jusqu'à 1, après chaque itération
            step = step + 1;
            
        }
        
        System.out.println();
        System.out.println("exemple for 2 : ");
        
     // Ceci est un exemple pour compter la totalité des nombres de 1 à 100,
        // et imprimez les résultats sur console.
    
            // Déclarez une variable
            int total = 0;
     
            // Déclarez une variable 'value'
            // Assignez une valeur initiale 1
            // Après chaque itération, sa valeur augmente 1
            // Remarque : la valeur ++ équivaut à l'instruction : valeur = valeur + 1 ;
            // value-- équivaut à l'instruction : value = value - 1;
            for (int value = 1; value <= 100; value++) {
     
                // Assignez la valeur 'total' à l'ancienne valeur plus 'valeur'.
                total = total + value;
            }
     
            System.out.println("Total = " + total);
            
            /* FOR EACH
         // arrayOrCollection : Tableau ou Collection (Collection).
            for (Type variable: arrayOrCollection)  {
                  // Code ...
            }*/
            
            System.out.println();
            System.out.println("for each :");
         // Déclarez un tableau de String.
            String[] fruits = new String[] { "Apple", "Apricot", "Banana" };
     
            // Utilisez la boucle for-each pour traverser les éléments du tableau.
            for (String fruit : fruits) {
     
                System.out.println(fruit);
     
            }
            
            System.out.println();
            System.out.println("while");
            
            //WHILE
         /*// Lorsque la condition (condition) est vraie, alors faites quelque chose
            while ( condition ) {
               // Faites quelque chose...
            }*/
            
            int x = 3;
            while (x<10) {
            	System.out.println("valeur = " + x);
            	x = x + 2;
            }
            
            System.out.println();
            System.out.println("Do/While");
         
            /*
         // La boucle de do-while effectue au moins une itération (iteration)
         // Et lorsque la condition est vraie, elle continue de fonctionner
         do {
            // Faites quelque chose ici.
         }
         while (condition);*/
       
            int y = 3;
            
            // La boucle do-while exécutera au moins une fois.
            do {
     
                System.out.println("Value = " + y);
     
                // Augmentez la ''valeur'' en ajoutant 3
                y = y + 3;
     
            } while (y < 10);  
    
            
            System.out.println();
            System.out.println("instruction break");
            
            System.out.println("Break example");
            
            int z = 2;
     
            while (z < 15) {
     
                System.out.println("----------------------\n");
                System.out.println("z = " + z);
     
                // Vérifiez si x = 5 puis quittez la boucle.
                if (z == 5) {
                    break;
                }
     
                z++;
                System.out.println("z after ++ = " + z);
     
            }
     
            System.out.println("Done!");
            
            
            
            System.out.println();
            System.out.println("instruction continue");
            
            System.out.println("Continue example");
            
            int a = 2;
     
            while (a < 7) {
     
                System.out.println("----------------------\n");
                System.out.println("a = " + a);
     
                // a = a + 1;
                a++;
     
                // % operator is used for calculating remainder.
                // If a is even, then ignore the command line below of 'continue',
                // and start new iteration (if condition still true).
                if (a % 2 == 0) {
     
                    continue;
                }
     
                System.out.println("a after ++ = " + a);
     
            }
     
            System.out.println("Done!");
	}

}
