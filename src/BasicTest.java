import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BasicTest {
  private int intA = 2, intB =3, intExpected = 5; 
  private double doubleA = 2.00, doubleB =3.33, doubleExpected = 5.3; 
  MyMath myMathInt = new MyMath(intA, intB);
  MyMath myMathDouble = new MyMath(doubleA, doubleB);
  
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testInt() {
    assertTrue(intExpected == myMathInt.add());
  }
  
  @Test
  public void testDouble() {
    assertTrue(doubleExpected == myMathDouble.add());
  }

}
