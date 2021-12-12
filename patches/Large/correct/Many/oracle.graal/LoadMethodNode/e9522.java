diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/LoadMethodNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/LoadMethodNode.java
index 8f279b3..1e3eff5 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/LoadMethodNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/extended/LoadMethodNode.java
@@ -101,7 +101,7 @@
              * This really represent a misuse of LoadMethod since we're loading from a class which
              * isn't known to implement the original method but for now at least fold it away.
              */
-            return ConstantNode.forConstant(JavaConstant.NULL_POINTER, null);
+            return ConstantNode.forConstant(stamp(), JavaConstant.NULL_POINTER, null);
         } else {
             return ConstantNode.forConstant(stamp(), newMethod.getEncoding(), tool.getMetaAccess());
         }
