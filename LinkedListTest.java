import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedListTest {

 @Test(expected = IndexOutOfBoundsException.class)
  public void testIndexOutOfBoundsExceptionIsThrown() {
    LinkedList tester = new LinkedList();
    tester.get(1000);
  }

  @Test
  public void testAddElementAtPosition() {
    LinkedList<Integer> tester = new LinkedList<>();
    
    // load up a list with 5 elements
    tester.add(0);
    tester.add(1);
    tester.add(2);
    tester.add(3);
    tester.add(4);
    tester.add(5);
    
    // insert into that list a new element at specific positions
    tester.add(1, 100);
    assertEquals("after adding elements the new postion 1 should be", new Integer(100), tester.get(1));
    assertEquals("after adding elements the new postion 2 should be", new Integer(1), tester.get(2));
    tester.add(1, 200);
    assertEquals("after adding elements the new position 1 should be", new Integer(200), tester.get(1));
    assertEquals("after adding elements the new position 2 should be", new Integer(100), tester.get(2));
    assertEquals("after adding elements the new position 3 should be", new Integer(1), tester.get(3));
  }
  
  @Test
  public void testAddAndSize() {
    LinkedList<String> tester = new LinkedList<>();
    tester.add("dog");
    tester.add("cat");
    tester.add("mouse");
    tester.add("bird");
    tester.add("frog");
    tester.add("turtle");
    tester.add("hamster");
    assertEquals("after adding 7 elements the size should be", 7, tester.size());
  }

  @Test
  public void testRemoveElementAtPositionAndGet() {
    LinkedList<Integer> tester = new LinkedList<>();
    tester.add(888);
    tester.add(100);
    tester.add(200);
    tester.add(300);
    tester.add(400);
    tester.add(500);
    int x = tester.get(3);
    tester.remove(3);
    assertEquals("after remove value at index 3 no longer exist in the list", -1, tester.indexOf(x));

   }

  @Test
  public void testIndexOf() {
    LinkedList<Integer> tester = new LinkedList<>();
    tester.add(888);
    tester.add(100);
    tester.add(200);
    tester.add(300);
    tester.add(400);
    tester.add(500);
    assertEquals("after index of 200 should be", 2, tester.indexOf(200));
   }
   
  @Test
  public void testToString() {
    LinkedList<String> tester = new LinkedList<>();
    tester.add("hop");
    tester.add("skip");
    tester.add("jump");
    tester.add("leap");
    assertEquals("after toString shoule be", "[hop, skip, jump, leap]", tester+"");
   }

 @Test
  public void testEquals() {
  
    // check if two lists are equal
    LinkedList<Integer> testList1 = new LinkedList<>();
    testList1.add(0);
    testList1.add(100);
    testList1.add(200);
    testList1.add(300);
    testList1.add(400);
    testList1.add(500);
    
    LinkedList<Integer> testList2 = new LinkedList<>();
    testList2.add(0);
    testList2.add(100);
    testList2.add(200);
    testList2.add(300);
    testList2.add(400);
    testList2.add(500);

    assertEquals("list 1 should be eqaul to list 2", true, testList1.equals(testList2));
    
    // check if two lists are not equal
    LinkedList<Integer> testList3 = new LinkedList<>();
    testList3.add(0);
    testList3.add(100);
    testList3.add(200);
    testList3.add(305);
    testList3.add(400);
    testList3.add(500);
    
    assertEquals("list 1 should not be eqaul to list 3", false, testList1.equals(testList3));
    
    // check if two empty lists are equal
    LinkedList testList4 = new LinkedList();
    LinkedList testList5 = new LinkedList();

    assertEquals("empty list 4 should eqaul to empty list 5", true, testList4.equals(testList5)); 
  }


 @Test
  public void testInsertList() {
  
    // check inserting one list into another at index
    LinkedList<Integer> testList1 = new LinkedList<>();
    testList1.add(0);
    testList1.add(100);
    testList1.add(200);
    testList1.add(300);
    testList1.add(400);
    testList1.add(500);
    
    LinkedList<Integer> testList2 = new LinkedList<>();
    testList2.add(0);
    testList2.add(100);
    testList2.add(200);
    testList2.add(300);
    testList2.add(400);
    testList2.add(500);
    
    // answer list
    LinkedList<Integer> testList3 = new LinkedList<>();
    testList3.add(0);
    testList3.add(100);
    testList3.add(0);
    testList3.add(100);
    testList3.add(200);
    testList3.add(300);
    testList3.add(400);
    testList3.add(500);
    testList3.add(200);
    testList3.add(300);
    testList3.add(400);
    testList3.add(500);

    testList1.insertList(2, testList2);
    
    assertEquals("list after insert should be eqaul to combined list", true, testList1.equals(testList3));
  }

}