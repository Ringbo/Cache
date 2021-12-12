diff --git a/OsmAnd/src/net/osmand/activities/MapActivity.java b/OsmAnd/src/net/osmand/activities/MapActivity.java
index 3d09ca0..cefebd9 100644
--- a/OsmAnd/src/net/osmand/activities/MapActivity.java
+++ b/OsmAnd/src/net/osmand/activities/MapActivity.java
@@ -534,12 +534,12 @@
     	speed *= 3.6;
     	if(speed < 4){
     		return currentZoom;
-    	} else if(speed < 30){
-    		// less than 30 - show 17 
+    	} else if(speed < 33){
+    		// less than 33 - show 17 
     		return 17;
-    	} else if(speed < 50){
+    	} else if(speed < 53){
     		return 16;
-    	} else if(speed < 80){
+    	} else if(speed < 83){
     		return 15;
     	}
     	// more than 80 - show 14 (it is slow)
