diff --git a/config/src/main/java/org/springframework/security/config/annotation/web/configurers/RememberMeConfigurer.java b/config/src/main/java/org/springframework/security/config/annotation/web/configurers/RememberMeConfigurer.java
index 4b40a3a..85f95b2 100644
--- a/config/src/main/java/org/springframework/security/config/annotation/web/configurers/RememberMeConfigurer.java
+++ b/config/src/main/java/org/springframework/security/config/annotation/web/configurers/RememberMeConfigurer.java
@@ -230,7 +230,7 @@
 		RememberMeServices rememberMeServices = getRememberMeServices(http, key);
 		http.setSharedObject(RememberMeServices.class, rememberMeServices);
 		LogoutConfigurer<H> logoutConfigurer = http.getConfigurer(LogoutConfigurer.class);
-		if (logoutConfigurer != null) {
+		if (logoutConfigurer != null && logoutHandler != null) {
 			logoutConfigurer.addLogoutHandler(logoutHandler);
 		}
 
