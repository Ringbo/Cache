diff --git a/packages/DocumentsUI/src/com/android/documentsui/Metrics.java b/packages/DocumentsUI/src/com/android/documentsui/Metrics.java
index bae334b..62d1c5a2 100644
--- a/packages/DocumentsUI/src/com/android/documentsui/Metrics.java
+++ b/packages/DocumentsUI/src/com/android/documentsui/Metrics.java
@@ -354,7 +354,7 @@
      * a single ROOT_OTHER bucket.
      */
     private static @Root int sanitizeRoot(Uri uri) {
-        if (LauncherActivity.isLaunchUri(uri)) {
+        if (uri == null || LauncherActivity.isLaunchUri(uri)) {
             return ROOT_NONE;
         }
 
