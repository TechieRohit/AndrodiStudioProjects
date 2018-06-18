package butter.droid.fragments;

import butter.droid.base.manager.provider.ProviderManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VideoPlayerFragment_MembersInjector
    implements MembersInjector<VideoPlayerFragment> {
  private final Provider<ProviderManager> providerManagerProvider;

  public VideoPlayerFragment_MembersInjector(Provider<ProviderManager> providerManagerProvider) {
    assert providerManagerProvider != null;
    this.providerManagerProvider = providerManagerProvider;
  }

  public static MembersInjector<VideoPlayerFragment> create(
      Provider<ProviderManager> providerManagerProvider) {
    return new VideoPlayerFragment_MembersInjector(providerManagerProvider);
  }

  @Override
  public void injectMembers(VideoPlayerFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    butter.droid.base.fragments.BaseVideoPlayerFragment_MembersInjector.injectProviderManager(
        instance, providerManagerProvider);
  }
}
