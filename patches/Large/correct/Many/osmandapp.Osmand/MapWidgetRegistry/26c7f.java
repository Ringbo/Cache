diff --git a/OsmAnd/src/net/osmand/plus/views/mapwidgets/MapWidgetRegistry.java b/OsmAnd/src/net/osmand/plus/views/mapwidgets/MapWidgetRegistry.java
index 3d57d4e..4f164de 100644
--- a/OsmAnd/src/net/osmand/plus/views/mapwidgets/MapWidgetRegistry.java
+++ b/OsmAnd/src/net/osmand/plus/views/mapwidgets/MapWidgetRegistry.java
@@ -378,7 +378,7 @@
 	}
 	
 	public ContextMenuAdapter getViewConfigureMenuAdapter(final MapActivity map) {
-		ContextMenuAdapter cm = new ContextMenuAdapter(map);
+		final ContextMenuAdapter cm = new ContextMenuAdapter(map);
 		cm.setDefaultLayoutId(R.layout.drawer_list_item);
 		cm.item(R.string.app_modes_choose).layout(R.layout.mode_toggles).reg();
 		cm.setChangeAppModeListener(new ConfigureMapMenu.OnClickListener() {
@@ -398,7 +398,7 @@
 						if (mil != null) {
 							mil.recreateControls();
 						}
-						adapter.notifyDataSetInvalidated();
+						map.getDashboard().updateListAdapter(getViewConfigureMenuAdapter(map));
 						return false;
 					}
 				}).reg();
