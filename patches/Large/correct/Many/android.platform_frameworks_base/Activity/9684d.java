diff --git a/core/java/android/app/Activity.java b/core/java/android/app/Activity.java
index ad272b8..e4c63f7 100644
--- a/core/java/android/app/Activity.java
+++ b/core/java/android/app/Activity.java
@@ -976,7 +976,7 @@
     protected void onCreate(@Nullable Bundle savedInstanceState) {
         if (DEBUG_LIFECYCLE) Slog.v(TAG, "onCreate " + this + ": " + savedInstanceState);
 
-        if (getApplicationInfo().targetSdkVersion >= O && mActivityInfo.isFixedOrientation()) {
+        if (getApplicationInfo().targetSdkVersion > O && mActivityInfo.isFixedOrientation()) {
             final TypedArray ta = obtainStyledAttributes(com.android.internal.R.styleable.Window);
             final boolean isTranslucentOrFloating = ActivityInfo.isTranslucentOrFloating(ta);
             ta.recycle();
