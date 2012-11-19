package fr.iutvalence.java.projets.bomberman;
import java.lang.Math;

/**
 * Type énuméré permettant de gérer aléatoirement les directions prises par le personnage
 */
public enum Direction
{
	HAUT, BAS, DROITE, GAUCHE;
	
	/**
	 * Méthode qui retourne aléatoirement une des directions (haut, bas, droite ou gauche)
	 * @return Direction retourne la direction
	 */
	public static Direction alea()
	{
		int min = 1;
		int max = 4;
		int tirage = (int)( Math.random()*( max - min + 1 ) ) + min;
		
		switch (tirage)
		{
		    case 0:  return HAUT;
		           
		    case 1:  return BAS;
		    
		    case 2:  return GAUCHE;
		             
		    case 3: return DROITE;
		    
		    default: return null; 
		}
	} 
}

