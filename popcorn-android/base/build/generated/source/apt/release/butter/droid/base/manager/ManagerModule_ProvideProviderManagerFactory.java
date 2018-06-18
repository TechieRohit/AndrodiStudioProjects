package butter.droid.base.manager;

import butter.droid.base.manager.provider.ProviderManager;
import butter.droid.base.providers.media.AnimeProvider;
import butter.droid.base.providers.media.MoviesProvider;
import butter.droid.base.providers.media.TVProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ManagerModule_ProvideProviderManagerFactory implements Factory<ProviderManager> {
  private final ManagerModule module;

  private final Provider<MoviesProvider> moviesProvider;

  private final Provider<TVProvider> tvProvider;

  private final Provider<AnimeProvider> animeProvider;

  public ManagerModule_ProvideProviderManagerFactory(
      ManagerModule module,
      Provider<MoviesProvider> moviesProvider,
      Provider<TVProvider> tvProvider,
      Provider<AnimeProvider> animeProvider) {
    assert module != null;
    this.module = module;
    assert moviesProvider != null;
    this.moviesProvider = moviesProvider;
    assert tvProvider != null;
    this.tvProvider = tvProvider;
    assert animeProvider != null;
    this.animeProvider = animeProvider;
  }

  @Override
  public ProviderManager get() {
    return Preconditions.checkNotNull(
        module.provideProviderManager(moviesProvider.get(), tvProvider.get(), animeProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProviderManager> create(
      ManagerModule module,
      Provider<MoviesProvider> moviesProvider,
      Provider<TVProvider> tvProvider,
      Provider<AnimeProvider> animeProvider) {
    return new ManagerModule_ProvideProviderManagerFactory(
        module, moviesProvider, tvProvider, animeProvider);
  }
}
