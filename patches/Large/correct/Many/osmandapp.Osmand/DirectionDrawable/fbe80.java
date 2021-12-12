diff --git a/OsmAnd/src/net/osmand/plus/views/DirectionDrawable.java b/OsmAnd/src/net/osmand/plus/views/DirectionDrawable.java
index bf87a45..23ca77a 100644
--- a/OsmAnd/src/net/osmand/plus/views/DirectionDrawable.java
+++ b/OsmAnd/src/net/osmand/plus/views/DirectionDrawable.java
@@ -57,7 +57,7 @@
 			IconsCache iconsCache = ((OsmandApplication) ctx.getApplicationContext()).getIconsCache();
 			if (opened == 0) {
 				arrowImage = iconsCache.getIcon(resourceId, R.color.color_ok);
-			} else if (opened == -1) {
+			} else if (opened != -1) {
 				arrowImage = iconsCache.getIcon(resourceId, R.color.color_warning);
 			}
 		}
