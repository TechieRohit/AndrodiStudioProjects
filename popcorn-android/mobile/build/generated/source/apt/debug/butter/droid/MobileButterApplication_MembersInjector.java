package butter.droid;

import butter.droid.base.manager.updater.ButterUpdateManager;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MobileButterApplication_MembersInjector
    implements MembersInjector<MobileButterApplication> {
  private final Provider<Picasso> picassoProvider;

  private final Provider<ButterUpdateManager> updateManagerProvider;

  public MobileButterApplication_MembersInjector(
      Provider<Picasso> picassoProvider, Provider<ButterUpdateManager> updateManagerProvider) {
    assert picassoProvider != null;
    this.picassoProvider = picassoProvider;
    assert updateManagerProvider != null;
    this.updateManagerProvider = updateManagerProvider;
  }

  public static MembersInjector<MobileButterApplication> create(
      Provider<Picasso> picassoProvider, Provider<ButterUpdateManager> updateManagerProvider) {
    return new MobileButterApplication_MembersInjector(picassoProvider, updateManagerProvider);
  }

  @Override
  public void injectMembers(MobileButterApplication instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    butter.droid.base.ButterApplication_MembersInjector.injectPicasso(instance, picassoProvider);
    butter.droid.base.ButterApplication_MembersInjector.injectUpdateManager(
        instance, updateManagerProvider);
  }
}
