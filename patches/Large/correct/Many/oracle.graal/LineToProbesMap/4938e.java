diff --git a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/debug/LineToProbesMap.java b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/debug/LineToProbesMap.java
index 29666d8..a2299b3 100644
--- a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/debug/LineToProbesMap.java
+++ b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/debug/LineToProbesMap.java
@@ -63,7 +63,7 @@
      * Create a map of {@link Probe}s that collects information on all probes added to subsequently
      * created ASTs (once installed).
      */
-    public LineToProbesMap() {
+    LineToProbesMap() {
         this.probeListener = new LineToProbesListener();
     }
 
