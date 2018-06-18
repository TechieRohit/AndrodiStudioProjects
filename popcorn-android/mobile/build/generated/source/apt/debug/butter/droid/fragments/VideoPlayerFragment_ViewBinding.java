// Generated code from Butter Knife. Do not modify!
package butter.droid.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butter.droid.R;
import butter.droid.widget.ButterSeekBar;
import butter.droid.widget.StrokedRobotoTextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VideoPlayerFragment_ViewBinding<T extends VideoPlayerFragment> implements Unbinder {
  protected T target;

  private View view2131755243;

  private View view2131755244;

  private View view2131755294;

  private View view2131755296;

  private View view2131755295;

  @UiThread
  public VideoPlayerFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mProgressIndicator = Utils.findRequiredViewAsType(source, R.id.progress_indicator, "field 'mProgressIndicator'", ProgressBar.class);
    target.videoSurface = Utils.findRequiredViewAsType(source, R.id.video_surface, "field 'videoSurface'", SurfaceView.class);
    target.mSubtitleText = Utils.findRequiredViewAsType(source, R.id.subtitle_text, "field 'mSubtitleText'", StrokedRobotoTextView.class);
    target.mControlLayout = Utils.findRequiredViewAsType(source, R.id.control_layout, "field 'mControlLayout'", RelativeLayout.class);
    target.mPlayerInfo = Utils.findRequiredViewAsType(source, R.id.player_info, "field 'mPlayerInfo'", TextView.class);
    target.mControlBar = Utils.findRequiredViewAsType(source, R.id.control_bar, "field 'mControlBar'", ButterSeekBar.class);
    view = Utils.findRequiredView(source, R.id.play_button, "field 'mPlayButton' and method 'onPlayPauseClick'");
    target.mPlayButton = Utils.castView(view, R.id.play_button, "field 'mPlayButton'", ImageButton.class);
    view2131755243 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onPlayPauseClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.forward_button, "field 'mForwardButton' and method 'onForwardClick'");
    target.mForwardButton = Utils.castView(view, R.id.forward_button, "field 'mForwardButton'", ImageButton.class);
    view2131755244 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onForwardClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.rewind_button, "field 'mRewindButton' and method 'onRewindClick'");
    target.mRewindButton = Utils.castView(view, R.id.rewind_button, "field 'mRewindButton'", ImageButton.class);
    view2131755294 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRewindClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.subs_button, "field 'mSubsButton' and method 'onSubsClick'");
    target.mSubsButton = Utils.castView(view, R.id.subs_button, "field 'mSubsButton'", ImageButton.class);
    view2131755296 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSubsClick();
      }
    });
    target.mCurrentTimeTextView = Utils.findRequiredViewAsType(source, R.id.current_time, "field 'mCurrentTimeTextView'", TextView.class);
    target.lengthTime = Utils.findRequiredViewAsType(source, R.id.length_time, "field 'lengthTime'", TextView.class);
    view = Utils.findRequiredView(source, R.id.scale_button, "method 'onScaleClick'");
    view2131755295 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onScaleClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mToolbar = null;
    target.mProgressIndicator = null;
    target.videoSurface = null;
    target.mSubtitleText = null;
    target.mControlLayout = null;
    target.mPlayerInfo = null;
    target.mControlBar = null;
    target.mPlayButton = null;
    target.mForwardButton = null;
    target.mRewindButton = null;
    target.mSubsButton = null;
    target.mCurrentTimeTextView = null;
    target.lengthTime = null;

    view2131755243.setOnClickListener(null);
    view2131755243 = null;
    view2131755244.setOnClickListener(null);
    view2131755244 = null;
    view2131755294.setOnClickListener(null);
    view2131755294 = null;
    view2131755296.setOnClickListener(null);
    view2131755296 = null;
    view2131755295.setOnClickListener(null);
    view2131755295 = null;

    this.target = null;
  }
}
