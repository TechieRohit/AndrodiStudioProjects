// Generated code from Butter Knife. Do not modify!
package butter.droid.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butter.droid.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MediaContainerFragment_ViewBinding<T extends MediaContainerFragment> implements Unbinder {
  protected T target;

  @UiThread
  public MediaContainerFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.pager, "field 'mViewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mViewPager = null;

    this.target = null;
  }
}
