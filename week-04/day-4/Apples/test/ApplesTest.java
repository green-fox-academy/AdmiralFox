import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

  @Test
  public void getAppleTest() {
    String message = "appple";
    Apples apple = new Apples();

    assertEquals(message, apple.getApple());
  }
}