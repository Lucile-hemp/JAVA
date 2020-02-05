/**
 * 
 */
package adneomSujet1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;

/**
 * @author Lucile
 *
 */
class AdneomPartitionTest extends AdneomPartition {

	/**
	 * Test method for {@link adneomSujet1.AdneomPartition#AdneomPartition()}.
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 */
	@Test
	final void testAdneomPartition() throws NoSuchFieldException, SecurityException {
		AdneomPartition maPartition = new AdneomPartition();
	
	assertEquals(null,maPartition);
	assertEquals("LinkedList",maPartition.getClass().getSimpleName());
			
}

	/**
	 * Test method for {@link adneomSujet1.AdneomPartition#partition(java.util.LinkedList, int)}.
	 */
	@Test
	final void testPartition() {
		

		LinkedList<Object> originalListe = new LinkedList<Object>();
		originalListe.add("1");
		originalListe.add("2");
		originalListe.add("3");
		originalListe.add("4");
		originalListe.add("5");
			
		AdneomPartition maPartition = new AdneomPartition();
		
		LinkedList<Object> lst = maPartition.partition(originalListe, 2);		
		
				
		assertEquals("LinkedList", lst.get(0).getClass().getSimpleName());
		assertEquals("LinkedList", lst.get(1).getClass().getSimpleName());
		assertEquals("LinkedList", lst.get(2).getClass().getSimpleName());
	
		LinkedList<Object> dummy; 
		for(int index=0; index  < lst.size(); index++)
		{
			dummy = ((LinkedList<Object>) lst.get(index));
				
		/*
		assertEquals("Object", dummy.get(0).getClass().getSimpleName());
		assertEquals("Object", lst.get(0).get(1).getClass().getSimpleName());
		assertEquals("Object", lst.get(0).get(2).getClass().getSimpleName());
		assertEquals("Object", lst.get(0).get(3).getClass().getSimpleName());
		assertEquals("Object", lst.get(0).get(4).getClass().getSimpleName());
		

		assertEquals("Object", lst.get(1).get(0).getClass().getSimpleName());
		assertEquals("Object", lst.get(1).get(1).getClass().getSimpleName());
		assertEquals("Object", lst.get(1).get(2).getClass().getSimpleName());
		assertEquals("Object", lst.get(1).get(3).getClass().getSimpleName());
		assertEquals("Object", lst.get(1).get(4).getClass().getSimpleName());
		

		assertEquals("Object", lst.get(2).get(0).getClass().getSimpleName());
		assertEquals("Object", lst.get(2).get(1).getClass().getSimpleName());
		assertEquals("Object", lst.get(2).get(2).getClass().getSimpleName());
		assertEquals("Object", lst.get(2).get(3).getClass().getSimpleName());
		assertEquals("Object", lst.get(2).get(4).getClass().getSimpleName());
		
		*/
		
		assertEquals("1", dummy.get(0));
		assertEquals("2", dummy.get(1));
		assertEquals("3", dummy.get(2));
		assertEquals("4", dummy.get(3));
		assertEquals("5", dummy.get(4));
		
		} // END FOR LOOP
		
		
		lst = maPartition.partition(originalListe, 3);		
		
		assertEquals("Liste", lst.get(0).getClass().getSimpleName());
		assertEquals("Liste", lst.get(1).getClass().getSimpleName());

		/*
		assertEquals("Object", lst.get(0).get(0).getClass().getSimpleName());
		assertEquals("Object", lst.get(0).get(1).getClass().getSimpleName());
		assertEquals("Object", lst.get(1).get(0).getClass().getSimpleName());
		assertEquals("Object", lst.get(1).get(1).getClass().getSimpleName());
		assertEquals("Object", lst.get(2).get(0).getClass().getSimpleName());
		*/

		assertEquals("1", dummy.get(0));
		assertEquals("2", dummy.get(1));
		assertEquals("3", dummy.get(2));
		assertEquals("4", dummy.get(3));
		assertEquals("5", dummy.get(4));
		
		lst = maPartition.partition(originalListe, 1);		
				

		assertEquals("Liste", lst.get(0).getClass().getSimpleName());
		assertEquals("Liste", lst.get(1).getClass().getSimpleName());
		assertEquals("Liste", lst.get(2).getClass().getSimpleName());
		assertEquals("Liste", lst.get(3).getClass().getSimpleName());
		assertEquals("Liste", lst.get(4).getClass().getSimpleName());

		/*
		assertEquals("Object", lst.get(0).get(0).getClass().getSimpleName());
		assertEquals("Object", lst.get(1).get(0).getClass().getSimpleName());
		assertEquals("Object", lst.get(2).get(0).getClass().getSimpleName());
		assertEquals("Object", lst.get(3).get(0).getClass().getSimpleName());
		assertEquals("Object", lst.get(4).get(0).getClass().getSimpleName());
		
		*/

		assertEquals("1", dummy.get(0));
		assertEquals("2", dummy.get(1));
		assertEquals("3", dummy.get(2));
		assertEquals("4", dummy.get(3));
		assertEquals("5", dummy.get(4));
		
	
	
	}

}
