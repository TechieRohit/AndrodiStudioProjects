// Generated code from Butter Knife. Do not modify!
package butter.droid.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import butter.droid.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShowDetailAboutFragment_ViewBinding<T extends ShowDetailAboutFragment> implements Unbinder {
  protected T target;

  private View view2131755256;

  @UiThread
  public ShowDetailAboutFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mTitle = Utils.findRequiredViewAsType(source, R.id.title, "field 'mTitle'", TextView.class);
    target.mMeta = Utils.findRequiredViewAsType(source, R.id.meta, "field 'mMeta'", TextView.class);
    target.mSynopsis = Utils.findRequiredViewAsType(source, R.id.synopsis, "field 'mSynopsis'", TextView.class);
    target.mRating = Utils.findRequiredViewAsType(source, R.id.rating, "field 'mRating'", RatingBar.class);
    view = Utils.findRequiredView(source, R.id.read_more, "field 'mReadMore' and method 'openReadMore'");
    target.mReadMore = Utils.castView(view, R.id.read_more, "field 'mReadMore'", Button.class);
    view2131755256 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openReadMore(p0);
      }
    });
    target.mInfoButtons = Utils.findRequiredViewAsType(source, R.id.info_buttons, "field 'mInfoButtons'", LinearLayout.class);
    target.mOpenMagnet = Utils.findRequiredViewAsType(source, R.id.magnet, "field 'mOpenMagnet'", ImageButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mTitle = null;
    target.mMeta = null;
    target.mSynopsis = null;
    target.mRating = null;
    target.mReadMore = null;
    target.mInfoButtons = null;
    target.mOpenMagnet = null;

    view2131755256.setOnClickListener(null);
    view2131755256 = null;

    this.target = null;
  }
}
