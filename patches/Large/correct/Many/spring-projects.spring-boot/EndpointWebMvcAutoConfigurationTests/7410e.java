diff --git a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfigurationTests.java b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfigurationTests.java
index a1f2020..66aec2b 100644
--- a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfigurationTests.java
+++ b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfigurationTests.java
@@ -296,7 +296,7 @@
 		this.applicationContext.refresh();
 		// /health, /metrics, /env (/shutdown is disabled by default)
 		assertThat(this.applicationContext.getBeansOfType(MvcEndpoint.class).size(),
-				is(equalTo(6)));
+				is(equalTo(5)));
 	}
 
 	@Test
