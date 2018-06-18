package butter.droid.base.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataModule_ProvideObjectMapperFactory implements Factory<ObjectMapper> {
  private final DataModule module;

  public DataModule_ProvideObjectMapperFactory(DataModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectMapper get() {
    return Preconditions.checkNotNull(
        module.provideObjectMapper(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectMapper> create(DataModule module) {
    return new DataModule_ProvideObjectMapperFactory(module);
  }
}
