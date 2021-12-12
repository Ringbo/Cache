diff --git a/spring-boot-project/spring-boot-actuator-autoconfigure/src/main/java/org/springframework/boot/actuate/autoconfigure/security/servlet/EndpointRequest.java b/spring-boot-project/spring-boot-actuator-autoconfigure/src/main/java/org/springframework/boot/actuate/autoconfigure/security/servlet/EndpointRequest.java
index ac64130..f3633bd 100644
--- a/spring-boot-project/spring-boot-actuator-autoconfigure/src/main/java/org/springframework/boot/actuate/autoconfigure/security/servlet/EndpointRequest.java
+++ b/spring-boot-project/spring-boot-actuator-autoconfigure/src/main/java/org/springframework/boot/actuate/autoconfigure/security/servlet/EndpointRequest.java
@@ -317,11 +317,11 @@
 
 		public RequestMatcher antPath(RequestMatcherProvider matcherProvider,
 				String... parts) {
-			String pattern = this.prefix;
+			StringBuilder pattern = new StringBuilder(this.prefix);
 			for (String part : parts) {
-				pattern += part;
+				pattern.append(part);
 			}
-			return matcherProvider.getRequestMatcher(pattern);
+			return matcherProvider.getRequestMatcher(pattern.toString());
 		}
 
 	}
