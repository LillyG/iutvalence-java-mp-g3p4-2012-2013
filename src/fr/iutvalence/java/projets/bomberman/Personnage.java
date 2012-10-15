package fr.iutvalence.java.projets.bomberman;
// FIXME corriger le commentaire

/** 
 * Personnage caracterisé par son numéro, son nom, sa position et son état (mort ou vivant)
 */
public class Personnage
{
	/** 
	 * Longueur maximale du nom du personnage (15 caractères, de 0 à 14)
	 */
	private static final int LONGUEUR_MAX_NOM = 14;

	/** 
	 * Numéro affecté au personnage.
	 */
	private final int numero;
	
	/** 
	 * Etat du personnage : est-il mort ou en vie ? 
	 */
	private boolean dead;
	
	/** 
	 * Position du personnage sur la carte 
	 */
	private Position position;
	
	/** 
	 * Nom du personnage 
	 */
	private final String name; 
	
	// FIXME compléter le commentaire
	/**
	 *  Initialise un personnage à l'état "vivant" 
	 * @param numero numéro du personnage
	 * @param dead état de départ
	 * @param position position de départ
	 * @param name nom du personnage (limité à 15 caractères)
	 */
	public Personnage(int numero, Position position, String name) 
	{
		super();
		this.numero = numero;
		this.dead = false;
		this.position = position;
		this.name = name.substring(0, LONGUEUR_MAX_NOM);
	}

	// FIXME corriger le commentaire

	/** Méthode retournant le numéro affecté au personnage créé
	 * @return the numero : numéro du personnage
	 */
	public int getNumero() 
	{
		return numero;
	}

	// FIXME corriger le commentaire
	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}
	
}
