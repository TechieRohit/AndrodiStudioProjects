package butter.droid.base.data;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final DataModule module;

  private final Provider<Cache> cacheProvider;

  public DataModule_ProvideOkHttpClientFactory(DataModule module, Provider<Cache> cacheProvider) {
    assert module != null;
    this.module = module;
    assert cacheProvider != null;
    this.cacheProvider = cacheProvider;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkHttpClient(cacheProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(DataModule module, Provider<Cache> cacheProvider) {
    return new DataModule_ProvideOkHttpClientFactory(module, cacheProvider);
  }
}
