diff --git a/host-controller/src/main/java/org/jboss/as/host/controller/ServerInventoryImpl.java b/host-controller/src/main/java/org/jboss/as/host/controller/ServerInventoryImpl.java
index 0c65bb3..b3881ff 100644
--- a/host-controller/src/main/java/org/jboss/as/host/controller/ServerInventoryImpl.java
+++ b/host-controller/src/main/java/org/jboss/as/host/controller/ServerInventoryImpl.java
@@ -253,7 +253,7 @@
         }
         final ManagedServer server = createManagedServer(serverName, domainModel, authKey);
         if(servers.putIfAbsent(serverName, server) != null) {
-            ROOT_LOGGER.existingServerWithState(serverName, existing.getState());
+            ROOT_LOGGER.existingServerWithState(serverName, server.getState());
             return;
         }
         if(running) {
