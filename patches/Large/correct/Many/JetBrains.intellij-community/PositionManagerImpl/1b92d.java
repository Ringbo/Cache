diff --git a/java/debugger/impl/src/com/intellij/debugger/engine/PositionManagerImpl.java b/java/debugger/impl/src/com/intellij/debugger/engine/PositionManagerImpl.java
index 151fc6f..570f6ba 100644
--- a/java/debugger/impl/src/com/intellij/debugger/engine/PositionManagerImpl.java
+++ b/java/debugger/impl/src/com/intellij/debugger/engine/PositionManagerImpl.java
@@ -285,8 +285,11 @@
         int rangeEnd = Integer.MIN_VALUE;
         for (Location location : fromClass.allLineLocations()) {
           final int lnumber = location.lineNumber();
-          if (lnumber < 1) {
-            continue; // should be a native method, skipping
+          if (lnumber <= 1) {
+            // should be a native method, skipping
+            // sometimes compiler generates location where line number is exactly 1 (e.g. GWT)
+            // such locations are hardly correspond to real lines in code, so skipping them too
+            continue;
           }
           final Method method = location.method();
           if (method == null || (canGetSynthetic && method.isSynthetic()) || method.isBridge()) {
