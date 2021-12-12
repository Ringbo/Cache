diff --git a/core/src/main/java/com/graphhopper/routing/ch/PrepareContractionHierarchies.java b/core/src/main/java/com/graphhopper/routing/ch/PrepareContractionHierarchies.java
index 3052d8e..b29e7f8 100644
--- a/core/src/main/java/com/graphhopper/routing/ch/PrepareContractionHierarchies.java
+++ b/core/src/main/java/com/graphhopper/routing/ch/PrepareContractionHierarchies.java
@@ -821,7 +821,7 @@
             algo = createDijkstraBidirection(graph);
         } else
         {
-            throw new UnsupportedOperationException("Algorithm " + opts.getAlgorithm() + " not supported for Contraction Hierarchies");
+            throw new IllegalArgumentException("Algorithm " + opts.getAlgorithm() + " not supported for Contraction Hierarchies");
         }
 
         algo.setMaxVisitedNodes(opts.getMaxVisitedNodes());
