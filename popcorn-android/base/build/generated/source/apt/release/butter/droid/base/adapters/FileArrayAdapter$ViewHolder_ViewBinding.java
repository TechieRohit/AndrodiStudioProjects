// Generated code from Butter Knife. Do not modify!
package butter.droid.base.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FileArrayAdapter$ViewHolder_ViewBinding<T extends FileArrayAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public FileArrayAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.text1 = Utils.findRequiredViewAsType(source, android.R.id.text1, "field 'text1'", TextView.class);
    target.text2 = Utils.findRequiredViewAsType(source, android.R.id.text2, "field 'text2'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.text1 = null;
    target.text2 = null;

    this.target = null;
  }
}
