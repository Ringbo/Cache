diff --git a/solr/contrib/dataimporthandler/src/java/org/apache/solr/handler/dataimport/ContextImpl.java b/solr/contrib/dataimporthandler/src/java/org/apache/solr/handler/dataimport/ContextImpl.java
index 19a37cd..bc70136 100644
--- a/solr/contrib/dataimporthandler/src/java/org/apache/solr/handler/dataimport/ContextImpl.java
+++ b/solr/contrib/dataimporthandler/src/java/org/apache/solr/handler/dataimport/ContextImpl.java
@@ -193,7 +193,7 @@
     }
   }
 
-  public void setDoc(DocBuilder.DocWrapper docWrapper) {
+  void setDoc(DocBuilder.DocWrapper docWrapper) {
     this.doc = docWrapper;
   }
 
