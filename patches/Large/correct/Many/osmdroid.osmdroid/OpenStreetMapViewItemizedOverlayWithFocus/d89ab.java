diff --git a/osmdroid-android/src/org/andnav/osm/views/overlay/OpenStreetMapViewItemizedOverlayWithFocus.java b/osmdroid-android/src/org/andnav/osm/views/overlay/OpenStreetMapViewItemizedOverlayWithFocus.java
index 1844aa2..0efc3ef 100644
--- a/osmdroid-android/src/org/andnav/osm/views/overlay/OpenStreetMapViewItemizedOverlayWithFocus.java
+++ b/osmdroid-android/src/org/andnav/osm/views/overlay/OpenStreetMapViewItemizedOverlayWithFocus.java
@@ -81,7 +81,7 @@
 			final OnItemTapListener<T> aOnItemTapListener, 
 			final ResourceProxy pResourceProxy) {
 
-		super(ctx, aList, pMarkerFocusedBase, pMarkerHotspot, aOnItemTapListener, pResourceProxy);
+		super(ctx, aList, pMarker, pMarkerHotspot, aOnItemTapListener, pResourceProxy);
 		
 		UNKNOWN = mResourceProxy.getString(ResourceProxy.string.unknown);
 		
