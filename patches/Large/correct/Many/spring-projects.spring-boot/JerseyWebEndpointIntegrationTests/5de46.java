diff --git a/spring-boot-project/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/web/jersey/JerseyWebEndpointIntegrationTests.java b/spring-boot-project/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/web/jersey/JerseyWebEndpointIntegrationTests.java
index 586a85f..b2b3fbb 100644
--- a/spring-boot-project/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/web/jersey/JerseyWebEndpointIntegrationTests.java
+++ b/spring-boot-project/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/web/jersey/JerseyWebEndpointIntegrationTests.java
@@ -142,7 +142,7 @@
 
 	private static class MockPrincipalWrapper extends HttpServletRequestWrapper {
 
-		public MockPrincipalWrapper(HttpServletRequest request) {
+		MockPrincipalWrapper(HttpServletRequest request) {
 			super(request);
 		}
 
