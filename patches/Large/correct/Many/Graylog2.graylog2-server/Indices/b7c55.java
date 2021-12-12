diff --git a/graylog2-server/src/main/java/org/graylog2/indexer/indices/Indices.java b/graylog2-server/src/main/java/org/graylog2/indexer/indices/Indices.java
index 67f96b3..1607022 100644
--- a/graylog2-server/src/main/java/org/graylog2/indexer/indices/Indices.java
+++ b/graylog2-server/src/main/java/org/graylog2/indexer/indices/Indices.java
@@ -162,7 +162,7 @@
     }
 
     public boolean aliasExists(String alias) {
-        return c.admin().indices().existsAliases(new IndicesGetAliasesRequest(alias)).actionGet().exists();
+        return c.admin().indices().aliasesExist(new IndicesGetAliasesRequest(alias)).actionGet().exists();
     }
 
     public String aliasTarget(String alias) {
