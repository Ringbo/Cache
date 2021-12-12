diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java
index 8454162..6e3d786 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java
@@ -1146,7 +1146,7 @@
      */
     public static Constant[] constantValues(ValueNode node, AbstractMergeNode merge, boolean allowNull) {
         if (node.isConstant()) {
-            JavaConstant[] result = new JavaConstant[merge.forwardEndCount()];
+            Constant[] result = new Constant[merge.forwardEndCount()];
             Arrays.fill(result, node.asConstant());
             return result;
         }
