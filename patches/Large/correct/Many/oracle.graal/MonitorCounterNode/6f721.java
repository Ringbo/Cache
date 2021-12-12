diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/MonitorCounterNode.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/MonitorCounterNode.java
index 02e209a..f556984 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/MonitorCounterNode.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/MonitorCounterNode.java
@@ -37,7 +37,7 @@
 @NodeInfo
 public class MonitorCounterNode extends FloatingNode implements LIRLowerable {
 
-    private MonitorCounterNode() {
+    MonitorCounterNode() {
         super(null);
     }
 
