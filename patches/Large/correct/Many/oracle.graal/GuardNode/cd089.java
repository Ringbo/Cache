diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/GuardNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/GuardNode.java
index b12b2c4..4a23bd8 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/GuardNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/GuardNode.java
@@ -112,7 +112,7 @@
         } else if (negated && condition() instanceof ShortCircuitOrNode) {
             ShortCircuitOrNode or = (ShortCircuitOrNode) condition();
             GuardNode firstGuard = graph().unique(new GuardNode(or.getX(), getGuard(), reason, action, !or.isXNegated(), speculation));
-            GuardNode secondGuard = graph().unique(new GuardNode(or.getY(), firstGuard, reason, action, or.isYNegated(), speculation));
+            GuardNode secondGuard = graph().unique(new GuardNode(or.getY(), firstGuard, reason, action, !or.isYNegated(), speculation));
             return secondGuard;
         }
         return this;
