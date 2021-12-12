diff --git a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/web/reactive/WebFluxAnnotationAutoConfigurationTests.java b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/web/reactive/WebFluxAnnotationAutoConfigurationTests.java
index 4893811..9150f55 100644
--- a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/web/reactive/WebFluxAnnotationAutoConfigurationTests.java
+++ b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/web/reactive/WebFluxAnnotationAutoConfigurationTests.java
@@ -91,7 +91,7 @@
 		load(CustomArgumentResolvers.class);
 		RequestMappingHandlerAdapter adapter = this.context
 				.getBean(RequestMappingHandlerAdapter.class);
-		assertThat(adapter.getArgumentResolvers()).contains(
+		assertThat(adapter.getCustomArgumentResolvers()).contains(
 				this.context.getBean("firstResolver",
 						HandlerMethodArgumentResolver.class),
 				this.context.getBean("secondResolver",
