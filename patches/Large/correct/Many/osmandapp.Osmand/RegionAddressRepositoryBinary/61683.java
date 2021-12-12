diff --git a/OsmAnd/src/net/osmand/plus/resources/RegionAddressRepositoryBinary.java b/OsmAnd/src/net/osmand/plus/resources/RegionAddressRepositoryBinary.java
index 43ebc98..4c87c71 100644
--- a/OsmAnd/src/net/osmand/plus/resources/RegionAddressRepositoryBinary.java
+++ b/OsmAnd/src/net/osmand/plus/resources/RegionAddressRepositoryBinary.java
@@ -119,7 +119,7 @@
 	
 	@Override
 	public synchronized void addCityToPreloadedList(City city) {
-		if (!cities.containsKey(city.getID())) {
+		if (!cities.containsKey(city.getId())) {
 			cities.put(city.getId(), city);
 		}
 	}
