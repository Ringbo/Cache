diff --git a/OsmAnd/src/net/osmand/plus/views/AnimateDraggingMapThread.java b/OsmAnd/src/net/osmand/plus/views/AnimateDraggingMapThread.java
index bbfc2dd..f02a5f7 100644
--- a/OsmAnd/src/net/osmand/plus/views/AnimateDraggingMapThread.java
+++ b/OsmAnd/src/net/osmand/plus/views/AnimateDraggingMapThread.java
@@ -93,7 +93,7 @@
 		while(currentThread != null){
 			try {
 				currentThread.join();
-			} catch (InterruptedException e) {
+			} catch (Exception e) {
 			}
 		}
 	}
