diff --git a/server/src/main/java/org/jboss/as/server/ServerControllerModelUtil.java b/server/src/main/java/org/jboss/as/server/ServerControllerModelUtil.java
index 1d4843a..1622172 100644
--- a/server/src/main/java/org/jboss/as/server/ServerControllerModelUtil.java
+++ b/server/src/main/java/org/jboss/as/server/ServerControllerModelUtil.java
@@ -207,9 +207,11 @@
 
         // Runtime operations
         if (serverEnvironment != null) {
-            if (serverEnvironment.getLaunchType() == ServerEnvironment.LaunchType.DOMAIN)
+            // Reload op -- does not work on a domain mode server
+            if (serverEnvironment.getLaunchType() != ServerEnvironment.LaunchType.DOMAIN)
                 root.registerOperationHandler(ServerReloadHandler.OPERATION_NAME, ServerReloadHandler.INSTANCE, ServerReloadHandler.INSTANCE, false);
 
+            // The System.exit() based shutdown command is only valid for a server process directly launched from the command line
             if (serverEnvironment.getLaunchType() == ServerEnvironment.LaunchType.STANADALONE)
                 root.registerOperationHandler(ServerShutdownHandler.OPERATION_NAME, ServerShutdownHandler.INSTANCE, ServerShutdownHandler.INSTANCE, false);
 
