diff --git a/OsmAnd/src/net/osmand/plus/activities/MainMenuActivity.java b/OsmAnd/src/net/osmand/plus/activities/MainMenuActivity.java
index 300d60e..ad1e1fa 100644
--- a/OsmAnd/src/net/osmand/plus/activities/MainMenuActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/MainMenuActivity.java
@@ -138,7 +138,7 @@
 				@Override
 				public void onScrollChanged() {
 					int scrollY = mainScroll.getScrollY();
-					if (previousScroll == scrollY){
+					if (previousScroll == scrollY || mainScroll.getChildAt(0) == null){
 						return;
 					}
 
