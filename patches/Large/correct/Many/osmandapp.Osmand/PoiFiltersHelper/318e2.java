diff --git a/OsmAnd/src/net/osmand/plus/PoiFiltersHelper.java b/OsmAnd/src/net/osmand/plus/PoiFiltersHelper.java
index 0891ab0..890e963 100644
--- a/OsmAnd/src/net/osmand/plus/PoiFiltersHelper.java
+++ b/OsmAnd/src/net/osmand/plus/PoiFiltersHelper.java
@@ -118,7 +118,7 @@
 		}
 		if(UDF_CAR_AID.equals(key)){
 			putValues(types, AmenityType.TRANSPORTATION, "fuel", "car_wash", "car_repair","car", "car_sharing");
-			putValues(types, AmenityType.SHOP, "fuel", "car_wash", "car_repair","car");
+			putValues(types, AmenityType.SHOP, "fuel", "car_wash", "car_repair","car", "car_parts");
 		} else if(UDF_SIGHTSEEING.equals(key)){
 			putAll(types, AmenityType.HISTORIC);
 			putAll(types, AmenityType.TOURISM);
