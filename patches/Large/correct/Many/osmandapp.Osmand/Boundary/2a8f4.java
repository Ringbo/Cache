diff --git a/DataExtractionOSM/src/net/osmand/data/Boundary.java b/DataExtractionOSM/src/net/osmand/data/Boundary.java
index ee0c06e..c211b96 100644
--- a/DataExtractionOSM/src/net/osmand/data/Boundary.java
+++ b/DataExtractionOSM/src/net/osmand/data/Boundary.java
@@ -47,7 +47,7 @@
 				List<Node> nodes = getOuterWays().get(0).getNodes();
 				closedWay = getOuterWays().size() == 1 && nodes.get(0).getId() == nodes.get(nodes.size() - 1).getId();
 				//if not closed, but we have only one way, make it close
-				if (!closedWay && getOuterWays().size() == 1) {
+				if (false && !closedWay && getOuterWays().size() == 1) {
 					nodes.add(nodes.get(0));
 					closedWay = true;
 				}
