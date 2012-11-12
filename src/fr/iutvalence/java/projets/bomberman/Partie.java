package fr.iutvalence.java.projets.bomberman;
/** C'est l'évolution dans le temps de l'état d'une map, du nombre de joueurs et de leur état,...*/
public class Partie 
{
	// FIXME il faut compléter la classe Partie pour qu'il s'agisse vraiment d'une partie de Bomberman
	// FIXME se limiter pour le moment à gérer aléatoirement les déplacements du personnage (à discuter)
	/** 
	 * Etat de la partie : En cours ou terminée 
	 */
	private boolean start;
	
	/** 
	 * Nombre de joueurs maximum de la partie
	 */
	private final int nbJoueurs;
	
	/** 
	 * Nombre de manches dans une partie
	 */
	private final int nbManches;
	
	/**
	 * Carte sur laquelle va se dérouler la partie
	 */
	private Map map;
	
	private Personnage personnage;
	
	/** Créer une nouvelle partie avec un nombre de joueurs (nbJoueurs) défini par l'utilisateur, une carte prédéfinie
	 * @param start
	 * @param nbJoueurs
	 */
	public Partie(int nbJoueurs, int nbManches) 
	{
		super();
		this.start = true;
		this.nbJoueurs = nbJoueurs;
		this.map = new Map();
		this.nbManches = nbManches;
		this.personnage = new Personnage(1,new Position(1,1),"Milou");
	}

	/**
	 * Méthode permettant de démarrer la partie
	 */
	public void demarrer()
	{
		this.start = true;
		while (this.start)
		{
			
		}
	// FIXME ici, il faut faire une boucle qui déroule la partie et retourne lorsqu'elle est terminee
	}

	/**
	 * Méthode permettant de terminer la partie
	 */
	public void terminer()
	{
		this.start = false;
	}
	
	/**
	 * Retourne le nombre de joueurs de la partie
	 * @return  le nombre de joueurs de la partie
	 */
	public int getNbJoueurs() 
	{
		return nbJoueurs;
	}
}
