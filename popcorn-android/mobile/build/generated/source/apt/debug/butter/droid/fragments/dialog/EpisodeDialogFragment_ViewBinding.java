// Generated code from Butter Knife. Do not modify!
package butter.droid.fragments.dialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butter.droid.R;
import butter.droid.widget.BottomSheetScrollView;
import butter.droid.widget.OptionSelector;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EpisodeDialogFragment_ViewBinding<T extends EpisodeDialogFragment> implements Unbinder {
  protected T target;

  private View view2131755263;

  private View view2131755243;

  private View view2131755254;

  private View view2131755252;

  @UiThread
  public EpisodeDialogFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mScrollView = Utils.findRequiredViewAsType(source, R.id.scrollview, "field 'mScrollView'", BottomSheetScrollView.class);
    view = Utils.findRequiredView(source, R.id.placeholder, "field 'mPlaceholder' and method 'outsideClick'");
    target.mPlaceholder = view;
    view2131755263 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.outsideClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.play_button, "field 'mPlayButton' and method 'playClick'");
    target.mPlayButton = Utils.castView(view, R.id.play_button, "field 'mPlayButton'", ImageButton.class);
    view2131755243 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.playClick();
      }
    });
    target.mHeaderImage = Utils.findRequiredViewAsType(source, R.id.header_image, "field 'mHeaderImage'", ImageView.class);
    target.mInfo = Utils.findRequiredViewAsType(source, R.id.info, "field 'mInfo'", TextView.class);
    target.mTitle = Utils.findRequiredViewAsType(source, R.id.title, "field 'mTitle'", TextView.class);
    target.mAired = Utils.findRequiredViewAsType(source, R.id.aired, "field 'mAired'", TextView.class);
    view = Utils.findRequiredView(source, R.id.synopsis, "field 'mSynopsis' and method 'readMoreClick'");
    target.mSynopsis = Utils.castView(view, R.id.synopsis, "field 'mSynopsis'", TextView.class);
    view2131755254 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.readMoreClick(p0);
      }
    });
    target.mSubtitles = Utils.findRequiredViewAsType(source, R.id.subtitles, "field 'mSubtitles'", OptionSelector.class);
    target.mQuality = Utils.findRequiredViewAsType(source, R.id.quality, "field 'mQuality'", OptionSelector.class);
    view = Utils.findRequiredView(source, R.id.magnet, "method 'openMagnet'");
    target.mOpenMagnet = Utils.castView(view, R.id.magnet, "field 'mOpenMagnet'", ImageButton.class);
    view2131755252 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openMagnet();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mScrollView = null;
    target.mPlaceholder = null;
    target.mPlayButton = null;
    target.mHeaderImage = null;
    target.mInfo = null;
    target.mTitle = null;
    target.mAired = null;
    target.mSynopsis = null;
    target.mSubtitles = null;
    target.mQuality = null;
    target.mOpenMagnet = null;

    view2131755263.setOnClickListener(null);
    view2131755263 = null;
    view2131755243.setOnClickListener(null);
    view2131755243 = null;
    view2131755254.setOnClickListener(null);
    view2131755254 = null;
    view2131755252.setOnClickListener(null);
    view2131755252 = null;

    this.target = null;
  }
}
