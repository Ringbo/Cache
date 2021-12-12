diff --git a/core/java/android/os/StrictMode.java b/core/java/android/os/StrictMode.java
index 759be91..ce213fb 100644
--- a/core/java/android/os/StrictMode.java
+++ b/core/java/android/os/StrictMode.java
@@ -1201,7 +1201,7 @@
             // throttled back to 60fps via SurfaceFlinger/View
             // invalidates, _not_ by posting frame updates every 16
             // milliseconds.
-            threadHandler.get().post(new Runnable() {
+            threadHandler.get().postAtFrontOfQueue(new Runnable() {
                     public void run() {
                         long loopFinishTime = SystemClock.uptimeMillis();
 
