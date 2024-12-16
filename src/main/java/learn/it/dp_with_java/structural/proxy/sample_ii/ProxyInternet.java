package learn.it.dp_with_java.structural.proxy.sample_ii;

import java.util.HashMap;
import java.util.Map;

public class ProxyInternet implements IInternet {

  private static final Map<String, IInternet> CONNECTION_CACHES
    = new HashMap<>(9);

  @Override
  public String connect( String url ) {
    url = url.toLowerCase();
    if( !CONNECTION_CACHES.containsKey(url) )
      CONNECTION_CACHES.put(url, new SimpleInternet() );

    return CONNECTION_CACHES.get(url).connect(url);
  }

  @Override
  public final int getCacheSize() {
    return CONNECTION_CACHES.size();
  }
}
