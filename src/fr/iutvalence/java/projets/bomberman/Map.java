package fr.iutvalence.java.projets.bomberman;
// FIXME détailler le commentaire

/**Environnement sur lequel vont se mouvoir les personnages, caractérisé par */
public class Map 
{	
	/** Zone de jeu représentée par un tableau d'entiers de lignes*colonnes cases (ici 15*13)*/
	private int[][] surface;	
	
	/** Nombre de lignes */
	private int lignes;
	
	/** Nombre de colonnes */
	private int colonnes;
				
	// FIXME écrire le commentaire
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