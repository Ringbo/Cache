diff --git a/spring-boot-starter-admin-client/src/main/java/de/codecentric/boot/admin/services/SpringBootAdminRegistrator.java b/spring-boot-starter-admin-client/src/main/java/de/codecentric/boot/admin/services/SpringBootAdminRegistrator.java
index c041587..079d7f7 100644
--- a/spring-boot-starter-admin-client/src/main/java/de/codecentric/boot/admin/services/SpringBootAdminRegistrator.java
+++ b/spring-boot-starter-admin-client/src/main/java/de/codecentric/boot/admin/services/SpringBootAdminRegistrator.java
@@ -57,7 +57,7 @@
 			ResponseEntity<Application> response = template.postForEntity(adminUrl, app, Application.class);
 
 			if (response.getStatusCode().equals(HttpStatus.CREATED)) {
-				LOGGER.info("Application registered itself as {}", response.getBody());
+				LOGGER.debug("Application registered itself as {}", response.getBody());
 				return true;
 			}
 			else if (response.getStatusCode().equals(HttpStatus.CONFLICT)) {
