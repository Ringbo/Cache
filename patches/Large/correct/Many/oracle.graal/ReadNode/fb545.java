diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/ReadNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/ReadNode.java
index b882ca6..4e96c97 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/ReadNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/ReadNode.java
@@ -45,12 +45,12 @@
         super(object, ConstantLocationNode.create(locationIdentity, kind, displacement, object.graph()), StampFactory.forKind(kind));
     }
 
-    private ReadNode(ValueNode object, ValueNode location, GuardingNode guard) {
+    private ReadNode(ValueNode object, ValueNode location, ValueNode guard) {
         /*
          * Used by node intrinsics. Since the initial value for location is a parameter, i.e., a
          * LocalNode, the constructor cannot use the declared type LocationNode.
          */
-        super(object, location, StampFactory.forNodeIntrinsic(), guard);
+        super(object, location, StampFactory.forNodeIntrinsic(), (GuardingNode) guard);
     }
 
     @Override
