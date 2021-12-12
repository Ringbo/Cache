diff --git a/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/debug/ShapeProfiler.java b/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/debug/ShapeProfiler.java
index 4ebec3c..e925704 100644
--- a/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/debug/ShapeProfiler.java
+++ b/truffle/com.oracle.truffle.object/src/com/oracle/truffle/object/debug/ShapeProfiler.java
@@ -107,7 +107,7 @@
         private long pas;
         private long pfs;
 
-        public ShapeStats(String label) {
+        ShapeStats(String label) {
             this.label = label;
         }
 
