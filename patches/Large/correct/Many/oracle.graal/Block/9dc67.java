diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/cfg/Block.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/cfg/Block.java
index 7f66d9f..c2d1c39 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/cfg/Block.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/cfg/Block.java
@@ -68,7 +68,7 @@
 
     public boolean isExceptionEntry() {
         Node predecessor = getBeginNode().predecessor();
-        return predecessor != null && predecessor instanceof InvokeWithExceptionNode && getBeginNode() != ((InvokeWithExceptionNode) predecessor).exceptionEdge();
+        return predecessor != null && predecessor instanceof InvokeWithExceptionNode && getBeginNode() == ((InvokeWithExceptionNode) predecessor).exceptionEdge();
     }
 
     public Block getFirstPredecessor() {
