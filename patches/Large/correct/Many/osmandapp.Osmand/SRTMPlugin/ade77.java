diff --git a/OsmAnd/src/net/osmand/plus/srtmplugin/SRTMPlugin.java b/OsmAnd/src/net/osmand/plus/srtmplugin/SRTMPlugin.java
index 1683ce4..43b187a 100644
--- a/OsmAnd/src/net/osmand/plus/srtmplugin/SRTMPlugin.java
+++ b/OsmAnd/src/net/osmand/plus/srtmplugin/SRTMPlugin.java
@@ -104,7 +104,7 @@
 			}
 		};
 		adapter.item(R.string.layer_hillshade).selected(HILLSHADE.get()? 1 : 0)
-			.icons( R.drawable.ic_action_hillshade_dark, R.drawable.ic_action_hillshade_light).listen(listener).position(9).layout(R.layout.drawer_list_item).reg();
+			.icons( R.drawable.ic_action_hillshade_dark, R.drawable.ic_action_hillshade_light).listen(listener).position(13).layout(R.layout.drawer_list_item).reg();
 	}
 	
 	@Override
