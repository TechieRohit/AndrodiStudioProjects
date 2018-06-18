package butter.droid.fragments;

import butter.droid.base.manager.provider.ProviderManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StreamLoadingFragment_MembersInjector
    implements MembersInjector<StreamLoadingFragment> {
  private final Provider<ProviderManager> providerManagerProvider;

  public StreamLoadingFragment_MembersInjector(Provider<ProviderManager> providerManagerProvider) {
    assert providerManagerProvider != null;
    this.providerManagerProvider = providerManagerProvider;
  }

  public static MembersInjector<StreamLoadingFragment> create(
      Provider<ProviderManager> providerManagerProvider) {
    return new StreamLoadingFragment_MembersInjector(providerManagerProvider);
  }

  @Override
  public void injectMembers(StreamLoadingFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    butter.droid.base.fragments.BaseStreamLoadingFragment_MembersInjector.injectProviderManager(
        instance, providerManagerProvider);
  }
}
