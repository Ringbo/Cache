diff --git a/spring-boot-samples/spring-boot-sample-web-secure/src/main/java/sample/ui/secure/SampleSecureApplication.java b/spring-boot-samples/spring-boot-sample-web-secure/src/main/java/sample/ui/secure/SampleSecureApplication.java
index fd09d36..92d878d 100644
--- a/spring-boot-samples/spring-boot-sample-web-secure/src/main/java/sample/ui/secure/SampleSecureApplication.java
+++ b/spring-boot-samples/spring-boot-sample-web-secure/src/main/java/sample/ui/secure/SampleSecureApplication.java
@@ -52,8 +52,7 @@
 
 	public static void main(String[] args) throws Exception {
 		// Set user password to "password" for demo purposes only
-		new SpringApplicationBuilder(SampleSecureApplication.class).properties(
-				"security.basic.enabled=false", "security.user.password=password").run(
+		new SpringApplicationBuilder(SampleSecureApplication.class).properties("security.user.password=password").run(
 				args);
 	}
 
