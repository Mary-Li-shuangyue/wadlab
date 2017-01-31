package gla.cs.joose.coursework.invmgt;

import gla.cs.joose.coursework.invmgt.model.Item;
import gla.cs.joose.coursework.invmgt.model.ItemFactory;
import junit.framework.TestCase;
import static org.junit.Assert.*;

public class Task10 extends TestCase {
	
	Item testItem = new Item();
	
	@Test(expected=NullPointerException.class)
	public void testEmptyBarcode() {
		ItemFactory.addItem(testItem.getBarcode(), testItem.getItemName(), testItem.getItemType().toString(), testItem.getQuantity(),
				testItem.getSupplier(),testItem.getDescription());
		
	}

}
