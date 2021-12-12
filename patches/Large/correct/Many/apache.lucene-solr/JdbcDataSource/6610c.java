diff --git a/contrib/dataimporthandler/src/main/java/org/apache/solr/handler/dataimport/JdbcDataSource.java b/contrib/dataimporthandler/src/main/java/org/apache/solr/handler/dataimport/JdbcDataSource.java
index 68aaf1a..2c1a790 100644
--- a/contrib/dataimporthandler/src/main/java/org/apache/solr/handler/dataimport/JdbcDataSource.java
+++ b/contrib/dataimporthandler/src/main/java/org/apache/solr/handler/dataimport/JdbcDataSource.java
@@ -62,7 +62,7 @@
 
     String bsz = initProps.getProperty("batchSize");
     if (bsz != null) {
-      bsz = (String) context.getVariableResolver().resolve(bsz);
+      bsz = (String) context.getVariableResolver().replaceTokens(bsz);
       try {
         batchSize = Integer.parseInt(bsz);
         if (batchSize == -1)
