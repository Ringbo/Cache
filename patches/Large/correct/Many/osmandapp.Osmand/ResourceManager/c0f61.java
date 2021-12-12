diff --git a/OsmAnd/src/net/osmand/plus/resources/ResourceManager.java b/OsmAnd/src/net/osmand/plus/resources/ResourceManager.java
index 019cd6f..776cdeb 100644
--- a/OsmAnd/src/net/osmand/plus/resources/ResourceManager.java
+++ b/OsmAnd/src/net/osmand/plus/resources/ResourceManager.java
@@ -676,7 +676,7 @@
 						changesManager.indexMainMap(f, dateCreated);
 						indexFileNames.put(f.getName(), dateFormat.format(dateCreated)); //$NON-NLS-1$
 					}
-					if (!mapReader.getRegionNames().isEmpty() || mapReader.isBasemap()) {
+					if (!mapReader.getRegionNames().isEmpty() || mapReader.containsPoiData()) {
 						try {
 							RandomAccessFile raf = new RandomAccessFile(f, "r"); //$NON-NLS-1$
 							RegionAddressRepositoryBinary rarb = new RegionAddressRepositoryBinary(this,
