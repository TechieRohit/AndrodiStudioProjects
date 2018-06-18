package butter.droid.fragments;

import butter.droid.base.manager.provider.ProviderManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MediaListFragment_MembersInjector implements MembersInjector<MediaListFragment> {
  private final Provider<ProviderManager> providerManagerProvider;

  private final Provider<OkHttpClient> clientProvider;

  public MediaListFragment_MembersInjector(
      Provider<ProviderManager> providerManagerProvider, Provider<OkHttpClient> clientProvider) {
    assert providerManagerProvider != null;
    this.providerManagerProvider = providerManagerProvider;
    assert clientProvider != null;
    this.clientProvider = clientProvider;
  }

  public static MembersInjector<MediaListFragment> create(
      Provider<ProviderManager> providerManagerProvider, Provider<OkHttpClient> clientProvider) {
    return new MediaListFragment_MembersInjector(providerManagerProvider, clientProvider);
  }

  @Override
  public void injectMembers(MediaListFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.providerManager = providerManagerProvider.get();
    instance.client = clientProvider.get();
  }

  public static void injectProviderManager(
      MediaListFragment instance, Provider<ProviderManager> providerManagerProvider) {
    instance.providerManager = providerManagerProvider.get();
  }

  public static void injectClient(
      MediaListFragment instance, Provider<OkHttpClient> clientProvider) {
    instance.client = clientProvider.get();
  }
}
