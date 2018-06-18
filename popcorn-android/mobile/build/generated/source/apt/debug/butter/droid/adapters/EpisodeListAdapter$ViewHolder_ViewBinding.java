// Generated code from Butter Knife. Do not modify!
package butter.droid.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butter.droid.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EpisodeListAdapter$ViewHolder_ViewBinding<T extends EpisodeListAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public EpisodeListAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.number = Utils.findRequiredViewAsType(source, R.id.info, "field 'number'", TextView.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.number = null;
    target.title = null;

    this.target = null;
  }
}
