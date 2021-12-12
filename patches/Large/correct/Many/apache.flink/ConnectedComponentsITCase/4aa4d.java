diff --git a/stratosphere-tests/src/test/java/eu/stratosphere/test/exampleScalaPrograms/ConnectedComponentsITCase.java b/stratosphere-tests/src/test/java/eu/stratosphere/test/exampleScalaPrograms/ConnectedComponentsITCase.java
index 7caa948..039b70d 100644
--- a/stratosphere-tests/src/test/java/eu/stratosphere/test/exampleScalaPrograms/ConnectedComponentsITCase.java
+++ b/stratosphere-tests/src/test/java/eu/stratosphere/test/exampleScalaPrograms/ConnectedComponentsITCase.java
@@ -31,7 +31,7 @@
         int dop = config.getInteger("ConnectedComponents#NumSubtasks", 1);
         int maxIterations = config.getInteger("ConnectedComponents#NumIterations", 1);
         ConnectedComponents cc = new ConnectedComponents();
-        Plan plan = cc.getPlan(verticesPath, edgesPath, resultPath, maxIterations);
+        Plan plan = cc.getScalaPlan(verticesPath, edgesPath, resultPath, maxIterations);
         plan.setDefaultParallelism(dop);
         return plan;
     }
