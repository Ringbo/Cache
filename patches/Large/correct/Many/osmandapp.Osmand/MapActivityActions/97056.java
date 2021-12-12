diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
index 7a4caf8..b96c002 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivityActions.java
@@ -880,7 +880,7 @@
 		}).reg();
 		
 		optionsMenuHelper.item(R.string.settings_activity)
-		.icons(R.drawable.ic_action_settings_light, R.drawable.ic_action_settings_dark)
+		.icons(R.drawable.ic_action_settings_dark, R.drawable.ic_action_settings_light)
 		.listen(new OnContextMenuClick() {
 			@Override
 			public boolean onContextMenuClick(ArrayAdapter<?> adapter, int itemId, int pos, boolean isChecked) {
