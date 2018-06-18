package butter.droid.base;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseApplicationModule_ProvideContextFactory implements Factory<Context> {
  private final BaseApplicationModule module;

  public BaseApplicationModule_ProvideContextFactory(BaseApplicationModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(BaseApplicationModule module) {
    return new BaseApplicationModule_ProvideContextFactory(module);
  }
}
