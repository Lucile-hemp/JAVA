/**
 * @author www.linkedin.com/in/ren%C3%A9e-l-dirry-337b26189/
 *   @see Raymond Barre Toua
 * @package adneomSujet1
 * @version 1.0
 *
 */
package adneomSujet1;
import java.util.LinkedList;


/**
 * Interface IAdneomPartition
 * Declare une seule fonction � impl�menter:
 *  partition()
 *
 *  
 */
public interface IAdneomPartition {

	/**
	 * Partition
	 * @param liste LinkedList
	 * @param taille int
	 * @return partition LinkedList
	 */
	
	
	public LinkedList<Object> partition(LinkedList<Object> liste, int taille);
}
