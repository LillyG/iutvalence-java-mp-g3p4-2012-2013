package fr.iutvalence.java.projets.bomberman;
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
	 * Nombre de points du personnage (gagnés au cours de la partie).
	 */
	private final int nbPoints;
	
	/** 
	 * Etat du personnage : vivant ou mort
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
	
	/**
	 * Créer un nouveau personnage à l'état "vivant", ayant 0 points  
	 * @param numero numéro du personnage
	 * @param position position du personnage
	 * @param name nom du personnage (limité à 15 caractères)
	 */
	public Personnage(int numero, Position position, String name) 
	{
		super();
		this.numero = numero;
		this.dead = false;
		this.position = position;
		this.name = name.substring(0, LONGUEUR_MAX_NOM);
		this.nbPoints = 0;
	}

	/** 
	 * retourne le numéro affecté au personnage
	 * @return le numéro affecté au personnage
	 */
	public int getNumero() 
	{
		return this.numero;
	}

	/**
	 * retourne le nom du personnage
	 * @return le nom du personnage
	 */
	public String getName() 
	{
		return this.name;
	}
	
	/**
	 * retourne la position du personnage
	 * @return la position du personnage
	 */
	public Position getPositionPerso()
	{
		return this.position;
	}
	
}
