diff --git a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfiguration.java b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfiguration.java
index 5e49ac5..5173059 100644
--- a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfiguration.java
+++ b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfiguration.java
@@ -156,7 +156,8 @@
 	@ConditionalOnExpression("${endpoints.health.enabled:true}")
 	public HealthMvcEndpoint healthMvcEndpoint(HealthEndpoint delegate) {
 		HealthMvcEndpoint healthMvcEndpoint = new HealthMvcEndpoint(delegate);
-		if (this.healthMvcEndpointProperties.getMapping() != null) {
+		if (this.healthMvcEndpointProperties.getMapping() != null
+				&& this.healthMvcEndpointProperties.getMapping().size() > 0) {
 			healthMvcEndpoint.setStatusMapping(this.healthMvcEndpointProperties
 					.getMapping());
 		}
