diff --git a/OsmAnd/src/net/osmand/plus/wikivoyage/explore/ExploreRvAdapter.java b/OsmAnd/src/net/osmand/plus/wikivoyage/explore/ExploreRvAdapter.java
index 6c387d5..073fd3c 100644
--- a/OsmAnd/src/net/osmand/plus/wikivoyage/explore/ExploreRvAdapter.java
+++ b/OsmAnd/src/net/osmand/plus/wikivoyage/explore/ExploreRvAdapter.java
@@ -108,7 +108,7 @@
 	public int getArticleItemCount() {
 		int count = 0;
 		for (Object o : items) {
-			if (o instanceof TravelArticle) {
+			if (o instanceof ArticleTravelCard) {
 				count++;
 			}
 		}
