// Generated code from Butter Knife. Do not modify!
package butter.droid.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butter.droid.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AboutFragment_ViewBinding<T extends AboutFragment> implements Unbinder {
  protected T target;

  private View view2131755229;

  private View view2131755236;

  private View view2131755237;

  private View view2131755234;

  private View view2131755232;

  private View view2131755233;

  private View view2131755235;

  @UiThread
  public AboutFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.logo_imageview, "field 'mLogoImageView' and method 'onLogoClick'");
    target.mLogoImageView = Utils.castView(view, R.id.logo_imageview, "field 'mLogoImageView'", ImageView.class);
    view2131755229 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onLogoClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.facebook_button, "field 'mFacebookButton' and method 'onFacebookClick'");
    target.mFacebookButton = Utils.castView(view, R.id.facebook_button, "field 'mFacebookButton'", TextView.class);
    view2131755236 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFacebookClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.git_button, "field 'mGitButton' and method 'onGitClick'");
    target.mGitButton = Utils.castView(view, R.id.git_button, "field 'mGitButton'", TextView.class);
    view2131755237 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onGitClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.blog_button, "field 'mBlogButton' and method 'onBlogClick'");
    target.mBlogButton = Utils.castView(view, R.id.blog_button, "field 'mBlogButton'", TextView.class);
    view2131755234 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBlogClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.butter_button, "field 'mButterButton' and method 'onButterClick'");
    target.mButterButton = Utils.castView(view, R.id.butter_button, "field 'mButterButton'", TextView.class);
    view2131755232 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onButterClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.discuss_button, "field 'mDiscussButton' and method 'onDiscussClick'");
    target.mDiscussButton = Utils.castView(view, R.id.discuss_button, "field 'mDiscussButton'", TextView.class);
    view2131755233 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onDiscussClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.twitter_button, "field 'mTwitterButton' and method 'onTwitterClick'");
    target.mTwitterButton = Utils.castView(view, R.id.twitter_button, "field 'mTwitterButton'", TextView.class);
    view2131755235 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTwitterClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mLogoImageView = null;
    target.mFacebookButton = null;
    target.mGitButton = null;
    target.mBlogButton = null;
    target.mButterButton = null;
    target.mDiscussButton = null;
    target.mTwitterButton = null;

    view2131755229.setOnClickListener(null);
    view2131755229 = null;
    view2131755236.setOnClickListener(null);
    view2131755236 = null;
    view2131755237.setOnClickListener(null);
    view2131755237 = null;
    view2131755234.setOnClickListener(null);
    view2131755234 = null;
    view2131755232.setOnClickListener(null);
    view2131755232 = null;
    view2131755233.setOnClickListener(null);
    view2131755233 = null;
    view2131755235.setOnClickListener(null);
    view2131755235 = null;

    this.target = null;
  }
}
