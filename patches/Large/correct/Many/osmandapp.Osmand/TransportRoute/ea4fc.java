diff --git a/OsmAnd-java/src/main/java/net/osmand/data/TransportRoute.java b/OsmAnd-java/src/main/java/net/osmand/data/TransportRoute.java
index 01925cd..902cac2 100644
--- a/OsmAnd-java/src/main/java/net/osmand/data/TransportRoute.java
+++ b/OsmAnd-java/src/main/java/net/osmand/data/TransportRoute.java
@@ -91,7 +91,7 @@
 		}
 		if (forwardStops.size() > 0) {
 			// resort ways to stops order 
-			Map<Way, int[]> orderWays = new HashMap<Way, int[]>();
+			final Map<Way, int[]> orderWays = new HashMap<Way, int[]>();
 			for (Way w : forwardWays) {
 				int[] pair = new int[] { 0, 0 };
 				Node firstNode = w.getFirstNode();
