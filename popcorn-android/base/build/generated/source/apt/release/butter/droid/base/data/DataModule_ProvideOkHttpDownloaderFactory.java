package butter.droid.base.data;

import com.jakewharton.picasso.OkHttp3Downloader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataModule_ProvideOkHttpDownloaderFactory implements Factory<OkHttp3Downloader> {
  private final DataModule module;

  private final Provider<OkHttpClient> clientProvider;

  public DataModule_ProvideOkHttpDownloaderFactory(
      DataModule module, Provider<OkHttpClient> clientProvider) {
    assert module != null;
    this.module = module;
    assert clientProvider != null;
    this.clientProvider = clientProvider;
  }

  @Override
  public OkHttp3Downloader get() {
    return Preconditions.checkNotNull(
        module.provideOkHttpDownloader(clientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttp3Downloader> create(
      DataModule module, Provider<OkHttpClient> clientProvider) {
    return new DataModule_ProvideOkHttpDownloaderFactory(module, clientProvider);
  }
}
