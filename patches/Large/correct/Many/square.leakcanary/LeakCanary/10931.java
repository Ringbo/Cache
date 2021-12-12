diff --git a/library/leakcanary-android/src/main/java/com/squareup/leakcanary/LeakCanary.java b/library/leakcanary-android/src/main/java/com/squareup/leakcanary/LeakCanary.java
index e39553a..78e57c4 100644
--- a/library/leakcanary-android/src/main/java/com/squareup/leakcanary/LeakCanary.java
+++ b/library/leakcanary-android/src/main/java/com/squareup/leakcanary/LeakCanary.java
@@ -61,7 +61,7 @@
     DebuggerControl debuggerControl = new AndroidDebuggerControl();
     AndroidHeapDumper heapDumper = new AndroidHeapDumper();
     heapDumper.cleanup();
-    ExcludedRefs excludedRefs = AndroidExcludedRefs.createAndroidDefaults().build();
+    ExcludedRefs excludedRefs = AndroidExcludedRefs.createAppDefaults().build();
     return new RefWatcher(new AndroidWatchExecutor(), debuggerControl, GcTrigger.DEFAULT,
         heapDumper, heapDumpListener, excludedRefs);
   }
