diff --git a/library/core/src/main/java/com/google/android/exoplayer2/util/EventLogger.java b/library/core/src/main/java/com/google/android/exoplayer2/util/EventLogger.java
index 9af46d8..1cac895 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/util/EventLogger.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/util/EventLogger.java
@@ -560,6 +560,6 @@
   }
 
   protected void loge(String tag, String msg, Throwable tr) {
-    Log.d(tag, msg, tr);
+    Log.e(tag, msg, tr);
   }
 }
