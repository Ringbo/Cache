diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/LoopEndNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/LoopEndNode.java
index f971509..cecf03b 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/LoopEndNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/LoopEndNode.java
@@ -38,7 +38,13 @@
 public final class LoopEndNode extends AbstractEndNode {
 
     public static final NodeClass<LoopEndNode> TYPE = NodeClass.create(LoopEndNode.class);
-    @Input(InputType.Association) LoopBeginNode loopBegin;
+
+    /*
+     * The declared type of the field cannot be LoopBeginNode, because loop explosion during partial
+     * evaluation can temporarily assign a non-loop begin. This node will then be deleted shortly
+     * after - but we still must not have type system violations for that short amount of time.
+     */
+    @Input(InputType.Association) AbstractBeginNode loopBegin;
     protected int endIndex;
 
     /**
@@ -72,7 +78,7 @@
     }
 
     public LoopBeginNode loopBegin() {
-        return loopBegin;
+        return (LoopBeginNode) loopBegin;
     }
 
     public void setLoopBegin(LoopBeginNode x) {
@@ -89,7 +95,7 @@
     }
 
     public boolean canSafepoint() {
-        assert !canSafepoint || loopBegin.canEndsSafepoint : "When safepoints are disabled for loop begin, safepoints must be disabled for all loop ends";
+        assert !canSafepoint || loopBegin().canEndsSafepoint : "When safepoints are disabled for loop begin, safepoints must be disabled for all loop ends";
         return canSafepoint;
     }
 
