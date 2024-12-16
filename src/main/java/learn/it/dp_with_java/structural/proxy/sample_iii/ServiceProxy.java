package learn.it.dp_with_java.structural.proxy.sample_iii;

import java.util.HashSet;
import java.util.Set;

public class ServiceProxy implements IService {

  public static final Set<IService> REPO = new HashSet<>(5);
  public final int HASH;

  public ServiceProxy( final IService service ) {
    REPO.add( service );
    this.HASH = service.hashCode();
  }

  @Override
  public void response() {
    for( IService service : REPO ) {
      if( service.hashCode() == this.HASH ) {
        service.response();
        break;
      }
    }
  }

  public static int getRepoSize() {
    return REPO.size();
  }

  @Override
  public String toString() {
    return String.format(
      "%s@%x[repoSize=%d]",
      this.getClass().getCanonicalName(),
      this.hashCode(),
      REPO.size()
    );
  }
}
