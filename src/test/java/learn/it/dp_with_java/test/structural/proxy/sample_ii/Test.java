package learn.it.dp_with_java.test.structural.proxy.sample_ii;


import learn.it.dp_with_java.structural.proxy.sample_ii.IInternet;
import learn.it.dp_with_java.structural.proxy.sample_ii.ProxyInternet;
import org.junit.jupiter.api.Assertions;

public class Test {

  @org.junit.jupiter.api.Test
  public void testInit() {
    IInternet internet = new ProxyInternet();

    Assertions.assertEquals(
      0, internet.getCacheSize()
    );

    internet.connect("somewhere.com" );

    Assertions.assertEquals(
      1, internet.getCacheSize()
    );

    internet.connect( "go-here.com" );

    Assertions.assertEquals(
      2, internet.getCacheSize()
    );

    internet.connect( "somewhere.com" );

    Assertions.assertEquals(
      2, internet.getCacheSize()
    );

    internet.connect( "somewhere-two.net");

    Assertions.assertEquals(
      3, internet.getCacheSize()
    );
  }
}
