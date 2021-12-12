diff --git a/OsmAnd/src/net/osmand/plus/activities/LocalIndexHelper.java b/OsmAnd/src/net/osmand/plus/activities/LocalIndexHelper.java
index 7b3143a..b9e8cd5 100644
--- a/OsmAnd/src/net/osmand/plus/activities/LocalIndexHelper.java
+++ b/OsmAnd/src/net/osmand/plus/activities/LocalIndexHelper.java
@@ -115,7 +115,7 @@
 			double diffElevationUp = 0;
 			double diffElevationDown = 0;
 			double totalElevation = 0;
-			double minElevation = 0;
+			double minElevation = 99999;
 			double maxElevation = 0;
 			
 			float maxSpeed = 0;
