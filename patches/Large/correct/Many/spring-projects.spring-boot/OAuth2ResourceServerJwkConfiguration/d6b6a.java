diff --git a/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/security/oauth2/resource/servlet/OAuth2ResourceServerJwkConfiguration.java b/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/security/oauth2/resource/servlet/OAuth2ResourceServerJwkConfiguration.java
index 8180ca1..f6deea3 100644
--- a/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/security/oauth2/resource/servlet/OAuth2ResourceServerJwkConfiguration.java
+++ b/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/security/oauth2/resource/servlet/OAuth2ResourceServerJwkConfiguration.java
@@ -33,8 +33,7 @@
 
 	private final OAuth2ResourceServerProperties properties;
 
-	public OAuth2ResourceServerJwkConfiguration(
-			OAuth2ResourceServerProperties properties) {
+	OAuth2ResourceServerJwkConfiguration(OAuth2ResourceServerProperties properties) {
 		this.properties = properties;
 	}
 
