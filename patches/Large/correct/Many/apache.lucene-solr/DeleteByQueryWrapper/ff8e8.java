diff --git a/solr/core/src/java/org/apache/solr/update/DeleteByQueryWrapper.java b/solr/core/src/java/org/apache/solr/update/DeleteByQueryWrapper.java
index 4a03064..1c1fccc 100644
--- a/solr/core/src/java/org/apache/solr/update/DeleteByQueryWrapper.java
+++ b/solr/core/src/java/org/apache/solr/update/DeleteByQueryWrapper.java
@@ -57,7 +57,7 @@
   public Query rewrite(IndexReader reader) throws IOException {
     Query rewritten = in.rewrite(reader);
     if (rewritten != in) {
-      return new DeleteByQueryWrapper(in, schema);
+      return new DeleteByQueryWrapper(rewritten, schema);
     } else {
       return this;
     }
