diff --git a/OsmAnd/src/net/osmand/plus/wikivoyage/explore/SavedArticlesTabFragment.java b/OsmAnd/src/net/osmand/plus/wikivoyage/explore/SavedArticlesTabFragment.java
index 409d98a..712920d 100644
--- a/OsmAnd/src/net/osmand/plus/wikivoyage/explore/SavedArticlesTabFragment.java
+++ b/OsmAnd/src/net/osmand/plus/wikivoyage/explore/SavedArticlesTabFragment.java
@@ -83,7 +83,7 @@
 
 	@Override
 	public void savedArticlesUpdated() {
-		if (adapter != null) {
+		if (adapter != null && getActivity() != null) {
 			List<Object> newItems = getItems();
 			SavedArticlesDiffCallback diffCallback = new SavedArticlesDiffCallback(adapter.getItems(), newItems);
 			DiffUtil.DiffResult diffRes = DiffUtil.calculateDiff(diffCallback);
