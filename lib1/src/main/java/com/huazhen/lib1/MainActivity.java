package com.huazhen.lib1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.huazhen.services.ToastServices;

import cn.fxlcy.component.services.AppServices;

/**
 * Created by fxlcy on 18-7-17.
 */
@Route(path = "/path/main")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ToastServices services = AppServices.getInstance().getService(ToastServices.class);

        services.toast(this, "sdfosdjfojsodfjosjdf");
    }
}
