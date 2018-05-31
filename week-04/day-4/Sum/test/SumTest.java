import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void sumOfElements() {
    Sum number = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    Integer expected = 10;

    assertEquals(expected, number.sumOfElements(numbers));
  }

  @Test
  public void emptyListAdded() {
    Sum number = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>();

    Integer expected = 0;

    assertEquals(expected, number.sumOfElements(numbers));
  }

  @Test
  public void listWithOneElement() {
    Sum number = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(2);
    Integer expected = 2;

    assertEquals(expected, number.sumOfElements(numbers));
  }

  @Test
  public void listWithZero() {
    Sum number = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(0);
    Integer expected = 0;

    assertEquals(expected, number.sumOfElements(numbers));
  }
}