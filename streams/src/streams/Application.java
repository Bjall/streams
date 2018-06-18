/**
 * Exercice sur les Streams
 *
 * @author Benoit Jallet
 *
 */
package streams;

public class Application {

	public static void main(String[] args) {

		// Utilisez l�API des Streams pour compter le nombre de lettres dans une cha�ne
		// de caract�res.
		String chaine = "Voici une belle cha�ne qui contient un certain nombre de caract�res";
		long nbCaracteres = chaine.chars().filter(c -> Character.isAlphabetic(c)).count();
		System.out.println(nbCaracteres);
	}

}
