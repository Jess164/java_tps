import java.util.Random;
import java.util.Scanner;

public class Tp1 {

	// Le scanner permet de saisir au clavier des données lors de l'exécution du programme.
	private static Scanner scanner;

	// Méthode principale
	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		// Appel de la méthode de l'exercice 1.1
		//exercice1_1();
		//exercice1_2();
		//exercice2_1();
		exercice2_2();

		scanner.close();
	}

	// Méthode de l'exercice n°1.1
	public static void exercice1_1() {

		// 1° - Déclaration
		String prenom;
		String nom;
		int age;
		
		// 2° - Initialisation
		System.out.println("Prénom : ");
		prenom = scanner.next();

		System.out.println("Nom : ");
		nom = scanner.next();

		System.out.println("Age : ");
		age = scanner.nextInt();

		// 3° - Utilisation
		System.out.print("Bonjour " + prenom + " " + nom + " (" + age + " ans)." );
	}

	// Méthode de l'exercice n°1.2 
	public static void exercice1_2() {
		int x;
		int y;
		int tempVariable;
		System.out.println("Saisir valeur de x : ");
		x = scanner.nextInt();

		System.out.println("Saisir valeur de y : ");
		y = scanner.nextInt();

		tempVariable = x;
		x = y;
		y = tempVariable;
		System.out.print("Les valeurs sont permutées, x vaut " + x + " et y vaut " + y);
	}

	// Méthode de l'exercice n°2.1
	public static void exercice2_1() {
		String firstWord;
		String secondWord;

		System.out.print("Saisir un premier mot : ");
		firstWord = scanner.next();

		System.out.print("Saisir un second mot : ");
		secondWord = scanner.next();

		if (firstWord.length() > secondWord.length()){
			System.out.print("Bonjour est le mot \"" + firstWord + "\" avec le plus de caractères.");
		} else if (firstWord.length() == secondWord.length()) {
			System.out.print("Les deux mots ont le même nombre de caractères");
		}
		else {
			System.out.print("Bonjour est le mot  \"" + secondWord + "\" avec le plus de caractères.");
		}
	}

	// Méthode de l'exercice n°2.2
	public static void exercice2_2() {
		int annee;
		System.out.print("Saisir une année : ");
		annee = scanner.nextInt();

		boolean isDivisibleBy400 =  annee % 400 == 0;
		boolean isDivisibleBy4AndNotBy100 = annee % 4 == 0 && annee % 100 != 0;

		if (isDivisibleBy4AndNotBy100 || isDivisibleBy400){
			System.out.print("L'annee " + annee + " est bissextile");
		}
		else{
			System.out.print("L'annee " + annee + " n'est pas bissextile");
		}
	}

}
