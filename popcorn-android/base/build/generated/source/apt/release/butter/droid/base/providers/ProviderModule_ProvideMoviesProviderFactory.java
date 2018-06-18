package butter.droid.base.providers;

import butter.droid.base.providers.media.MoviesProvider;
import butter.droid.base.providers.subs.open.OpenSubsProvider;
import com.fasterxml.jackson.databind.ObjectMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProviderModule_ProvideMoviesProviderFactory implements Factory<MoviesProvider> {
  private final ProviderModule module;

  private final Provider<OkHttpClient> clientProvider;

  private final Provider<ObjectMapper> mapperProvider;

  private final Provider<OpenSubsProvider> subsProvider;

  public ProviderModule_ProvideMoviesProviderFactory(
      ProviderModule module,
      Provider<OkHttpClient> clientProvider,
      Provider<ObjectMapper> mapperProvider,
      Provider<OpenSubsProvider> subsProvider) {
    assert module != null;
    this.module = module;
    assert clientProvider != null;
    this.clientProvider = clientProvider;
    assert mapperProvider != null;
    this.mapperProvider = mapperProvider;
    assert subsProvider != null;
    this.subsProvider = subsProvider;
  }

  @Override
  public MoviesProvider get() {
    return Preconditions.checkNotNull(
        module.provideMoviesProvider(
            clientProvider.get(), mapperProvider.get(), subsProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MoviesProvider> create(
      ProviderModule module,
      Provider<OkHttpClient> clientProvider,
      Provider<ObjectMapper> mapperProvider,
      Provider<OpenSubsProvider> subsProvider) {
    return new ProviderModule_ProvideMoviesProviderFactory(
        module, clientProvider, mapperProvider, subsProvider);
  }
}
