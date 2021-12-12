diff --git a/core/java/android/util/Log.java b/core/java/android/util/Log.java
index 121485a..fe41932 100644
--- a/core/java/android/util/Log.java
+++ b/core/java/android/util/Log.java
@@ -289,7 +289,10 @@
     static int wtf(int logId, String tag, String msg, Throwable tr, boolean localStack,
             boolean system) {
         TerribleFailure what = new TerribleFailure(msg, tr);
-        int bytes = println_native(logId, ASSERT, tag, msg + '\n'
+        // Only mark this as ERROR, do not use ASSERT since that should be
+        // reserved for cases where the system is guaranteed to abort.
+        // The onTerribleFailure call does not always cause a crash.
+        int bytes = println_native(logId, ERROR, tag, msg + '\n'
                 + getStackTraceString(localStack ? what : tr));
         sWtfHandler.onTerribleFailure(tag, what, system);
         return bytes;
