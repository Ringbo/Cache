diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/security/oauth2/resource/UserInfoTokenServices.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/security/oauth2/resource/UserInfoTokenServices.java
index f36fd3e..f09c602 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/security/oauth2/resource/UserInfoTokenServices.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/security/oauth2/resource/UserInfoTokenServices.java
@@ -99,7 +99,13 @@
 		return new OAuth2Authentication(request, token);
 	}
 
-	private Object getPrincipal(Map<String, Object> map) {
+	/**
+	 * Return the principal that should be used for the token. The default implementation
+	 * looks for well know {@code user*} keys in the map.
+	 * @param map the source map
+	 * @return the principal or {@literal "unknown"}
+	 */
+	protected Object getPrincipal(Map<String, Object> map) {
 		for (String key : PRINCIPAL_KEYS) {
 			if (map.containsKey(key)) {
 				return map.get(key);
