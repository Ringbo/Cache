diff --git a/OsmAnd-java/src/net/osmand/binary/BinaryInspector.java b/OsmAnd-java/src/net/osmand/binary/BinaryInspector.java
index 2e6b969..2f24bdd 100644
--- a/OsmAnd-java/src/net/osmand/binary/BinaryInspector.java
+++ b/OsmAnd-java/src/net/osmand/binary/BinaryInspector.java
@@ -60,12 +60,12 @@
 		// test cases show info
 		if(args.length == 1 && "test".equals(args[0])) {
 			in.inspector(new String[]{
-				"-vpoi",
-//				"-vmap", "-vmapobjects", 
+//				"-vpoi",
+				"-vmap", "-vmapobjects", 
 //				"-vrouting",
 //				"-vaddress", "-vcities", "-vstreets", "-vstreetgroups","-vbuildings", 
 				//"-zoom=16",
-				//"-bbox=4,55,7,50", 
+//				"-bbox=1.74,51.17,1.75,51.16", 
 				"/home/victor/projects/osmand/osm-gen/Map.obf"
 					});
 		} else {
@@ -727,7 +727,7 @@
 		for(int i=0; i<obj.getPointsLength(); i++) {
 			float x = (float) MapUtils.get31LongitudeX(obj.getPoint31XTile(i));
 			float y = (float) MapUtils.get31LatitudeY(obj.getPoint31YTile(i));
-			b.append(x).append(" / ").append(y).append(" , ");
+			b.append(y).append(" / ").append(x).append(" , ");
 		}
 	}
 
