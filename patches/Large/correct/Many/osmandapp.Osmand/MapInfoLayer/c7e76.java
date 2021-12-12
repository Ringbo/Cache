diff --git a/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java b/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java
index 2be5b5d..32878fe 100644
--- a/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/MapInfoLayer.java
@@ -419,7 +419,7 @@
 		View confirmDialog = view.inflate(view.getContext(), R.layout.configuration_dialog, null);
 		final ListView lv = (ListView) confirmDialog.findViewById(android.R.id.list);
 		NavigateAction.prepareAppModeView(map, selected, true, 
-				(ViewGroup) confirmDialog.findViewById(R.id.TopBar), false, 
+				(ViewGroup) confirmDialog.findViewById(R.id.TopBar), true, 
 				new View.OnClickListener() {
 			@Override
 			public void onClick(View v) {
