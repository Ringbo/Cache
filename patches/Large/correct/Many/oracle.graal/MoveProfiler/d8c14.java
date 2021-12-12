diff --git a/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/profiling/MoveProfiler.java b/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/profiling/MoveProfiler.java
index b1acda2..488c96a 100644
--- a/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/profiling/MoveProfiler.java
+++ b/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/profiling/MoveProfiler.java
@@ -44,7 +44,7 @@
 
         private final int[] cnt;
 
-        public MoveStatistics() {
+        MoveStatistics() {
             cnt = new int[MoveType.values().length];
 
         }
