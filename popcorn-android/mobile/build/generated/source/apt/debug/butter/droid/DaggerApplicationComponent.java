package butter.droid;

import android.content.Context;
import butter.droid.activities.AboutActivity;
import butter.droid.activities.AboutActivity_MembersInjector;
import butter.droid.activities.BeamPlayerActivity;
import butter.droid.activities.BeamPlayerActivity_MembersInjector;
import butter.droid.activities.MainActivity;
import butter.droid.activities.MainActivity_MembersInjector;
import butter.droid.activities.MediaDetailActivity;
import butter.droid.activities.MediaDetailActivity_MembersInjector;
import butter.droid.activities.PreferencesActivity;
import butter.droid.activities.PreferencesActivity_MembersInjector;
import butter.droid.activities.SearchActivity;
import butter.droid.activities.SearchActivity_MembersInjector;
import butter.droid.activities.StreamLoadingActivity;
import butter.droid.activities.StreamLoadingActivity_MembersInjector;
import butter.droid.activities.TermsActivity;
import butter.droid.activities.TermsActivity_MembersInjector;
import butter.droid.activities.TrailerPlayerActivity;
import butter.droid.activities.TrailerPlayerActivity_MembersInjector;
import butter.droid.activities.VideoPlayerActivity;
import butter.droid.activities.VideoPlayerActivity_MembersInjector;
import butter.droid.base.BaseApplicationModule;
import butter.droid.base.BaseApplicationModule_ProvideContextFactory;
import butter.droid.base.data.DataModule;
import butter.droid.base.data.DataModule_ProvideCacheFactory;
import butter.droid.base.data.DataModule_ProvideObjectMapperFactory;
import butter.droid.base.data.DataModule_ProvideOkHttpClientFactory;
import butter.droid.base.data.DataModule_ProvideOkHttpDownloaderFactory;
import butter.droid.base.data.DataModule_ProvidePicassoFactory;
import butter.droid.base.manager.ManagerModule;
import butter.droid.base.manager.ManagerModule_ProvideProviderManagerFactory;
import butter.droid.base.manager.provider.ProviderManager;
import butter.droid.base.manager.updater.ButterUpdateManager;
import butter.droid.base.manager.updater.ButterUpdateManager_Factory;
import butter.droid.base.manager.youtube.YouTubeManager;
import butter.droid.base.manager.youtube.YouTubeManager_Factory;
import butter.droid.base.providers.ProviderModule;
import butter.droid.base.providers.ProviderModule_ProvideAnimeProviderFactory;
import butter.droid.base.providers.ProviderModule_ProvideMoviesProviderFactory;
import butter.droid.base.providers.ProviderModule_ProvideOpenSubsProviderFactory;
import butter.droid.base.providers.ProviderModule_ProvideTVProviderFactory;
import butter.droid.base.providers.media.AnimeProvider;
import butter.droid.base.providers.media.MoviesProvider;
import butter.droid.base.providers.media.TVProvider;
import butter.droid.base.providers.subs.open.OpenSubsModule;
import butter.droid.base.providers.subs.open.OpenSubsModule_ProvideXmlrpcClientFactory;
import butter.droid.base.providers.subs.open.OpenSubsProvider;
import butter.droid.base.vpn.VPNHTChecker;
import butter.droid.base.vpn.VPNHTChecker_Factory;
import butter.droid.fragments.MediaContainerFragment;
import butter.droid.fragments.MediaContainerFragment_MembersInjector;
import butter.droid.fragments.MediaGenreSelectionFragment;
import butter.droid.fragments.MediaGenreSelectionFragment_MembersInjector;
import butter.droid.fragments.MediaListFragment;
import butter.droid.fragments.MediaListFragment_MembersInjector;
import butter.droid.fragments.MovieDetailFragment;
import butter.droid.fragments.MovieDetailFragment_MembersInjector;
import butter.droid.fragments.NavigationDrawerFragment;
import butter.droid.fragments.NavigationDrawerFragment_MembersInjector;
import butter.droid.fragments.StreamLoadingFragment;
import butter.droid.fragments.StreamLoadingFragment_MembersInjector;
import butter.droid.fragments.VideoPlayerFragment;
import butter.droid.fragments.VideoPlayerFragment_MembersInjector;
import butter.droid.fragments.dialog.EpisodeDialogFragment;
import butter.droid.fragments.dialog.EpisodeDialogFragment_MembersInjector;
import butter.droid.fragments.dialog.LoadingDetailDialogFragment;
import butter.droid.fragments.dialog.LoadingDetailDialogFragment_MembersInjector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import de.timroes.axmlrpc.XMLRPCClient;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<Context> provideContextProvider;

  private Provider<Cache> provideCacheProvider;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<OkHttp3Downloader> provideOkHttpDownloaderProvider;

  private Provider<Picasso> providePicassoProvider;

  private Provider<ObjectMapper> provideObjectMapperProvider;

  private Provider<ButterUpdateManager> butterUpdateManagerProvider;

  private MembersInjector<MobileButterApplication> mobileButterApplicationMembersInjector;

  private Provider<XMLRPCClient> provideXmlrpcClientProvider;

  private Provider<OpenSubsProvider> provideOpenSubsProvider;

  private Provider<MoviesProvider> provideMoviesProvider;

  private Provider<TVProvider> provideTVProvider;

  private Provider<AnimeProvider> provideAnimeProvider;

  private Provider<ProviderManager> provideProviderManagerProvider;

  private Provider<YouTubeManager> youTubeManagerProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private MembersInjector<TrailerPlayerActivity> trailerPlayerActivityMembersInjector;

  private MembersInjector<PreferencesActivity> preferencesActivityMembersInjector;

  private MembersInjector<AboutActivity> aboutActivityMembersInjector;

  private MembersInjector<BeamPlayerActivity> beamPlayerActivityMembersInjector;

  private MembersInjector<MediaDetailActivity> mediaDetailActivityMembersInjector;

  private MembersInjector<SearchActivity> searchActivityMembersInjector;

  private MembersInjector<StreamLoadingActivity> streamLoadingActivityMembersInjector;

  private MembersInjector<TermsActivity> termsActivityMembersInjector;

  private MembersInjector<VideoPlayerActivity> videoPlayerActivityMembersInjector;

  private Provider<VPNHTChecker> vPNHTCheckerProvider;

  private MembersInjector<NavigationDrawerFragment> navigationDrawerFragmentMembersInjector;

  private MembersInjector<MediaContainerFragment> mediaContainerFragmentMembersInjector;

  private MembersInjector<MediaListFragment> mediaListFragmentMembersInjector;

  private MembersInjector<MediaGenreSelectionFragment> mediaGenreSelectionFragmentMembersInjector;

  private MembersInjector<LoadingDetailDialogFragment> loadingDetailDialogFragmentMembersInjector;

  private MembersInjector<StreamLoadingFragment> streamLoadingFragmentMembersInjector;

  private MembersInjector<EpisodeDialogFragment> episodeDialogFragmentMembersInjector;

  private MembersInjector<MovieDetailFragment> movieDetailFragmentMembersInjector;

  private MembersInjector<VideoPlayerFragment> videoPlayerFragmentMembersInjector;

  private DaggerApplicationComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideContextProvider =
        DoubleCheck.provider(
            BaseApplicationModule_ProvideContextFactory.create(builder.baseApplicationModule));

    this.provideCacheProvider =
        DoubleCheck.provider(
            DataModule_ProvideCacheFactory.create(builder.dataModule, provideContextProvider));

    this.provideOkHttpClientProvider =
        DoubleCheck.provider(
            DataModule_ProvideOkHttpClientFactory.create(builder.dataModule, provideCacheProvider));

    this.provideOkHttpDownloaderProvider =
        DoubleCheck.provider(
            DataModule_ProvideOkHttpDownloaderFactory.create(
                builder.dataModule, provideOkHttpClientProvider));

    this.providePicassoProvider =
        DoubleCheck.provider(
            DataModule_ProvidePicassoFactory.create(
                builder.dataModule, provideContextProvider, provideOkHttpDownloaderProvider));

    this.provideObjectMapperProvider =
        DoubleCheck.provider(DataModule_ProvideObjectMapperFactory.create(builder.dataModule));

    this.butterUpdateManagerProvider =
        DoubleCheck.provider(
            ButterUpdateManager_Factory.create(
                MembersInjectors.<ButterUpdateManager>noOp(),
                provideContextProvider,
                provideOkHttpClientProvider,
                provideObjectMapperProvider));

    this.mobileButterApplicationMembersInjector =
        MobileButterApplication_MembersInjector.create(
            providePicassoProvider, butterUpdateManagerProvider);

    this.provideXmlrpcClientProvider =
        DoubleCheck.provider(
            OpenSubsModule_ProvideXmlrpcClientFactory.create(builder.openSubsModule));

    this.provideOpenSubsProvider =
        DoubleCheck.provider(
            ProviderModule_ProvideOpenSubsProviderFactory.create(
                builder.providerModule,
                provideContextProvider,
                provideOkHttpClientProvider,
                provideObjectMapperProvider,
                provideXmlrpcClientProvider));

    this.provideMoviesProvider =
        DoubleCheck.provider(
            ProviderModule_ProvideMoviesProviderFactory.create(
                builder.providerModule,
                provideOkHttpClientProvider,
                provideObjectMapperProvider,
                provideOpenSubsProvider));

    this.provideTVProvider =
        DoubleCheck.provider(
            ProviderModule_ProvideTVProviderFactory.create(
                builder.providerModule,
                provideOkHttpClientProvider,
                provideObjectMapperProvider,
                provideOpenSubsProvider));

    this.provideAnimeProvider =
        DoubleCheck.provider(
            ProviderModule_ProvideAnimeProviderFactory.create(
                builder.providerModule,
                provideOkHttpClientProvider,
                provideObjectMapperProvider,
                provideOpenSubsProvider));

    this.provideProviderManagerProvider =
        DoubleCheck.provider(
            ManagerModule_ProvideProviderManagerFactory.create(
                builder.managerModule,
                provideMoviesProvider,
                provideTVProvider,
                provideAnimeProvider));

    this.youTubeManagerProvider = YouTubeManager_Factory.create(provideOkHttpClientProvider);

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(
            butterUpdateManagerProvider, provideProviderManagerProvider, youTubeManagerProvider);

    this.trailerPlayerActivityMembersInjector =
        TrailerPlayerActivity_MembersInjector.create(
            butterUpdateManagerProvider, youTubeManagerProvider);

    this.preferencesActivityMembersInjector =
        PreferencesActivity_MembersInjector.create(butterUpdateManagerProvider);

    this.aboutActivityMembersInjector =
        AboutActivity_MembersInjector.create(butterUpdateManagerProvider);

    this.beamPlayerActivityMembersInjector =
        BeamPlayerActivity_MembersInjector.create(butterUpdateManagerProvider);

    this.mediaDetailActivityMembersInjector =
        MediaDetailActivity_MembersInjector.create(butterUpdateManagerProvider);

    this.searchActivityMembersInjector =
        SearchActivity_MembersInjector.create(butterUpdateManagerProvider);

    this.streamLoadingActivityMembersInjector =
        StreamLoadingActivity_MembersInjector.create(butterUpdateManagerProvider);

    this.termsActivityMembersInjector =
        TermsActivity_MembersInjector.create(butterUpdateManagerProvider);

    this.videoPlayerActivityMembersInjector =
        VideoPlayerActivity_MembersInjector.create(butterUpdateManagerProvider);

    this.vPNHTCheckerProvider =
        DoubleCheck.provider(
            VPNHTChecker_Factory.create(provideContextProvider, provideOkHttpClientProvider));

    this.navigationDrawerFragmentMembersInjector =
        NavigationDrawerFragment_MembersInjector.create(
            provideProviderManagerProvider, vPNHTCheckerProvider);

    this.mediaContainerFragmentMembersInjector =
        MediaContainerFragment_MembersInjector.create(provideProviderManagerProvider);

    this.mediaListFragmentMembersInjector =
        MediaListFragment_MembersInjector.create(
            provideProviderManagerProvider, provideOkHttpClientProvider);

    this.mediaGenreSelectionFragmentMembersInjector =
        MediaGenreSelectionFragment_MembersInjector.create(provideProviderManagerProvider);

    this.loadingDetailDialogFragmentMembersInjector =
        LoadingDetailDialogFragment_MembersInjector.create(provideProviderManagerProvider);

    this.streamLoadingFragmentMembersInjector =
        StreamLoadingFragment_MembersInjector.create(provideProviderManagerProvider);

    this.episodeDialogFragmentMembersInjector =
        EpisodeDialogFragment_MembersInjector.create(provideProviderManagerProvider);

    this.movieDetailFragmentMembersInjector =
        MovieDetailFragment_MembersInjector.create(
            provideProviderManagerProvider, youTubeManagerProvider);

    this.videoPlayerFragmentMembersInjector =
        VideoPlayerFragment_MembersInjector.create(provideProviderManagerProvider);
  }

  @Override
  public void inject(MobileButterApplication application) {
    mobileButterApplicationMembersInjector.injectMembers(application);
  }

  @Override
  public void inject(MainActivity activity) {
    mainActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(TrailerPlayerActivity activity) {
    trailerPlayerActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(PreferencesActivity activity) {
    preferencesActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(AboutActivity activity) {
    aboutActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(BeamPlayerActivity activity) {
    beamPlayerActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(MediaDetailActivity activity) {
    mediaDetailActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(SearchActivity activity) {
    searchActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(StreamLoadingActivity activity) {
    streamLoadingActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(TermsActivity activity) {
    termsActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(VideoPlayerActivity activity) {
    videoPlayerActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(NavigationDrawerFragment fragment) {
    navigationDrawerFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(MediaContainerFragment fragment) {
    mediaContainerFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(MediaListFragment fragment) {
    mediaListFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(MediaGenreSelectionFragment fragment) {
    mediaGenreSelectionFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(LoadingDetailDialogFragment fragment) {
    loadingDetailDialogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(StreamLoadingFragment fragment) {
    streamLoadingFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(EpisodeDialogFragment fragment) {
    episodeDialogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(MovieDetailFragment fragment) {
    movieDetailFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(VideoPlayerFragment fragment) {
    videoPlayerFragmentMembersInjector.injectMembers(fragment);
  }

  public static final class Builder {
    private BaseApplicationModule baseApplicationModule;

    private DataModule dataModule;

    private OpenSubsModule openSubsModule;

    private ProviderModule providerModule;

    private ManagerModule managerModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (baseApplicationModule == null) {
        throw new IllegalStateException(
            BaseApplicationModule.class.getCanonicalName() + " must be set");
      }
      if (dataModule == null) {
        this.dataModule = new DataModule();
      }
      if (openSubsModule == null) {
        this.openSubsModule = new OpenSubsModule();
      }
      if (providerModule == null) {
        this.providerModule = new ProviderModule();
      }
      if (managerModule == null) {
        this.managerModule = new ManagerModule();
      }
      return new DaggerApplicationComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder applicationModule(ApplicationModule applicationModule) {
      Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public Builder baseApplicationModule(BaseApplicationModule baseApplicationModule) {
      this.baseApplicationModule = Preconditions.checkNotNull(baseApplicationModule);
      return this;
    }

    public Builder dataModule(DataModule dataModule) {
      this.dataModule = Preconditions.checkNotNull(dataModule);
      return this;
    }

    public Builder managerModule(ManagerModule managerModule) {
      this.managerModule = Preconditions.checkNotNull(managerModule);
      return this;
    }

    public Builder providerModule(ProviderModule providerModule) {
      this.providerModule = Preconditions.checkNotNull(providerModule);
      return this;
    }

    public Builder openSubsModule(OpenSubsModule openSubsModule) {
      this.openSubsModule = Preconditions.checkNotNull(openSubsModule);
      return this;
    }
  }
}
