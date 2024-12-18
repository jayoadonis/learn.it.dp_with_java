package learn.it.dp_with_java.structural.bridge.sample_i;

public abstract class ServiceProxy {

  protected IService service;

  public ServiceProxy( IService service ) {
    this.service = service;
  }

  public void setService( IService service ) {
    if( service != null )
      this.service = service;
  }

  public abstract String connect(String uri);
}
