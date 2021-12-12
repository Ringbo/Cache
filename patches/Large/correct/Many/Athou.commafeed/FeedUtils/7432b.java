diff --git a/src/main/java/com/commafeed/backend/feeds/FeedUtils.java b/src/main/java/com/commafeed/backend/feeds/FeedUtils.java
index 737da59..c124125 100644
--- a/src/main/java/com/commafeed/backend/feeds/FeedUtils.java
+++ b/src/main/java/com/commafeed/backend/feeds/FeedUtils.java
@@ -126,8 +126,8 @@
 			whitelist.addAttributes("colgroup", "span", "width");
 			whitelist.addAttributes("iframe", "src", "height", "width",
 					"allowfullscreen", "frameborder", "style");
-			whitelist.addAttributes("img", "alt", "height", "src", "title",
-					"width");
+			whitelist.addAttributes("img", "align", "alt", "height", "src",
+					"title", "width");
 			whitelist.addAttributes("ol", "start", "type");
 			whitelist.addAttributes("q", "cite");
 			whitelist.addAttributes("table", "border", "bordercolor",
