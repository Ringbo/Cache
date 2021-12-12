diff --git a/platform/smRunner/src/com/intellij/execution/testframework/sm/runner/SMTestProxy.java b/platform/smRunner/src/com/intellij/execution/testframework/sm/runner/SMTestProxy.java
index 6b3535c..9fc70fb 100644
--- a/platform/smRunner/src/com/intellij/execution/testframework/sm/runner/SMTestProxy.java
+++ b/platform/smRunner/src/com/intellij/execution/testframework/sm/runner/SMTestProxy.java
@@ -146,7 +146,7 @@
     final boolean canCacheErrors = !myState.isInProgress();
     // calculate
     final boolean hasErrors = calcHasErrors();
-    if (canCacheErrors) {
+    if (canCacheErrors || hasErrors) {
       myHasCriticalErrors = hasErrors;
       myHasErrorsCached = true;
     }
