package com.kissdream.androidjnitest;

/**
 * Created by apple on 2017/12/3.
 */

public class myJNIUtils {
    static {
        //名字注意，需要跟你的build.gradle ndk节点下面的名字一样
        System.loadLibrary("NameProvider");
    }
    //JNI接口需要用native关键字修饰
    public native String getName();
}
