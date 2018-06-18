// Generated code from Butter Knife. Do not modify!
package butter.droid.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butter.droid.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MediaGenreSelectionFragment_ViewBinding<T extends MediaGenreSelectionFragment> implements Unbinder {
  protected T target;

  @UiThread
  public MediaGenreSelectionFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mProgressOverlay = Utils.findRequiredViewAsType(source, R.id.progressOverlay, "field 'mProgressOverlay'", LinearLayout.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    target.mEmptyView = Utils.findRequiredViewAsType(source, R.id.emptyView, "field 'mEmptyView'", TextView.class);
    target.mProgressTextView = Utils.findRequiredViewAsType(source, R.id.progress_textview, "field 'mProgressTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mProgressOverlay = null;
    target.mRecyclerView = null;
    target.mEmptyView = null;
    target.mProgressTextView = null;

    this.target = null;
  }
}
