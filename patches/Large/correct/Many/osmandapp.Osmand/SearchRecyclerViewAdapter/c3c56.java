diff --git a/OsmAnd/src/net/osmand/plus/wikivoyage/search/SearchRecyclerViewAdapter.java b/OsmAnd/src/net/osmand/plus/wikivoyage/search/SearchRecyclerViewAdapter.java
index 72cbbcc..0dbcfef 100644
--- a/OsmAnd/src/net/osmand/plus/wikivoyage/search/SearchRecyclerViewAdapter.java
+++ b/OsmAnd/src/net/osmand/plus/wikivoyage/search/SearchRecyclerViewAdapter.java
@@ -74,7 +74,7 @@
 			if (item instanceof WikivoyageSearchResult) {
 				WikivoyageSearchResult searchRes = (WikivoyageSearchResult) item;
 				Picasso.get()
-						.load(app.getSettings().SHOW_IMAGES.get() ?
+						.load(app.getSettings().WIKIVOYAGE_SHOW_IMAGES.get() ?
 								WikivoyageArticle.getImageUrl(searchRes.getImageTitle(), true) : null)
 						.transform(new CropCircleTransformation())
 						.placeholder(placeholder)
