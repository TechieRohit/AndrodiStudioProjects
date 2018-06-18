package butter.droid.fragments.dialog;

import butter.droid.base.manager.provider.ProviderManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoadingDetailDialogFragment_MembersInjector
    implements MembersInjector<LoadingDetailDialogFragment> {
  private final Provider<ProviderManager> providerManagerProvider;

  public LoadingDetailDialogFragment_MembersInjector(
      Provider<ProviderManager> providerManagerProvider) {
    assert providerManagerProvider != null;
    this.providerManagerProvider = providerManagerProvider;
  }

  public static MembersInjector<LoadingDetailDialogFragment> create(
      Provider<ProviderManager> providerManagerProvider) {
    return new LoadingDetailDialogFragment_MembersInjector(providerManagerProvider);
  }

  @Override
  public void injectMembers(LoadingDetailDialogFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.providerManager = providerManagerProvider.get();
  }

  public static void injectProviderManager(
      LoadingDetailDialogFragment instance, Provider<ProviderManager> providerManagerProvider) {
    instance.providerManager = providerManagerProvider.get();
  }
}
