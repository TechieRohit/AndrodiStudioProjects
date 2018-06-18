package butter.droid.fragments.dialog;

import butter.droid.base.manager.provider.ProviderManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EpisodeDialogFragment_MembersInjector
    implements MembersInjector<EpisodeDialogFragment> {
  private final Provider<ProviderManager> providerManagerProvider;

  public EpisodeDialogFragment_MembersInjector(Provider<ProviderManager> providerManagerProvider) {
    assert providerManagerProvider != null;
    this.providerManagerProvider = providerManagerProvider;
  }

  public static MembersInjector<EpisodeDialogFragment> create(
      Provider<ProviderManager> providerManagerProvider) {
    return new EpisodeDialogFragment_MembersInjector(providerManagerProvider);
  }

  @Override
  public void injectMembers(EpisodeDialogFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.providerManager = providerManagerProvider.get();
  }

  public static void injectProviderManager(
      EpisodeDialogFragment instance, Provider<ProviderManager> providerManagerProvider) {
    instance.providerManager = providerManagerProvider.get();
  }
}
