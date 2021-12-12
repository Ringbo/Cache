diff --git a/core/java/android/os/Looper.java b/core/java/android/os/Looper.java
index b58ff1f..d299672 100644
--- a/core/java/android/os/Looper.java
+++ b/core/java/android/os/Looper.java
@@ -147,7 +147,7 @@
             }
 
             final long traceTag = me.mTraceTag;
-            if (traceTag != 0) {
+            if (traceTag != 0 && Trace.isTagEnabled(traceTag)) {
                 Trace.traceBegin(traceTag, msg.target.getTraceName(msg));
             }
             try {
