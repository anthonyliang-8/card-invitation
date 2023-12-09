// Generated by view binder compiler. Do not edit!
package com.example.event_invitation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.event_invitation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSelectorBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView SelectorTitle;

  @NonNull
  public final Button button;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final RadioButton option1;

  @NonNull
  public final RadioButton option2;

  @NonNull
  public final RadioButton option3;

  @NonNull
  public final RadioButton option4;

  @NonNull
  public final RadioButton radioButton10;

  @NonNull
  public final RadioButton radioButton11;

  @NonNull
  public final RadioButton radioButton12;

  @NonNull
  public final RadioButton radioButton13;

  @NonNull
  public final RadioButton radioButton14;

  @NonNull
  public final RadioButton radioButton15;

  @NonNull
  public final RadioButton radioButton9;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final RadioGroup radioGroup2;

  @NonNull
  public final RadioGroup radioGroup3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  private FragmentSelectorBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView SelectorTitle, @NonNull Button button, @NonNull ImageView imageView5,
      @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8,
      @NonNull RadioButton option1, @NonNull RadioButton option2, @NonNull RadioButton option3,
      @NonNull RadioButton option4, @NonNull RadioButton radioButton10,
      @NonNull RadioButton radioButton11, @NonNull RadioButton radioButton12,
      @NonNull RadioButton radioButton13, @NonNull RadioButton radioButton14,
      @NonNull RadioButton radioButton15, @NonNull RadioButton radioButton9,
      @NonNull RadioGroup radioGroup, @NonNull RadioGroup radioGroup2,
      @NonNull RadioGroup radioGroup3, @NonNull TextView textView4, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.SelectorTitle = SelectorTitle;
    this.button = button;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.imageView7 = imageView7;
    this.imageView8 = imageView8;
    this.option1 = option1;
    this.option2 = option2;
    this.option3 = option3;
    this.option4 = option4;
    this.radioButton10 = radioButton10;
    this.radioButton11 = radioButton11;
    this.radioButton12 = radioButton12;
    this.radioButton13 = radioButton13;
    this.radioButton14 = radioButton14;
    this.radioButton15 = radioButton15;
    this.radioButton9 = radioButton9;
    this.radioGroup = radioGroup;
    this.radioGroup2 = radioGroup2;
    this.radioGroup3 = radioGroup3;
    this.textView4 = textView4;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSelectorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSelectorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_selector, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSelectorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SelectorTitle;
      TextView SelectorTitle = ViewBindings.findChildViewById(rootView, id);
      if (SelectorTitle == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.imageView7;
      ImageView imageView7 = ViewBindings.findChildViewById(rootView, id);
      if (imageView7 == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.option1;
      RadioButton option1 = ViewBindings.findChildViewById(rootView, id);
      if (option1 == null) {
        break missingId;
      }

      id = R.id.option2;
      RadioButton option2 = ViewBindings.findChildViewById(rootView, id);
      if (option2 == null) {
        break missingId;
      }

      id = R.id.option3;
      RadioButton option3 = ViewBindings.findChildViewById(rootView, id);
      if (option3 == null) {
        break missingId;
      }

      id = R.id.option4;
      RadioButton option4 = ViewBindings.findChildViewById(rootView, id);
      if (option4 == null) {
        break missingId;
      }

      id = R.id.radioButton10;
      RadioButton radioButton10 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton10 == null) {
        break missingId;
      }

      id = R.id.radioButton11;
      RadioButton radioButton11 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton11 == null) {
        break missingId;
      }

      id = R.id.radioButton12;
      RadioButton radioButton12 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton12 == null) {
        break missingId;
      }

      id = R.id.radioButton13;
      RadioButton radioButton13 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton13 == null) {
        break missingId;
      }

      id = R.id.radioButton14;
      RadioButton radioButton14 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton14 == null) {
        break missingId;
      }

      id = R.id.radioButton15;
      RadioButton radioButton15 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton15 == null) {
        break missingId;
      }

      id = R.id.radioButton9;
      RadioButton radioButton9 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton9 == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.radioGroup2;
      RadioGroup radioGroup2 = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup2 == null) {
        break missingId;
      }

      id = R.id.radioGroup3;
      RadioGroup radioGroup3 = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      return new FragmentSelectorBinding((ConstraintLayout) rootView, SelectorTitle, button,
          imageView5, imageView6, imageView7, imageView8, option1, option2, option3, option4,
          radioButton10, radioButton11, radioButton12, radioButton13, radioButton14, radioButton15,
          radioButton9, radioGroup, radioGroup2, radioGroup3, textView4, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
