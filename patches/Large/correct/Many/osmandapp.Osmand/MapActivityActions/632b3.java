diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
index 65b9a05..17419e6 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
@@ -361,7 +361,7 @@
 				|| (OsmandPlugin.getEnabledPlugin(OsmandMonitoringPlugin.class) != null)) {
 			adapter.addItem(new ContextMenuItem.ItemBuilder()
 					.setTitleId(R.string.context_menu_item_add_waypoint, mapActivity)
-					.setTitle(POINT_ADD_GPX_WAYPOINT)
+					.setId(POINT_ADD_GPX_WAYPOINT)
 					.setIcon(R.drawable.ic_action_gnew_label_dark)
 					.setOrder(ADD_GPX_WAYPOINT_ITEM_ORDER)
 					.setListener(listener).createItem());
