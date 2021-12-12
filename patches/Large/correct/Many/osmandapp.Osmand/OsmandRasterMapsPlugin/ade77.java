diff --git a/OsmAnd/src/net/osmand/plus/rastermaps/OsmandRasterMapsPlugin.java b/OsmAnd/src/net/osmand/plus/rastermaps/OsmandRasterMapsPlugin.java
index 876dc43..cacea3b 100644
--- a/OsmAnd/src/net/osmand/plus/rastermaps/OsmandRasterMapsPlugin.java
+++ b/OsmAnd/src/net/osmand/plus/rastermaps/OsmandRasterMapsPlugin.java
@@ -212,9 +212,9 @@
 		adapter.item(R.string.layer_map).icons(R.drawable.ic_action_globus_dark, R.drawable.ic_action_globus_light)
 				.listen(listener).position(0).reg();
 		adapter.item(R.string.layer_overlay).selected(overlayLayer.getMap() != null ? 1 : 0).
-				icons(R.drawable.ic_action_up_dark, R.drawable.ic_action_up_light).listen(listener).position(10).reg();
+				icons(R.drawable.ic_action_up_dark, R.drawable.ic_action_up_light).listen(listener).position(14).reg();
 		adapter.item(R.string.layer_underlay).selected(underlayLayer.getMap() != null ? 1 : 0) 
-				.icons(R.drawable.ic_action_down_dark, R.drawable.ic_action_down_light).listen(listener).position(11).reg();
+				.icons(R.drawable.ic_action_down_dark, R.drawable.ic_action_down_light).listen(listener).position(15).reg();
 	}
 	
 	
