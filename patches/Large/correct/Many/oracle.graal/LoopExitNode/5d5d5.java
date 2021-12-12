diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/LoopExitNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/LoopExitNode.java
index 76c550a..f7d1213 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/LoopExitNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/LoopExitNode.java
@@ -35,7 +35,13 @@
 public final class LoopExitNode extends BeginStateSplitNode implements IterableNodeType, Simplifiable {
 
     public static final NodeClass<LoopExitNode> TYPE = NodeClass.create(LoopExitNode.class);
-    @Input(InputType.Association) LoopBeginNode loopBegin;
+
+    /*
+     * The declared type of the field cannot be LoopBeginNode, because loop explosion during partial
+     * evaluation can temporarily assign a non-loop begin. This node will then be deleted shortly
+     * after - but we still must not have type system violations for that short amount of time.
+     */
+    @Input(InputType.Association) AbstractBeginNode loopBegin;
 
     public LoopExitNode(LoopBeginNode loop) {
         super(TYPE);
@@ -44,7 +50,7 @@
     }
 
     public LoopBeginNode loopBegin() {
-        return loopBegin;
+        return (LoopBeginNode) loopBegin;
     }
 
     @Override
