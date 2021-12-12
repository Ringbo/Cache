diff --git a/core/src/main/java/com/graphhopper/util/GHUtility.java b/core/src/main/java/com/graphhopper/util/GHUtility.java
index 5859cde..ff15a9b 100644
--- a/core/src/main/java/com/graphhopper/util/GHUtility.java
+++ b/core/src/main/java/com/graphhopper/util/GHUtility.java
@@ -154,7 +154,8 @@
         }
         int from = fwd ? edge.getBaseNode() : edge.getAdjNode();
         int to = fwd ? edge.getAdjNode() : edge.getBaseNode();
-        System.out.printf("graph.edge(%d, %d, %f, %s);\n", from, to, edge.getDistance(), fwd && bwd ? "true" : "false");
+        System.out.printf(Locale.ROOT,
+                "graph.edge(%d, %d, %f, %s);\n", from, to, edge.getDistance(), fwd && bwd ? "true" : "false");
     }
 
     public static void printInfo(final Graph g, int startNode, final int counts, final EdgeFilter filter) {
