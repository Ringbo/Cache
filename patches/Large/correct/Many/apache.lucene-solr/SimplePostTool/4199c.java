diff --git a/solr/core/src/java/org/apache/solr/util/SimplePostTool.java b/solr/core/src/java/org/apache/solr/util/SimplePostTool.java
index 646f591..8b03cdc 100644
--- a/solr/core/src/java/org/apache/solr/util/SimplePostTool.java
+++ b/solr/core/src/java/org/apache/solr/util/SimplePostTool.java
@@ -1093,7 +1093,7 @@
           // Raw content type of form "text/html; encoding=utf-8"
           String rawContentType = conn.getContentType();
           String type = rawContentType.split(";")[0];
-          if(typeSupported(type)) {
+          if(typeSupported(type) || "*".equals(fileTypes)) {
             String encoding = conn.getContentEncoding();
             InputStream is;
             if (encoding != null && encoding.equalsIgnoreCase("gzip")) {
