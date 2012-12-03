package fr.iutvalence.java.projets.bomberman;
/** 
 * Position des éléments (personnages, briques, bonus...) sur la carte, exprimée par 
 * un couple d'entiers.
 */
public class Position 
{
	/** 
	 * Position sur l'axe horizontal (numéro de la colonne).
	 */
	private final int x;
	
	/**
	 * Position sur l'axe vertical (numéro de la ligne)
	 */
	private final int y;
	
	/** Créer une nouvelle position, en prenant x et y en paramètres
	 * @param x position en abscisse
	 * @param y position en ordonné
	 */
	public Position(int x, int y) 
	{
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * Retourne la position en abscisse
	 * @return x la position en abscisse
	 */
	public int getX() 
	{
		return x;
	}
	
	/**
	 * Retourne la position en ordonnée
	 * @return y la position en ordonnée
	 */
	public int getY()
	{
		return y;
	}
	
	/**
	 * renvoie la position sous la forme : "(x,y)" 
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		String result="(" + this.x + "," + this.y + ")";
		return result;
	}

	
	///**
	// * Méthode permettant de modifier la position du personnage
	// * @param x position en absisse
	//* @param y position en ordonnee
	//* @return nouvelle position
	 //*/
	//public Position setPosition(int x, int y)
	//{
		//Position pos = new Position(x,y);
		//return pos;
	//}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) 
	{
		// Vérification de l'égalité des références
		if (obj == null) return false;
		if (obj == this) return true;
		// Vérification du type du paramètre
		if (!(obj instanceof Position)) return false;
		Position temp = (Position)obj;
		// Vérification des valeurs des attributs
		return (this.x == temp.x) && (this.y == temp.y);
	}	

	/**
	 * Méthode qui retourne la nouvelle position du personnage en fonction de son déplacement et de sa position initiale
	 * (La nature des cases (bloc, brique...) qui entourent le personnage n'est pas pris en compte pour le moment,
	 * le déplacement se fait quoiqu'il arrive (-> pb : sortie de la map ?)
	 * @param direction direction que doit prendre le personnage
	 * @return Position retourne la nouvelle position du personnage, après translation
	 */
	public Position translation(Direction direction)
	{
		Position pos_final;
		// TODO remove this
		System.out.println(direction);
		switch (direction)
		{
		    case HAUT: 
		    	pos_final = new Position(this.x-1,this.y);
		    	break;
		           
		    case BAS:  
		    	pos_final = new Position(this.x+1, this.y);
		    	break;
		    	
		    case DROITE: 
		    	pos_final = new Position(this.x, this.y+1);
		    	break;
		             
		    case GAUCHE:
		    	pos_final = new Position(this.x, this.y-1);
		    	break;
		    default: 
		    	pos_final = new Position(this.x, this.y);
		    	break;
		}
		return pos_final;
	}
}
