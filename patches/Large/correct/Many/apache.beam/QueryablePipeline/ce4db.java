diff --git a/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/graph/QueryablePipeline.java b/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/graph/QueryablePipeline.java
index 12057a7..c2c299e 100644
--- a/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/graph/QueryablePipeline.java
+++ b/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/graph/QueryablePipeline.java
@@ -145,7 +145,7 @@
             PCollectionNode.class.getSimpleName(),
             PTransformNode.class.getSimpleName(),
             producedNode,
-            network.successors(producedNode));
+            network.predecessors(producedNode));
         unproducedCollections.remove(producedNode);
       }
       for (Map.Entry<String, String> consumed : transform.getInputsMap().entrySet()) {
