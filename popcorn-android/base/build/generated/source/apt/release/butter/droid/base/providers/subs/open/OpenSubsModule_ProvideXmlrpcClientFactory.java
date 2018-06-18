package butter.droid.base.providers.subs.open;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import de.timroes.axmlrpc.XMLRPCClient;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OpenSubsModule_ProvideXmlrpcClientFactory implements Factory<XMLRPCClient> {
  private final OpenSubsModule module;

  public OpenSubsModule_ProvideXmlrpcClientFactory(OpenSubsModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public XMLRPCClient get() {
    return Preconditions.checkNotNull(
        module.provideXmlrpcClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<XMLRPCClient> create(OpenSubsModule module) {
    return new OpenSubsModule_ProvideXmlrpcClientFactory(module);
  }
}
