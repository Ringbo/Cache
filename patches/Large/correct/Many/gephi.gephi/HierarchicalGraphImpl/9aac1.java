diff --git a/DHNSGraph/src/org/gephi/graph/dhns/graph/HierarchicalGraphImpl.java b/DHNSGraph/src/org/gephi/graph/dhns/graph/HierarchicalGraphImpl.java
index 3714eb5..cda3585 100644
--- a/DHNSGraph/src/org/gephi/graph/dhns/graph/HierarchicalGraphImpl.java
+++ b/DHNSGraph/src/org/gephi/graph/dhns/graph/HierarchicalGraphImpl.java
@@ -170,7 +170,7 @@
         checkNode(node);
         AbstractEdge absEdge = checkEdge(edge);
         if (absEdge.getSource(view.getViewId()) == node) {
-            return absEdge.getTarget();
+            return absEdge.getTarget(view.getViewId());
         } else if (absEdge.getTarget(view.getViewId()) == node) {
             return absEdge.getSource(view.getViewId());
         }
