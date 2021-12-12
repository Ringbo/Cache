diff --git a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/graph/PostOrderNodeIterator.java b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/graph/PostOrderNodeIterator.java
index a39ac03..8305259 100644
--- a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/graph/PostOrderNodeIterator.java
+++ b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/graph/PostOrderNodeIterator.java
@@ -48,7 +48,7 @@
         FixedNode current = start;
 
         do {
-            if (current instanceof Invoke) {
+            if (current instanceof InvokeWithExceptionNode) {
                 invoke((Invoke) current);
                 queueSuccessors(current, null);
                 current = nextQueuedNode();
