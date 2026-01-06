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
		//exercice2_2();
		//exercice3_1();
		exercice4_1();
		//exercice4_2();

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
		System.out.println("Saisir valeur de x : ");
		int x = scanner.nextInt();

		System.out.println("Saisir valeur de y : ");
		int y = scanner.nextInt();

		int tempVariable = x;
		x = y;
		y = tempVariable;

		/*
			x = x + y;
			y = x - y;
			x = x - y;
		*/

		System.out.print("Les valeurs sont permutées, x vaut " + x + " et y vaut " + y);
	}

	// Méthode de l'exercice n°2.1
	public static void exercice2_1() {
		System.out.print("Saisir un premier mot : ");
		String firstWord = scanner.next();

		System.out.print("Saisir un second mot : ");
		String secondWord = scanner.next();

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

	// Méthode de l'exercice n°3.1
	public static void exercice3_1() {
		int maxValue = -1;
		int maxIndex = 0;
		int minValue = 101;
		int minIndex =0;

		for (int i = 1; i < 10; i++) {
			int randomValue = (int)(Math.random() * 101);
			if (randomValue < minValue){
				minValue = randomValue;
				minIndex = i;
			}
			if (randomValue > maxValue){
				maxValue = randomValue;
				maxIndex = i;
			}
			System.out.println("Le nombre " + i + " vaut " + randomValue);
		}

		System.out.print("le maximum vaut " + maxValue + " (numéro " + maxIndex + ")" + " et le minimum vaut " + minValue + " (numéro " + minIndex + ")");


	}

	// Méthode de l'exercice n°4.1
	public static void exercice4_1() {
		int secretNumber = (int) (Math.random() * 101);
		System.out.println("secretNumber :" + secretNumber);
		int tries = 0;
		int proposition = 101 ;

		while(secretNumber != proposition && tries <= 6){
			System.out.print("Entrer un nombre : ");
			proposition = scanner.nextInt();
			int distance = Math.abs(secretNumber - proposition);

			if (0 == distance) break;
			else if (1<= distance && distance <=5){
				System.out.println("-----> Chaud");
			} else if (6<= distance && distance <=20) {
				System.out.println("-----> Tiède");
			} else{
				System.out.println("-----> Froid");
			}
			tries++;
		}

		if (proposition == secretNumber){
			System.out.println("-----> Gagné (" + tries + " tentatives)");
		}else{
			System.out.println("-----> Perdu : Le nombre secret était " + secretNumber);
		}
	}

	// Méthode de l'exercice n°4.2 (Do while)
	public static void exercice4_2() {
		int nombre0rdi = (int) (Math.random() * 101);
		System.out.println(nombre0rdi);
		int cpt = 0;
		int nombreUtilisateur;
		do {
			System.out.println("Entrer un nombre : ");
			nombreUtilisateur = scanner.nextInt();
			cpt++;
			int distance = Math.abs(nombreUtilisateur - nombre0rdi);
			if (distance > 20)
				System.out.println("Froid");
			else if (distance > 5)
				System.out.println("Tiède");
			else if (distance > 0)
				System.out.println("Chaud");
			else {
				System.out.println("Gagné en " + cpt + " tentatives");
			}
		} while (nombre0rdi != nombreUtilisateur) ;
	}
}

