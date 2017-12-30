package io.github.pierry.progress;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Progress {

  private View view;
  private TextView msg;
  private ProgressBar progressBar;
  private LinearLayout ll;
  private AlertDialog.Builder builder;
  private Dialog dialog;

  public Progress(Context context) {
    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    view = inflater.inflate(R.layout.progress, null);
    init();
  }

  void init() {
    msg = (TextView) view.findViewById(R.id.msg);
    progressBar = ((ProgressBar) view.findViewById(R.id.loader));
    ll = ((LinearLayout) view.findViewById(R.id.ll));
    builder = new AlertDialog.Builder(view.getContext());
  }

  public void light(String message) {
    setBackgroundColor(view.getResources().getColor(R.color.pp_white));
    setProgressColor(view.getResources().getColor(R.color.pp_black));
    setMessageColor(view.getResources().getColor(R.color.pp_black));
    setMessage(message);
    show();
  }

  public void dark(String message) {
    setBackgroundColor(view.getResources().getColor(R.color.pp_black));
    setProgressColor(view.getResources().getColor(R.color.pp_white));
    setMessageColor(view.getResources().getColor(R.color.pp_white));
    setMessage(message);
    show();
  }

  public Progress setBackgroundDrawable(Drawable drawable) {
    ll.setBackgroundDrawable(drawable);
    ll.setPadding(30, 30, 30, 30);
    return this;
  }

  public Progress setBackgroundColor(int color) {
    ll.setBackgroundColor(color);
    return this;
  }

  public Progress setProgressColor(int color) {
    progressBar.setIndeterminateTintList(ColorStateList.valueOf(color));
    return this;
  }

  public Progress setMessage(String message) {
    msg.setText(message);
    return this;
  }

  public Progress setMessageColor(int color) {
    msg.setTextColor(color);
    return this;
  }

  public void show() {
    builder.setView(view);
    dialog = builder.create();
    dialog.show();
  }

  public void dismiss() {
    dialog.dismiss();
  }
}
