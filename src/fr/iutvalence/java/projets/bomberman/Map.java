package fr.iutvalence.java.projets.bomberman;
// FIXME détailler le commentaire (FIXED ?)
/**
 * Environnement défini par un tableau d'entiers (de lignes*colonnes cases) dont les valeurs 
 * caractérisent un élément du jeu (personnage, brique, bombe, etc.)
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

	/** 
	 * Nombre de lignes 
	 */
	private final int lignes;

	/** 
	 * Nombre de colonnes 
	 */
	private final int colonnes;
				
	// FIXME compléter le commentaire (FIXED)
	/** 
	 * Créer une nouvelle carte de 13*15 cases, dont chaque case est initialisée à un état donné 
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
		
		this.lignes=NB_LIGNES;
		this.colonnes=NB_COLONNES;

	}

	/** 
	 * Créer une nouvelle carte de lignes*colonnes cases, qui ne sont pas initialisées
	 */
	public Map(int lignes, int colonnes)
	{
		this.surface = new int [lignes][colonnes] ;
		this.lignes=lignes;
		this.colonnes=colonnes;
	}
	
	// FIXME compléter le commentaire (FIXED ?)
	/**
	 * Méthode retournant une chaîne de caractère qui représente un objet carte
	 * la valeur 0 (vide) est représenté par un espace
	 * la valeur 1 (bloc) est représenté par "x"
	 * la valeur 2 (brique) est représenté par "X"
	 * la valeur 3 (personnage) est représenté par "&"
	 * la valeur 4 (bombe) est représenté par "¤"
	 * la valeur 5 (bonus) est représenté par "$"
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		String result;
		result = "";
		// FIXME à compléter (FIXED)
		//for (int i = 0; i < this.surface.length; i++) 
		int i = 0;
		while (i < this.surface.length) 
		{
			for (int j = 0; j < this.surface[i].length; j++)
			{
				if (surface[i][j] == 0)
				{
					result= result + " ";
				}
				else if (surface[i][j] == 1)
				{
					result= result + "o";
				}
				else if (surface[i][j] == 2)
				{
					result= result + "X";
				}
				else if (surface[i][j] == 3)
				{
					result= result + "&";
				}
				else if (surface[i][j] == 4)
				{
					result= result + "¤";
				}
				else if (surface[i][j] == 5)
				{
					result= result + "$";
				}	
			}
			result += "\n" ;
			i++;
		}
		return result;
	}
	
	// FIXME autres méthodes ?
	
}