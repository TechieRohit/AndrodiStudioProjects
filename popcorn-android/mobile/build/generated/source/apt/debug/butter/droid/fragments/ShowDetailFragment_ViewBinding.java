// Generated code from Butter Knife. Do not modify!
package butter.droid.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import butter.droid.R;
import butter.droid.widget.WrappingViewPager;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShowDetailFragment_ViewBinding<T extends ShowDetailFragment> implements Unbinder {
  protected T target;

  private View view2131755256;

  @UiThread
  public ShowDetailFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.pager, "field 'mViewPager'", WrappingViewPager.class);
    target.mTabs = Utils.findRequiredViewAsType(source, R.id.tabs, "field 'mTabs'", TabLayout.class);
    target.mBackground = source.findViewById(R.id.background);
    target.mShadow = source.findViewById(R.id.top);
    target.mTitle = Utils.findOptionalViewAsType(source, R.id.title, "field 'mTitle'", TextView.class);
    target.mMeta = Utils.findOptionalViewAsType(source, R.id.aired, "field 'mMeta'", TextView.class);
    target.mSynopsis = Utils.findOptionalViewAsType(source, R.id.synopsis, "field 'mSynopsis'", TextView.class);
    view = source.findViewById(R.id.read_more);
    target.mReadMore = Utils.castView(view, R.id.read_more, "field 'mReadMore'", TextView.class);
    if (view != null) {
      view2131755256 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.openReadMore(p0);
        }
      });
    }
    target.mRating = Utils.findOptionalViewAsType(source, R.id.rating, "field 'mRating'", RatingBar.class);
    target.mCoverImage = Utils.findOptionalViewAsType(source, R.id.cover_image, "field 'mCoverImage'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mViewPager = null;
    target.mTabs = null;
    target.mBackground = null;
    target.mShadow = null;
    target.mTitle = null;
    target.mMeta = null;
    target.mSynopsis = null;
    target.mReadMore = null;
    target.mRating = null;
    target.mCoverImage = null;

    if (view2131755256 != null) {
      view2131755256.setOnClickListener(null);
      view2131755256 = null;
    }

    this.target = null;
  }
}
