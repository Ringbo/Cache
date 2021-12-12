diff --git a/spring-boot-project/spring-boot-actuator-autoconfigure/src/main/java/org/springframework/boot/actuate/autoconfigure/security/servlet/EndpointRequest.java b/spring-boot-project/spring-boot-actuator-autoconfigure/src/main/java/org/springframework/boot/actuate/autoconfigure/security/servlet/EndpointRequest.java
index 4f65bb3..f3633bd 100644
--- a/spring-boot-project/spring-boot-actuator-autoconfigure/src/main/java/org/springframework/boot/actuate/autoconfigure/security/servlet/EndpointRequest.java
+++ b/spring-boot-project/spring-boot-actuator-autoconfigure/src/main/java/org/springframework/boot/actuate/autoconfigure/security/servlet/EndpointRequest.java
@@ -317,7 +317,7 @@
 
 		public RequestMatcher antPath(RequestMatcherProvider matcherProvider,
 				String... parts) {
-			StringBuffer pattern = new StringBuffer(this.prefix);
+			StringBuilder pattern = new StringBuilder(this.prefix);
 			for (String part : parts) {
 				pattern.append(part);
 			}
