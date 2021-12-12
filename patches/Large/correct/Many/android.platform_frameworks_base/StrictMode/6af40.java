diff --git a/core/java/android/os/StrictMode.java b/core/java/android/os/StrictMode.java
index 1cc2d33..f10b982 100644
--- a/core/java/android/os/StrictMode.java
+++ b/core/java/android/os/StrictMode.java
@@ -1919,9 +1919,9 @@
         for (int i = 0; i < numViolations; ++i) {
             if (LOG_V) Log.d(TAG, "strict mode violation stacks read from binder call.  i=" + i);
             ViolationInfo info = new ViolationInfo(p, !currentlyGathering);
-            if (info.crashInfo.stackTrace != null && info.crashInfo.stackTrace.length() > 10000) {
+            if (info.crashInfo.stackTrace != null && info.crashInfo.stackTrace.length() > 30000) {
                 String front = info.crashInfo.stackTrace.substring(256);
-                // 10000 characters is way too large for this to be any sane kind of
+                // 30000 characters is way too large for this to be any sane kind of
                 // strict mode collection of stacks.  We've had a problem where we leave
                 // strict mode violations associated with the thread, and it keeps tacking
                 // more and more stacks on to the violations.  Looks like we're in this casse,
