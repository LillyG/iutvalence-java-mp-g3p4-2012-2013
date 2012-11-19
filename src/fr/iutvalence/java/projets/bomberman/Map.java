package fr.iutvalence.java.projets.bomberman;
// FIXME (NOT FIXED) dire à quoi sert la classe, non comment elle est faite
/**
 * Environnement défini par un tableau d'entiers (de lignes*colonnes cases) dont les valeurs 
 * caractérisent un élément du jeu (personnage, brique, bombe, etc.)
 * 
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
				
	
	// FIXME définir les différentes valeurs possibles via des constantes ou une énumération (FIXED)
	/**
	 * Constante définissant les différentes valeurs possibles du tableau
	 */
	private static final int CASE_VIDE = 0;
	private static final int CASE_BRIQUE = 1;
	private static final int CASE_FIXE = 2;
	private static final int CASE_PERSO = 3;
	private static final int CASE_BOMBE = 4;
	private static final int CASE_BONUS = 5;
	
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
				{{CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE},
				{CASE_FIXE,CASE_VIDE,CASE_VIDE,CASE_VIDE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_VIDE,CASE_VIDE,CASE_VIDE,CASE_FIXE},
				{CASE_FIXE,CASE_VIDE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_VIDE,CASE_FIXE},
				{CASE_FIXE,CASE_VIDE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_VIDE,CASE_FIXE},
				{CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE},
				{CASE_FIXE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_VIDE,CASE_VIDE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_FIXE},
				{CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_VIDE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE},
				{CASE_FIXE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_VIDE,CASE_VIDE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_FIXE},
				{CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE},
				{CASE_FIXE,CASE_VIDE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_VIDE,CASE_FIXE},
				{CASE_FIXE,CASE_VIDE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_BRIQUE,CASE_FIXE,CASE_VIDE,CASE_FIXE},
				{CASE_FIXE,CASE_VIDE,CASE_VIDE,CASE_VIDE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_BRIQUE,CASE_VIDE,CASE_VIDE,CASE_VIDE,CASE_FIXE},
				{CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE,CASE_FIXE}};
		
		this.lignes=NB_LIGNES;
		this.colonnes=NB_COLONNES;

	}

	/** 
	 * Créer une nouvelle carte de lignes*colonnes cases, qui ne sont pas initialisées
	 * @param lignes nombre de lignes de la map
	 * @param colonnes nombre de colonnes de la map
	 */
	public Map(int lignes, int colonnes)
	{
		this.surface = new int [lignes][colonnes] ;
		this.lignes=lignes;
		this.colonnes=colonnes;
	}
	
	/**
	 * Retourne le nombre de lignes de la map
	 * @return lignes nombre de lignes de la map
	 */
	public int getLIGNES() 
	{
		return this.lignes;
	}
	
	/**
	 * Retourne le nombre de colonnes de la map
	 * @return lignes nombre de colonnes de la map
	 */
	public int getCOLONNES() 
	{
		return this.colonnes;
	}
	
	/**
	 * Méthode retournant une chaîne de caractères qui représente un objet carte
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
		//for (int i = 0; i < this.surface.length; i++) 
		int i = 0;
		while (i < this.surface.length) 
		{
			for (int j = 0; j < this.surface[i].length; j++)
			{
				if (this.surface[i][j] == 0)
				{
					result= result + " ";
				}
				else if (this.surface[i][j] == 1)
				{
					result= result + "o";
				}
				else if (this.surface[i][j] == 2)
				{
					result= result + "X";
				}
				else if (this.surface[i][j] == 3)
				{
					result= result + "&";
				}
				else if (this.surface[i][j] == 4)
				{
					result= result + "¤";
				}
				else if (this.surface[i][j] == 5)
				{
					result= result + "$";
				}	
			}
			result += "\n" ;
			i++;
		}
		return result;
	}
		
	/**
	 * Méthode qui retourne vrai si la position est dans la Map, faux sinon
	 * @param position position à tester
	 * @return boolean 
	 */
	public boolean estDansMaps(Position position)
	{
		if ((position.getX() < 0) && (position.getX() > (this.getCOLONNES() - 1)))
			return false;
		else 
			if ((position.getY() < 0) && (position.getX() > (this.getLIGNES() - 1)))
				return false;
			else
				return true;
	}
	
	/**
	 * Méthode qui retourne la nature de la case de position pos (sous la forme d'une constante) 
	 * @param pos position de la case dont on veut connaître la "nature"
	 * @return int valeur de la case 
	 */
	public int natureCase(Position pos) 
	{
		
	}
	//TODO ajouter une méthode qui permet de savoir "la nature" de chaque case (en passant en paramètre la position)
	//TODO ajouter une méthode qui permet de modifier "la nature" des cases
	
}