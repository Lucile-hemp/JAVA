/**
 * @author www.linkedin.com/in/ren%C3%A9e-l-dirry-337b26189/
 *   @see Raymond Barre Toua
 * @package adneomSujet1
 * @version 1.0
 *
 */


package adneomSujet1;
import java.util.LinkedList;
import java.util.Iterator;


/**
 * class AdneomPartition
 * Cette classe implemente l'interface IAdneomPartition
 *  
 * Elle implemente la Liste sous la forme d'une LinkedList d'Object
 * 
 *
 */

public class AdneomPartition implements IAdneomPartition
{
	/*
	 * Private variable
	 */ 
	private LinkedList<Object> partition;
	
	/**
	 * Contructeur:
	 * 
	 * cree la Liste sous la forme d'une ArrayList d'Object
	 * 
	 */
	public AdneomPartition()
	{
		partition = new LinkedList<Object>();
	}
	
	/**
	 * fonction partition
	 * @param liste LinkedList, taille int
	 * @return partition LinkedList 
	 * 
	 * Implementation: Cree des sous listes
	 *                 Itere la Liste en parametre
	 *                 Divide int fois la Liste en parametre
	 *                 Ajoute chaque sous Liste � une Liste
	 *                 Retourne la Liste
	 *
	 *   
	 */
	
	public LinkedList<Object> partition(LinkedList<Object> liste, int taille)
{	
			
			/* cr�ation d'une sousListe 
			 * pour partitionner les �l�ments puis
			 * � ajouter � this.partition:
			 */
			
			LinkedList<Object> sousListe = new LinkedList<Object>();
				Iterator<Object> itr = liste.iterator();
				
			while(itr.hasNext())
			{
				/* partitionnement des donn�es 
				 *en sous-listes de la taille:
				 */
				sousListe = new LinkedList<Object>();

				for(int index=0; index<taille; index++)
				{	
					if(itr.hasNext())
						{
						sousListe.add(itr.next());
						}
				}
				
				/* Ajout de chaque sous-liste � 
				 * la Liste principale � retourner:
				 */
				this.partition.add(sousListe);
			}		
		// retourne la liste partitionn�e:
		return this.partition;
	}  // END OF METHOD
	
}  // END OF CLASS
