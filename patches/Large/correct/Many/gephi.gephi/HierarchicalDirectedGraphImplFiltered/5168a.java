diff --git a/DHNSGraph/src/org/gephi/graph/dhns/graph/HierarchicalDirectedGraphImplFiltered.java b/DHNSGraph/src/org/gephi/graph/dhns/graph/HierarchicalDirectedGraphImplFiltered.java
index 26ef2a1..364400f 100644
--- a/DHNSGraph/src/org/gephi/graph/dhns/graph/HierarchicalDirectedGraphImplFiltered.java
+++ b/DHNSGraph/src/org/gephi/graph/dhns/graph/HierarchicalDirectedGraphImplFiltered.java
@@ -93,7 +93,7 @@
     public int getDegree(Node node) {
         view.checkUpdate();
         AbstractNode absNode = checkNode(node);
-        int count = view.getClusteredLayerInDegree(absNode);
+        int count = view.getClusteredLayerDegree(absNode);
         return count;
     }
 
