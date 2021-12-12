diff --git a/OsmAnd/src/net/osmand/plus/activities/OsmandIntents.java b/OsmAnd/src/net/osmand/plus/activities/OsmandIntents.java
index 583726d..ba6bcc1 100644
--- a/OsmAnd/src/net/osmand/plus/activities/OsmandIntents.java
+++ b/OsmAnd/src/net/osmand/plus/activities/OsmandIntents.java
@@ -30,7 +30,7 @@
 	}
 	
 	public static Class<? extends Activity> getLocalIndexActivity() {
-		return DownloadIndexActivity.class;
+		return LocalIndexesActivity.class;
 	}
 
 }
