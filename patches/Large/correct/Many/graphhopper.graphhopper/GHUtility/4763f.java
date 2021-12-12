diff --git a/core/src/main/java/com/graphhopper/util/GHUtility.java b/core/src/main/java/com/graphhopper/util/GHUtility.java
index b616840..5859cde 100644
--- a/core/src/main/java/com/graphhopper/util/GHUtility.java
+++ b/core/src/main/java/com/graphhopper/util/GHUtility.java
@@ -134,7 +134,7 @@
         NodeAccess na = g.getNodeAccess();
         for (int node = 0; node < g.getNodes(); ++node) {
             if (bBox.contains(na.getLat(node), na.getLon(node))) {
-                System.out.printf("na.setNode(%d, %f, %f);\n", node, na.getLat(node), na.getLon(node));
+                System.out.printf(Locale.ROOT, "na.setNode(%d, %f, %f);\n", node, na.getLat(node), na.getLon(node));
             }
         }
         AllEdgesIterator iter = g.getAllEdges();
