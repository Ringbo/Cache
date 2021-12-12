diff --git a/solr/core/src/java/org/apache/solr/handler/component/HttpShardHandlerFactory.java b/solr/core/src/java/org/apache/solr/handler/component/HttpShardHandlerFactory.java
index 596f08b..d77bf80 100644
--- a/solr/core/src/java/org/apache/solr/handler/component/HttpShardHandlerFactory.java
+++ b/solr/core/src/java/org/apache/solr/handler/component/HttpShardHandlerFactory.java
@@ -161,7 +161,7 @@
       T temp = (T) initArgs.get(configKey);
       toReturn = (temp != null) ? temp : defaultValue;
     }
-    log.info("Setting {} to: {}", configKey, soTimeout);
+    log.info("Setting {} to: {}", configKey, toReturn);
     return toReturn;
   }
 
