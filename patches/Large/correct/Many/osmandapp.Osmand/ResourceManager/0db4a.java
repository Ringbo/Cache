diff --git a/OsmAnd/src/net/osmand/plus/resources/ResourceManager.java b/OsmAnd/src/net/osmand/plus/resources/ResourceManager.java
index d1d42fc..37675d3 100644
--- a/OsmAnd/src/net/osmand/plus/resources/ResourceManager.java
+++ b/OsmAnd/src/net/osmand/plus/resources/ResourceManager.java
@@ -853,7 +853,7 @@
 	}
 
 	public AmenityIndexRepositoryBinary getWikiRepositoryByRegionName(String name) {
-		if (name == null)
+		if (name == null || name.isEmpty())
 			return null;
 		for (String filename : amenityRepositories.keySet()) {
 			if ((filename.contains("_wiki")
