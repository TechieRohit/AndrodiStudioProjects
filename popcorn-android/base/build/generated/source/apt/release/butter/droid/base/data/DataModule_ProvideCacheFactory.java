package butter.droid.base.data;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataModule_ProvideCacheFactory implements Factory<Cache> {
  private final DataModule module;

  private final Provider<Context> contextProvider;

  public DataModule_ProvideCacheFactory(DataModule module, Provider<Context> contextProvider) {
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public Cache get() {
    return Preconditions.checkNotNull(
        module.provideCache(contextProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Cache> create(DataModule module, Provider<Context> contextProvider) {
    return new DataModule_ProvideCacheFactory(module, contextProvider);
  }
}
