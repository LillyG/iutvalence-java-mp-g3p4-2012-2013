package fr.iutvalence.java.projets.bomberman;

/** C'est l'évolution dans le temps de l'état d'une map, du nombre de joueurs et de leur état,... */
public class Partie
{
	// FIXME se limiter pour le moment à gérer aléatoirement les déplacements du personnage (à discuter)
	/**
	 * Etat de la partie : En cours ou terminée
	 */
	private boolean start;

	/**
	 * Nombre de joueurs maximum de la partie
	 */
	private final int nbJoueurs;

	/**
	 * Nombre de manches dans une partie
	 */
	// private final int nbManches;

	/**
	 * Carte sur laquelle va se dérouler la partie
	 */
	private Map map;

	/**
	 * 
	 */
	private Personnage personnage;

	/**
	 * Créer une nouvelle partie avec un nombre de joueurs (nbJoueurs) défini par l'utilisateur, une carte prédéfinie
	 * 
	 * @param nbJoueurs
	 *            nombre de joueurs dans la partie
	 */
	// @param nbManches nombre de manches de la partie
	// @param personnage un personnage

	public Partie(int nbJoueurs) // int nbManches, Personnage personnage
	{
		super();
		this.start = true;
		this.nbJoueurs = nbJoueurs;
		this.map = new Map();
		// this.nbManches = nbManches;
		this.personnage = new Personnage(1, new Position(1, 1), "Milou"); // personnage;
	}

	/**
	 * Méthode permettant de démarrer la partie
	 */
	public void demarrer()
	{
		this.start = true;

		Position nouvellePos = null;
		while (this.start)
		{
			Direction direction = Direction.alea();
			try
			{
				// FIXME il ne faut pas créer une partie à chaque tour ! (FIXED)
				this.map.setNatureCase(this.personnage.getPositionPerso(), Map.CASE_PERSO); // on place le personnage
																							// sur la carte
				System.out.println("Position actuelle");
				System.out.println(this.map.toString());
				nouvellePos = this.personnage.getPositionPerso().translation(direction); // simule une direction que
																							// veut prendre le
																							// personnage
				if (this.map.estDansMap(nouvellePos)) // le personnage se déplace si la nouvelle position est dans la
														// map et que la case est accessible
				{

					System.out.println("...");
					if ((this.map.getNatureCase(nouvellePos) == Map.CASE_VIDE)
							|| (this.map.getNatureCase(nouvellePos) == Map.CASE_PERSO)
							|| (this.map.getNatureCase(nouvellePos) == Map.CASE_BONUS))
					{
						System.out.println("!!!");
						System.out.println(this.personnage.getPositionPerso());
						System.out.println(nouvellePos);
						this.map.setNatureCase(this.personnage.getPositionPerso(), Map.CASE_VIDE);
						this.personnage.setPositionPerso(nouvellePos); // Modifie la position du personnage
						this.map.setNatureCase(this.personnage.getPositionPerso(), Map.CASE_PERSO); // le personnage
																									// s'est déplacé sur
																									// la carte
					}
				}
				// this.personnage.setPositionPerso(posTest);
				System.out.println("Position après déplacement");
				System.out.println(this.map.toString());

				Thread.sleep(1000);

				/*
				 * nouvellePos = this.personnage.getPositionPerso().translation(direction); //simule une direction que
				 * veut prendre le personnage if (this.map.estDansMap(nouvellePos)) //le personnage se déplace si la
				 * nouvelle position est dans la map et que la case est accessible if
				 * ((this.map.getNatureCase(nouvellePos) == Map.CASE_VIDE) || (this.map.getNatureCase(nouvellePos) ==
				 * Map.CASE_PERSO) || (this.map.getNatureCase(nouvellePos) == Map.CASE_BONUS))
				 * this.map.setNatureCase(this.personnage.getPositionPerso(), Map.CASE_VIDE);
				 * this.personnage.setPositionPerso(nouvellePos); //Modifie la position du personnage
				 * this.map.setNatureCase(this.personnage.getPositionPerso(), Map.CASE_PERSO); //le personnage s'est
				 * déplacé sur la carte System.out.println(this.map.toString());
				 * 
				 * this.terminer();
				 */
			}
			catch (InterruptedException ie)
			{
			}
		}
		// FIXME ici, il faut faire une boucle qui déroule la partie et retourne lorsqu'elle est terminee
	}

	/**
	 * Méthode permettant de terminer la partie
	 */
	public void terminer()
	{
		this.start = false;
	}

	/**
	 * Retourne le nombre de joueurs de la partie
	 * 
	 * @return le nombre de joueurs de la partie
	 */
	public int getNbJoueurs()
	{
		return this.nbJoueurs;
	}
}
