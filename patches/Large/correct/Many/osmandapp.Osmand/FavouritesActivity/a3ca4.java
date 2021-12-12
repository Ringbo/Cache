diff --git a/OsmAnd/src/net/osmand/plus/activities/FavouritesActivity.java b/OsmAnd/src/net/osmand/plus/activities/FavouritesActivity.java
index 35195ab..9ac63dc 100644
--- a/OsmAnd/src/net/osmand/plus/activities/FavouritesActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/FavouritesActivity.java
@@ -200,7 +200,7 @@
 
 			@Override
 			public int compare(FavouritePoint object1, FavouritePoint object2) {
-				return object1.getName(object1).compareTo(object2.getName(object2));
+				return object1.getName().compareTo(object2.getName());
 			}
 		});
 		
