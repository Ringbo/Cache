diff --git a/OsmAnd/src/net/osmand/plus/activities/MapActivityLayers.java b/OsmAnd/src/net/osmand/plus/activities/MapActivityLayers.java
index e2aa9b0..b694d40 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MapActivityLayers.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MapActivityLayers.java
@@ -269,7 +269,7 @@
 			@Override
 			public void onClick(DialogInterface dialog, int which) {
 				if (which == 0) {
-					which = list.size() + 1;
+					which = list.size() + 2;
 				}
 				PoiLegacyFilter pf = list.get(which - 1);
 				String filterId = pf.getFilterId();
