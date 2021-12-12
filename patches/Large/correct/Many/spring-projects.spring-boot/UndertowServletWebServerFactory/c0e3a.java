diff --git a/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/embedded/undertow/UndertowServletWebServerFactory.java b/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/embedded/undertow/UndertowServletWebServerFactory.java
index 86b6862..7be903e 100644
--- a/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/embedded/undertow/UndertowServletWebServerFactory.java
+++ b/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/embedded/undertow/UndertowServletWebServerFactory.java
@@ -292,7 +292,7 @@
 		SessionManager sessionManager = manager.getDeployment().getSessionManager();
 		int sessionTimeout = (getSessionTimeout() == null || getSessionTimeout().isZero()
 				|| getSessionTimeout().isNegative() ? -1
-						: (int) getSessionTimeout().toMinutes());
+						: (int) getSessionTimeout().getSeconds());
 		sessionManager.setDefaultSessionTimeout(sessionTimeout);
 		return manager;
 	}
