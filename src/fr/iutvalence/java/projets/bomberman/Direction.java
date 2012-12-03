package fr.iutvalence.java.projets.bomberman;
import java.util.Random;

/**
 * Type énuméré permettant de gérer aléatoirement les directions prises par le personnage
 */
public enum Direction
{
	HAUT, BAS, DROITE, GAUCHE;

	private final static Random RNG = new Random(); 
	
	/**
	 * Méthode qui retourne aléatoirement une des directions (haut, bas, droite ou gauche)
	 * @return Direction retourne la direction
	 */
	public static Direction alea()
	{
		switch (RNG.nextInt(4))
		{
		    case 0:  return HAUT;
		           
		    case 1:  return BAS;
		    
		    case 2:  return GAUCHE;
		             
		    case 3: return DROITE;
		    
		    default: return null; 
		}
	} 
}

