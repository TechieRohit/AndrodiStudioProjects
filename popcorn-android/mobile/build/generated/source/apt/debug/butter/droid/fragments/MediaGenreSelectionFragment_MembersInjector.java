package butter.droid.fragments;

import butter.droid.base.manager.provider.ProviderManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MediaGenreSelectionFragment_MembersInjector
    implements MembersInjector<MediaGenreSelectionFragment> {
  private final Provider<ProviderManager> providerManagerProvider;

  public MediaGenreSelectionFragment_MembersInjector(
      Provider<ProviderManager> providerManagerProvider) {
    assert providerManagerProvider != null;
    this.providerManagerProvider = providerManagerProvider;
  }

  public static MembersInjector<MediaGenreSelectionFragment> create(
      Provider<ProviderManager> providerManagerProvider) {
    return new MediaGenreSelectionFragment_MembersInjector(providerManagerProvider);
  }

  @Override
  public void injectMembers(MediaGenreSelectionFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.providerManager = providerManagerProvider.get();
  }

  public static void injectProviderManager(
      MediaGenreSelectionFragment instance, Provider<ProviderManager> providerManagerProvider) {
    instance.providerManager = providerManagerProvider.get();
  }
}
