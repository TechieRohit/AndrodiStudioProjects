// Generated code from Butter Knife. Do not modify!
package butter.droid.widget;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OptionSelector_ViewBinding<T extends OptionSelector> implements Unbinder {
  protected T target;

  @UiThread
  public OptionSelector_ViewBinding(T target, View source) {
    this.target = target;

    target.mText = Utils.findRequiredViewAsType(source, android.R.id.text1, "field 'mText'", TextView.class);
    target.mIcon = Utils.findRequiredViewAsType(source, android.R.id.icon, "field 'mIcon'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mText = null;
    target.mIcon = null;

    this.target = null;
  }
}
