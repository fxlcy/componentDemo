package com.huazhen.lib1;

import android.content.Context;
import android.widget.Toast;

import com.huazhen.services.ToastServices;

/**
 * Created by fxlcy on 18-7-19.
 */
public class ToastServices2Impl implements ToastServices {
    @Override
    public void toast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
