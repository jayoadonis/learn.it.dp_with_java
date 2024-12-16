package learn.it.dp_with_java.test.structural.proxy.sample_iii;

import learn.it.dp_with_java.structural.proxy.sample_iii.IService;
import learn.it.dp_with_java.structural.proxy.sample_iii.ServiceI;
import learn.it.dp_with_java.structural.proxy.sample_iii.ServiceProxy;
import org.junit.jupiter.api.Assertions;

public class Test {

  @org.junit.jupiter.api.Test
  public void TestInit() {
    System.out.println(
      ">>>> " + (IService.STATE)
    );

    IService serviceI = new ServiceI();
    IService serviceIa = new ServiceI();
    IService serviceProxy = new ServiceProxy(serviceI);
    IService serviceProxya = new ServiceProxy(serviceIa);

    System.out.println(serviceProxy);
    System.out.println(serviceProxya);
    serviceProxy.response();
    serviceProxya.response();

    Assertions.assertEquals( (byte)127, IService.STATE );
  }
}
