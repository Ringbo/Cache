diff --git a/OsmAnd/src/net/osmand/plus/sherpafy/TourViewActivity.java b/OsmAnd/src/net/osmand/plus/sherpafy/TourViewActivity.java
index cab0bc7..0b2f6a9 100644
--- a/OsmAnd/src/net/osmand/plus/sherpafy/TourViewActivity.java
+++ b/OsmAnd/src/net/osmand/plus/sherpafy/TourViewActivity.java
@@ -33,8 +33,7 @@
 	protected void onCreate(Bundle savedInstanceState) {
 		super.onCreate(savedInstanceState);
 		((OsmandApplication) getApplication()).applyTheme(this);
-		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
-
+		getSupportActionBar().setDisplayHomeAsUpEnabled(false);
 
 		//		if (customization.getTourInformations().isEmpty())
 //		{
