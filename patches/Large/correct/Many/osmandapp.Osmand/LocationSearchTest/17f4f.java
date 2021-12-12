diff --git a/OsmAnd-java/test/java/net/osmand/search/LocationSearchTest.java b/OsmAnd-java/test/java/net/osmand/search/LocationSearchTest.java
index a5b07f1..73d608f 100644
--- a/OsmAnd-java/test/java/net/osmand/search/LocationSearchTest.java
+++ b/OsmAnd-java/test/java/net/osmand/search/LocationSearchTest.java
@@ -15,7 +15,7 @@
 public class LocationSearchTest {
 
 	private void search(String string, LatLon latLon) throws IOException {
-		SearchResultMatcher srm = new SearchUICore.SearchResultMatcher(null, 0, null, 100);
+		SearchResultMatcher srm = new SearchUICore.SearchResultMatcher(null, null, 0, null, 100);
 		new SearchCoreFactory.SearchLocationAndUrlAPI().
 			search(new SearchPhrase(null, OsmAndCollator.primaryCollator()).generateNewPhrase(string, null), srm);
 		Assert.assertEquals(1, srm.getRequestResults().size());
