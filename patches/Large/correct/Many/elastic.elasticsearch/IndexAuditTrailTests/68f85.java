diff --git a/shield/src/test/java/org/elasticsearch/shield/audit/index/IndexAuditTrailTests.java b/shield/src/test/java/org/elasticsearch/shield/audit/index/IndexAuditTrailTests.java
index b4340c9..0b9e471 100644
--- a/shield/src/test/java/org/elasticsearch/shield/audit/index/IndexAuditTrailTests.java
+++ b/shield/src/test/java/org/elasticsearch/shield/audit/index/IndexAuditTrailTests.java
@@ -794,7 +794,7 @@
 
         SearchResponse response = getClient().prepareSearch(resolveIndexName())
                 .setTypes(IndexAuditTrail.DOC_TYPE)
-                .addFields(fieldList())
+                .fields(fieldList())
                 .execute().actionGet();
 
         assertEquals(1, response.getHits().getTotalHits());
