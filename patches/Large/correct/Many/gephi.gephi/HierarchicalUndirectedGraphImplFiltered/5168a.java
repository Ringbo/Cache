diff --git a/DHNSGraph/src/org/gephi/graph/dhns/graph/HierarchicalUndirectedGraphImplFiltered.java b/DHNSGraph/src/org/gephi/graph/dhns/graph/HierarchicalUndirectedGraphImplFiltered.java
index 88f4d8f..0cdcc0f 100644
--- a/DHNSGraph/src/org/gephi/graph/dhns/graph/HierarchicalUndirectedGraphImplFiltered.java
+++ b/DHNSGraph/src/org/gephi/graph/dhns/graph/HierarchicalUndirectedGraphImplFiltered.java
@@ -98,7 +98,7 @@
     public int getDegree(Node node) {
         view.checkUpdate();
         AbstractNode absNode = checkNode(node);
-        int count = view.getClusteredLayerInDegree(absNode);
+        int count = view.getClusteredLayerDegree(absNode);
         return count;
     }
 
