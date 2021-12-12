diff --git a/OsmAnd/src/net/osmand/plus/activities/search/SearchPOIActivity.java b/OsmAnd/src/net/osmand/plus/activities/search/SearchPOIActivity.java
index 312e197..65a9c2f 100644
--- a/OsmAnd/src/net/osmand/plus/activities/search/SearchPOIActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/search/SearchPOIActivity.java
@@ -833,7 +833,7 @@
 		}
 	};
 	
-	static class DirectionDrawable extends Drawable {
+	class DirectionDrawable extends Drawable {
 		Paint paintRouteDirection;
 		Path path = new Path();
 		private float angle;
@@ -844,9 +844,7 @@
 		public DirectionDrawable(){
 			paintRouteDirection = new Paint();
 			paintRouteDirection.setStyle(Style.FILL_AND_STROKE);
-			// colors.xml-Issue
-			//paintRouteDirection.setColor(getResources().getColor(R.color.poi_direction));
-			paintRouteDirection.setColor(Color.rgb(100, 0, 255));
+			paintRouteDirection.setColor(getResources().getColor(R.color.poi_direction));
 			paintRouteDirection.setAntiAlias(true);
 			
 			int h = 15;
@@ -867,17 +865,11 @@
 		
 		public void setOpenedColor(int opened){
 			if(opened == 0){
-				// colors.xml-Issue
-				//paintRouteDirection.setColor(getResources().getColor(R.color.poi_open));
-				paintRouteDirection.setColor(Color.rgb(50, 205, 50));
+				paintRouteDirection.setColor(getResources().getColor(R.color.poi_open));
 			} else if(opened == -1){
-				// colors.xml-Issue
-				//paintRouteDirection.setColor(getResources().getColor(R.color.poi_unknown_arrow));
-				paintRouteDirection.setColor(Color.rgb(200, 200, 200));
+				paintRouteDirection.setColor(getResources().getColor(R.color.poi_unknown_arrow));
 			} else {
-				// colors.xml-Issue
-				//paintRouteDirection.setColor(getResources().getColor(R.color.poi_closed));
-				paintRouteDirection.setColor(Color.rgb(238, 50, 50));
+				paintRouteDirection.setColor(getResources().getColor(R.color.poi_closed));
 			}
 		}
 		
