package learn.it.dp_with_java.test.structural.bridge.sample_i;

import learn.it.dp_with_java.structural.bridge.sample_i.*;
import org.junit.jupiter.api.Assertions;

public class Test {

  @org.junit.jupiter.api.Test
  public void testInit() {
    IService serviceI = new ServiceI();
    IService serviceII = new ServiceII();

    ServiceProxy serviceProxy = new ServiceProxyCache(serviceI);
    ServiceProxyCache serviceProxyCache = (ServiceProxyCache)serviceProxy;

    Assertions.assertEquals( 0, serviceProxyCache.getCacheSize() );

    serviceProxy.connect("somewhere.com");

    Assertions.assertEquals( 1, serviceProxyCache.getCacheSize() );

    serviceProxy.connect("somewhere.com");

    Assertions.assertEquals( 1, serviceProxyCache.getCacheSize() );

    serviceProxy.setService( serviceII );

    serviceProxy.connect("somewhere.com");

    Assertions.assertEquals( 2, serviceProxyCache.getCacheSize() );

    serviceProxy.connect("somewhere.com");
    Assertions.assertEquals( 2, serviceProxyCache.getCacheSize() );

    serviceProxy.setService(serviceI);

    serviceProxy.connect("somewhere.com");
    Assertions.assertEquals( 2, serviceProxyCache.getCacheSize() );
  }
}