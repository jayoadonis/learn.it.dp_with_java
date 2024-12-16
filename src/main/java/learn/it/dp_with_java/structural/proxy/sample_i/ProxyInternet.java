package learn.it.dp_with_java.structural.proxy.sample_i;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements IInternet {

  private final IInternet INTERNET = new SimpleInternet();

  private static final List<String> BANNED_URL = new ArrayList<>(9);

  static {
    ProxyInternet.BANNED_URL.add("www.banned.com");
    ProxyInternet.BANNED_URL.add("banned.com");
  }

  @Override
  public String connect( String url ) throws RuntimeException {
    if( url.isBlank() )
      throw new RuntimeException("Invalid url: '" + (url) + "'" );

    final String RESULT_URL = this.INTERNET.connect(url);

    if( ProxyInternet.BANNED_URL.contains( RESULT_URL.toLowerCase() ) )
      throw new RuntimeException("Banned url: '" + (url) + "'" );

    return RESULT_URL;
  }
}
