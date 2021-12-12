diff --git a/core/java/android/os/StrictMode.java b/core/java/android/os/StrictMode.java
index 0ee8d86f..47ea732 100644
--- a/core/java/android/os/StrictMode.java
+++ b/core/java/android/os/StrictMode.java
@@ -1725,7 +1725,7 @@
         for (int i = 0; i < numViolations; ++i) {
             if (LOG_V) Log.d(TAG, "strict mode violation stacks read from binder call.  i=" + i);
             ViolationInfo info = new ViolationInfo(p, !currentlyGathering);
-            if (info.crashInfo.stackTrace.length() > 10000) {
+            if (info.crashInfo.stackTrace != null && info.crashInfo.stackTrace.length() > 10000) {
                 // 10000 characters is way too large for this to be any sane kind of
                 // strict mode collection of stacks.  We've had a problem where we leave
                 // strict mode violations associated with the thread, and it keeps tacking
