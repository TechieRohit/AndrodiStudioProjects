// Generated code from Butter Knife. Do not modify!
package butter.droid.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butter.droid.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NavigationAdapter$HeaderHolder_ViewBinding<T extends NavigationAdapter.HeaderHolder> implements Unbinder {
  protected T target;

  @UiThread
  public NavigationAdapter$HeaderHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.mBackgroundImageView = Utils.findRequiredViewAsType(source, R.id.bg_imageview, "field 'mBackgroundImageView'", ImageView.class);
    target.mProfileImageView = Utils.findRequiredViewAsType(source, R.id.profile_imageview, "field 'mProfileImageView'", CircleImageView.class);
    target.mTitleTextView = Utils.findRequiredViewAsType(source, R.id.title_textview, "field 'mTitleTextView'", TextView.class);
    target.mSubtitleTextView = Utils.findRequiredViewAsType(source, R.id.subtitle_textview, "field 'mSubtitleTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mBackgroundImageView = null;
    target.mProfileImageView = null;
    target.mTitleTextView = null;
    target.mSubtitleTextView = null;

    this.target = null;
  }
}
