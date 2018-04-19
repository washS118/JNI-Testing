#include <stdio.h>
#include "../header/app_TestDriver.h"

JNIEXPORT jint JNICALL Java_app_TestDriver_intMethod
  (JNIEnv *env, jobject obj, jint num){
      int cint = (int) num;
      cint = cint + 1;
      return (jint) cint;
  }

JNIEXPORT jboolean JNICALL Java_app_TestDriver_booleanMethod
  (JNIEnv *env, jobject obj, jboolean b){
      return !b;
  }

  int main(){};