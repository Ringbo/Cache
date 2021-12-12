diff --git a/OsmAnd-java/src/net/osmand/map/RegionRegistry.java b/OsmAnd-java/src/net/osmand/map/RegionRegistry.java
index 0320fbc..d41c6a9 100644
--- a/OsmAnd-java/src/net/osmand/map/RegionRegistry.java
+++ b/OsmAnd-java/src/net/osmand/map/RegionRegistry.java
@@ -22,7 +22,7 @@
 			try {
 				long t = -System.currentTimeMillis();
 				r = new RegionRegistry();
-				InputStream in = RegionsRegistryConverter.class.getResourceAsStream(RegionRegistry.fileName);
+				InputStream in = RegionRegistry.class.getResourceAsStream(RegionRegistry.fileName);
 				OsmAndRegionInfo regInfo = OsmAndRegionInfo.newBuilder().mergeFrom(in).build();
 				for(int j = 0; j < regInfo.getRegionInfo().getRegionsCount(); j++) {
 					r.countries.add(RegionCountry.construct(regInfo.getRegionInfo().getRegions(j)));
