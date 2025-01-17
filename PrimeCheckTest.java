import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* ToDo: insert a test here */
    //Bekannte Primzahlen testen

    int[]primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
    for(int prime: primes){
      assertEquals("Test Primzahl: " + prime, true, PrimeCheck.isPrime(prime));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* ToDo: insert a test here */
    // Belkannte nicht Primzahlen testen
    int[] nonPrimes = {4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24};
    for(int nonprime; primes) {
      assertEquals("Test keine Primzahl: " + nonprime, false, PrimeCheck.isPrime(nonprime));
    }
  }
}
