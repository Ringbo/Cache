diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/interceptor/CommandContext.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/interceptor/CommandContext.java
index 8e1bf22..6e77c75 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/interceptor/CommandContext.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/interceptor/CommandContext.java
@@ -137,7 +137,7 @@
               // reduce log level, as normally we're not interested in logging this exception
               log.debug("Optimistic locking exception : " + exception);
             } else {
-              log.error("Error while closing command context", exception);
+              log.debug("Error while closing command context", exception);
             }
 
             transactionContext.rollback();
