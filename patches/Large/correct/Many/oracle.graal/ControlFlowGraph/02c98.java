diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/cfg/ControlFlowGraph.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/cfg/ControlFlowGraph.java
index e66a6a9..0208542 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/cfg/ControlFlowGraph.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/cfg/ControlFlowGraph.java
@@ -252,7 +252,7 @@
     private void computeLoopInformation() {
         loops = new ArrayList<>();
         for (Block block : reversePostOrder) {
-            Node beginNode = block.getBeginNode();
+            AbstractBeginNode beginNode = block.getBeginNode();
             if (beginNode instanceof LoopBeginNode) {
                 Loop<Block> loop = new HIRLoop(block.getLoop(), loops.size(), block);
                 loops.add(loop);
