package fr.iutvalence.java.projets.bomberman;
// FIXME écrire un commentaire
// TODO à compléter
/** C'est l'évolution dans le temps de l'état d'une map, du nombre de joueurs, de leur état...*/
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

	//TODO à compléter 
	/** Initialisation de la partie...
	 * @param start
	 * @param nbJoueurs
	 */
	public Partie(int nbJoueurs) 
	{
		super();
		this.start = true;
		this.nbJoueurs = nbJoueurs;
	}

	
	public void demarrer()
	{
	this.start = true;
	}
	
	public void terminer()
	{
		this.start = false;
	}
	
	/**
	 * @return the nbJoueurs
	 */
	public int getNbJoueurs() 
	{
		return nbJoueurs;
	}
	
	public static void main(String args[])
	{
	System.out.println("");
	}
}
