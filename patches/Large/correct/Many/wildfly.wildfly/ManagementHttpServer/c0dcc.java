diff --git a/domain-http/interface/src/main/java/org/jboss/as/domain/http/server/ManagementHttpServer.java b/domain-http/interface/src/main/java/org/jboss/as/domain/http/server/ManagementHttpServer.java
index 807b237..856b85e 100644
--- a/domain-http/interface/src/main/java/org/jboss/as/domain/http/server/ManagementHttpServer.java
+++ b/domain-http/interface/src/main/java/org/jboss/as/domain/http/server/ManagementHttpServer.java
@@ -209,7 +209,7 @@
         try {
             pathHandler.addPrefixPath(ErrorContextHandler.ERROR_CONTEXT, ErrorContextHandler.createErrorContext(consoleSlot));
         } catch (ModuleLoadException e) {
-            ROOT_LOGGER.error(consoleSlot == null ? "main" : consoleSlot);
+            ROOT_LOGGER.errorContextModuleNotFound(consoleSlot == null ? "main" : consoleSlot);
         }
 
         ManagementRootConsoleRedirectHandler rootConsoleRedirectHandler = new ManagementRootConsoleRedirectHandler(consoleHandler);
