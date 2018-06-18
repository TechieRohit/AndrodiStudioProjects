package butter.droid.fragments;

import butter.droid.base.manager.provider.ProviderManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MediaContainerFragment_MembersInjector
    implements MembersInjector<MediaContainerFragment> {
  private final Provider<ProviderManager> providerManagerProvider;

  public MediaContainerFragment_MembersInjector(Provider<ProviderManager> providerManagerProvider) {
    assert providerManagerProvider != null;
    this.providerManagerProvider = providerManagerProvider;
  }

  public static MembersInjector<MediaContainerFragment> create(
      Provider<ProviderManager> providerManagerProvider) {
    return new MediaContainerFragment_MembersInjector(providerManagerProvider);
  }

  @Override
  public void injectMembers(MediaContainerFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.providerManager = providerManagerProvider.get();
  }

  public static void injectProviderManager(
      MediaContainerFragment instance, Provider<ProviderManager> providerManagerProvider) {
    instance.providerManager = providerManagerProvider.get();
  }
}
