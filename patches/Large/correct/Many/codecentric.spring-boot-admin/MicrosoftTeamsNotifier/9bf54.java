diff --git a/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/notify/MicrosoftTeamsNotifier.java b/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/notify/MicrosoftTeamsNotifier.java
index 2a4fd8b..acc6a8f 100644
--- a/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/notify/MicrosoftTeamsNotifier.java
+++ b/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/notify/MicrosoftTeamsNotifier.java
@@ -92,7 +92,7 @@
 			return;
 		}
 
-		this.restTemplate.postForObject(webhookUrl, message, Void.class);
+		this.restTemplate.postForEntity(webhookUrl, message, Void.class);
 	}
 
 	@Override
