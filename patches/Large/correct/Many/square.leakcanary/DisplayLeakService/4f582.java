diff --git a/leakcanary-android/src/main/java/com/squareup/leakcanary/DisplayLeakService.java b/leakcanary-android/src/main/java/com/squareup/leakcanary/DisplayLeakService.java
index 24e8842..6bf9450 100644
--- a/leakcanary-android/src/main/java/com/squareup/leakcanary/DisplayLeakService.java
+++ b/leakcanary-android/src/main/java/com/squareup/leakcanary/DisplayLeakService.java
@@ -42,7 +42,7 @@
 
   @Override protected final void onHeapAnalyzed(HeapDump heapDump, AnalysisResult result) {
     String leakInfo = leakInfo(this, heapDump, result, true);
-    CanaryLog.d(leakInfo);
+    CanaryLog.d("%s", leakInfo);
 
     boolean resultSaved = false;
     boolean shouldSaveResult = result.leakFound || result.failure != null;
