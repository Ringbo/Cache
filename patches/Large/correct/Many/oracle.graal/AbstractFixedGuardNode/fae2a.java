diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/AbstractFixedGuardNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/AbstractFixedGuardNode.java
index 9a977fe..3e83cbc 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/AbstractFixedGuardNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/AbstractFixedGuardNode.java
@@ -102,7 +102,7 @@
     public DeoptimizeNode lowerToIf() {
         FixedNode currentNext = next();
         setNext(null);
-        DeoptimizeNode deopt = graph().add(new DeoptimizeNode(action, reason));
+        DeoptimizeNode deopt = graph().add(new DeoptimizeNode(action, reason, speculation));
         deopt.setStateBefore(stateBefore());
         IfNode ifNode;
         AbstractBeginNode noDeoptSuccessor;
