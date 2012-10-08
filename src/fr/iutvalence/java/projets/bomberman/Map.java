package fr.iutvalence.java.projets.bomberman;
// FIXME détailler le commentaire
/**
 * Environnement défini par un nombre de colonnes et un nombre de lignes
 * sur lequel vont se mouvoir les personnages, caractérisé par un 
 * */
public class Map 
{	
	/** 
	 * Zone de jeu représentée par un tableau d'entiers de lignes*colonnes cases
	 */
	private int[][] surface;	
	
	// FIXME le nombre de lignes change t'il en cours de partie ?
	/** 
	 * Nombre de lignes 
	 */
	private int lignes;

	// FIXME le nombre de colonnes change t'il en cours de partie ?
	/** 
	 * Nombre de colonnes 
	 */
	private int colonnes;
				
	// FIXME compléter le commentaire
	/** 
	 * 0 : vide 
	 * 1 : brique (cassable)
	 * 2 : bloc (fixe)
	 * 3 : personnage
	 * 4 : bombe
	 * 5 : bonus */
	public Map()
	{
		this.surface = new int [][] 
				{{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
				{2,0,0,0,1,1,1,1,1,1,1,0,0,0,2},
				{2,0,2,1,2,1,2,1,2,1,2,1,2,0,2},
				{2,0,1,1,1,1,1,1,1,1,1,1,1,0,2},
				{2,1,2,1,2,1,2,1,2,1,2,1,2,1,2},
				{2,1,1,1,1,1,0,0,1,1,1,1,1,1,2},
				{2,1,2,1,2,1,2,0,2,1,2,1,2,1,2},
				{2,1,1,1,1,1,1,0,0,1,1,1,1,1,2},
				{2,1,2,1,2,1,2,1,2,1,2,1,2,1,2},
				{2,0,1,1,1,1,1,1,1,1,1,1,1,0,2},
				{2,0,2,1,2,1,2,1,2,1,2,1,2,0,2},
				{2,0,0,0,1,1,1,1,1,1,1,0,0,0,2},
				{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}};
		
		// FIXME définir les valeurs par défaut sous forme de constantes
		this.lignes=13;
		this.colonnes=15;

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		String result="";
		
		// FIXME à compléter
		
		// TODO Auto-generated method stub
		return result;
	}
	
	// FIXME autres méthodes ?
	
}