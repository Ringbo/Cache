diff --git a/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/embedded/undertow/UndertowServletWebServerFactory.java b/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/embedded/undertow/UndertowServletWebServerFactory.java
index f166463..5342026 100644
--- a/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/embedded/undertow/UndertowServletWebServerFactory.java
+++ b/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/embedded/undertow/UndertowServletWebServerFactory.java
@@ -348,7 +348,7 @@
 			DeploymentInfo deployment, ServletContextInitializer... initializers) {
 		ServletContextInitializer[] mergedInitializers = mergeInitializers(initializers);
 		Initializer initializer = new Initializer(mergedInitializers);
-		deployment.addServletContainerInitalizer(new ServletContainerInitializerInfo(
+		deployment.addServletContainerInitializer(new ServletContainerInitializerInfo(
 				Initializer.class,
 				new ImmediateInstanceFactory<ServletContainerInitializer>(initializer),
 				NO_CLASSES));
