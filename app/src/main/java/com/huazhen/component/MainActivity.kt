package com.huazhen.component

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        ARouter.init(application)
//        ARouter.openDebug()


        ARouter.getInstance().build("/path/main")
                .navigation(this,object :NavigationCallback{
                    override fun onLost(postcard: Postcard?) {

                    }

                    override fun onFound(postcard: Postcard?) {

                    }

                    override fun onInterrupt(postcard: Postcard?) {

                    }

                    override fun onArrival(postcard: Postcard?) {
                    }

                })

    }
}
