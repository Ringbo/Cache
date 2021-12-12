diff --git a/OsmAndCore-sample/src/net/osmand/core/samples/android/sample1/search/QuickSearchDialogFragment.java b/OsmAndCore-sample/src/net/osmand/core/samples/android/sample1/search/QuickSearchDialogFragment.java
index 48f8b05..1a5deb3 100644
--- a/OsmAndCore-sample/src/net/osmand/core/samples/android/sample1/search/QuickSearchDialogFragment.java
+++ b/OsmAndCore-sample/src/net/osmand/core/samples/android/sample1/search/QuickSearchDialogFragment.java
@@ -657,7 +657,7 @@
 	}
 
 	private void runCoreSearchInternal(String text, boolean updateResult, boolean searchMore) {
-		SearchResultCollection c = searchUICore.search(text, new ResultMatcher<SearchResult>() {
+		SearchResultCollection c = searchUICore.search(text, updateResult, new ResultMatcher<SearchResult>() {
 			SearchResultCollection regionResultCollection = null;
 			SearchCoreAPI regionResultApi = null;
 			List<SearchResult> results = new ArrayList<>();
