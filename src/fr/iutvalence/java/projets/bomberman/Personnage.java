package fr.iutvalence.java.projets.bomberman;
// FIXME corriger le commentaire

/**Petit bonhomme caracterisé par son numéro, son nom, sa position et son état (mort ou vivant)*/
public class Personnage
{
	/** Nombre max de personnages */
	private final int nbJoueurs;
	
	/** Numéro affecté au personnage.*/
	private final int numero;
	
	/** Etat du personnage : est-il mort ou en vie ? */
	private boolean dead;
	
	// FIXME corriger un commentaire
	/** Position du personnage sur la carte */
	private Position position;
	
	// FIXME écrire un commentaire
	// FIXME plusieurs noms ?
	/** Nom du personnage */
	private final char[] name; 
	
	// FIXME compléter le commentaire
	// FIXME paramètres ?
	/**
	 * @param nbJoueurs
	 * @param numero
	 * @param dead
	 * @param position
	 * @param name
	 */
	public Personnage(int nbJoueurs, int numero, Position position, char[] name) {
		super();
		this.nbJoueurs = nbJoueurs;
		this.numero = numero;
		this.dead = false;
		this.position = position;
		this.name = name;
	}

	// FIXME corriger le commentaire

	/**
	 * @return the numero
	 */
	public int getNumero() 
	{
		return numero;
	}

	// FIXME corriger le commentaire
	// FIXME type de retour ?
	/**
	 * @return the name
	 */
	public char[] getName() {
		return name;
	}
	
}
