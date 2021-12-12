diff --git a/spring-boot-samples/spring-boot-sample-web-method-security/src/main/java/sample/security/method/SampleMethodSecurityApplication.java b/spring-boot-samples/spring-boot-sample-web-method-security/src/main/java/sample/security/method/SampleMethodSecurityApplication.java
index 93847c0..3dfbeff 100644
--- a/spring-boot-samples/spring-boot-sample-web-method-security/src/main/java/sample/security/method/SampleMethodSecurityApplication.java
+++ b/spring-boot-samples/spring-boot-sample-web-method-security/src/main/java/sample/security/method/SampleMethodSecurityApplication.java
@@ -73,7 +73,7 @@
 		@Override
 		public void init(AuthenticationManagerBuilder auth) throws Exception {
 			auth.inMemoryAuthentication().withUser("admin").password("admin")
-					.roles("ADMIN", "USER").and().withUser("user").password("user")
+					.roles("ADMIN", "USER", "ACTUATOR").and().withUser("user").password("user")
 					.roles("USER");
 		}
 
