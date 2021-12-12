diff --git a/src/main/java/org/graylog2/indexer/Indexer.java b/src/main/java/org/graylog2/indexer/Indexer.java
index 7ff4bd0..4e288ee 100644
--- a/src/main/java/org/graylog2/indexer/Indexer.java
+++ b/src/main/java/org/graylog2/indexer/Indexer.java
@@ -89,7 +89,7 @@
         if (conn.getResponseCode() == 200) {
             return true;
         } else {
-            LOG.warn("Response code of create index operation was not 201, but " + conn.getResponseCode());
+            LOG.warn("Response code of create index operation was not 200, but " + conn.getResponseCode());
             return false;
         }
     }
@@ -121,10 +121,10 @@
             OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
             writer.write(batch);
             writer.close();
-            if (conn.getResponseCode() == 201) {
+            if (conn.getResponseCode() == 200) {
                 return true;
             } else {
-                LOG.warn("Indexer response code was not 201, but " + conn.getResponseCode());
+                LOG.warn("Indexer response code was not 200, but " + conn.getResponseCode());
                 return false; 
             }
         } catch (IOException e) {
