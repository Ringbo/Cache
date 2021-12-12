diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/virtual/VirtualArrayNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/virtual/VirtualArrayNode.java
index 21d2080..ed8326c 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/virtual/VirtualArrayNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/virtual/VirtualArrayNode.java
@@ -140,7 +140,7 @@
     }
 
     @Override
-    public AllocatedObjectNode getMaterializedRepresentation(FixedNode fixed, ValueNode[] entries, int[] locks) {
+    public ValueNode getMaterializedRepresentation(FixedNode fixed, ValueNode[] entries, int[] locks) {
         return new AllocatedObjectNode(this);
     }
 }
