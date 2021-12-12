diff --git a/OsmAnd/src/net/osmand/plus/OsmandApplication.java b/OsmAnd/src/net/osmand/plus/OsmandApplication.java
index 2523063..dc5c9e0 100644
--- a/OsmAnd/src/net/osmand/plus/OsmandApplication.java
+++ b/OsmAnd/src/net/osmand/plus/OsmandApplication.java
@@ -511,7 +511,8 @@
 				LOG.error("I/O exception", e);
 				warnings.add("Error while reading the special phrases. Restart OsmAnd if possible");
 			}
-			if (!Version.isBlackberry(this)) {
+			
+			if (!Version.isBlackberry(this) || !"qnx".equals(System.getProperty("os.name"))) {
 				if (osmandSettings.NATIVE_RENDERING_FAILED.get()) {
 					osmandSettings.SAFE_MODE.set(true);
 					osmandSettings.NATIVE_RENDERING_FAILED.set(false);
