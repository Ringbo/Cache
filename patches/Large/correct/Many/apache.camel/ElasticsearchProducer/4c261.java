diff --git a/components/camel-elasticsearch/src/main/java/org/apache/camel/component/elasticsearch/ElasticsearchProducer.java b/components/camel-elasticsearch/src/main/java/org/apache/camel/component/elasticsearch/ElasticsearchProducer.java
index b930119..2b432d5 100644
--- a/components/camel-elasticsearch/src/main/java/org/apache/camel/component/elasticsearch/ElasticsearchProducer.java
+++ b/components/camel-elasticsearch/src/main/java/org/apache/camel/component/elasticsearch/ElasticsearchProducer.java
@@ -109,7 +109,7 @@
         boolean configIndexType = false;
         String indexType = message.getHeader(ElasticsearchConfiguration.PARAM_INDEX_TYPE, String.class);
         if (indexType == null) {
-            message.setHeader(ElasticsearchConfiguration.PARAM_INDEX_TYPE, getEndpoint().getConfig().getIndexName());
+            message.setHeader(ElasticsearchConfiguration.PARAM_INDEX_TYPE, getEndpoint().getConfig().getIndexType());
             configIndexType = true;
         }
 
