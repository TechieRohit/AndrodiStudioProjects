// Generated code from Butter Knife. Do not modify!
package butter.droid.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import butter.droid.R;
import butter.droid.widget.ButterSeekBar;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BeamPlayerFragment_ViewBinding<T extends BeamPlayerFragment> implements Unbinder {
  protected T target;

  private View view2131755243;

  private View view2131755244;

  private View view2131755242;

  @UiThread
  public BeamPlayerFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mPanel = Utils.findRequiredViewAsType(source, R.id.sliding_layout, "field 'mPanel'", SlidingUpPanelLayout.class);
    view = Utils.findRequiredView(source, R.id.play_button, "field 'mPlayButton' and method 'playPauseClick'");
    target.mPlayButton = Utils.castView(view, R.id.play_button, "field 'mPlayButton'", ImageButton.class);
    view2131755243 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.playPauseClick(p0);
      }
    });
    target.mCoverImage = Utils.findRequiredViewAsType(source, R.id.cover_image, "field 'mCoverImage'", ImageView.class);
    target.mButterSeekBar = Utils.findRequiredViewAsType(source, R.id.seekbar, "field 'mButterSeekBar'", ButterSeekBar.class);
    target.mVolumeBar = Utils.findRequiredViewAsType(source, R.id.volumebar, "field 'mVolumeBar'", ButterSeekBar.class);
    view = Utils.findRequiredView(source, R.id.forward_button, "method 'forwardClick'");
    view2131755244 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.forwardClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.backward_button, "method 'backwardClick'");
    view2131755242 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.backwardClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mToolbar = null;
    target.mPanel = null;
    target.mPlayButton = null;
    target.mCoverImage = null;
    target.mButterSeekBar = null;
    target.mVolumeBar = null;

    view2131755243.setOnClickListener(null);
    view2131755243 = null;
    view2131755244.setOnClickListener(null);
    view2131755244 = null;
    view2131755242.setOnClickListener(null);
    view2131755242 = null;

    this.target = null;
  }
}
