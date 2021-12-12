diff --git a/src/test/java/org/elasticsearch/index/mapper/geo/GeoMappingTests.java b/src/test/java/org/elasticsearch/index/mapper/geo/GeoMappingTests.java
index 58e2159..44c9575 100644
--- a/src/test/java/org/elasticsearch/index/mapper/geo/GeoMappingTests.java
+++ b/src/test/java/org/elasticsearch/index/mapper/geo/GeoMappingTests.java
@@ -45,7 +45,7 @@
                     .endObject()
                 .endObject()
                 .endObject()).execute().actionGet();
-        ensureGreen();
+        ensureYellow();
         assertPrecision(new Distance(2, DistanceUnit.MILLIMETERS));
 
         client().admin().indices().preparePutMapping("test").setType("type1").setSource(XContentFactory.jsonBuilder().startObject()
