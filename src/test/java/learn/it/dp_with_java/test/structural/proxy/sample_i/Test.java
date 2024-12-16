package learn.it.dp_with_java.test.structural.proxy.sample_i;

import learn.it.dp_with_java.structural.proxy.sample_i.IInternet;
import learn.it.dp_with_java.structural.proxy.sample_i.ProxyInternet;
import org.junit.jupiter.api.Assertions;

public class Test {

  @org.junit.jupiter.api.Test
  public void testInit() {
    IInternet internet = new ProxyInternet();
    Throwable t = Assertions.assertThrowsExactly(
      RuntimeException.class,
      () -> { internet.connect("banned.com"); }
    );

    Assertions.assertTrue(
      t.getMessage().toLowerCase().contains("banned url")
    );

    String result = Assertions.assertDoesNotThrow(
      () -> { return internet.connect("somewhere.com"); }
    );

    Assertions.assertEquals("www.somewhere.com", result );

    t = Assertions.assertThrowsExactly(
      RuntimeException.class,
      () -> { internet.connect("   "); }
    );

    Assertions.assertTrue(
      t.getMessage().toLowerCase().contains("invalid url")
    );
  }
}
