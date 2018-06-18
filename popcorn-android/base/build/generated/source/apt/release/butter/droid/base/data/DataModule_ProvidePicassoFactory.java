package butter.droid.base.data;

import android.content.Context;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataModule_ProvidePicassoFactory implements Factory<Picasso> {
  private final DataModule module;

  private final Provider<Context> contextProvider;

  private final Provider<OkHttp3Downloader> okHttpDownloaderProvider;

  public DataModule_ProvidePicassoFactory(
      DataModule module,
      Provider<Context> contextProvider,
      Provider<OkHttp3Downloader> okHttpDownloaderProvider) {
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert okHttpDownloaderProvider != null;
    this.okHttpDownloaderProvider = okHttpDownloaderProvider;
  }

  @Override
  public Picasso get() {
    return Preconditions.checkNotNull(
        module.providePicasso(contextProvider.get(), okHttpDownloaderProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Picasso> create(
      DataModule module,
      Provider<Context> contextProvider,
      Provider<OkHttp3Downloader> okHttpDownloaderProvider) {
    return new DataModule_ProvidePicassoFactory(module, contextProvider, okHttpDownloaderProvider);
  }
}
