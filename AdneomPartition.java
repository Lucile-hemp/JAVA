/**
 * @author www.linkedin.com/in/ren%C3%A9e-l-dirry-337b26189/
 * @package adneomSujet1
 * @version 1.0
 */
package adneomSujet1;
import java.util.LinkedList;
import java.util.Iterator;

/**
 * class AdneomPartition
 * Cette classe implemente l'interface IAdneomPartition
 *  
 * Elle implemente la Liste sous la forme d'une LinkedList d'Object
 */

public class AdneomPartition implements IAdneomPartition
{
	/*
	 * Private variable
	 */ 
	private LinkedList<Object> mainPartition;
	
	/**
	 * Contructeur:
	 * 
	 * cree la Liste sous la forme d'une ArrayList d'Object
	 * 
	 */
	public AdneomPartition()
	{
		mainPartition = new LinkedList<Object>();
	}
	
	/**
	 * fonction partition
	 * @param liste LinkedList, taille int
	 * @return partition LinkedList  
	 * Implementation: Cree des sous listes
	 *                 Itere la Liste en parametre
	 *                 Divide int fois la Liste en parametre
	 *                 Ajoute chaque sous Liste à une Liste
	 *                 Retourne la Liste
	 *   
	 */
	
	public LinkedList<Object> partition(LinkedList<Object> liste, int taille)
{	
			
			/* création d'une sousListe 
			 * pour partitionner les éléments puis
			 * à ajouter à this.partition:
			 */
			
			LinkedList<Object> sousListe = new LinkedList<Object>();
			Iterator<Object> itr = liste.iterator();
				
			while(itr.hasNext())
			{
				/* partitionnement des données 
				 *en sous-listes de la taille:
				 */
				sousListe = new LinkedList<Object>();

				for(int index=0; index<taille; index++)
				{	
					if(itr.hasNext())
						sousListe.add(itr.next());
				}
				
				/* Ajout de chaque sous-liste à 
				 * la Liste principale à retourner:
				 */
				 
				this.mainPartition.add(sousListe);
			}		
		// retourne la liste partitionnée:
		return this.mainPartition;
	}  // END OF METHOD
	
}  // END OF CLASS
