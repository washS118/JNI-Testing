#include <stdio.h>
#include "TestDriver.h"

JNIEXPORT jint JNICALL Java_TestDriver_intMethod
  (JNIEnv *env, jobject obj, jint num){
      return num * num;
  }

JNIEXPORT jboolean JNICALL Java_TestDriver_booleanMethod
  (JNIEnv *env, jobject obj, jboolean b){
      return !b;
  }

  int main(){};