diff --git a/OsmAnd/src/net/osmand/plus/views/POIMapLayer.java b/OsmAnd/src/net/osmand/plus/views/POIMapLayer.java
index 0f64683..b878429 100644
--- a/OsmAnd/src/net/osmand/plus/views/POIMapLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/POIMapLayer.java
@@ -374,15 +374,15 @@
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
 
