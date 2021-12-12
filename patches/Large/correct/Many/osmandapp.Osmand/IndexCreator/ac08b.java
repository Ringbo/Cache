diff --git a/DataExtractionOSM/src/net/osmand/data/preparation/IndexCreator.java b/DataExtractionOSM/src/net/osmand/data/preparation/IndexCreator.java
index b8f0ac9..aff4988 100644
--- a/DataExtractionOSM/src/net/osmand/data/preparation/IndexCreator.java
+++ b/DataExtractionOSM/src/net/osmand/data/preparation/IndexCreator.java
@@ -892,7 +892,7 @@
 						}
 					}
 
-					Long streetId = getStreetInCity(c, name, location, (a6.getId() << 1) | 1);
+					Long streetId = getStreetInCity(c, name, location, (a6.getId() << 2) | 2);
 					if (streetId == null) {
 						return;
 					}
@@ -1155,7 +1155,7 @@
 						loadEntityData(e, false);
 						LatLon l = e.getLatLon();
 						City city = getClosestCity(l);
-						Long idStreet = getStreetInCity(city, e.getTag(OSMTagKey.ADDR_STREET), l, e.getId() << 1);
+						Long idStreet = getStreetInCity(city, e.getTag(OSMTagKey.ADDR_STREET), l, (e.getId() << 2));
 						if (idStreet != null) {
 							Building building = new Building(e);
 							building.setName(e.getTag(OSMTagKey.ADDR_HOUSE_NUMBER));
@@ -1185,7 +1185,7 @@
 						loadEntityData(e, false);
 						LatLon l = e.getLatLon();
 						City city = getClosestCity(l);
-						Long idStreet = getStreetInCity(city, e.getTag(OSMTagKey.NAME), l, e.getId() << 1);
+						Long idStreet = getStreetInCity(city, e.getTag(OSMTagKey.NAME), l, (e.getId() << 2) | 1);
 						if (idStreet != null && saveAddressWays) {
 							DataIndexWriter.writeStreetWayNodes(addressStreetNodeStat, pStatements, idStreet, (Way) e, BATCH_SIZE);
 						}
