diff --git a/src/main/java/org/elasticsearch/hadoop/rest/RestClient.java b/src/main/java/org/elasticsearch/hadoop/rest/RestClient.java
index 9f9d60f..113639e 100644
--- a/src/main/java/org/elasticsearch/hadoop/rest/RestClient.java
+++ b/src/main/java/org/elasticsearch/hadoop/rest/RestClient.java
@@ -106,7 +106,7 @@
         HttpConnectionManager manager = client.getHttpConnectionManager();
         if (manager instanceof SimpleHttpConnectionManager) {
             try {
-                ((SimpleHttpConnectionManager) manager).shutdown();
+                ((SimpleHttpConnectionManager) manager).closeIdleConnections(0);
             } catch (NullPointerException npe) {
                 // ignore
             } catch (Exception ex) {
