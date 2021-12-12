diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java
index 44637fe..4547d30 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java
@@ -325,7 +325,7 @@
         } else if (next1 instanceof DeoptimizeNode && next2 instanceof DeoptimizeNode) {
             DeoptimizeNode deopt1 = (DeoptimizeNode) next1;
             DeoptimizeNode deopt2 = (DeoptimizeNode) next2;
-            if (deopt1.reason() == deopt2.reason() && deopt1.action() == deopt1.action()) {
+            if (deopt1.reason() == deopt2.reason() && deopt1.action() == deopt2.action()) {
                 // Same deoptimization reason and action.
                 return true;
             }
