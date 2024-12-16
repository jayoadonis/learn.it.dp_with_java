package learn.it.dp_with_java.structural.proxy.sample_i;

public class SimpleInternet implements IInternet {

  /**
   *
   * @param url
   * @return return an URL/URI with a <em>'www.'</em> as mandatory prefix
   * @throws RuntimeException
   */
  @Override
  public String connect( String url ) throws RuntimeException {
    if( !url.substring(0,url.indexOf('.')+1).equalsIgnoreCase("www.") )
      url = ("www." + url);
    return url;
  }
}
