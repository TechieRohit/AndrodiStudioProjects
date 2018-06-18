// Generated code from Butter Knife. Do not modify!
package butter.droid.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butter.droid.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StreamLoadingFragment_ViewBinding<T extends StreamLoadingFragment> implements Unbinder {
  protected T target;

  private View view2131755285;

  @UiThread
  public StreamLoadingFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mProgressIndicator = Utils.findRequiredViewAsType(source, R.id.progress_indicator, "field 'mProgressIndicator'", ProgressBar.class);
    target.mPrimaryTextView = Utils.findRequiredViewAsType(source, R.id.primary_textview, "field 'mPrimaryTextView'", TextView.class);
    target.mSecondaryTextView = Utils.findRequiredViewAsType(source, R.id.secondary_textview, "field 'mSecondaryTextView'", TextView.class);
    target.mTertiaryTextView = Utils.findRequiredViewAsType(source, R.id.tertiary_textview, "field 'mTertiaryTextView'", TextView.class);
    target.mBackgroundImageView = Utils.findRequiredViewAsType(source, R.id.background_imageview, "field 'mBackgroundImageView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.startexternal_button, "field 'mStartExternalButton' and method 'externalClick'");
    target.mStartExternalButton = Utils.castView(view, R.id.startexternal_button, "field 'mStartExternalButton'", Button.class);
    view2131755285 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.externalClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mProgressIndicator = null;
    target.mPrimaryTextView = null;
    target.mSecondaryTextView = null;
    target.mTertiaryTextView = null;
    target.mBackgroundImageView = null;
    target.mStartExternalButton = null;

    view2131755285.setOnClickListener(null);
    view2131755285 = null;

    this.target = null;
  }
}
