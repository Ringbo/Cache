diff --git a/astroboy/src/roboguice/astroboy/activity/ExampleBackgroundTask.java b/astroboy/src/roboguice/astroboy/activity/ExampleBackgroundTask.java
index f133483..a694b09 100644
--- a/astroboy/src/roboguice/astroboy/activity/ExampleBackgroundTask.java
+++ b/astroboy/src/roboguice/astroboy/activity/ExampleBackgroundTask.java
@@ -17,7 +17,7 @@
     }
 
     @Override
-    protected void onInterrupted(InterruptedException e) {
+    protected void onInterrupted(Exception e) {
         Ln.d("Interrupting background task %s", this);
     }
 
