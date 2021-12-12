diff --git a/elasticsearch/x-pack/marvel/src/main/java/org/elasticsearch/marvel/agent/exporter/http/HttpExporter.java b/elasticsearch/x-pack/marvel/src/main/java/org/elasticsearch/marvel/agent/exporter/http/HttpExporter.java
index 10a15c6..624bef3 100644
--- a/elasticsearch/x-pack/marvel/src/main/java/org/elasticsearch/marvel/agent/exporter/http/HttpExporter.java
+++ b/elasticsearch/x-pack/marvel/src/main/java/org/elasticsearch/marvel/agent/exporter/http/HttpExporter.java
@@ -169,7 +169,7 @@
         if (bulkTimeout != null) {
             queryString = "?master_timeout=" + bulkTimeout;
         }
-        HttpURLConnection conn = openAndValidateConnection("POST", "/_bulk" + queryString, XContentType.SMILE.restContentType());
+        HttpURLConnection conn = openAndValidateConnection("POST", "/_bulk" + queryString, XContentType.SMILE.mediaType());
         if (conn != null && (keepAliveThread == null || !keepAliveThread.isAlive())) {
             // start keep alive upon successful connection if not there.
             initKeepAliveThread();
@@ -450,7 +450,7 @@
         logger.debug("http exporter [{}] - installing template [{}]", name(), template);
         HttpURLConnection connection = null;
         try {
-            connection = openConnection(host, "PUT", "_template/" + template, XContentType.JSON.restContentType());
+            connection = openConnection(host, "PUT", "_template/" + template, XContentType.JSON.mediaType());
             if (connection == null) {
                 logger.debug("http exporter [{}] - no available connection to update marvel template [{}]", name(), template);
                 return false;
