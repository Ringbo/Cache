diff --git a/compiler/util/src/org/jetbrains/jet/utils/Profiler.java b/compiler/util/src/org/jetbrains/jet/utils/Profiler.java
index 06f4a68..0c4a4f7 100644
--- a/compiler/util/src/org/jetbrains/jet/utils/Profiler.java
+++ b/compiler/util/src/org/jetbrains/jet/utils/Profiler.java
@@ -116,7 +116,7 @@
     }
 
     public Profiler start() {
-        if (!paused) {
+        if (paused) {
             start = System.nanoTime();
             paused = false;
         }
