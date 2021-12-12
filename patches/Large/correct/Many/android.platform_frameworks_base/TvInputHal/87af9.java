diff --git a/services/core/java/com/android/server/tv/TvInputHal.java b/services/core/java/com/android/server/tv/TvInputHal.java
index a035826..ebbb8b3 100644
--- a/services/core/java/com/android/server/tv/TvInputHal.java
+++ b/services/core/java/com/android/server/tv/TvInputHal.java
@@ -116,7 +116,7 @@
 
     public void close() {
         synchronized (mLock) {
-            if (mPtr != 0l) {
+            if (mPtr != 0L) {
                 nativeClose(mPtr);
             }
         }
