diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/interceptor/CommandContext.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/interceptor/CommandContext.java
index d11308b..7c84dd9 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/interceptor/CommandContext.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/interceptor/CommandContext.java
@@ -153,7 +153,7 @@
       // reduce log level, as normally we're not interested in logging this exception
       log.debug("Optimistic locking exception : " + exception);
     } else {
-      log.debug("Error while closing command context", exception);
+      log.error("Error while closing command context", exception);
     }
   }
 
