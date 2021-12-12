diff --git a/contrib/dataimporthandler/src/main/java/org/apache/solr/handler/dataimport/JdbcDataSource.java b/contrib/dataimporthandler/src/main/java/org/apache/solr/handler/dataimport/JdbcDataSource.java
index 583e1ae..68aaf1a 100644
--- a/contrib/dataimporthandler/src/main/java/org/apache/solr/handler/dataimport/JdbcDataSource.java
+++ b/contrib/dataimporthandler/src/main/java/org/apache/solr/handler/dataimport/JdbcDataSource.java
@@ -113,7 +113,7 @@
         throw new SolrException(SolrException.ErrorCode.SERVER_ERROR, "Could not load driver: " + driver, e);
       }
     } else {
-      if(jndiName != null){
+      if(jndiName == null){
         throw new SolrException(SolrException.ErrorCode.SERVER_ERROR, "Driver must be specified");
       }
     }
