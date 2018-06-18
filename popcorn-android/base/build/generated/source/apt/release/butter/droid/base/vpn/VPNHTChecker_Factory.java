package butter.droid.base.vpn;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VPNHTChecker_Factory implements Factory<VPNHTChecker> {
  private final Provider<Context> contextProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public VPNHTChecker_Factory(
      Provider<Context> contextProvider, Provider<OkHttpClient> okHttpClientProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public VPNHTChecker get() {
    return new VPNHTChecker(contextProvider.get(), okHttpClientProvider.get());
  }

  public static Factory<VPNHTChecker> create(
      Provider<Context> contextProvider, Provider<OkHttpClient> okHttpClientProvider) {
    return new VPNHTChecker_Factory(contextProvider, okHttpClientProvider);
  }
}
