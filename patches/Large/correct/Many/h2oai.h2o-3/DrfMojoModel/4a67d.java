diff --git a/h2o-genmodel/src/main/java/hex/genmodel/algos/drf/DrfMojoModel.java b/h2o-genmodel/src/main/java/hex/genmodel/algos/drf/DrfMojoModel.java
index 37e18a9..103aa54 100644
--- a/h2o-genmodel/src/main/java/hex/genmodel/algos/drf/DrfMojoModel.java
+++ b/h2o-genmodel/src/main/java/hex/genmodel/algos/drf/DrfMojoModel.java
@@ -59,6 +59,6 @@
      * @return A graph of the forest.
      */
     public Graph computeGraph(int treeToPrint) {
-        return computeGraph(_effective_n_classes, treeToPrint);
+        return computeGraph(treeToPrint, _effective_n_classes);
     }
 }
