diff --git a/mr/src/main/java/org/elasticsearch/hadoop/mr/EsOutputFormat.java b/mr/src/main/java/org/elasticsearch/hadoop/mr/EsOutputFormat.java
index 301d07b..5b7f773 100644
--- a/mr/src/main/java/org/elasticsearch/hadoop/mr/EsOutputFormat.java
+++ b/mr/src/main/java/org/elasticsearch/hadoop/mr/EsOutputFormat.java
@@ -252,7 +252,7 @@
             settings.setHosts(uri);
 
             if (log.isDebugEnabled()) {
-                log.debug(String.format("EsRecordWriter instance [%s] assigned to [%s]", uri));
+                log.debug(String.format("EsRecordWriter instance [%s] assigned to [%s]", currentInstance, uri));
             }
 
             client = new RestRepository(settings);
