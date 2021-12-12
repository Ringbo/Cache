diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/optimize/solver/BackTrackLineSearchTest.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/optimize/solver/BackTrackLineSearchTest.java
index d2326d4..4e954d2 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/optimize/solver/BackTrackLineSearchTest.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/optimize/solver/BackTrackLineSearchTest.java
@@ -51,7 +51,7 @@
 
         BackTrackLineSearch lineSearch = new BackTrackLineSearch(layer, layer.getOptimizer());
 
-        double step = lineSearch.optimize(layer.params(), layer.gradient().gradient(), layer.gradient().gradient().dup());
+        double step = lineSearch.optimize(layer.params(), layer.gradient().gradient(), layer.gradient().gradient().dup().negi());
         assertEquals(0.0,step,1e-1);
     }
 
@@ -85,7 +85,7 @@
 
         network.fit(data.getFeatureMatrix(), data.getLabels());
         double score = network.getLayer(1).score();
-        assertEquals(1.3385236740112305, score, 1e-4);
+        assertEquals(1.2918350219726562, score, 1e-4);
 
     }
 
@@ -101,7 +101,7 @@
 
         network.fit(data.getFeatureMatrix(), data.getLabels());
         double score = network.getLayer(1).score();
-        assertEquals(0.7130653858184814, score, 1e-4);
+        assertEquals(1.337026596069336, score, 1e-4);
 
     }
 
