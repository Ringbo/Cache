diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/cfg/ControlFlowGraph.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/cfg/ControlFlowGraph.java
index 6ab06e9..9821a07 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/cfg/ControlFlowGraph.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/cfg/ControlFlowGraph.java
@@ -346,7 +346,7 @@
             }
             Block firstSucc = block.getSuccessors().get(0);
             if (block.getSuccessorCount() == 1) {
-                block.postdominator = block;
+                block.postdominator = firstSucc;
                 continue;
             }
             Block postdominator = firstSucc;
