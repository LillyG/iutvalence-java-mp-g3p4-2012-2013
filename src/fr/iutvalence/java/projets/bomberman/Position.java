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
	
	// FIXME corriger le commentaire
	/**
	 * @param x
	 * @param y
	 */
	public Position(int x, int y) 
	{
		super();
		this.x = x;
		this.y = y;
	}

	// FIXME corriger le commentaire
	/**
	 * @return the x
	 */
	public int getX() 
	{
		return x;
	}

	// FIXME corriger le commentaire
	/**
	 * @return the y
	 */
	public int getY()
	{
		return y;
	}
	
	// FIXME redéfinir toString
	// FIXME redéfinir equals et hashCode
}
