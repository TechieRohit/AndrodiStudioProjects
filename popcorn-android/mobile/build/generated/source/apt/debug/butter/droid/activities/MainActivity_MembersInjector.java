package butter.droid.activities;

import butter.droid.base.manager.provider.ProviderManager;
import butter.droid.base.manager.updater.ButterUpdateManager;
import butter.droid.base.manager.youtube.YouTubeManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<ButterUpdateManager> updateManagerProvider;

  private final Provider<ProviderManager> providerManagerProvider;

  private final Provider<YouTubeManager> youTubeManagerProvider;

  public MainActivity_MembersInjector(
      Provider<ButterUpdateManager> updateManagerProvider,
      Provider<ProviderManager> providerManagerProvider,
      Provider<YouTubeManager> youTubeManagerProvider) {
    assert updateManagerProvider != null;
    this.updateManagerProvider = updateManagerProvider;
    assert providerManagerProvider != null;
    this.providerManagerProvider = providerManagerProvider;
    assert youTubeManagerProvider != null;
    this.youTubeManagerProvider = youTubeManagerProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<ButterUpdateManager> updateManagerProvider,
      Provider<ProviderManager> providerManagerProvider,
      Provider<YouTubeManager> youTubeManagerProvider) {
    return new MainActivity_MembersInjector(
        updateManagerProvider, providerManagerProvider, youTubeManagerProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    butter.droid.activities.base.ButterBaseActivity_MembersInjector.injectUpdateManager(
        instance, updateManagerProvider);
    instance.providerManager = providerManagerProvider.get();
    instance.youTubeManager = youTubeManagerProvider.get();
  }

  public static void injectProviderManager(
      MainActivity instance, Provider<ProviderManager> providerManagerProvider) {
    instance.providerManager = providerManagerProvider.get();
  }

  public static void injectYouTubeManager(
      MainActivity instance, Provider<YouTubeManager> youTubeManagerProvider) {
    instance.youTubeManager = youTubeManagerProvider.get();
  }
}
