diff --git a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfigurationTests.java b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfigurationTests.java
index 80a439e..20dc615 100644
--- a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfigurationTests.java
+++ b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfigurationTests.java
@@ -88,7 +88,7 @@
 				EmbeddedServletContainerAutoConfiguration.class,
 				DispatcherServletAutoConfiguration.class, WebMvcAutoConfiguration.class,
 				ManagementServerPropertiesAutoConfiguration.class,
-				EndpointWebMvcAutoConfiguration.class);
+				EndpointWebMvcAutoConfiguration.class, ErrorMvcAutoConfiguration.class);
 		this.applicationContext.refresh();
 		assertContent("/controller", 8080, "controlleroutput");
 		assertContent("/endpoint", 8080, null);
@@ -125,7 +125,7 @@
 				ServerPropertiesAutoConfiguration.class,
 				EmbeddedServletContainerAutoConfiguration.class,
 				DispatcherServletAutoConfiguration.class, WebMvcAutoConfiguration.class,
-				EndpointWebMvcAutoConfiguration.class);
+				EndpointWebMvcAutoConfiguration.class, ErrorMvcAutoConfiguration.class);
 		this.applicationContext.refresh();
 		assertContent("/controller", 7070, "controlleroutput");
 		assertContent("/endpoint", 7070, null);
