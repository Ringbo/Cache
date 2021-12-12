diff --git a/OsmAnd/src/net/osmand/plus/views/TransportStopsLayer.java b/OsmAnd/src/net/osmand/plus/views/TransportStopsLayer.java
index eeb9645..11aad63 100644
--- a/OsmAnd/src/net/osmand/plus/views/TransportStopsLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/TransportStopsLayer.java
@@ -163,7 +163,7 @@
 
 	@Override
 	public boolean drawInScreenPixels() {
-		return false;
+		return true;
 	}
 
 	@Override
