// Generated code from Butter Knife. Do not modify!
package butter.droid.fragments.dialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butter.droid.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoadingBeamingDialogFragment_ViewBinding<T extends LoadingBeamingDialogFragment> implements Unbinder {
  protected T target;

  @UiThread
  public LoadingBeamingDialogFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mTextView = Utils.findRequiredViewAsType(source, R.id.progress_textview, "field 'mTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mTextView = null;

    this.target = null;
  }
}
