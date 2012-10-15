package fr.iutvalence.java.projets.bomberman;
// FIXME détailler le commentaire
/**
 * Environnement défini par un nombre de colonnes et un nombre de lignes
 * caractérisé par un 
 * */
public class Map 
{	
	/** 
	 * Constante définissant le nombre de lignes de la map
	 */
	private static final int NB_LIGNES= 13;
	
	/** 
	 * Constante définissant le nombre de colonnes de la map
	 */
	private static final int NB_COLONNES = 15;
	
	/** 
	 * Zone de jeu représentée par un tableau d'entiers de lignes*colonnes cases
	 */
	private int[][] surface;	
	
	// FIXME (fixed) le nombre de lignes change t'il en cours de partie ?
	/** 
	 * Nombre de lignes 
	 */
	private final int lignes;

	// FIXME (fixed) le nombre de colonnes change t'il en cours de partie ?
	/** 
	 * Nombre de colonnes 
	 */
	private final int colonnes;
				
	// FIXME compléter le commentaire
	/** Initialise chaque case de la map à un état donné 
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
		
		// FIXME (fixed) définir les valeurs par défaut sous forme de constantes
		this.lignes=NB_LIGNES;
		this.colonnes=NB_COLONNES;

	}

	public Map(int lignes, int colonnes)
	{
		this.surface = new int [lignes][colonnes] ;
		this.lignes=lignes;
		this.colonnes=colonnes;
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