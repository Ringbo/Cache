diff --git a/OsmAnd/src/net/osmand/plus/activities/search/SearchPOIActivity.java b/OsmAnd/src/net/osmand/plus/activities/search/SearchPOIActivity.java
index 61fd56c..7bd5dfa 100644
--- a/OsmAnd/src/net/osmand/plus/activities/search/SearchPOIActivity.java
+++ b/OsmAnd/src/net/osmand/plus/activities/search/SearchPOIActivity.java
@@ -211,7 +211,7 @@
 	
 	@Override
 	public void onCreate(Bundle icicle) {
-		requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
+		supportRequestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
 		super.onCreate(icicle);
 		setContentView(R.layout.searchpoi);
 		
