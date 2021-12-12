diff --git a/config/src/main/java/org/springframework/security/config/annotation/web/configurers/SessionManagementConfigurer.java b/config/src/main/java/org/springframework/security/config/annotation/web/configurers/SessionManagementConfigurer.java
index eb24911..ba469e5 100644
--- a/config/src/main/java/org/springframework/security/config/annotation/web/configurers/SessionManagementConfigurer.java
+++ b/config/src/main/java/org/springframework/security/config/annotation/web/configurers/SessionManagementConfigurer.java
@@ -201,7 +201,7 @@
 	 */
 	public SessionManagementConfigurer<H> sessionAuthenticationStrategy(
 			SessionAuthenticationStrategy sessionAuthenticationStrategy) {
-		this.sessionAuthenticationStrategy = sessionAuthenticationStrategy;
+		this.sessionFixationAuthenticationStrategy = sessionAuthenticationStrategy;
 		return this;
 	}
 
