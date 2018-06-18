package butter.droid.activities;

import butter.droid.base.manager.updater.ButterUpdateManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreferencesActivity_MembersInjector
    implements MembersInjector<PreferencesActivity> {
  private final Provider<ButterUpdateManager> updateManagerProvider;

  public PreferencesActivity_MembersInjector(Provider<ButterUpdateManager> updateManagerProvider) {
    assert updateManagerProvider != null;
    this.updateManagerProvider = updateManagerProvider;
  }

  public static MembersInjector<PreferencesActivity> create(
      Provider<ButterUpdateManager> updateManagerProvider) {
    return new PreferencesActivity_MembersInjector(updateManagerProvider);
  }

  @Override
  public void injectMembers(PreferencesActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    butter.droid.activities.base.ButterBaseActivity_MembersInjector.injectUpdateManager(
        instance, updateManagerProvider);
    instance.updateManager = updateManagerProvider.get();
  }

  public static void injectUpdateManager(
      PreferencesActivity instance, Provider<ButterUpdateManager> updateManagerProvider) {
    instance.updateManager = updateManagerProvider.get();
  }
}
