diff --git a/src/main/java/org/graylog2/indexer/Indexer.java b/src/main/java/org/graylog2/indexer/Indexer.java
index afaddc7..24a0003 100644
--- a/src/main/java/org/graylog2/indexer/Indexer.java
+++ b/src/main/java/org/graylog2/indexer/Indexer.java
@@ -60,11 +60,12 @@
         URL url = new URL(Indexer.buildIndexURL());
         HttpURLConnection conn = (HttpURLConnection) url.openConnection();
         conn.setRequestMethod("HEAD");
-        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
+        // Older versions of ElasticSearch return 400 Bad Request in cse of an existing index.
+        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK || conn.getResponseCode() == HttpURLConnection.HTTP_BAD_REQUEST) {
             return true;
         } else {
             if (conn.getResponseCode() != HttpURLConnection.HTTP_NOT_FOUND) {
-                LOG.warn("Indexer response code was not 200 or 404, but " + conn.getResponseCode());
+                LOG.warn("Indexer response code was not (200 or 400) or 404, but " + conn.getResponseCode());
             }
 
             return false;
