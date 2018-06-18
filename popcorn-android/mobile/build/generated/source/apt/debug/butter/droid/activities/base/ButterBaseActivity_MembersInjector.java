package butter.droid.activities.base;

import butter.droid.base.manager.updater.ButterUpdateManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ButterBaseActivity_MembersInjector
    implements MembersInjector<ButterBaseActivity> {
  private final Provider<ButterUpdateManager> updateManagerProvider;

  public ButterBaseActivity_MembersInjector(Provider<ButterUpdateManager> updateManagerProvider) {
    assert updateManagerProvider != null;
    this.updateManagerProvider = updateManagerProvider;
  }

  public static MembersInjector<ButterBaseActivity> create(
      Provider<ButterUpdateManager> updateManagerProvider) {
    return new ButterBaseActivity_MembersInjector(updateManagerProvider);
  }

  @Override
  public void injectMembers(ButterBaseActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.updateManager = updateManagerProvider.get();
  }

  public static void injectUpdateManager(
      ButterBaseActivity instance, Provider<ButterUpdateManager> updateManagerProvider) {
    instance.updateManager = updateManagerProvider.get();
  }
}
