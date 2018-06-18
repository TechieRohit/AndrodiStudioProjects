// Generated code from Butter Knife. Do not modify!
package butter.droid.fragments.dialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butter.droid.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larswerkman.holocolorpicker.ColorPicker;
import com.larswerkman.holocolorpicker.OpacityBar;
import com.larswerkman.holocolorpicker.SVBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ColorPickerDialogFragment_ViewBinding<T extends ColorPickerDialogFragment> implements Unbinder {
  protected T target;

  @UiThread
  public ColorPickerDialogFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.colorPicker = Utils.findRequiredViewAsType(source, R.id.picker, "field 'colorPicker'", ColorPicker.class);
    target.svBar = Utils.findRequiredViewAsType(source, R.id.svbar, "field 'svBar'", SVBar.class);
    target.opacityBar = Utils.findRequiredViewAsType(source, R.id.opacitybar, "field 'opacityBar'", OpacityBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.colorPicker = null;
    target.svBar = null;
    target.opacityBar = null;

    this.target = null;
  }
}
