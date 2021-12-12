diff --git a/OsmAnd/src/net/osmand/plus/poi/PoiFiltersHelper.java b/OsmAnd/src/net/osmand/plus/poi/PoiFiltersHelper.java
index 2d7a710..42ced4a 100644
--- a/OsmAnd/src/net/osmand/plus/poi/PoiFiltersHelper.java
+++ b/OsmAnd/src/net/osmand/plus/poi/PoiFiltersHelper.java
@@ -149,7 +149,7 @@
 					// "rail", "tram", "light_rail", "subway", "railway_narrow_gauge", "railway_monorail", "railway_funicular"
 					);
 		} else if (UDF_RESTAURANTS.equals(key)) {
-			putValues(poiTypes, types, "sustenance", "restaurant",
+			putValues(poiTypes, types, "sustenance", "restaurant_not_found",
 					"cafe", "food_court", "pub", "bar", "biergarten");
 		} else if (UDF_SIGHTSEEING.equals(key)) {
 			// TODO filter only sightseeing from tourimsm
@@ -413,13 +413,13 @@
 	    		for(PoiCategory a : types.keySet()){
 	    			if(types.get(a) == null){
 		    			insertCategories.bindString(1, p.getFilterId());
-						insertCategories.bindString(2, a.getTranslation());
+						insertCategories.bindString(2, a.getKey());
 						insertCategories.bindNull(3);
     					insertCategories.execute();
 	    			} else {
 	    				for(String s : types.get(a)){
 	    					insertCategories.bindString(1, p.getFilterId());
-	    					insertCategories.bindString(2, a.getTranslation());
+	    					insertCategories.bindString(2, a.getKey());
 	    					insertCategories.bindString(3, s);
 	    					insertCategories.execute();
 	    				}
