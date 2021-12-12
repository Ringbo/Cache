diff --git a/core/src/main/java/com/graphhopper/routing/util/RoutingAlgorithmSpecialAreaTests.java b/core/src/main/java/com/graphhopper/routing/util/RoutingAlgorithmSpecialAreaTests.java
index b81acce..f80966f 100644
--- a/core/src/main/java/com/graphhopper/routing/util/RoutingAlgorithmSpecialAreaTests.java
+++ b/core/src/main/java/com/graphhopper/routing/util/RoutingAlgorithmSpecialAreaTests.java
@@ -86,17 +86,17 @@
 
             OneRun or = new OneRun(50.0314, 10.5105, 50.0303, 10.5070, 571, 22);
             testCollector.assertDistance(prepare, or.getList(idx, ef), or);
-            or = new OneRun(49.51451, 9.967346, 50.2920, 10.4650, 107542, 1712);
+            or = new OneRun(49.51451, 9.967346, 50.2920, 10.4650, 107545, 1946);
             testCollector.assertDistance(prepare, or.getList(idx, ef), or);
-            or = new OneRun(50.0780, 9.1570, 49.5860, 9.9750, 91715, 1299);
+            or = new OneRun(50.0780, 9.1570, 49.5860, 9.9750, 91715, 1413);
             testCollector.assertDistance(prepare, or.getList(idx, ef), or);
-            or = new OneRun(50.2800, 9.7190, 49.8960, 10.3890, 76411, 1406);
+            or = new OneRun(50.2800, 9.7190, 49.8960, 10.3890, 76414, 1671);
             testCollector.assertDistance(prepare, or.getList(idx, ef), or);
-            or = new OneRun(49.8020, 9.2470, 50.4940, 10.1970, 125633, 2253);
+            or = new OneRun(49.8020, 9.2470, 50.4940, 10.1970, 125633, 2449);
             testCollector.assertDistance(prepare, or.getList(idx, ef), or);
-            or = new OneRun(49.72449, 9.23482, 50.4140, 10.2750, 137260.8, 2401);
+            or = new OneRun(49.72449, 9.23482, 50.4140, 10.2750, 137264, 2718);
             testCollector.assertDistance(prepare, or.getList(idx, ef), or);
-            or = new OneRun(50.1100, 10.7530, 49.6500, 10.3410, 73530, 1462);
+            or = new OneRun(50.1100, 10.7530, 49.6500, 10.3410, 73533, 1818);
             testCollector.assertDistance(prepare, or.getList(idx, ef), or);
 
             System.out.println("unterfranken " + prepare.createAlgo() + ": " + (testCollector.errors.size() - failed) + " failed");
