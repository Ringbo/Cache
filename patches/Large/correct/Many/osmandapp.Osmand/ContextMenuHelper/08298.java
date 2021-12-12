diff --git a/OsmAndCore-sample/src/net/osmand/core/samples/android/sample1/mapcontextmenu/ContextMenuHelper.java b/OsmAndCore-sample/src/net/osmand/core/samples/android/sample1/mapcontextmenu/ContextMenuHelper.java
index 866d768..8e5a739 100644
--- a/OsmAndCore-sample/src/net/osmand/core/samples/android/sample1/mapcontextmenu/ContextMenuHelper.java
+++ b/OsmAndCore-sample/src/net/osmand/core/samples/android/sample1/mapcontextmenu/ContextMenuHelper.java
@@ -110,15 +110,15 @@
 			settings.setTextZoom((int) (ctx.getResources().getDisplayMetrics().density * 100f));
 		} else {
 			if (ctx.getResources().getDisplayMetrics().density <= 0.5f) {
-				WebSettings.setTextSize(WebSettings.TextSize.SMALLEST);
+				settings.setTextSize(WebSettings.TextSize.SMALLEST);
 			} else if (ctx.getResources().getDisplayMetrics().density <= 0.75f) {
-				WebSettings.setTextSize(WebSettings.TextSize.SMALLER);
+				settings.setTextSize(WebSettings.TextSize.SMALLER);
 			} else if (ctx.getResources().getDisplayMetrics().density <= 1.0f) {
-				WebSettings.setTextSize(WebSettings.TextSize.NORMAL);
+				settings.setTextSize(WebSettings.TextSize.NORMAL);
 			} else if (ctx.getResources().getDisplayMetrics().density <= 1.5f) {
-				WebSettings.setTextSize(WebSettings.TextSize.LARGER);
+				settings.setTextSize(WebSettings.TextSize.LARGER);
 			} else {
-				WebSettings.setTextSize(WebSettings.TextSize.LARGEST);
+				settings.setTextSize(WebSettings.TextSize.LARGEST);
 			}
 		}
 
