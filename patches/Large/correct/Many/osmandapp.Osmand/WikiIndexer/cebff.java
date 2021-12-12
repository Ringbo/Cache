diff --git a/DataExtractionOSM/src/net/osmand/data/index/WikiIndexer.java b/DataExtractionOSM/src/net/osmand/data/index/WikiIndexer.java
index 1f55366..94140e3 100644
--- a/DataExtractionOSM/src/net/osmand/data/index/WikiIndexer.java
+++ b/DataExtractionOSM/src/net/osmand/data/index/WikiIndexer.java
@@ -274,7 +274,7 @@
 		}
 		
 		private float zeroParseFloat(String s) {
-			return s.length() == 0 ? 0 : Float.parseFloat(s);
+			return s == null || s.length() == 0 ? 0 : Float.parseFloat(s);
 		}
 		
 		private int findOpenBrackets(int i) {
@@ -353,7 +353,7 @@
 					String lon_dir = readProperty("lon_dir", h, e);
 					String lat_dg = readProperty("lat_deg", h, e);
 					String lon_dg = readProperty("lon_deg", h, e);
-					if(lat_dg.length() == 0 || lon_dg.length() == 0){
+					if(lon_dg == null || lat_dg == null || lat_dg.length() == 0 || lon_dg.length() == 0){
 						return;
 					}
 					float lat_deg = Float.parseFloat(lat_dg);
@@ -365,7 +365,7 @@
 					lat = (("S".equals(lat_dir))? -1 : 1) * (lat_deg + (lat_min + lat_sec/60)/60);
 					lon = (("E".equals(lon_dir))? -1 : 1) * (lon_deg + (lon_min + lon_sec/60)/60);
 				} catch (RuntimeException es) {
-					log.debug("Article " + title, es);
+					log.error("Article " + title, es);
 					return;
 				}
 				// 3. Parse main subcategory name
