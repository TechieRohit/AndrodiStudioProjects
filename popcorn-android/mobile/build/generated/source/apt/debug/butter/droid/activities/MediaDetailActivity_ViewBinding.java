// Generated code from Butter Knife. Do not modify!
package butter.droid.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butter.droid.R;
import butter.droid.widget.ObservableParallaxScrollView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MediaDetailActivity_ViewBinding<T extends MediaDetailActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MediaDetailActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
    target.mScrollView = Utils.findRequiredViewAsType(source, R.id.scrollview, "field 'mScrollView'", ObservableParallaxScrollView.class);
    target.mParallaxLayout = Utils.findOptionalViewAsType(source, R.id.parallax, "field 'mParallaxLayout'", RelativeLayout.class);
    target.mParallaxColor = source.findViewById(R.id.parallax_color);
    target.mContent = Utils.findRequiredViewAsType(source, R.id.content, "field 'mContent'", FrameLayout.class);
    target.mLogo = Utils.findRequiredViewAsType(source, R.id.logo, "field 'mLogo'", ImageView.class);
    target.mBgImage = Utils.findRequiredViewAsType(source, R.id.bg_image, "field 'mBgImage'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mToolbar = null;
    target.mScrollView = null;
    target.mParallaxLayout = null;
    target.mParallaxColor = null;
    target.mContent = null;
    target.mLogo = null;
    target.mBgImage = null;

    this.target = null;
  }
}
