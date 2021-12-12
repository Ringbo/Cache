diff --git a/deeplearning4j-nearestneighbors-parent/nearestneighbor-core/src/main/java/org/deeplearning4j/clustering/vptree/VPTree.java b/deeplearning4j-nearestneighbors-parent/nearestneighbor-core/src/main/java/org/deeplearning4j/clustering/vptree/VPTree.java
index e269983..3cd8b74 100644
--- a/deeplearning4j-nearestneighbors-parent/nearestneighbor-core/src/main/java/org/deeplearning4j/clustering/vptree/VPTree.java
+++ b/deeplearning4j-nearestneighbors-parent/nearestneighbor-core/src/main/java/org/deeplearning4j/clustering/vptree/VPTree.java
@@ -478,7 +478,7 @@
         results.clear();
         distances.clear();
 
-        PriorityQueue<HeapObject> pq = new PriorityQueue<>(new HeapObjectComparator());
+        PriorityQueue<HeapObject> pq = new PriorityQueue<>(items.rows(), new HeapObjectComparator());
         search(root, target, k + 1, pq, Double.MAX_VALUE);
 
         if (pq.size() > k)
