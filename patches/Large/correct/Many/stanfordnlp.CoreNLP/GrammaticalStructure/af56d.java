diff --git a/src/edu/stanford/nlp/trees/GrammaticalStructure.java b/src/edu/stanford/nlp/trees/GrammaticalStructure.java
index f1c12e5..55ca574 100644
--- a/src/edu/stanford/nlp/trees/GrammaticalStructure.java
+++ b/src/edu/stanford/nlp/trees/GrammaticalStructure.java
@@ -253,8 +253,11 @@
     }
     if (attach && puncFilter.accept(t.headWordNode().label().value())) {
       // make faster by first looking for links from parent
+      // it is necessary to look for paths using all directions
+      // because sometimes there are edges created from lower nodes to
+      // nodes higher up
       TreeGraphNode parent = t.parent().highestNodeWithSameHead();
-      if (!basicGraph.isEdge(parent, t) && basicGraph.getShortestPath(root, t, true) == null) {
+      if (!basicGraph.isEdge(parent, t) && basicGraph.getShortestPath(root, t, false) == null) {
         basicGraph.add(parent, t, GrammaticalRelation.DEPENDENT);
       }
     }
