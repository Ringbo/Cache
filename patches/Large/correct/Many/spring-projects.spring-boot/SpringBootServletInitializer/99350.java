diff --git a/spring-boot/src/main/java/org/springframework/boot/context/web/SpringBootServletInitializer.java b/spring-boot/src/main/java/org/springframework/boot/context/web/SpringBootServletInitializer.java
index fef93f4..abbe9b2 100644
--- a/spring-boot/src/main/java/org/springframework/boot/context/web/SpringBootServletInitializer.java
+++ b/spring-boot/src/main/java/org/springframework/boot/context/web/SpringBootServletInitializer.java
@@ -85,7 +85,7 @@
 		application.contextClass(AnnotationConfigEmbeddedWebApplicationContext.class);
 		application = configure(application);
 		// Ensure error pages are registered
-		application.sources(ErrorWrapperEmbeddedServletContainerFactory.class);
+		application.sources(ErrorPageFilter.class);
 		return (WebApplicationContext) application.run();
 	}
 
