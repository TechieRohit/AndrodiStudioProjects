package butter.droid.activities;

import butter.droid.base.manager.updater.ButterUpdateManager;
import butter.droid.base.manager.youtube.YouTubeManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrailerPlayerActivity_MembersInjector
    implements MembersInjector<TrailerPlayerActivity> {
  private final Provider<ButterUpdateManager> updateManagerProvider;

  private final Provider<YouTubeManager> youTubeManagerProvider;

  public TrailerPlayerActivity_MembersInjector(
      Provider<ButterUpdateManager> updateManagerProvider,
      Provider<YouTubeManager> youTubeManagerProvider) {
    assert updateManagerProvider != null;
    this.updateManagerProvider = updateManagerProvider;
    assert youTubeManagerProvider != null;
    this.youTubeManagerProvider = youTubeManagerProvider;
  }

  public static MembersInjector<TrailerPlayerActivity> create(
      Provider<ButterUpdateManager> updateManagerProvider,
      Provider<YouTubeManager> youTubeManagerProvider) {
    return new TrailerPlayerActivity_MembersInjector(updateManagerProvider, youTubeManagerProvider);
  }

  @Override
  public void injectMembers(TrailerPlayerActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    butter.droid.activities.base.ButterBaseActivity_MembersInjector.injectUpdateManager(
        instance, updateManagerProvider);
    instance.youTubeManager = youTubeManagerProvider.get();
  }

  public static void injectYouTubeManager(
      TrailerPlayerActivity instance, Provider<YouTubeManager> youTubeManagerProvider) {
    instance.youTubeManager = youTubeManagerProvider.get();
  }
}
