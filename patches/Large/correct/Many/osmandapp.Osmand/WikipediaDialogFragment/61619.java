diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/WikipediaDialogFragment.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/WikipediaDialogFragment.java
index 6747198..73cd329 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/WikipediaDialogFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/WikipediaDialogFragment.java
@@ -167,8 +167,7 @@
 			if (TextUtils.isEmpty(preferredLanguage)) {
 				preferredLanguage = getMyApplication().getLanguage();
 			}
-
-			final String title = TextUtils.isEmpty(preferredLanguage) ? amenity.getName() : amenity.getName(lang);
+			final String title = TextUtils.isEmpty(preferredLanguage) ? amenity.getName() : amenity.getName(preferredLanguage);
 			((TextView) mainView.findViewById(R.id.title_text_view)).setText(title);
 
 			String lng = amenity.getContentLanguage("content", preferredLanguage, "en");
