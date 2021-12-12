diff --git a/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/registry/ApplicationRegistry.java b/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/registry/ApplicationRegistry.java
index 0aaf981..c6ee812 100644
--- a/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/registry/ApplicationRegistry.java
+++ b/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/registry/ApplicationRegistry.java
@@ -61,7 +61,7 @@
 			LOGGER.info("New Application {} registered ", newApp);
 		} else {
 			if ((app.getUrl().equals(oldApp.getUrl()) && app.getName().equals(oldApp.getName()))) {
-				LOGGER.info("Application {} refreshed", newApp);
+				LOGGER.debug("Application {} refreshed", newApp);
 			} else {
 				LOGGER.warn("Application {} not registered because of conflict with {}", newApp, oldApp);
 				throw new ApplicationRegistryConflictException(oldApp, app);
