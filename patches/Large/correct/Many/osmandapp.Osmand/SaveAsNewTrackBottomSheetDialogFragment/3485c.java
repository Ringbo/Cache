diff --git a/OsmAnd/src/net/osmand/plus/measurementtool/SaveAsNewTrackBottomSheetDialogFragment.java b/OsmAnd/src/net/osmand/plus/measurementtool/SaveAsNewTrackBottomSheetDialogFragment.java
index fb85028..5ea3462 100644
--- a/OsmAnd/src/net/osmand/plus/measurementtool/SaveAsNewTrackBottomSheetDialogFragment.java
+++ b/OsmAnd/src/net/osmand/plus/measurementtool/SaveAsNewTrackBottomSheetDialogFragment.java
@@ -73,7 +73,7 @@
 					return false;
 				}
 			});
-			routePointImage.setOnClickListener(saveAsLineOnClickListener);
+			routePointImage.setOnClickListener(saveAsRoutePointOnClickListener);
 		}
 
 		if (nightMode) {
