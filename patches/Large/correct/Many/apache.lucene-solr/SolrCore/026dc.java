diff --git a/solr/src/java/org/apache/solr/core/SolrCore.java b/solr/src/java/org/apache/solr/core/SolrCore.java
index c935e0a..7e9c65c 100644
--- a/solr/src/java/org/apache/solr/core/SolrCore.java
+++ b/solr/src/java/org/apache/solr/core/SolrCore.java
@@ -419,7 +419,7 @@
     try {
         clazz = getResourceLoader().findClass(className);
         if (cast != null && !cast.isAssignableFrom(clazz)) {
-          throw new SolrException(SolrException.ErrorCode.SERVER_ERROR,"Error Instantiating "+msg+", "+className+ " is not a " +cast.getName(), false);
+          throw new SolrException(SolrException.ErrorCode.SERVER_ERROR,"Error Instantiating "+msg+", "+className+ " is not a " +cast.getName());
         }
       //most of the classes do not have constructors which takes SolrCore argument. It is recommended to obtain SolrCore by implementing SolrCoreAware.
       // So invariably always it will cause a  NoSuchMethodException. So iterate though the list of available constructors
@@ -434,7 +434,7 @@
     } catch (SolrException e) {
       throw e;
     } catch (Exception e) {
-      throw new SolrException(SolrException.ErrorCode.SERVER_ERROR,"Error Instantiating "+msg+", "+className+ " failed to instantiate " +cast.getName(), e);
+      throw new SolrException(SolrException.ErrorCode.SERVER_ERROR,"Error Instantiating "+msg+", "+className+ " failed to instantiate " +cast.getName(), e, false);
     }
   }
 
