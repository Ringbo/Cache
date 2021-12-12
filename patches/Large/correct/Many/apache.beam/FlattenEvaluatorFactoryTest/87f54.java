diff --git a/runners/direct-java/src/test/java/org/apache/beam/runners/direct/FlattenEvaluatorFactoryTest.java b/runners/direct-java/src/test/java/org/apache/beam/runners/direct/FlattenEvaluatorFactoryTest.java
index 3c00126..2aa4ab1 100644
--- a/runners/direct-java/src/test/java/org/apache/beam/runners/direct/FlattenEvaluatorFactoryTest.java
+++ b/runners/direct-java/src/test/java/org/apache/beam/runners/direct/FlattenEvaluatorFactoryTest.java
@@ -77,9 +77,9 @@
     rightSideEvaluator.processElement(WindowedValue.valueInGlobalWindow(-1));
     leftSideEvaluator.processElement(
         WindowedValue.timestampedValueInGlobalWindow(2, new Instant(1024)));
-    leftSideEvaluator.processElement(WindowedValue.valueInEmptyWindows(4, PaneInfo.NO_FIRING));
+    leftSideEvaluator.processElement(WindowedValue.valueInGlobalWindow(4, PaneInfo.NO_FIRING));
     rightSideEvaluator.processElement(
-        WindowedValue.valueInEmptyWindows(2, PaneInfo.ON_TIME_AND_ONLY_FIRING));
+        WindowedValue.valueInGlobalWindow(2, PaneInfo.ON_TIME_AND_ONLY_FIRING));
     rightSideEvaluator.processElement(
         WindowedValue.timestampedValueInGlobalWindow(-4, new Instant(-4096)));
 
@@ -99,12 +99,12 @@
         flattenedLeftBundle.commit(Instant.now()).getElements(),
         containsInAnyOrder(
             WindowedValue.timestampedValueInGlobalWindow(2, new Instant(1024)),
-            WindowedValue.valueInEmptyWindows(4, PaneInfo.NO_FIRING),
+            WindowedValue.valueInGlobalWindow(4, PaneInfo.NO_FIRING),
             WindowedValue.valueInGlobalWindow(1)));
     assertThat(
         flattenedRightBundle.commit(Instant.now()).getElements(),
         containsInAnyOrder(
-            WindowedValue.valueInEmptyWindows(2, PaneInfo.ON_TIME_AND_ONLY_FIRING),
+            WindowedValue.valueInGlobalWindow(2, PaneInfo.ON_TIME_AND_ONLY_FIRING),
             WindowedValue.timestampedValueInGlobalWindow(-4, new Instant(-4096)),
             WindowedValue.valueInGlobalWindow(-1)));
   }
