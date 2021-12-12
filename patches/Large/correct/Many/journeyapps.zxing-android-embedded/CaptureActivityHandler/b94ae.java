diff --git a/src/com/google/zxing/client/android/CaptureActivityHandler.java b/src/com/google/zxing/client/android/CaptureActivityHandler.java
index 3cf2969..3e1e2e8 100755
--- a/src/com/google/zxing/client/android/CaptureActivityHandler.java
+++ b/src/com/google/zxing/client/android/CaptureActivityHandler.java
@@ -112,8 +112,8 @@
           Log.d(TAG, "Using browser in package " + browserPackageName);
         }
 
-        // Needed for default Android browser only apparently
-        if ("com.android.browser".equals(browserPackageName)) {
+        // Needed for default Android browser / Chrome only apparently
+        if ("com.android.browser".equals(browserPackageName) || "com.android.chrome".equals(browserPackageName)) {
           intent.setPackage(browserPackageName);
           intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
           intent.putExtra(Browser.EXTRA_APPLICATION_ID, browserPackageName);
