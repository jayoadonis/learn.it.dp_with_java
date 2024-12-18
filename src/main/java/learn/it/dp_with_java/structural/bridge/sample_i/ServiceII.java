package learn.it.dp_with_java.structural.bridge.sample_i;

public final class ServiceII implements IService {

  @Override
  public String connect(String uri) {
    if( uri.startsWith("https://") )
      return uri;
    return "https://" + uri;
  }

  @Override
  public int hashCode() {
    return IService.Type.SERVICE_II.CODE;
  }
}
