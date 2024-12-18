package learn.it.dp_with_java.structural.bridge.sample_i;

public final class ServiceI implements IService {

  @Override
  public String connect(String uri) {
    //REM: [TODO] .|. ...
    return uri;
  }

  @Override
  public int hashCode() {
    return IService.Type.SERVICE_I.CODE;
  }
}
