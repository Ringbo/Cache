diff --git a/OsmAnd/src/net/osmand/plus/dashboard/DashPluginsFragment.java b/OsmAnd/src/net/osmand/plus/dashboard/DashPluginsFragment.java
index cdd8fc5..7c1184d 100644
--- a/OsmAnd/src/net/osmand/plus/dashboard/DashPluginsFragment.java
+++ b/OsmAnd/src/net/osmand/plus/dashboard/DashPluginsFragment.java
@@ -91,7 +91,7 @@
 		}
 		
 		for (int i = 0; i < showedPlugins.size(); i++) {
-			final OsmandPlugin plugin = availablePlugins.get(i);
+			final OsmandPlugin plugin = showedPlugins.get(i);
 			View view = inflater.inflate(R.layout.dash_plugin_item, null, false);
 			((TextView) view.findViewById(R.id.plugin_name)).setText(plugin.getName());
 			((TextView) view.findViewById(R.id.plugin_descr)).setText(plugin.getDescription());
