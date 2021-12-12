diff --git a/src/edu/stanford/nlp/graph/DirectedMultiGraph.java b/src/edu/stanford/nlp/graph/DirectedMultiGraph.java
index f2118c1..98f4c96 100644
--- a/src/edu/stanford/nlp/graph/DirectedMultiGraph.java
+++ b/src/edu/stanford/nlp/graph/DirectedMultiGraph.java
@@ -138,7 +138,7 @@
     }
     boolean foundOut = outgoingEdges.containsKey(source) && outgoingEdges.get(source).containsKey(dest) &&
         outgoingEdges.get(source).get(dest).remove(data);
-    boolean foundIn = incomingEdges.containsKey(source) && incomingEdges.get(source).containsKey(dest) &&
+    boolean foundIn = incomingEdges.containsKey(dest) && incomingEdges.get(dest).containsKey(source) &&
         incomingEdges.get(dest).get(source).remove(data);
     if (foundOut && !foundIn) {
       throw new AssertionError("Edge found in outgoing but not incoming");
