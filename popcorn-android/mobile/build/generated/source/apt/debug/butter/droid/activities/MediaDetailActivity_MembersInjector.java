package butter.droid.activities;

import butter.droid.base.manager.updater.ButterUpdateManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MediaDetailActivity_MembersInjector
    implements MembersInjector<MediaDetailActivity> {
  private final Provider<ButterUpdateManager> updateManagerProvider;

  public MediaDetailActivity_MembersInjector(Provider<ButterUpdateManager> updateManagerProvider) {
    assert updateManagerProvider != null;
    this.updateManagerProvider = updateManagerProvider;
  }

  public static MembersInjector<MediaDetailActivity> create(
      Provider<ButterUpdateManager> updateManagerProvider) {
    return new MediaDetailActivity_MembersInjector(updateManagerProvider);
  }

  @Override
  public void injectMembers(MediaDetailActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    butter.droid.activities.base.ButterBaseActivity_MembersInjector.injectUpdateManager(
        instance, updateManagerProvider);
  }
}
