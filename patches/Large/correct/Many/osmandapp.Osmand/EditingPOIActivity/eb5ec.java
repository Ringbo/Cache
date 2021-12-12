diff --git a/OsmAnd/src/net/osmand/plus/activities/EditingPOIActivity.java b/OsmAnd/src/net/osmand/plus/activities/EditingPOIActivity.java
index ab74d8e..cbe2fe4 100644
--- a/OsmAnd/src/net/osmand/plus/activities/EditingPOIActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/EditingPOIActivity.java
@@ -138,7 +138,7 @@
 					public void run() {
 						AccessibleToast.makeText(ctx, ctx.getResources().getString(R.string.poi_remove_success), Toast.LENGTH_LONG).show();
 						if(ctx.getMapView() != null){
-							ctx.getMapView().refreshMap();
+							ctx.getMapView().refreshMap(true);
 						}						
 					}
 				});
@@ -283,7 +283,7 @@
 						AccessibleToast.makeText(ctx, MessageFormat.format(ctx.getResources().getString(R.string.poi_action_succeded_template), msg),
 								Toast.LENGTH_LONG).show();
 						if (ctx.getMapView() != null) {
-							ctx.getMapView().refreshMap();
+							ctx.getMapView().refreshMap(true);
 						}
 						ctx.dismissDialog(dialogID);
 					}
