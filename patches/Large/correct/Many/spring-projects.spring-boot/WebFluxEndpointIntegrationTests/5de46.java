diff --git a/spring-boot-project/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/web/reactive/WebFluxEndpointIntegrationTests.java b/spring-boot-project/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/web/reactive/WebFluxEndpointIntegrationTests.java
index d0afb7a..a1db891 100644
--- a/spring-boot-project/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/web/reactive/WebFluxEndpointIntegrationTests.java
+++ b/spring-boot-project/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/endpoint/web/reactive/WebFluxEndpointIntegrationTests.java
@@ -164,7 +164,7 @@
 	private static class MockPrincipalServerWebExchangeDecorator
 			extends ServerWebExchangeDecorator {
 
-		protected MockPrincipalServerWebExchangeDecorator(ServerWebExchange delegate) {
+		MockPrincipalServerWebExchangeDecorator(ServerWebExchange delegate) {
 			super(delegate);
 		}
 
