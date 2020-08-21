#include <jni.h>

JNIEXPORT jstring JNICALL
JAVA_com_example_weatherapp_getAPI(JNIEnv *env, jclass type){
    return (*env) -> NewStringUTF(env, "aHR0cHM6Ly9hcGkub3BlbndlYXRoZXJtYXAub3JnL2RhdGEvMi41Lw==");
}