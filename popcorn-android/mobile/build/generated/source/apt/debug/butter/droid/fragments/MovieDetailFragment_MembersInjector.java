package butter.droid.fragments;

import butter.droid.base.manager.provider.ProviderManager;
import butter.droid.base.manager.youtube.YouTubeManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovieDetailFragment_MembersInjector
    implements MembersInjector<MovieDetailFragment> {
  private final Provider<ProviderManager> providerManagerProvider;

  private final Provider<YouTubeManager> youTubeManagerProvider;

  public MovieDetailFragment_MembersInjector(
      Provider<ProviderManager> providerManagerProvider,
      Provider<YouTubeManager> youTubeManagerProvider) {
    assert providerManagerProvider != null;
    this.providerManagerProvider = providerManagerProvider;
    assert youTubeManagerProvider != null;
    this.youTubeManagerProvider = youTubeManagerProvider;
  }

  public static MembersInjector<MovieDetailFragment> create(
      Provider<ProviderManager> providerManagerProvider,
      Provider<YouTubeManager> youTubeManagerProvider) {
    return new MovieDetailFragment_MembersInjector(providerManagerProvider, youTubeManagerProvider);
  }

  @Override
  public void injectMembers(MovieDetailFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.providerManager = providerManagerProvider.get();
    instance.youTubeManager = youTubeManagerProvider.get();
  }

  public static void injectProviderManager(
      MovieDetailFragment instance, Provider<ProviderManager> providerManagerProvider) {
    instance.providerManager = providerManagerProvider.get();
  }

  public static void injectYouTubeManager(
      MovieDetailFragment instance, Provider<YouTubeManager> youTubeManagerProvider) {
    instance.youTubeManager = youTubeManagerProvider.get();
  }
}
