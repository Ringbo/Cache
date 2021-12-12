diff --git a/OsmAnd/src/net/osmand/plus/OsmandApplication.java b/OsmAnd/src/net/osmand/plus/OsmandApplication.java
index e38ca0f..b08a776 100644
--- a/OsmAnd/src/net/osmand/plus/OsmandApplication.java
+++ b/OsmAnd/src/net/osmand/plus/OsmandApplication.java
@@ -707,7 +707,7 @@
 		} else {
 			lang = Locale.getDefault().getLanguage();
 		}
-		if (lang != null && lang.length() > 2) {
+		if (lang != null && lang.length() > 3) {
 			lang = lang.substring(0, 2).toLowerCase();
 		}
 		return lang;
