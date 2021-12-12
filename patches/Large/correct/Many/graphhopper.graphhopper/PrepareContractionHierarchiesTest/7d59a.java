diff --git a/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java b/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java
index ee1673a..069f4ab 100644
--- a/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java
+++ b/src/test/java/com/graphhopper/routing/ch/PrepareContractionHierarchiesTest.java
@@ -268,7 +268,7 @@
         int old = GHUtility.count(g.getAllEdges());
         PrepareContractionHierarchies prepare = new PrepareContractionHierarchies().graph(g);
         prepare.doWork();
-        assertEquals(old + 20, GHUtility.count(g.getAllEdges()));
+        assertEquals(old + 21, GHUtility.count(g.getAllEdges()));
         RoutingAlgorithm algo = prepare.createAlgo();
         Path p = algo.calcPath(4, 7);
         assertEquals(Helper.createTList(4, 5, 6, 7), p.calcNodes());
