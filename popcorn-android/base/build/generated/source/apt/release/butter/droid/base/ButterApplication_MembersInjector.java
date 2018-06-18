package butter.droid.base;

import butter.droid.base.manager.updater.ButterUpdateManager;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ButterApplication_MembersInjector implements MembersInjector<ButterApplication> {
  private final Provider<Picasso> picassoProvider;

  private final Provider<ButterUpdateManager> updateManagerProvider;

  public ButterApplication_MembersInjector(
      Provider<Picasso> picassoProvider, Provider<ButterUpdateManager> updateManagerProvider) {
    assert picassoProvider != null;
    this.picassoProvider = picassoProvider;
    assert updateManagerProvider != null;
    this.updateManagerProvider = updateManagerProvider;
  }

  public static MembersInjector<ButterApplication> create(
      Provider<Picasso> picassoProvider, Provider<ButterUpdateManager> updateManagerProvider) {
    return new ButterApplication_MembersInjector(picassoProvider, updateManagerProvider);
  }

  @Override
  public void injectMembers(ButterApplication instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.picasso = picassoProvider.get();
    instance.updateManager = updateManagerProvider.get();
  }

  public static void injectPicasso(ButterApplication instance, Provider<Picasso> picassoProvider) {
    instance.picasso = picassoProvider.get();
  }

  public static void injectUpdateManager(
      ButterApplication instance, Provider<ButterUpdateManager> updateManagerProvider) {
    instance.updateManager = updateManagerProvider.get();
  }
}
