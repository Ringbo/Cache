diff --git a/OsmAnd/src/net/osmand/plus/audionotes/AudioNotesLayer.java b/OsmAnd/src/net/osmand/plus/audionotes/AudioNotesLayer.java
index 3100694..167266c 100644
--- a/OsmAnd/src/net/osmand/plus/audionotes/AudioNotesLayer.java
+++ b/OsmAnd/src/net/osmand/plus/audionotes/AudioNotesLayer.java
@@ -100,7 +100,7 @@
 
 	@Override
 	public boolean drawInScreenPixels() {
-		return false;
+		return true;
 	}
 	
 	@Override
