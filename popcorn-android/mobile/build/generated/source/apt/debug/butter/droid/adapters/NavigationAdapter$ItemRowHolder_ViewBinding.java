// Generated code from Butter Knife. Do not modify!
package butter.droid.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NavigationAdapter$ItemRowHolder_ViewBinding<T extends NavigationAdapter.ItemRowHolder> implements Unbinder {
  protected T target;

  @UiThread
  public NavigationAdapter$ItemRowHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.icon = Utils.findRequiredViewAsType(source, android.R.id.icon, "field 'icon'", ImageView.class);
    target.title = Utils.findRequiredViewAsType(source, android.R.id.text1, "field 'title'", TextView.class);
    target.checkbox = Utils.findRequiredViewAsType(source, android.R.id.checkbox, "field 'checkbox'", Switch.class);
    target.progressBar = Utils.findRequiredViewAsType(source, android.R.id.progress, "field 'progressBar'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.icon = null;
    target.title = null;
    target.checkbox = null;
    target.progressBar = null;

    this.target = null;
  }
}
