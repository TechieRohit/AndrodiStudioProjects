package butter.droid.base.manager.updater;

import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ButterUpdateManager_Factory implements Factory<ButterUpdateManager> {
  private final MembersInjector<ButterUpdateManager> butterUpdateManagerMembersInjector;

  private final Provider<Context> contextProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<ObjectMapper> objectMapperProvider;

  public ButterUpdateManager_Factory(
      MembersInjector<ButterUpdateManager> butterUpdateManagerMembersInjector,
      Provider<Context> contextProvider,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<ObjectMapper> objectMapperProvider) {
    assert butterUpdateManagerMembersInjector != null;
    this.butterUpdateManagerMembersInjector = butterUpdateManagerMembersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
    assert objectMapperProvider != null;
    this.objectMapperProvider = objectMapperProvider;
  }

  @Override
  public ButterUpdateManager get() {
    return MembersInjectors.injectMembers(
        butterUpdateManagerMembersInjector,
        new ButterUpdateManager(
            contextProvider.get(), okHttpClientProvider.get(), objectMapperProvider.get()));
  }

  public static Factory<ButterUpdateManager> create(
      MembersInjector<ButterUpdateManager> butterUpdateManagerMembersInjector,
      Provider<Context> contextProvider,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<ObjectMapper> objectMapperProvider) {
    return new ButterUpdateManager_Factory(
        butterUpdateManagerMembersInjector,
        contextProvider,
        okHttpClientProvider,
        objectMapperProvider);
  }
}
