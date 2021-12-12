diff --git a/src/com/jwetherell/algorithms/data_structures/KdTree.java b/src/com/jwetherell/algorithms/data_structures/KdTree.java
index cb15d96..9267d72 100644
--- a/src/com/jwetherell/algorithms/data_structures/KdTree.java
+++ b/src/com/jwetherell/algorithms/data_structures/KdTree.java
@@ -338,7 +338,7 @@
         }
         Double nodeDistance = node.id.euclideanDistance(value);
         if (nodeDistance.compareTo(lastDistance)<0) {
-            if (results.size()==K) results.remove(lastNode);
+            if (results.size()==K && lastNode!=null) results.remove(lastNode);
             results.add(node);
         } else if (nodeDistance.equals(lastDistance)) {
             results.add(node);
