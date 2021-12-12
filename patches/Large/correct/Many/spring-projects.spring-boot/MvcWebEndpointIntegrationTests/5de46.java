diff --git a/spring-boot-project/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/web/servlet/MvcWebEndpointIntegrationTests.java b/spring-boot-project/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/web/servlet/MvcWebEndpointIntegrationTests.java
index 64fcc7a..baa7101 100644
--- a/spring-boot-project/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/web/servlet/MvcWebEndpointIntegrationTests.java
+++ b/spring-boot-project/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/web/servlet/MvcWebEndpointIntegrationTests.java
@@ -156,7 +156,7 @@
 
 	private static class MockPrincipalWrapper extends HttpServletRequestWrapper {
 
-		public MockPrincipalWrapper(HttpServletRequest request) {
+		MockPrincipalWrapper(HttpServletRequest request) {
 			super(request);
 		}
 
