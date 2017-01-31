package lecture.unittesting;

import java.io.Closeable;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFixturesDemo {

	//Two resources: one expensive and managed resource that is shared at the class level, 
	//and the other managed resource that is instantiated for each method
	private ManagedResource myManagedResource;
	private static ExpensiveManagedResource myExpensiveManagedResource;
	
	static class ExpensiveManagedResource implements Closeable {
	    @Override
	    public void close() throws IOException {}
	}

	static class ManagedResource implements Closeable {
	    @Override
	    public void close() throws IOException {}
	}
	////
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("@BeforeClass: creating ExpensiveManagedResource");
	    myExpensiveManagedResource = new ExpensiveManagedResource();
	}
	
	 @AfterClass
	 public static void tearDownClass() throws IOException {
	    System.out.println("@AfterClass removing ExpensiveManagedResource");
	    myExpensiveManagedResource.close();
	    myExpensiveManagedResource = null;
	 }
	 
	 @Before
	 public void setUp() {
	    System.out.println("@Before: creating ManagedResource");
	    this.myManagedResource = new ManagedResource();
	 }
	 
	  @After
	  public void tearDown() throws IOException {
	    System.out.println("@After: removing ManagedResource");
	    this.myManagedResource.close();
	    this.myManagedResource = null;
	  }

	  @Test
	  public void test1() {
	    System.out.println("@Test test1()");
	  }

	  @Test
	  public void test2() {
	    System.out.println("@Test test2()");
	  }

}
