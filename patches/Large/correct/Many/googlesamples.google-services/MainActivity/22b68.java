diff --git a/android/signin/app/src/main/java/com/google/samples/quickstart/signin/MainActivity.java b/android/signin/app/src/main/java/com/google/samples/quickstart/signin/MainActivity.java
index 016c146..d17dfab 100644
--- a/android/signin/app/src/main/java/com/google/samples/quickstart/signin/MainActivity.java
+++ b/android/signin/app/src/main/java/com/google/samples/quickstart/signin/MainActivity.java
@@ -140,7 +140,7 @@
     protected void onSaveInstanceState(Bundle outState) {
         super.onSaveInstanceState(outState);
         outState.putBoolean(KEY_IS_RESOLVING, mIsResolving);
-        outState.putBoolean(KEY_SHOULD_RESOLVE, mIsResolving);
+        outState.putBoolean(KEY_SHOULD_RESOLVE, mShouldResolve);
     }
     // [END on_save_instance_state]
 
