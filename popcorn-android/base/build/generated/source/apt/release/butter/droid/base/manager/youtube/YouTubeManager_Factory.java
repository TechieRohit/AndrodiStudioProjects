package butter.droid.base.manager.youtube;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class YouTubeManager_Factory implements Factory<YouTubeManager> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  public YouTubeManager_Factory(Provider<OkHttpClient> okHttpClientProvider) {
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public YouTubeManager get() {
    return new YouTubeManager(okHttpClientProvider.get());
  }

  public static Factory<YouTubeManager> create(Provider<OkHttpClient> okHttpClientProvider) {
    return new YouTubeManager_Factory(okHttpClientProvider);
  }
}
