package butter.droid.fragments;

import butter.droid.base.manager.provider.ProviderManager;
import butter.droid.base.vpn.VPNHTChecker;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NavigationDrawerFragment_MembersInjector
    implements MembersInjector<NavigationDrawerFragment> {
  private final Provider<ProviderManager> providerManagerProvider;

  private final Provider<VPNHTChecker> vpnhtCheckerProvider;

  public NavigationDrawerFragment_MembersInjector(
      Provider<ProviderManager> providerManagerProvider,
      Provider<VPNHTChecker> vpnhtCheckerProvider) {
    assert providerManagerProvider != null;
    this.providerManagerProvider = providerManagerProvider;
    assert vpnhtCheckerProvider != null;
    this.vpnhtCheckerProvider = vpnhtCheckerProvider;
  }

  public static MembersInjector<NavigationDrawerFragment> create(
      Provider<ProviderManager> providerManagerProvider,
      Provider<VPNHTChecker> vpnhtCheckerProvider) {
    return new NavigationDrawerFragment_MembersInjector(
        providerManagerProvider, vpnhtCheckerProvider);
  }

  @Override
  public void injectMembers(NavigationDrawerFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.providerManager = providerManagerProvider.get();
    instance.vpnhtChecker = vpnhtCheckerProvider.get();
  }

  public static void injectProviderManager(
      NavigationDrawerFragment instance, Provider<ProviderManager> providerManagerProvider) {
    instance.providerManager = providerManagerProvider.get();
  }

  public static void injectVpnhtChecker(
      NavigationDrawerFragment instance, Provider<VPNHTChecker> vpnhtCheckerProvider) {
    instance.vpnhtChecker = vpnhtCheckerProvider.get();
  }
}
