package fr.iutvalence.java.projets.bomberman;
// FIXME écrire un commentaire
// TODO à compléter
/** C'est l'évolution dans le temps de l'état d'une map, du nombre de joueurs et de leur état,...*/
public class Partie 
{
	// FIXME attributs, constructeurs, méthodes ?
	
	/** 
	 * Etat de la partie : En cours ou terminée 
	 */
	private boolean start;
	
	/** 
	 * Nombre de joueurs maximum de la partie
	 */
	private final int nbJoueurs;
	
	/**
	 * Carte sur laquelle va se dérouler la partie
	 */
	private Map map;

	//TODO à compléter 
	/** Créer une nouvelle partie avec un nombre de joueurs (nbJoueurs) défini par l'utilisateur, une carte prédéfinie
	 * @param start
	 * @param nbJoueurs
	 */
	public Partie(int nbJoueurs) 
	{
		super();
		this.start = true;
		this.nbJoueurs = nbJoueurs;
		this.map = new Map();
	}

	// FIXME écrire un commentaire (FIXED)
	/**
	 * Méthode permettant de démarrer la partie
	 */
	public void demarrer()
	{
	this.start = true;
	}

	// FIXME écrire un commentaire (FIXED)
	/**
	 * Méthode permettant de terminer la partie
	 */
	public void terminer()
	{
		this.start = false;
	}
	
	// FIXME compléter le commentaire (FIXED)
	/**
	 * Lit le nombre de joueurs de la partie
	 * @return the nbJoueurs
	 */
	public int getNbJoueurs() 
	{
		return nbJoueurs;
	}
	
	// FIXME pas de main ici, il faut considérer que la méthode start ne retourne que lorsque la partie est finie (1 partie = 1 round)
	public static void main(String args[])
	{
	System.out.println("");
	}
}
