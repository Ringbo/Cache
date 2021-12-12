diff --git a/graal/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/LoopNode.java b/graal/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/LoopNode.java
index 786dac5..72cc15e 100644
--- a/graal/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/LoopNode.java
+++ b/graal/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/LoopNode.java
@@ -31,13 +31,10 @@
  */
 public abstract class LoopNode extends Node {
 
-    /*
-     * TODO Unfortunately we cannot yet use interface typed fields as child fields.
-     */
-    @Child protected Node repeatingNode;
+    @Child protected RepeatingNode repeatingNode;
 
     public LoopNode(RepeatingNode repeatingNode) {
-        this.repeatingNode = (Node) repeatingNode;
+        this.repeatingNode = repeatingNode;
     }
 
     public abstract void executeLoop(VirtualFrame frame);
@@ -47,7 +44,7 @@
     }
 
     public final RepeatingNode getRepeatingNode() {
-        return (RepeatingNode) repeatingNode;
+        return repeatingNode;
     }
 
 }
