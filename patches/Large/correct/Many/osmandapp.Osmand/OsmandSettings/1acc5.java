diff --git a/OsmAnd/src/net/osmand/plus/OsmandSettings.java b/OsmAnd/src/net/osmand/plus/OsmandSettings.java
index 1cc4325..6b929a0 100644
--- a/OsmAnd/src/net/osmand/plus/OsmandSettings.java
+++ b/OsmAnd/src/net/osmand/plus/OsmandSettings.java
@@ -2336,7 +2336,7 @@
 	public Set<String> getSelectedPoiFilters() {
 		Set<String> result = new LinkedHashSet<>();
 		String filtersId = SELECTED_POI_FILTER_FOR_MAP.get();
-		if (filtersId != null) {
+		if (filtersId != null && !filtersId.isEmpty()) {
 			Collections.addAll(result, filtersId.split(","));
 		}
 		return result;
