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
	
	// FIXME corriger le commentaire (FIXED)
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

	// FIXME corriger le commentaire (FIXED)
	/**
	 * Lit la position en abscisse
	 * @return the x
	 */
	public int getX() 
	{
		return x;
	}

	// FIXME corriger le commentaire (FIXED)
	/**
	 * Lit la position en ordonné
	 * @return the y
	 */
	public int getY()
	{
		return y;
	}
	
	// FIXME redéfinir toString (FIXED)
	/*
	 * renvoie la position sous la forme : "(x,y)" 
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		String result="(" + this.x + "," + this.y + ")";
		return result;
	}

	// FIXME redéfinir equals et hashCode (FIXED)
	/* (non-Javadoc)
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

	/* (non-Javadoc)
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
}


