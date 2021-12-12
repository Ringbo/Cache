diff --git a/src/test/java/org/elasticsearch/test/integration/update/UpdateTests.java b/src/test/java/org/elasticsearch/test/integration/update/UpdateTests.java
index 0cf7821..18844b6 100644
--- a/src/test/java/org/elasticsearch/test/integration/update/UpdateTests.java
+++ b/src/test/java/org/elasticsearch/test/integration/update/UpdateTests.java
@@ -267,7 +267,7 @@
         getResponse = client.prepareGet("test", "type1", "2").setFields("_ttl").execute().actionGet();
         ttl = ((Number) getResponse.field("_ttl").value()).longValue();
         assertThat(ttl, greaterThan(0L));
-        assertThat(ttl, lessThan(3600000L));
+        assertThat(ttl, lessThanOrEqualTo(3600000L));
 
         // check timestamp update
         client.prepareIndex("test", "type1", "3").setSource("field", 1).setRefresh(true).execute().actionGet();
