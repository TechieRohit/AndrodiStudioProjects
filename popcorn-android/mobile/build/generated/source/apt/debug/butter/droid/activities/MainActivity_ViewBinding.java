// Generated code from Butter Knife. Do not modify!
package butter.droid.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butter.droid.R;
import butter.droid.widget.ScrimInsetsFrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MainActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mNavigationDrawerContainer = Utils.findRequiredViewAsType(source, R.id.navigation_drawer_container, "field 'mNavigationDrawerContainer'", ScrimInsetsFrameLayout.class);
    target.mTabs = Utils.findOptionalViewAsType(source, R.id.tabs, "field 'mTabs'", TabLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mToolbar = null;
    target.mNavigationDrawerContainer = null;
    target.mTabs = null;

    this.target = null;
  }
}
