package fr.formation.o7;

public class IfElse {

	public static void main(String[] args) {
		// condition: Des conditions doivent être vérifiées.
		if (true)  {
		    // Faites quelque chose ici si la condition est vraie.
		}
		
        // Déclarez une variable représentant votre âge
        int age = 30;
 
        System.out.println("Your age: " + age);
 
        // La condition (condition) à vérifier est 'age==>== 20'
        if (age > 20) {
 
            System.out.println("Okey!");
            System.out.println("Age is greater than 20");
        }
 
        // Le code sous le bloc 'if'.
        System.out.println("Done!");
        
        
        
		if( true )  {
				   // Faites quelque chose ici
				}  
				// D'autre
				else  { 
				   // Faites quelque chose ici
				}
		
		// Déclarez la variable représentant votre âge
        int age2 = 15;
 
        System.out.println("Your age: " + age2);
 
        // La condition (condition) à vérifier est 'age==>== 18'.
        if (age2 >= 18) {
 
            System.out.println("Okey!");
            System.out.println("You are accepted!");
             
        } else {
 
            System.out.println("Sorry!");
            System.out.println("Age is less than 18");
        }
 
        // Les codes en arrière du bloc 'if' et du bloc 'else'.
        System.out.println("Done!");
        
       
        
        
        /*if(condition 1)  {
        	 
        	   // Faites quelque chose ici   
        	} else if(condition 2) {
        	 
        	   // Faites quelque chose ici   
        	} else if(condition 3) {
        	 
        	   // Faites quelque chose ici
        	}
        	// D'autre
        	else  { 
        	 
        	   // Faites quelque chose ici   
        	}*/
        
     // Déclaration une variable de type int (32 bits entier)
        // Représentez vos résultats de tests (score)
        int score = 20;
 
        System.out.println("Your score =" + score);
 
        // Si le score est inférieur à 50
        if (score < 50) {
            System.out.println("You are not pass");
        }
        // Ou alors, si le score est supérieur ou égal à 50 et inférieur à 80.
        else if (score >= 50 && score < 80) {
            System.out.println("You are pass");
        }
        // Les autres cas (c'est-à-dire supérieur ou égal à 80)
        else {
            System.out.println("You are pass, good student!");
        }
        
	}
	

}
