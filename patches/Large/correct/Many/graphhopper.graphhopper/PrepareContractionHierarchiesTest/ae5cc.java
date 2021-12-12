diff --git a/core/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java b/core/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java
index 9743604..1d1e144 100644
--- a/core/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java
+++ b/core/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java
@@ -126,7 +126,7 @@
         int old = g.getAllEdges().getMaxId();
         PrepareContractionHierarchies prepare = new PrepareContractionHierarchies(carEncoder, weighting).setGraph(g);
         prepare.doWork();
-        assertEquals(old + 8, g.getAllEdges().getMaxId());
+        assertEquals(old + 10, g.getAllEdges().getMaxId());
     }
 
     @Test
@@ -159,7 +159,7 @@
         PrepareContractionHierarchies prepare = new PrepareContractionHierarchies(carEncoder, weighting).setGraph(g);
         prepare.doWork();
         // PrepareTowerNodesShortcutsTest.printEdges(g);
-        assertEquals(old + 17, GHUtility.count(g.getAllEdges()));
+        assertEquals(old + 9, GHUtility.count(g.getAllEdges()));
         RoutingAlgorithm algo = prepare.createAlgo();
         Path p = algo.calcPath(0, 10);
         assertEquals(10, p.getDistance(), 1e-6);
@@ -276,7 +276,7 @@
         int old = g.getAllEdges().getMaxId();
         PrepareContractionHierarchies prepare = new PrepareContractionHierarchies(carEncoder, weighting).setGraph(g);
         prepare.doWork();
-        assertEquals(old + 26, g.getAllEdges().getMaxId());
+        assertEquals(old + 23, g.getAllEdges().getMaxId());
         RoutingAlgorithm algo = prepare.createAlgo();
         Path p = algo.calcPath(4, 7);
         assertEquals(Helper.createTList(4, 5, 6, 7), p.calcNodes());
