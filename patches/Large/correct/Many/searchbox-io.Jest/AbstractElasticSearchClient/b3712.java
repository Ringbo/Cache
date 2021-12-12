diff --git a/src/main/java/io/searchbox/client/AbstractElasticSearchClient.java b/src/main/java/io/searchbox/client/AbstractElasticSearchClient.java
index 36157bd..2195aea 100644
--- a/src/main/java/io/searchbox/client/AbstractElasticSearchClient.java
+++ b/src/main/java/io/searchbox/client/AbstractElasticSearchClient.java
@@ -103,9 +103,9 @@
 
     protected String getRequestURL(String elasticSearchServer, String uri) {
         StringBuilder sb = new StringBuilder(elasticSearchServer);
-        uri = modifyData(uri);
+        String modifiedURI = modifyData(uri);
         sb.append("/");
-        sb.append(uri);
+        sb.append(modifiedURI);
         return sb.toString();
     }
 
