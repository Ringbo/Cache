diff --git a/OsmAnd/src/net/osmand/plus/wikivoyage/article/WikivoyageArticleDialogFragment.java b/OsmAnd/src/net/osmand/plus/wikivoyage/article/WikivoyageArticleDialogFragment.java
index d43f33e..7a308fb 100644
--- a/OsmAnd/src/net/osmand/plus/wikivoyage/article/WikivoyageArticleDialogFragment.java
+++ b/OsmAnd/src/net/osmand/plus/wikivoyage/article/WikivoyageArticleDialogFragment.java
@@ -119,7 +119,7 @@
 
 		contentWebView = (WebView) mainView.findViewById(R.id.content_web_view);
 		contentWebView.getSettings().setJavaScriptEnabled(true);
-		contentWebView.getSettings().setLoadsImagesAutomatically(getSettings().SHOW_IMAGES.get());
+		contentWebView.getSettings().setLoadsImagesAutomatically(getSettings().WIKIVOYAGE_SHOW_IMAGES.get());
 
 		return mainView;
 	}
@@ -231,7 +231,7 @@
 		StringBuilder sb = new StringBuilder(HEADER_INNER);
 
 		String articleImageTitle = article.getImageTitle();
-		if (!TextUtils.isEmpty(articleImageTitle)&&!getSettings().SHOW_IMAGES.get()) {
+		if (!TextUtils.isEmpty(articleImageTitle)&&getSettings().WIKIVOYAGE_SHOW_IMAGES.get()) {
 			String url = WikivoyageArticle.getImageUrl(articleImageTitle, false);
 			sb.append("<div class=\"title-image\" style=\"background-image: url(").append(url).append(")\"></div>");
 		}
