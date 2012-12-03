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
	private static final int NB_LIGNES_DEFAUT= 13;
	
	/** 
	 * Constante définissant le nombre de colonnes de la map
	 */
	private static final int NB_COLONNES_DEFAUT = 15;
	
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
				
	/**
	 * Constante définissant les différentes valeurs possibles du tableau
	 */
	/**
	 * Constante représentant une case vide sur la map
	 */
	public static final int CASE_VIDE = 0;
	/**
	 * Constante représentant une brique sur la map
	 */
	public static final int CASE_BRIQUE = 1;
	/**
	 * Constante représentant un bloc sur la map
	 */
	public static final int CASE_FIXE = 2;
	/**
	 * Constante représentant un personnage sur la map
	 */
	public static final int CASE_PERSO = 3;
	/**
	 * Constante représentant une bombe sur la map
	 */
	public static final int CASE_BOMBE = 4;
	/**
	 * Constante représentant un bonus sur la map
	 */
	public static final int CASE_BONUS = 5;
	
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
		
		this.lignes=NB_LIGNES_DEFAUT;
		this.colonnes=NB_COLONNES_DEFAUT;

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
	public int getLignes() 
	{
		return this.lignes;
	}
	
	/**
	 * Retourne le nombre de colonnes de la map
	 * @return lignes nombre de colonnes de la map
	 */
	public int getColonnes() 
	{
		return this.colonnes;
	}
	
	/*/**
	 * Retourne la valeur de CASE_VIDE
	 * @return valeur de CASE_VIDE (=0)
	 *
	public int getCaseVide()
	{
		return this.CASE_VIDE;
	}*/
	
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
	public boolean estDansMap(Position position)
	{
		if ((position.getX() < 0) || (position.getX() > (this.getColonnes() - 1)))
			return false;
		if ((position.getY() < 0) || (position.getX() > (this.getLignes() - 1)))
				return false;
		return true;
	}
	
	// FIXME exception ?
	/**
	 * Méthode qui retourne la nature de la case de position pos (sous la forme d'un entier) 
	 * @param pos position de la case dont on veut connaître la "nature"
	 * @return int valeur de la case 
	 */
	public int getNatureCase(Position pos) 
	{
		return this.surface[pos.getX()][pos.getY()];
	}
	
	/**
	 * Méthode qui permet de modifier la nature de la case de position pos 
	 * @param pos position de la case dont on veut modifier la "nature"
	 * @param nature valeur qu'on veut attribuer à la case 
	 */
	public void setNatureCase(Position pos, int nature)
	{
		this.surface[pos.getX()][pos.getY()] = nature;
	}	
}