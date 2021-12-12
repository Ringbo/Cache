diff --git a/OsmAnd-java/src/main/java/net/osmand/map/TileSourceManager.java b/OsmAnd-java/src/main/java/net/osmand/map/TileSourceManager.java
index df6cd6a..f71fcde 100644
--- a/OsmAnd-java/src/main/java/net/osmand/map/TileSourceManager.java
+++ b/OsmAnd-java/src/main/java/net/osmand/map/TileSourceManager.java
@@ -61,7 +61,7 @@
 		private int avgSize;
 		private int bitDensity;
 		// -1 never expires, 
-		private int expirationTimeMillis = -1;
+		private long expirationTimeMillis = -1;
 		private boolean ellipticYTile;
 		private String rule;
 		private boolean hidden; // if hidden in configure map settings, for example mapillary sources
@@ -141,7 +141,7 @@
 			return name;
 		}
 		
-		public void setExpirationTimeMillis(int timeMillis) {
+		public void setExpirationTimeMillis(long timeMillis) {
 			this.expirationTimeMillis = timeMillis;
 		}
 		
@@ -149,7 +149,7 @@
 			if(minutes < 0) {
 				this.expirationTimeMillis = -1;
 			} else {
-				this.expirationTimeMillis = minutes * 60 * 1000;
+				this.expirationTimeMillis = minutes * 60 * 1000l;
 			}
 		}
 		
@@ -157,10 +157,10 @@
 			if(expirationTimeMillis < 0) {
 				return -1;
 			}
-			return expirationTimeMillis / (60  * 1000);
+			return (int) (expirationTimeMillis / (60  * 1000));
 		}
 		
-		public int getExpirationTimeMillis() {
+		public long getExpirationTimeMillis() {
 			return expirationTimeMillis;
 		}
 		
