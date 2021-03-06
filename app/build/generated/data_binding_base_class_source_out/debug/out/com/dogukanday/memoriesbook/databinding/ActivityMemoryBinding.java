// Generated by view binder compiler. Do not edit!
package com.dogukanday.memoriesbook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dogukanday.memoriesbook.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMemoryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final EditText whenText;

  @NonNull
  public final EditText whereText;

  @NonNull
  public final EditText whoText;

  private ActivityMemoryBinding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull ImageView imageView, @NonNull EditText whenText, @NonNull EditText whereText,
      @NonNull EditText whoText) {
    this.rootView = rootView;
    this.button = button;
    this.imageView = imageView;
    this.whenText = whenText;
    this.whereText = whereText;
    this.whoText = whoText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMemoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMemoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_memory, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMemoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.whenText;
      EditText whenText = ViewBindings.findChildViewById(rootView, id);
      if (whenText == null) {
        break missingId;
      }

      id = R.id.whereText;
      EditText whereText = ViewBindings.findChildViewById(rootView, id);
      if (whereText == null) {
        break missingId;
      }

      id = R.id.whoText;
      EditText whoText = ViewBindings.findChildViewById(rootView, id);
      if (whoText == null) {
        break missingId;
      }

      return new ActivityMemoryBinding((ConstraintLayout) rootView, button, imageView, whenText,
          whereText, whoText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
