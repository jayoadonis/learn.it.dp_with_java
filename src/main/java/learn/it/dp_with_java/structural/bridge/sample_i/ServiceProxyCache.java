package learn.it.dp_with_java.structural.bridge.sample_i;

import java.util.HashMap;
import java.util.Map;

public class ServiceProxyCache extends ServiceProxy {

  private static final Map<Integer, IService> SERVICE_CACHES
    = new HashMap<>(9);

  public ServiceProxyCache( IService service ) {
    super( service );
  }

  @Override
  public String connect(String uri) {

    if( uri == null || uri.isBlank() || super.service == null )
      return null;

    uri = uri.trim().toLowerCase();

    final int ID = super.service.hashCode() + uri.hashCode();
    if( !SERVICE_CACHES.containsKey(ID) )
      SERVICE_CACHES.put(ID, super.service );

    return SERVICE_CACHES.get(ID).connect(uri);
  }

  public int getCacheSize() {
    return SERVICE_CACHES.size();
  }

}
