diff --git a/OsmAnd/src/net/osmand/plus/helpers/DatabaseHelper.java b/OsmAnd/src/net/osmand/plus/helpers/DatabaseHelper.java
index 019f717..17b02c7 100644
--- a/OsmAnd/src/net/osmand/plus/helpers/DatabaseHelper.java
+++ b/OsmAnd/src/net/osmand/plus/helpers/DatabaseHelper.java
@@ -50,7 +50,7 @@
         if (conn.getVersion() == 0 || DB_VERSION != conn.getVersion()) {
             if (readonly) {
                 conn.close();
-                conn = app.getSQLiteAPI().getOrCreateDatabase(DB_NAME, true);
+                conn = app.getSQLiteAPI().getOrCreateDatabase(DB_NAME, false);
             }
             if (conn.getVersion() == 0) {
                 conn.setVersion(DB_VERSION);
