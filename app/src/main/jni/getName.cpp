#include "com_kissdream_androidjnitest_myJNIUtils.h"
JNIEXPORT jstring JNICALL Java_com_kissdream_androidjnitest_myJNIUtils_getName
        (JNIEnv * env, jobject obj){
//如果是用C语言格式就用这种方式
//    return (*env)->NewStringUTF(env,"Kiss dream");
    //如果是用C语言格式就用这种方式
return env->NewStringUTF((char *)"Kiss dream");
}

