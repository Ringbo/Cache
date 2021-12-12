diff --git a/OsmAnd-java/src/net/osmand/search/core/SearchCoreFactory.java b/OsmAnd-java/src/net/osmand/search/core/SearchCoreFactory.java
index d2a6200..5478d4c 100644
--- a/OsmAnd-java/src/net/osmand/search/core/SearchCoreFactory.java
+++ b/OsmAnd-java/src/net/osmand/search/core/SearchCoreFactory.java
@@ -157,7 +157,7 @@
 	
 	public static class SearchAddressByNameAPI extends SearchBaseAPI {
 		
-		private static final int DEFAULT_ADDRESS_BBOX_RADIUS = 200*1000;
+		private static final int DEFAULT_ADDRESS_BBOX_RADIUS = 100*1000;
 		private static final int LIMIT = 10000;
 		
 		
@@ -208,7 +208,7 @@
 
 
 		private void initAndSearchCities(final SearchPhrase phrase, final SearchResultMatcher resultMatcher) throws IOException {
-			QuadRect bbox = phrase.getRadiusBBoxToSearch(DEFAULT_ADDRESS_BBOX_RADIUS * 10);
+			QuadRect bbox = phrase.getRadiusBBoxToSearch(DEFAULT_ADDRESS_BBOX_RADIUS * 20);
 			Iterator<BinaryMapIndexReader> offlineIndexes = phrase.getOfflineIndexes(bbox, SearchPhraseDataType.ADDRESS);
 			while(offlineIndexes.hasNext()) {
 				BinaryMapIndexReader r = offlineIndexes.next();
@@ -263,7 +263,7 @@
 				final QuadRect streetBbox = phrase.getRadiusBBoxToSearch(DEFAULT_ADDRESS_BBOX_RADIUS);
 				final QuadRect postcodeBbox = phrase.getRadiusBBoxToSearch(DEFAULT_ADDRESS_BBOX_RADIUS * 5);
 				final QuadRect villagesBbox = phrase.getRadiusBBoxToSearch(DEFAULT_ADDRESS_BBOX_RADIUS * 3);
-				final QuadRect cityBbox = phrase.getRadiusBBoxToSearch(DEFAULT_ADDRESS_BBOX_RADIUS * 10);
+				final QuadRect cityBbox = phrase.getRadiusBBoxToSearch(DEFAULT_ADDRESS_BBOX_RADIUS * 5); // covered by separate search before
 				final int priority = phrase.isNoSelectedType() ? 
 						SEARCH_ADDRESS_BY_NAME_PRIORITY : SEARCH_ADDRESS_BY_NAME_PRIORITY_RADIUS2;
 				final BinaryMapIndexReader[] currentFile = new BinaryMapIndexReader[1]; 
@@ -355,7 +355,7 @@
 								resultMatcher.isCancelled();
 					}
 				};
-				Iterator<BinaryMapIndexReader> offlineIterator = phrase.getRadiusOfflineIndexes(DEFAULT_ADDRESS_BBOX_RADIUS * 10, 
+				Iterator<BinaryMapIndexReader> offlineIterator = phrase.getRadiusOfflineIndexes(DEFAULT_ADDRESS_BBOX_RADIUS * 5, 
 						SearchPhraseDataType.ADDRESS);
 				while (offlineIterator.hasNext()) {
 					BinaryMapIndexReader r = offlineIterator.next();
@@ -367,7 +367,7 @@
 									: StringMatcherMode.CHECK_STARTS_FROM_SPACE);
 					if (locSpecified) {
 						req.setBBoxRadius(loc.getLatitude(), loc.getLongitude(),
-								phrase.getRadiusSearch(DEFAULT_ADDRESS_BBOX_RADIUS * 10));
+								phrase.getRadiusSearch(DEFAULT_ADDRESS_BBOX_RADIUS * 5));
 					}
 					r.searchAddressDataByName(req);
 					for (SearchResult res : immediateResults) {
@@ -390,7 +390,7 @@
 	
 	public static class SearchAmenityByNameAPI extends SearchBaseAPI {
 		private static final int LIMIT = 10000;
-		private static final int BBOX_RADIUS = 1000 * 1000;
+		private static final int BBOX_RADIUS = 500 * 1000;
 		private static final int BBOX_RADIUS_INSIDE = 10000 * 1000; // to support city search for basemap
 		
 		
@@ -420,7 +420,7 @@
 							sr.otherNames = object.getAllNames(true);
 							sr.localeName = object.getName(phrase.getSettings().getLang(), phrase.getSettings().isTransliterate());
 							if(phrase.isUnknownSearchWordComplete()) {
-								if(!nm.matches(sr.localeName) || !nm.matches(sr.otherNames)) {
+								if(!nm.matches(sr.localeName) && !nm.matches(sr.otherNames)) {
 									return false;
 								}
 							}
