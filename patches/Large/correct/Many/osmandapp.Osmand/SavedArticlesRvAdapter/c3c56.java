diff --git a/OsmAnd/src/net/osmand/plus/wikivoyage/explore/SavedArticlesRvAdapter.java b/OsmAnd/src/net/osmand/plus/wikivoyage/explore/SavedArticlesRvAdapter.java
index 0a69ae3..461530c 100644
--- a/OsmAnd/src/net/osmand/plus/wikivoyage/explore/SavedArticlesRvAdapter.java
+++ b/OsmAnd/src/net/osmand/plus/wikivoyage/explore/SavedArticlesRvAdapter.java
@@ -76,7 +76,7 @@
 			final ItemVH holder = (ItemVH) viewHolder;
 			WikivoyageArticle article = (WikivoyageArticle) getItem(position);
 			boolean lastItem = position == getItemCount() - 1;
-			if (app.getSettings().SHOW_IMAGES.get()) {
+			if (app.getSettings().WIKIVOYAGE_SHOW_IMAGES.get()) {
 				Picasso.get()
 						.load(WikivoyageArticle.getImageUrl(article.getImageTitle(), false))
 						.transform(USE_ALTERNATIVE_CARD ? new CropRectTransformation() : new CropCircleTransformation())
