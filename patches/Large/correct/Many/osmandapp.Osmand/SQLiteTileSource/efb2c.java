diff --git a/OsmAnd/src/net/osmand/plus/SQLiteTileSource.java b/OsmAnd/src/net/osmand/plus/SQLiteTileSource.java
index 7b24625..4fd8503 100644
--- a/OsmAnd/src/net/osmand/plus/SQLiteTileSource.java
+++ b/OsmAnd/src/net/osmand/plus/SQLiteTileSource.java
@@ -215,7 +215,7 @@
 					if(expireminutes != -1) {
 						int minutes = (int) cursor.getInt(expireminutes);
 						if(minutes > 0) {
-							this.expirationTimeMillis = minutes * 60 * 1000;
+							this.expirationTimeMillis = minutes * 60 * 1000l;
 						}
 					} else {
 						addInfoColumn("expireminutes", "0");
@@ -503,7 +503,7 @@
 		return (int) (expirationTimeMillis / (60  * 1000));
 	}
 	
-	public int getExpirationTimeMillis() {
+	public long getExpirationTimeMillis() {
 		return expirationTimeMillis;
 	}
 	
