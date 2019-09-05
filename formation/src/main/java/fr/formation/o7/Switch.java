package fr.formation.o7;

public class Switch {
	
	public static void main(String[] args) {
		/*
		// variable_to_test : Une variable à tester.
		switch ( variable_to_test ) {
		  case value1:
		   // Faites quelque chose ici ...
		   break;
		  case value2:
		   // Faites quelque chose ici ...
		   break;
		  default:
		   // Faites quelque chose ici ...
		}*/
		
		 // Déclarez une variable de l'âge (âge)
        int age = 20;
 
        // Vérifiez la valeur de l'âge
        switch (age) {
        // Au cas où l'âge est égal 18
        case 18:
            System.out.println("You are 18 year old");
            break;
        // Au cas où l'âge est égal 20
        case 20:
            System.out.println("You are 20 year old");
            break;
        // Les autres cas restants
        default:
            System.out.println("You are not 18 or 20 year old");
        }
        
     /*
     // Ceci n'est pas autorisé !!
	case (age < 18) :
	 
	// Le case accepte seulement une valeur spécifique, par exemple :
	case 18:
	  // Faites quelque chose ici ..
	  break;*/
	}

}
