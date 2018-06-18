// Generated code from Butter Knife. Do not modify!
package butter.droid.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import butter.droid.R;
import butter.droid.widget.OptionSelector;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MovieDetailFragment_ViewBinding<T extends MovieDetailFragment> implements Unbinder {
  protected T target;

  private View view2131755243;

  private View view2131755251;

  private View view2131755256;

  private View view2131755257;

  private View view2131755252;

  @UiThread
  public MovieDetailFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.play_button, "field 'mPlayButton' and method 'play'");
    target.mPlayButton = Utils.castView(view, R.id.play_button, "field 'mPlayButton'", ImageButton.class);
    view2131755243 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.play();
      }
    });
    target.mTitle = Utils.findRequiredViewAsType(source, R.id.title, "field 'mTitle'", TextView.class);
    view = Utils.findRequiredView(source, R.id.health, "field 'mHealth' and method 'clickHealth'");
    target.mHealth = Utils.castView(view, R.id.health, "field 'mHealth'", ImageView.class);
    view2131755251 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.clickHealth();
      }
    });
    target.mMeta = Utils.findRequiredViewAsType(source, R.id.meta, "field 'mMeta'", TextView.class);
    target.mSynopsis = Utils.findRequiredViewAsType(source, R.id.synopsis, "field 'mSynopsis'", TextView.class);
    view = Utils.findRequiredView(source, R.id.read_more, "field 'mReadMore' and method 'openReadMore'");
    target.mReadMore = Utils.castView(view, R.id.read_more, "field 'mReadMore'", Button.class);
    view2131755256 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openReadMore(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.watch_trailer, "field 'mWatchTrailer' and method 'openTrailer'");
    target.mWatchTrailer = Utils.castView(view, R.id.watch_trailer, "field 'mWatchTrailer'", Button.class);
    view2131755257 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openTrailer(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.magnet, "field 'mOpenMagnet' and method 'openMagnet'");
    target.mOpenMagnet = Utils.castView(view, R.id.magnet, "field 'mOpenMagnet'", ImageButton.class);
    view2131755252 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openMagnet();
      }
    });
    target.mRating = Utils.findRequiredViewAsType(source, R.id.rating, "field 'mRating'", RatingBar.class);
    target.mSubtitles = Utils.findRequiredViewAsType(source, R.id.subtitles, "field 'mSubtitles'", OptionSelector.class);
    target.mQuality = Utils.findRequiredViewAsType(source, R.id.quality, "field 'mQuality'", OptionSelector.class);
    target.mCoverImage = Utils.findOptionalViewAsType(source, R.id.cover_image, "field 'mCoverImage'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mPlayButton = null;
    target.mTitle = null;
    target.mHealth = null;
    target.mMeta = null;
    target.mSynopsis = null;
    target.mReadMore = null;
    target.mWatchTrailer = null;
    target.mOpenMagnet = null;
    target.mRating = null;
    target.mSubtitles = null;
    target.mQuality = null;
    target.mCoverImage = null;

    view2131755243.setOnClickListener(null);
    view2131755243 = null;
    view2131755251.setOnClickListener(null);
    view2131755251 = null;
    view2131755256.setOnClickListener(null);
    view2131755256 = null;
    view2131755257.setOnClickListener(null);
    view2131755257 = null;
    view2131755252.setOnClickListener(null);
    view2131755252 = null;

    this.target = null;
  }
}
