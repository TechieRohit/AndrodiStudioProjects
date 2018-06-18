package butter.droid.base.fragments;

import butter.droid.base.manager.provider.ProviderManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseVideoPlayerFragment_MembersInjector
    implements MembersInjector<BaseVideoPlayerFragment> {
  private final Provider<ProviderManager> providerManagerProvider;

  public BaseVideoPlayerFragment_MembersInjector(
      Provider<ProviderManager> providerManagerProvider) {
    assert providerManagerProvider != null;
    this.providerManagerProvider = providerManagerProvider;
  }

  public static MembersInjector<BaseVideoPlayerFragment> create(
      Provider<ProviderManager> providerManagerProvider) {
    return new BaseVideoPlayerFragment_MembersInjector(providerManagerProvider);
  }

  @Override
  public void injectMembers(BaseVideoPlayerFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.providerManager = providerManagerProvider.get();
  }

  public static void injectProviderManager(
      BaseVideoPlayerFragment instance, Provider<ProviderManager> providerManagerProvider) {
    instance.providerManager = providerManagerProvider.get();
  }
}
