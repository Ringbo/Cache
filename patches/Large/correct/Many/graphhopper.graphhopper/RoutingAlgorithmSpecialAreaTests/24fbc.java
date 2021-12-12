diff --git a/core/src/main/java/com/graphhopper/routing/util/RoutingAlgorithmSpecialAreaTests.java b/core/src/main/java/com/graphhopper/routing/util/RoutingAlgorithmSpecialAreaTests.java
index 3b87efb..a749b00 100644
--- a/core/src/main/java/com/graphhopper/routing/util/RoutingAlgorithmSpecialAreaTests.java
+++ b/core/src/main/java/com/graphhopper/routing/util/RoutingAlgorithmSpecialAreaTests.java
@@ -91,13 +91,13 @@
             testCollector.assertDistance(prepare.createAlgo(),
                     currIdx.findClosest(50.0780, 9.1570, ef), currIdx.findClosest(49.5860, 9.9750, ef), 91715, 1299);
             testCollector.assertDistance(prepare.createAlgo(),
-                    currIdx.findClosest(50.2800, 9.7190, ef), currIdx.findClosest(49.8960, 10.3890, ef), 76409, 1406);
+                    currIdx.findClosest(50.2800, 9.7190, ef), currIdx.findClosest(49.8960, 10.3890, ef), 76411, 1406);
             testCollector.assertDistance(prepare.createAlgo(),
                     currIdx.findClosest(49.8020, 9.2470, ef), currIdx.findClosest(50.4940, 10.1970, ef), 125633, 2253);
             testCollector.assertDistance(prepare.createAlgo(),
                     currIdx.findClosest(49.72449, 9.23482, ef), currIdx.findClosest(50.4140, 10.2750, ef), 137260.8, 2401);
             testCollector.assertDistance(prepare.createAlgo(),
-                    currIdx.findClosest(50.1100, 10.7530, ef), currIdx.findClosest(49.6500, 10.3410, ef), 73533, 1462);
+                    currIdx.findClosest(50.1100, 10.7530, ef), currIdx.findClosest(49.6500, 10.3410, ef), 73530, 1462);
 
             System.out.println("unterfranken " + prepare.createAlgo() + ": " + (testCollector.errors.size() - failed) + " failed");
         }
@@ -151,9 +151,9 @@
     void testIndex()
     {
         TestAlgoCollector testCollector = new TestAlgoCollector("testIndex");
-        testCollector.queryIndex(unterfrankenGraph, idx, 50.081135, 10.124374, 11.93);
+        testCollector.queryIndex(unterfrankenGraph, idx, 50.080539, 10.125854, 63.35);
         testCollector.queryIndex(unterfrankenGraph, idx, 50.081146, 10.124496, 0.0);
-        testCollector.queryIndex(unterfrankenGraph, idx, 49.681805, 9.939882, 225.36);
+        testCollector.queryIndex(unterfrankenGraph, idx, 49.68243, 9.933271, 436.29);
         testCollector.queryIndex(unterfrankenGraph, idx, 50.066495, 10.191836, 14.63);
 
         testCollector.printSummary();
