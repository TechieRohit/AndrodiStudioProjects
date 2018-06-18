package butter.droid.base.fragments;

import butter.droid.base.manager.provider.ProviderManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseStreamLoadingFragment_MembersInjector
    implements MembersInjector<BaseStreamLoadingFragment> {
  private final Provider<ProviderManager> providerManagerProvider;

  public BaseStreamLoadingFragment_MembersInjector(
      Provider<ProviderManager> providerManagerProvider) {
    assert providerManagerProvider != null;
    this.providerManagerProvider = providerManagerProvider;
  }

  public static MembersInjector<BaseStreamLoadingFragment> create(
      Provider<ProviderManager> providerManagerProvider) {
    return new BaseStreamLoadingFragment_MembersInjector(providerManagerProvider);
  }

  @Override
  public void injectMembers(BaseStreamLoadingFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.providerManager = providerManagerProvider.get();
  }

  public static void injectProviderManager(
      BaseStreamLoadingFragment instance, Provider<ProviderManager> providerManagerProvider) {
    instance.providerManager = providerManagerProvider.get();
  }
}
