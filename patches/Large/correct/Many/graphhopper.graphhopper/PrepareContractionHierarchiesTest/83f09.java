diff --git a/core/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java b/core/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java
index f36fad1..99aeba0 100644
--- a/core/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java
+++ b/core/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java
@@ -148,7 +148,7 @@
         PrepareContractionHierarchies prepare = new PrepareContractionHierarchies().graph(g);
         prepare.doWork();
         // PrepareTowerNodesShortcutsTest.printEdges(g);
-        assertEquals(old + 13, GHUtility.count(g.getAllEdges()));
+        assertEquals(old + 21, GHUtility.count(g.getAllEdges()));
         RoutingAlgorithm algo = prepare.createAlgo();
         Path p = algo.calcPath(0, 10);
         assertEquals(10, p.distance(), 1e-6);
@@ -250,7 +250,7 @@
         int old = g.getAllEdges().maxId();
         PrepareContractionHierarchies prepare = new PrepareContractionHierarchies().graph(g);
         prepare.doWork();
-        assertEquals(old + 33, g.getAllEdges().maxId());
+        assertEquals(old + 25, g.getAllEdges().maxId());
         RoutingAlgorithm algo = prepare.createAlgo();
         Path p = algo.calcPath(4, 7);
         assertEquals(Helper.createTList(4, 5, 6, 7), p.calcNodes());
