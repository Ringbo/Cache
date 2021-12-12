diff --git a/OpenStreetMapViewer/src/org/osmdroid/samples/SampleMapActivity.java b/OpenStreetMapViewer/src/org/osmdroid/samples/SampleMapActivity.java
index ca08269..353991d 100644
--- a/OpenStreetMapViewer/src/org/osmdroid/samples/SampleMapActivity.java
+++ b/OpenStreetMapViewer/src/org/osmdroid/samples/SampleMapActivity.java
@@ -103,7 +103,7 @@
 		// register location listener
 		initLocation();
 
-		super.onPause();
+		super.onResume();
 	}
 
 	@Override
@@ -114,7 +114,7 @@
 			OSMUploader.uploadAsync(this.mRouteRecorder.getRecordedGeoPoints());
 		}
 
-		super.onResume();
+		super.onPause();
 	}
 
 	// ===========================================================
