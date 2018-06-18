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
import java.lang.IllegalStateException;
import java.lang.Override;

public class MediaGridAdapter$ViewHolder_ViewBinding<T extends MediaGridAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public MediaGridAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.focusOverlay = Utils.findRequiredView(source, R.id.focus_overlay, "field 'focusOverlay'");
    target.coverImage = Utils.findRequiredViewAsType(source, R.id.cover_image, "field 'coverImage'", ImageView.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.year = Utils.findRequiredViewAsType(source, R.id.year, "field 'year'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.focusOverlay = null;
    target.coverImage = null;
    target.title = null;
    target.year = null;

    this.target = null;
  }
}
