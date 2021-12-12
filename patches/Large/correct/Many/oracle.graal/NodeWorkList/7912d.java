diff --git a/graal/com.oracle.graal.graph/src/com/oracle/graal/graph/NodeWorkList.java b/graal/com.oracle.graal.graph/src/com/oracle/graal/graph/NodeWorkList.java
index 61ae140..143e195 100644
--- a/graal/com.oracle.graal.graph/src/com/oracle/graal/graph/NodeWorkList.java
+++ b/graal/com.oracle.graal.graph/src/com/oracle/graal/graph/NodeWorkList.java
@@ -157,7 +157,7 @@
         }
 
         private boolean checkInfiniteWork(Node node) {
-            if (lastPull == node) {
+            if (lastPull == node && !node.hasNoUsages()) {
                 if (firstNoChange == null) {
                     firstNoChange = node;
                     lastChain = node;
