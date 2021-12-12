diff --git a/OsmAnd/src/net/osmand/plus/render/BaseOsmandRender.java b/OsmAnd/src/net/osmand/plus/render/BaseOsmandRender.java
index 54cc8c1..5129e9c 100644
--- a/OsmAnd/src/net/osmand/plus/render/BaseOsmandRender.java
+++ b/OsmAnd/src/net/osmand/plus/render/BaseOsmandRender.java
@@ -210,7 +210,7 @@
 			return true;
 		}
 		for (BaseOsmandRender d : dependRenderers) {
-			if (d.isObjectVisibleImpl(tag, val, zoom, type, nightMode)) {
+			if (d.isObjectVisible(tag, val, zoom, type, nightMode)) {
 				return true;
 			}
 		}
