diff --git a/DataExtractionOSM/src/net/osmand/data/index/WikiIndexer.java b/DataExtractionOSM/src/net/osmand/data/index/WikiIndexer.java
index b88274f..90b0624 100644
--- a/DataExtractionOSM/src/net/osmand/data/index/WikiIndexer.java
+++ b/DataExtractionOSM/src/net/osmand/data/index/WikiIndexer.java
@@ -340,7 +340,7 @@
 				if(ei != -1) {
 					String englishName = text.substring("[[en:".length() + i, ei).trim();
 					enSearch.setString(1, englishName);
-					ResultSet rs = enSearch.getResultSet();
+					ResultSet rs = enSearch.executeQuery();
 					while (rs.next()) {
 						clat = rs.getFloat(1);
 						clon = rs.getFloat(2);
