diff --git a/graal/com.oracle.graal.truffle.hotspot/src/com/oracle/graal/truffle/hotspot/HotSpotTruffleRuntime.java b/graal/com.oracle.graal.truffle.hotspot/src/com/oracle/graal/truffle/hotspot/HotSpotTruffleRuntime.java
index ba50416..bc818e4 100644
--- a/graal/com.oracle.graal.truffle.hotspot/src/com/oracle/graal/truffle/hotspot/HotSpotTruffleRuntime.java
+++ b/graal/com.oracle.graal.truffle.hotspot/src/com/oracle/graal/truffle/hotspot/HotSpotTruffleRuntime.java
@@ -315,7 +315,7 @@
     public boolean cancelInstalledTask(OptimizedCallTarget optimizedCallTarget) {
         Future<?> codeTask = this.compilations.get(optimizedCallTarget);
         if (codeTask != null && isCompiling(optimizedCallTarget)) {
-            this.compilations.remove(codeTask);
+            this.compilations.remove(optimizedCallTarget);
             return codeTask.cancel(true);
         }
         return false;
