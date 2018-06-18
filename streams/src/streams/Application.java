/**
 * Exercice sur les Streams
 *
 * @author Benoit Jallet
 *
 */
package streams;

public class Application {

	public static void main(String[] args) {

		// Utilisez l’API des Streams pour compter le nombre de lettres dans une chaîne
		// de caractères.
		String chaine = "Voici une belle chaîne qui contient un certain nombre de caractères";
		long nbCaracteres = chaine.chars().filter(c -> Character.isAlphabetic(c)).count();
		System.out.println(nbCaracteres);
	}

}
