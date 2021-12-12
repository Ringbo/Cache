diff --git a/src/main/java/org/elasticsearch/hadoop/rest/BufferedRestClient.java b/src/main/java/org/elasticsearch/hadoop/rest/BufferedRestClient.java
index 264d33b..cb2e593 100644
--- a/src/main/java/org/elasticsearch/hadoop/rest/BufferedRestClient.java
+++ b/src/main/java/org/elasticsearch/hadoop/rest/BufferedRestClient.java
@@ -99,7 +99,7 @@
         client.bulk(index, buffer, bufferSize);
         bufferSize = 0;
         bufferEntries = 0;
-        requiresRefreshAfterBulk = true;
+        executedBulkWrite = true;
     }
 
     @Override
