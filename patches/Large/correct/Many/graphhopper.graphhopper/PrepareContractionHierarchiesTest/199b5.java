diff --git a/core/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java b/core/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java
index f5c761a..264137b 100644
--- a/core/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java
+++ b/core/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java
@@ -117,7 +117,7 @@
         int old = g.getAllEdges().maxId();
         PrepareContractionHierarchies prepare = new PrepareContractionHierarchies().graph(g);
         prepare.doWork();
-        assertEquals(old + 8, g.getAllEdges().maxId());
+        assertEquals(old + 9, g.getAllEdges().maxId());
     }
 
     @Test
@@ -148,7 +148,7 @@
         PrepareContractionHierarchies prepare = new PrepareContractionHierarchies().graph(g);
         prepare.doWork();
         // PrepareTowerNodesShortcutsTest.printEdges(g);
-        assertEquals(old + 15, GHUtility.count(g.getAllEdges()));
+        assertEquals(old + 19, GHUtility.count(g.getAllEdges()));
         RoutingAlgorithm algo = prepare.createAlgo();
 
         Path p = algo.calcPath(0, 10);
@@ -251,7 +251,7 @@
         int old = g.getAllEdges().maxId();
         PrepareContractionHierarchies prepare = new PrepareContractionHierarchies().graph(g);
         prepare.doWork();
-        assertEquals(old + 25, g.getAllEdges().maxId());
+        assertEquals(old + 24, g.getAllEdges().maxId());
         RoutingAlgorithm algo = prepare.createAlgo();
         Path p = algo.calcPath(4, 7);
         assertEquals(Helper.createTList(4, 5, 6, 7), p.calcNodes());
