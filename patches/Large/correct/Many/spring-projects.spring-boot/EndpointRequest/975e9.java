diff --git a/spring-boot-project/spring-boot-actuator-autoconfigure/src/main/java/org/springframework/boot/actuate/autoconfigure/security/servlet/EndpointRequest.java b/spring-boot-project/spring-boot-actuator-autoconfigure/src/main/java/org/springframework/boot/actuate/autoconfigure/security/servlet/EndpointRequest.java
index 8ce38af..79894be 100644
--- a/spring-boot-project/spring-boot-actuator-autoconfigure/src/main/java/org/springframework/boot/actuate/autoconfigure/security/servlet/EndpointRequest.java
+++ b/spring-boot-project/spring-boot-actuator-autoconfigure/src/main/java/org/springframework/boot/actuate/autoconfigure/security/servlet/EndpointRequest.java
@@ -115,12 +115,12 @@
 	/**
 	 * Base class for supported request matchers.
 	 */
-	private static abstract class AbstractRequestMatcher
+	private abstract static class AbstractRequestMatcher
 			extends ApplicationContextRequestMatcher<WebApplicationContext> {
 
 		private volatile RequestMatcher delegate;
 
-		public AbstractRequestMatcher() {
+		AbstractRequestMatcher() {
 			super(WebApplicationContext.class);
 		}
 
