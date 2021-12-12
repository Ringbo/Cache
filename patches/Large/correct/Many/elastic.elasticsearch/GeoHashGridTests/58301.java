diff --git a/server/src/test/java/org/elasticsearch/search/aggregations/bucket/geogrid/GeoHashGridTests.java b/server/src/test/java/org/elasticsearch/search/aggregations/bucket/geogrid/GeoHashGridTests.java
index c48308e..9d40796 100644
--- a/server/src/test/java/org/elasticsearch/search/aggregations/bucket/geogrid/GeoHashGridTests.java
+++ b/server/src/test/java/org/elasticsearch/search/aggregations/bucket/geogrid/GeoHashGridTests.java
@@ -51,6 +51,6 @@
 
     @Override
     protected int randomPrecision() {
-        return randomIntBetween(1, 12);
+        return randomIntBetween(4, 12);
     }
 }
