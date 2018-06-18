package butter.droid.base.providers;

import android.content.Context;
import butter.droid.base.providers.subs.open.OpenSubsProvider;
import com.fasterxml.jackson.databind.ObjectMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.timroes.axmlrpc.XMLRPCClient;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProviderModule_ProvideOpenSubsProviderFactory
    implements Factory<OpenSubsProvider> {
  private final ProviderModule module;

  private final Provider<Context> contextProvider;

  private final Provider<OkHttpClient> clientProvider;

  private final Provider<ObjectMapper> mapperProvider;

  private final Provider<XMLRPCClient> xmlrpcClientProvider;

  public ProviderModule_ProvideOpenSubsProviderFactory(
      ProviderModule module,
      Provider<Context> contextProvider,
      Provider<OkHttpClient> clientProvider,
      Provider<ObjectMapper> mapperProvider,
      Provider<XMLRPCClient> xmlrpcClientProvider) {
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert clientProvider != null;
    this.clientProvider = clientProvider;
    assert mapperProvider != null;
    this.mapperProvider = mapperProvider;
    assert xmlrpcClientProvider != null;
    this.xmlrpcClientProvider = xmlrpcClientProvider;
  }

  @Override
  public OpenSubsProvider get() {
    return Preconditions.checkNotNull(
        module.provideOpenSubsProvider(
            contextProvider.get(),
            clientProvider.get(),
            mapperProvider.get(),
            xmlrpcClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OpenSubsProvider> create(
      ProviderModule module,
      Provider<Context> contextProvider,
      Provider<OkHttpClient> clientProvider,
      Provider<ObjectMapper> mapperProvider,
      Provider<XMLRPCClient> xmlrpcClientProvider) {
    return new ProviderModule_ProvideOpenSubsProviderFactory(
        module, contextProvider, clientProvider, mapperProvider, xmlrpcClientProvider);
  }
}
