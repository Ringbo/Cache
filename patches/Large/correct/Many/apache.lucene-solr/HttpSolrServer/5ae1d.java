diff --git a/solr/solrj/src/java/org/apache/solr/client/solrj/impl/HttpSolrServer.java b/solr/solrj/src/java/org/apache/solr/client/solrj/impl/HttpSolrServer.java
index fe32861..5c5ed40 100644
--- a/solr/solrj/src/java/org/apache/solr/client/solrj/impl/HttpSolrServer.java
+++ b/solr/solrj/src/java/org/apache/solr/client/solrj/impl/HttpSolrServer.java
@@ -290,7 +290,11 @@
 
               if (isMultipart) {
                 for (ContentStream content : streams) {
-                   parts.add(new FormBodyPart(content.getName(), new InputStreamBody(content.getStream(), content.getName())));
+                   parts.add(new FormBodyPart(content.getName(), 
+                       new InputStreamBody(
+                           content.getStream(), 
+                           content.getContentType(), 
+                           content.getName())));
                 }
               }
               
